package com.sofka.petProjectDDD.lending.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.petProjectDDD.lending.Fine;
import com.sofka.petProjectDDD.lending.Item;
import com.sofka.petProjectDDD.lending.values.DevolutionDate;
import com.sofka.petProjectDDD.lending.values.LendingDate;
import com.sofka.petProjectDDD.lending.values.LendingId;

import java.util.Set;

public class LendingAdded extends DomainEvent {

    private final LendingId lendingId;
    private final Set<Item> items;
    private final LendingDate lendingDate;
    private final DevolutionDate devolutionDate;

    public LendingAdded(LendingId lendingId, Set<Item> items,  DevolutionDate devolutionDate, LendingDate lendingDate) {
        super("com.sofka.petProjectDDD.lending.lendingadded");
        this.lendingId = lendingId;
        this.items = items;
        this.devolutionDate = devolutionDate;
        this.lendingDate = lendingDate;
    }

    public LendingId getLendingId() {
        return lendingId;
    }

    public Set<Item> getItems() {
        return items;
    }

    public DevolutionDate getDevolutionDate() {
        return devolutionDate;
    }

    public LendingDate getLendingDate() {
        return lendingDate;
    }
}