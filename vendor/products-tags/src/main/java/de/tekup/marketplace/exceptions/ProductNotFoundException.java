package de.tekup.marketplace.exceptions;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(long message) {
        super("Product with id " + message + " Not found");
    }
}
