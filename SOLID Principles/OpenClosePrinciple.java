package solid.principle;

public class OpenClosePrinciple {
    /**
     * Open for Extension but close for Modification
     * We should not  add additional methods in the existing class instead we should go for interface
     */
}
class MySQlDataBaseInvoice implements  InvoiceDaoService{
    @Override
    public void saveInvoice(Invoice invoice) {
        // save invoice details in MySQL data base
    }
}
class SaveInvoiceInFile implements InvoiceDaoService{
    @Override
    public void saveInvoice(Invoice invoice) {
        // save  invoice files to a given location
    }
}


