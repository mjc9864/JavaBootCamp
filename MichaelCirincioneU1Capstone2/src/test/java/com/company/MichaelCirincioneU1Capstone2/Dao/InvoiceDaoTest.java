package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Invoice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoTest {



    @Autowired
    InvoiceDao invoiceDao;




    @Before
    public void setUp() throws Exception {

        List<Invoice> invoices = invoiceDao.getAllInvoices();
        for (Invoice invoice : invoices) {
            invoiceDao.deleteInvoice(invoice.getInvoiceID());
        }

    }

    @Test
    public void addGetDeleteInvoice() {
        Invoice invoice = new Invoice();
        invoice.setName("name1");
        invoice.setStreet("street1");
        invoice.setCity("city1");
        invoice.setState("state1");
        invoice.setZipcode("zip1");
        invoice.setItemType("item1");
        invoice.setItemID(16);
        invoice.setUnitPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setQuantity(4);
        invoice.setSubtotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTax(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setProcessingFee(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));

        invoice = invoiceDao.addInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getInvoiceID());
        assertEquals(invoice1, invoice);

        invoiceDao.deleteInvoice(invoice.getInvoiceID());
        invoice1 = invoiceDao.getInvoice(invoice.getInvoiceID());
        assertNull(invoice1);
    }


    @Test
    public void getAllInvoices() {

        Invoice invoice = new Invoice();
        invoice.setName("name1");
        invoice.setStreet("street1");
        invoice.setCity("city1");
        invoice.setState("state1");
        invoice.setZipcode("zip1");
        invoice.setItemType("item1");
        invoice.setItemID(16);
        invoice.setUnitPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setQuantity(4);
        invoice.setSubtotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTax(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setProcessingFee(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));

        invoice = invoiceDao.addInvoice(invoice);

        invoice = new Invoice();
        invoice.setName("name1");
        invoice.setStreet("street1");
        invoice.setCity("city1");
        invoice.setState("state1");
        invoice.setZipcode("zip1");
        invoice.setItemType("item1");
        invoice.setItemID(16);
        invoice.setUnitPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setQuantity(4);
        invoice.setSubtotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTax(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setProcessingFee(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));

        invoice = invoiceDao.addInvoice(invoice);

        List<Invoice> invoiceList = invoiceDao.getAllInvoices();
        assertEquals(2, invoiceList.size());

    }

    @Test
    public void updateInvoice() {

        Invoice invoice = new Invoice();
        invoice.setName("name1");
        invoice.setStreet("street1");
        invoice.setCity("city1");
        invoice.setState("state1");
        invoice.setZipcode("zip1");
        invoice.setItemType("item1");
        invoice.setItemID(16);
        invoice.setUnitPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setQuantity(4);
        invoice.setSubtotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTax(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setProcessingFee(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        invoice.setTotal(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));

        invoice = invoiceDao.addInvoice(invoice);

        invoice.setName("name2");

        invoiceDao.updateInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getInvoiceID());
        assertEquals(invoice1, invoice);

    }

}