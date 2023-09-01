package SezimTasks;

public class DomainExtension {

    public static boolean checkDomain(String domain) {
        // Convert the domain to lowercase for case-insensitive matching
        String lowerCaseDomain = domain.toLowerCase();

        // Check if the domain ends with ".com", ".org", or ".net"
        return lowerCaseDomain.endsWith(".com") ||
                lowerCaseDomain.endsWith(".org") ||
                lowerCaseDomain.endsWith(".net");
    }

    public static void main(String[] args) {
        System.out.println(checkDomain("https://www.google.com")); // true
        System.out.println(checkDomain("https://www.yahoo.org")); // true
        System.out.println(checkDomain("https://www.microsoft.net")); // true
        System.out.println(checkDomain("https://www.facebook.co.uk")); // false
        System.out.println(checkDomain("https://www.amazon.xyz")); // false
    }
}

/*
Write a static method called checkDomain()
that takes a String as input and checks if it ends with ".com", ".org", or ".net".
The method should return true if the String ends with one of these suffixes,
and false otherwise.

Param:

String for domain

Return

boolean

Expected Output:

isUrlValid("https://www.google.com"); // Expected output: true
isUrlValid("https://www.yahoo.org"); // Expected output: true
isUrlValid("https://www.microsoft.net"); // Expected output: true
isUrlValid("https://www.facebook.co.uk"); // Expected output: false
isUrlValid("https://www.amazon.xyz"); // Expected output: false*/