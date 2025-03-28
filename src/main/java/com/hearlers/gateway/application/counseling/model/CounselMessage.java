package com.hearlers.gateway.application.counseling.model;

import java.time.LocalDate;

public class CounselMessage {
    private String id;
    private String counselId;
    private String message;
    private boolean isUserMessage;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;
}
