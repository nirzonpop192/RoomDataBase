package com.faisal.mohammad.filesystem;

import android.os.AsyncTask;

public class InsertAsyncTask extends AsyncTask<StudentClass,Void,Void> {
    private DAOStudent daoStudent=null;

    public InsertAsyncTask(DAOStudent daoStudent) {
        this.daoStudent = daoStudent;
    }

    @Override
    protected Void doInBackground(StudentClass... studentClasses) {
        daoStudent.insetStudent(studentClasses[0]);
        return null;
    }
}
