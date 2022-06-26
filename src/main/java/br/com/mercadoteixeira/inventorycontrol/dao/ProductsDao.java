package br.com.mercadoteixeira.inventorycontrol.dao;

import java.util.List;

import br.com.mercadoteixeira.inventorycontrol.domain.Products;

public interface ProductsDao {

    void save(Products products);

    void update(Products products);

    void delete (Long id);

    Products findById(Long id);

    List<Products> findAll();
}
