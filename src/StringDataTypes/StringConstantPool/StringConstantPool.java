package StringDataTypes.StringConstantPool;

public class StringConstantPool {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "String";
        String str3 = new String("String");
        String str4 = str3.intern();
        compare(str3, str4);
        compare(str1, str2);
        compare(str1, str3);
        compare(str1, str4);
    }
    static void compare(String a, String b) {
        if(a == b) {
            System.out.println("2 strings are located at a same location");
            return;
        }
        if(a.equals(b)) {
            System.out.println("2 string have same value");
        }
    }

}
