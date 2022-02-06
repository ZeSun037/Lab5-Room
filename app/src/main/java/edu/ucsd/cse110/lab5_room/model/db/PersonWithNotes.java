package edu.ucsd.cse110.lab5_room.model.db;

import androidx.room.Relation;
import androidx.room.Embedded;

import java.util.List;

import edu.ucsd.cse110.lab5_room.model.IPerson;


public class PersonWithNotes extends IPerson {
    @Embedded
    Person person;

    @Relation(parentColumn = "id",
                entityColumn = "person_id",
                entity = Note.class,
                projection = {"text"})
    public List<String> notes;

    @Override
    public String getName() {
        return this.person.name;
    }

    @Override
    public List<String> getNotes() {
        return this.notes;
    }

    public int getId() {return person.personId;}
}
