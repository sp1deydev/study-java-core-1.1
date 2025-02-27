package StringDataTypes.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(strBuilder));
//        strBuilder.append(" Java");
//        System.out.println(System.identityHashCode(strBuilder));
//        System.out.println(strBuilder);
        strBuilder.append(" World");
        System.out.println("StringBuilder: " + strBuilder);

        // Chèn chuỗi vào vị trí cụ thể
        strBuilder.insert(5, " Java");
        System.out.println("After insert: " + strBuilder);

        // Xóa một phần chuỗi
        strBuilder.delete(5, 10);
        System.out.println("After delete: " + strBuilder);

        // Đảo ngược chuỗi
        strBuilder.reverse();
        System.out.println("After reverse: " + strBuilder);
        System.out.println(System.identityHashCode(strBuilder));
    }
}
