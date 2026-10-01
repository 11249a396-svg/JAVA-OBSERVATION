public class StringDemo {
    public static void main(String[] args) {

        String s = "Andhra University";

        System.out.println("Length : " + s.length());
        System.out.println("Upper case : " + s.toUpperCase());
        System.out.println("First six : " + s.substring(0, 6));
        System.out.println("Position of U: " + s.indexOf('U'));
        System.out.println("Replace A->X: " + s.replace('A', 'X'));
        System.out.println("Original : " + s);

        String a = "level";
        String b = new StringBuilder(a).reverse().toString();

        if (a.equals(b))
            System.out.println(a + " is a palindrome");
        else
            System.out.println(a + " is not a palindrome");
    }
}
