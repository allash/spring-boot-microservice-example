package com.microhome.account.db.entities;

import com.microhome.account.db.enums.TaskStatus;

import java.time.Instant;
import java.util.UUID;

public class DbTask {
    private UUID id;
    private String title;
    private Instant createdAt;
    private TaskStatus status;

    public DbTask() {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
        this.status = TaskStatus.IN_PROGRESS;
    }

    public DbTask(String title) {
        this();
        this.title = title;
    }
}
