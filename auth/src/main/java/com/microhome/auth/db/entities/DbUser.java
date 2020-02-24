package com.microhome.auth.db.entities;

import java.time.Instant;
import java.util.UUID;

public class DbUser {
    private UUID id;
    private String name;
    private int age;
    private Instant createdAt;

    public DbUser() {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
    }

    public DbUser(String name, int age) {
        this();
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
