package br.com.rts.estudos.graphql.customscalars;

import br.com.rts.estudos.graphql.customscalars.entities.Product;
import br.com.rts.estudos.graphql.customscalars.repositories.ProductRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomScalarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomScalarsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Faker faker, ProductRepository repository) {
        return args -> {
            List<Product> products = List.of(getNewProject(faker),
                    getNewProject(faker),
                    getNewProject(faker),
                    getNewProject(faker),
                    getNewProject(faker),
                    getNewProject(faker));

            repository.saveAll(products);
        };
    }

    private static Product getNewProject(Faker faker) {
        return Product
                .builder()
                .title(faker.commerce().productName())
                .isOnSale(faker.random().nextBoolean())
                .weight(faker.random().nextFloat())
                .build();
    }

    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}
