package util;

import exceptions.FileProcessingException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public FileReader() {}

    public static List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = TextSelector.class.getResourceAsStream(filePath);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by period (.)
                String[] segments = line.split("\\.");
                for (String segment : segments) {
                    // Add each segment (trimming spaces) to the list
                    if (!segment.trim().isEmpty()) {
                        lines.add(segment.trim() + ".");
                    } else {
                        lines.add(segment.trim());
                    }
                }
            }
        } catch (IOException e) {
            throw new FileProcessingException(e.getMessage());
        }
        return lines;
    }
}



