package model;

public class Inc {
    private String customerId;
    private int invoiceMonth;
    private int invoiceYear;
    private String description;

    public Inc(String customerId, int invoiceMonth, int invoiceYear, String description) {
        this.customerId = customerId;
        this.invoiceMonth = invoiceMonth;
        this.invoiceYear = invoiceYear;
        this.description = description;
    }
}
