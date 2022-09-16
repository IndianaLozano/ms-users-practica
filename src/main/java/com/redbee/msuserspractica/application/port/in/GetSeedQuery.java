package com.redbee.msuserspractica.application.port.in;


import com.redbee.msuserspractica.domain.Page;
import com.redbee.msuserspractica.domain.Seed;

import java.util.Map;

public interface GetSeedQuery {
    Page<Seed> execute(int page, int size, Map<String, String> filters);
}
