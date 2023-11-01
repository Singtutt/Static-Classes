package com.pluralsight;

public class NameFormatter {
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String nameFormat = lastName + ", " + prefix + ", " + firstName;
        if (middleName != null && !middleName.isEmpty()) {
            nameFormat += " " + middleName;
        }
        if (suffix != null & !suffix.isEmpty()) {
            nameFormat += ", " + suffix;
        }
        return nameFormat;
    }

    public static String format(String fullName) {
        String[] nameSplit = fullName.split("\\s*,\\s*");
        if (nameSplit.length == 2) {
            String[] firstAndMiddle = nameSplit[0].split("\\s+");
            return format(firstAndMiddle[0], firstAndMiddle[1]);
        } else if (nameSplit.length == 1) {
            return nameSplit[0];
        }
        return fullName;
    }
}
