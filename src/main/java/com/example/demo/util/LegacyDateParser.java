package com.example.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class LegacyDateParser {

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private LegacyDateParser() {
    }

    public static Date parse(String value) {
        try {
            return FORMAT.parse(value);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Could not parse", e);
        }
    }

    public static List<Date> parseAll(List<String> values) {
        List<Date> dates = new ArrayList<>();
        for (String value : values) {
            dates.add(parse(value));
        }
        return dates;
    }
}
