package com.example.wall_i.data.db

import ImageResponse
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Entity::class)], version = 1)
abstract class ImageDatabase :RoomDatabase(){
    abstract fun imgDAO():ImageResponseDAO

    companion object{
      @Volatile  private var instance:ImageDatabase?=null
        private val lock= Any()

        operator fun invoke(context: Context)= instance?: synchronized(lock){
            instance?:buildDatabse(context).also {
                instance=it
            }
        }

        fun buildDatabse(context:Context)= Room.databaseBuilder(
            context.applicationContext,
            ImageDatabase::class.java,
            "imageDatabase"
        ).build()


    }
}