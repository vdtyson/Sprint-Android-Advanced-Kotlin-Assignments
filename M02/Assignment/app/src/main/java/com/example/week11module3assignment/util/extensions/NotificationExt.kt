package com.example.week11module3assignment.util.extensions

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Build.*
import android.os.Build.VERSION.*
import android.provider.Settings.Global.getString
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import com.example.week11module3assignment.R

fun Context.showNotification(channelId: String, icon: Int, title: String = "", description: String) {
    NotificationCompat.Builder(this,channelId)
        .setSmallIcon(icon)
        .setContentTitle(title)
        .setContentText(description)
        .priority = NotificationCompat.PRIORITY_DEFAULT
}
private fun createNotificationChannel() {
    // Create the NotificationChannel, but only on API 26+ because
    // the NotificationChannel class is new and not in the support library
    if (Build.SDK_INT >= VERSION_CODES.O) {
        val name = getString(R.string.channel_name)
        val descriptionText = getString(R.string.channel_description)
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
            description = descriptionText
        }
        // Register the channel with the system
        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}