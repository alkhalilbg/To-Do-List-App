package com.alkhalilbg.todolistapp;

import com.alkhalilbg.todolistapp.database.AppDatabase;
import com.alkhalilbg.todolistapp.database.TaskEntry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class AddTaskViewModel extends ViewModel {


    private LiveData<TaskEntry> task;


    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }


    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
