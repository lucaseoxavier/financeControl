package com.smd.financeControl.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateHelper {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

    public static Date parseDate(String dateString) {
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + dateString + ". Date Format needs to be " + DATE_FORMAT);
        }
    }

    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }

}
