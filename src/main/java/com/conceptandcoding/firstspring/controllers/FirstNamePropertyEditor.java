package com.conceptandcoding.firstspring.controllers;

import java.beans.PropertyEditorSupport;

public class FirstNamePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text != null && !text.trim().isEmpty()) {
            // Capitalize the first letter and make the rest lowercase
            String formattedName = text.trim().substring(0, 1).toUpperCase() + text.trim().substring(1).toLowerCase();
            setValue(formattedName);  // set the transformed value
        } else {
            setValue(text); // leave it as is if null or empty
        }
    }
}
