package br.com.mercadoteixeira.inventorycontrol.dao;

import org.springframework.stereotype.Repository;

import br.com.mercadoteixeira.inventorycontrol.domain.Products;

@Repository
public class ProductDao extends AbstractDao<Products, Long> implements ProductsDao {

}
