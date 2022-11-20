package com.meetyourroommate.app.roommate.application.tranform;


import com.meetyourroommate.app.roommate.domain.entities.Team;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("TeamRequestMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public TeamMapper teamMapper() { return new TeamMapper(); }

    @Bean
    public TeamRequestMapper teamRequestMapper() { return new TeamRequestMapper(); }

    @Bean
    public TeamRequestDtoMapper teamRequestDtoMapper() { return new TeamRequestDtoMapper(); }

}
