package com.example.springresthelloword.error;

import java.util.Set;

public class BookUnSupportedFieldPatchException extends RuntimeException {
    public BookUnSupportedFieldPatchException(Set<String> keys) {
        super(String.format("Field %s update is not allow.", keys.toString()));
    }
}
