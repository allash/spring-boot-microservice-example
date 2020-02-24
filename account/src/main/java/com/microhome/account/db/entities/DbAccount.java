package com.microhome.account.db.entities;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class DbAccount {
    private UUID id;
    private String name;
    private Instant createdAt;
    private List<DbTask> tasks;

    public DbAccount() {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
    }

    public DbAccount(String name) {
        this();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public List<DbTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<DbTask> tasks) {
        this.tasks = tasks;
    }
}
