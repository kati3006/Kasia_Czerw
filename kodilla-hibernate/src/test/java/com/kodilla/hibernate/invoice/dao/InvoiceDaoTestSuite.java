package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Invoice invoice = new Invoice("1");
        Item item1 = new Item(product1, new BigDecimal("120"), 2);
        invoice.getItems().add(item1);
        item1.setInvoice(invoice);
        item1.setProduct(product1);
        product1.getItems().add(item1);

        //When
        productDao.save(product1);
        invoiceDao.save(invoice);
        itemDao.save(item1);

        //Then
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        Assert.assertEquals(id, readInvoice.getId());

        //CleanUp
        itemDao.delete(item1.getId());
        invoiceDao.delete(id);
        productDao.delete(product1.getId());

    }
}