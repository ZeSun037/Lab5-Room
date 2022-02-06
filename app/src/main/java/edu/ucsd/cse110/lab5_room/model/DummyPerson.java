package edu.ucsd.cse110.lab5_room.model;

import java.util.Arrays;
import java.util.List;

public class DummyPerson extends IPerson {
    private final int id;
    private final String name;
    private final List<String> notes;

    public DummyPerson(int id, String name, String[] notes) {
        this.id = id;
        this.name = name;
        this.notes = Arrays.asList(notes);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getNotes() {
        return notes;
    }

    @Override
    public int getId() {return id;}
}
