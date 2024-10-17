package br.com.rts.estudos.graphql.customscalars.controllers;

import br.com.rts.estudos.graphql.customscalars.entities.Product;
import br.com.rts.estudos.graphql.customscalars.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @QueryMapping
    public List<Product> findAllProducts(){
        return repository.findAll();
    }
}
