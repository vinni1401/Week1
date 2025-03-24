public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());  
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught.");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to generate exception
        handleException();
    }
}
