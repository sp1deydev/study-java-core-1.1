package StringDataTypes.StringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("Hello");
        System.out.println(System.identityHashCode(strBuffer));
        strBuffer.append(" World"); // Thay đổi trực tiếp
        System.out.println("StringBuffer: " + strBuffer);

        // Chèn chuỗi vào vị trí cụ thể
        strBuffer.insert(5, " Java");
        System.out.println("After insert: " + strBuffer);

        // Xóa một phần chuỗi
        strBuffer.delete(5, 10);
        System.out.println("After delete: " + strBuffer);

        // Đảo ngược chuỗi
        strBuffer.reverse();
        System.out.println("After reverse: " + strBuffer);
        System.out.println(System.identityHashCode(strBuffer));
    }
}
