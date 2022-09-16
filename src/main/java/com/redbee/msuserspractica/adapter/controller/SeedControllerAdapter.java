package com.redbee.msuserspractica.adapter.controller;

import com.redbee.msuserspractica.adapter.controller.model.PageResponse;
import com.redbee.msuserspractica.adapter.controller.model.SeedRest;
import com.redbee.msuserspractica.application.port.in.GetSeedQuery;
import com.redbee.msuserspractica.domain.Page;
import com.redbee.msuserspractica.domain.Seed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/api/ms-users-practica/seeds")
public class        SeedControllerAdapter {

    private GetSeedQuery getSeedQuery;

    public SeedControllerAdapter(GetSeedQuery getSeedQuery) {
        this.getSeedQuery = getSeedQuery;
    }
    @GetMapping
    public PageResponse<SeedRest> getSeeds(
        @RequestParam(name = "page", required = false, defaultValue = "0") int page,
        @RequestParam(name = "size", required = false, defaultValue = "50") int size,
        @RequestParam Map<String,String> queryParams
    ) {
        log.info("Ejecucion de get '/seeds' con queryParams: {}", queryParams.toString());

        Page<Seed> seeds = getSeedQuery.execute(page, size, queryParams);


        return PageResponse.<SeedRest>builder().build().fromDomain(seeds, SeedRest::fromDomain);
    }

}
