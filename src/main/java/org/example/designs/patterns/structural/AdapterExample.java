package org.example.designs.patterns.structural;


import lombok.RequiredArgsConstructor;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * *
 *
 * Scenario
 *
 * 1. You have plain text data you need to export and validate that data into a xml file
 * 2. You have to do the same task for Json data. But the function for this operation will only be accepting
 * an xml file.
 *
 * * @author Pratyay
 *
 * todo: Still not an accurate implementation
 */

interface DataExporter {
    void export();
}

@RequiredArgsConstructor
class JsonExporter implements DataExporter {
    private final String plainData;
    private final XMLExporter xmlExporter;
    private final Adapter adapter;


    private void export(Map<String, Object> data) {
        // business logic here.
    }

    @Override
    public void export() {
        File xmlFile = xmlExporter.export(plainData);
        Map<String, Object> data = adapter.transform(xmlFile);
        export(data);
    }
}

class XMLExporter {
    public File export(String plainXML) {
        // business logic later.
        return null;
    }
}

class Adapter {
    Map<String, Object> transform(File file) {
        return new HashMap<>();
    }
}
