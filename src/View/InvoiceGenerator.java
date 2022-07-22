/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Raghad.Emad
 */
public class InvoiceGenerator extends JFrame{
    //variables for the right panel
     private JTextField DateField;
    private JTextField NameField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton saveButton;
    private JButton cancelButton;
    //variable for the table in the right panel
    private JTextField itemNumber;
    private JTextField itemName;
    private JTextField itemPrice;
    private JTextField itemCount;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
   
    
    
    public InvoiceGenerator(InvoiceGeneratorUI frame) {
        custNameLbl = new JLabel("Customer Name:");
        NameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        DateField = new JTextField(20);
        saveButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        //action performed on clicking save or cancel button
        saveButton.setActionCommand("Creation Complete");
        cancelButton.setActionCommand("Invoice not Created");
        
        saveButton.addActionListener(frame.getMyActionListner());
        cancelButton.addActionListener(frame.getMyActionListner());
        
        setLayout(new GridLayout(3, 2));
        // to be added to the frame
        add(invDateLbl);
        add(DateField);
        add(custNameLbl);
        add(NameField);
        add(saveButton);
        add(cancelButton);
        
        pack();
        
    }
    
}
