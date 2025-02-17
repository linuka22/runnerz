package com.linuka.runnerz.run;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime endedOn,
    Integer Kilometers,
    Location location
    ) 
    {}
