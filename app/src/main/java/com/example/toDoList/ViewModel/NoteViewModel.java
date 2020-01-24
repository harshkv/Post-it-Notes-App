package com.example.toDoList.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import com.example.toDoList.Model.Note;
import com.example.toDoList.Repository.NoteRepository;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository repository;
    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        repository = new NoteRepository(application);
        allNotes = repository.getAllNotes();
    }

    public  void insert(Note note){
        repository.insert(note);
    }

    public  void update(Note note){
        repository.update(note);
    }

    public  void delete(Note note){
        repository.delete(note);
    }

    public  void deleteAllNotes(){
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }


}
