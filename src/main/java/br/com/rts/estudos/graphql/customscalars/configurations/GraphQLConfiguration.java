package br.com.rts.estudos.graphql.customscalars.configurations;

import graphql.scalars.ExtendedScalars;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfiguration {

    @Bean
    public RuntimeWiringConfigurer getRuntimeWiringConfigurer(){
        return wiring -> wiring
                .scalar(ExtendedScalars.GraphQLBigDecimal);
    }
}
