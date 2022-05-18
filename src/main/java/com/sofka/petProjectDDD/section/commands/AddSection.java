package com.sofka.petProjectDDD.section.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.petProjectDDD.section.values.Aisle;
import com.sofka.petProjectDDD.section.values.Floor;
import com.sofka.petProjectDDD.section.values.Name;

public class AddSection extends Command {

    private final Name name;
    private final Aisle aisle;
    private final Floor floor;

    public AddSection(Name name, Aisle aisle, Floor floor) {
        this.name = name;
        this.aisle = aisle;
        this.floor = floor;
    }

    public Name getName() {
        return name;
    }

    public Aisle getAisle() {
        return aisle;
    }

    public Floor getFloor() {
        return floor;
    }
}
