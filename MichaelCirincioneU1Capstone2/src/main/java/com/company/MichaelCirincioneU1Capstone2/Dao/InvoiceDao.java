package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Invoice;

import java.util.List;

public interface InvoiceDao {

    Invoice addInvoice(Invoice invoice);

    Invoice getInvoice(int invoiceID);

    List<Invoice> getAllInvoices();

    Invoice updateInvoice(Invoice invoice);

    void deleteInvoice(int invoiceID);


}
