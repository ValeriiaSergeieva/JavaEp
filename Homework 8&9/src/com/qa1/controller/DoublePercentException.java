package com.qa1.controller;

import com.qa1.view.ViewBook;

public class DoublePercentException extends Exception {
    @Override
    public String getMessage() {
        return ViewBook.INPUT_WRONG_DATA;
    }
}
