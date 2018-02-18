package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Resource
public interface ProductDao extends CrudRepository <Product, Integer>{
    List<Product> findByName (String name);
}
