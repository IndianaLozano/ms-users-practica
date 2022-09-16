package com.redbee.msuserspractica.application.port.out;

import com.redbee.msuserspractica.domain.Seed;

import java.util.UUID;

public interface ConfirmationRepository {

    void save(Seed seed, UUID uuid);

    Seed findById(String id);
}
