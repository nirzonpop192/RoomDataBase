package com.faisal.mohammad.filesystem;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {StudentClass.class}, version = 1, exportSchema = false)
public abstract class DataBaseClass extends RoomDatabase {
    private static DataBaseClass mInstance = null;

    public abstract DAOStudent daoStudent();


    public static synchronized DataBaseClass getmInstance(Context context) {
        if (mInstance == null) {
            mInstance = Room.databaseBuilder(context.getApplicationContext(),
                    DataBaseClass.class, "people.db3")
                   // .allowMainThreadQueries()
                    .build();
        }
        return mInstance;
    }
}
