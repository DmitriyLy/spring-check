package net.dmly.springdatabuilder.unsafe_starter;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordsMatcher {

    public static List<String> toWordsByJavaConvention(String words) {
        ArrayList<String> result = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();
        int min = 0;
        int max = 0;
        for(int i = 0; i < words.length(); i++) {
            if(Character.isUpperCase(words.charAt(i))) {
                String line = builder.toString().trim();
                if (line.length() > 0) result.add(line);
                builder = new StringBuilder();
            }
            builder.append(words.charAt(i));
        }
        result.add(builder.toString().trim());

        return result;
    }

    public static String findAndRemoveMatchingPiecesIfExists(Set<String> options, List<String> pieces) {
        StringBuilder match = new StringBuilder(pieces.remove(0));

        List<String> remainingOptions = options.stream()
                .filter(option -> option.toLowerCase().startsWith(match.toString().toLowerCase()))
                .collect(Collectors.toList());

        if (remainingOptions.isEmpty()) {
            return "";
        }

        while (remainingOptions.size() > 1) {
            match.append(pieces.remove(0));
            remainingOptions.removeIf(option -> !option.toLowerCase().startsWith(match.toString().toLowerCase()));

        }

        while (!remainingOptions.get(0).equalsIgnoreCase(match.toString())) {
            match.append(pieces.remove(0));
        }

        return Introspector.decapitalize(match.toString());
    }
}
