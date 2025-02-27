package StringDataTypes.String;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "String 1 ";
//        str1.concat("concat string");
        System.out.println(System.identityHashCode(str1));
        str1 = str1.concat("concat string"); // tạo địa chỉ mới cho str1
        System.out.println(System.identityHashCode(str1));
        String str2 = str1.concat("concat string");
        System.out.println(System.identityHashCode(str2));
        String str3 = new String("String 1 ");
        System.out.println(System.identityHashCode(str3));
        String str4 = "String 1 ";
        System.out.println(System.identityHashCode(str4));
        System.out.println("1: " + str1);
        System.out.println("2: " + str2);
        System.out.println(str1 == str3);

    }
}
