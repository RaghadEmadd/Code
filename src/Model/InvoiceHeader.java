/*
BTA3TE ANAAA
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Raghad.Emad
 */
public class InvoiceHeader {
     //left panel variables
    private int invoiceNumber;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<InvoiceLine> Lines;
    private DateFormat simpleDateFormat1 = new SimpleDateFormat("dd-mm-yyyy");

    Object getInvoiceNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getCustomerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getInvoiceTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getInvoiceDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
