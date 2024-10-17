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
            List<Product> products = List.of(Product.builder().title(faker.commerce().productName()).build(),
                    Product.builder().title(faker.commerce().productName()).build(),
                    Product.builder().title(faker.commerce().productName()).build(),
                    Product.builder().title(faker.commerce().productName()).build(),
                    Product.builder().title(faker.commerce().productName()).build(),
                    Product.builder().title(faker.commerce().productName()).build());

            repository.saveAll(products);
        };
    }

    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}
