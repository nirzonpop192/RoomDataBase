package com.faisal.mohammad.filesystem;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface DAOStudent {
   @Insert
    void insetStudent(StudentClass studentClass);
}
