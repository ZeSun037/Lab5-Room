package edu.ucsd.cse110.lab5_room.model;

import java.util.List;

public abstract class IPerson {
    public abstract int getId();
    public abstract String getName();
    public abstract List<String> getNotes();
}
