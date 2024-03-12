package ru.lotnik.data.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "notification")
@Entity
public class Notification extends Base {

    @Column(name = "sms_notification")
    private boolean smsNotification;

    @Column(name = "email_notification")
    private boolean emailNotification;

    @Column(name = "pushNotification")
    private boolean pushNotification;
}
