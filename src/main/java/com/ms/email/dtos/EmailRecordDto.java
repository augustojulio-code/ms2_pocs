package com.ms.email.dtos;

import org.hibernate.validator.constraints.UUID;

public record EmailRecordDto(UUID userUuid, String emailTo, String subject, String text) {
}
