package com.redbee.msuserspractica.application.port.out;

import com.redbee.msuserspractica.domain.Seed;

import java.util.UUID;

public interface NotificationRepository {

    void notify(Seed seed, UUID notificationId);
}
