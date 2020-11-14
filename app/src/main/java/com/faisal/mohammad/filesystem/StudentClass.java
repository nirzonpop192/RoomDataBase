package com.faisal.mohammad.filesystem;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Student")
public class StudentClass {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "cFirstName")
    String firstName;
    @ColumnInfo(name = "cLastName")
    String lastName;

    public StudentClass() {
    }

    public StudentClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }
}
