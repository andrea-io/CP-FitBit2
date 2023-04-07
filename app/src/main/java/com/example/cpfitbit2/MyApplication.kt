package com.example.fitbit

import android.app.Application
import com.example.cpfitbit2.AppDatabase

class MyApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}