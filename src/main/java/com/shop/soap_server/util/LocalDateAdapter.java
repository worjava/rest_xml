package com.shop.soap_server.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    public LocalDateAdapter() {
    }

    private static final DateTimeFormatter dateFormatter =
            DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public LocalDate unmarshal(String v)  {
        return LocalDate.parse(v, dateFormatter);
    }

    @Override
    public String marshal(LocalDate v)  {
        return v.format(dateFormatter);
    }

}
