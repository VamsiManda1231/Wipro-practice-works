public class StringBuffers {
    public static void main(String[] args) {
    
        String a = args[0].trim();

        int length = a.length();
    
        String b = a.substring(0, 2);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(b);
        }

        System.out.println(result.toString());
    }
    
    
}
