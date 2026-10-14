public class DefangIP {
    public static String defangIPaddr(String address) {
        // Replaces all literal occurrences of "." with "[.]"
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String ip1 = "1.1.1.1";
        String ip2 = "255.100.50.0";

        System.out.println("Original: " + ip1 + " -> Defanged: " + defangIPaddr(ip1));
        System.out.println("Original: " + ip2 + " -> Defanged: " + defangIPaddr(ip2));
    }
}
