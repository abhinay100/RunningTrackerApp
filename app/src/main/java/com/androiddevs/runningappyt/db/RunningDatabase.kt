package com.androiddevs.runningappyt.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * Created by Abhinay on 05/10/23.
 */
@Database(
      entities = [Run::class],
      version = 1
)
@TypeConverters(Converters::class)
abstract  class RunningDatabase : RoomDatabase() {
    abstract fun getRunDao(): RunDAO

}