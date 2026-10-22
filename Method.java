// // // //Method without parameter & without return values ///////////////////////
// // // public class Method{
// // //     public static void main(String[] args) {
// // //         inviteMessage();
// // //     }
// // //     static void inviteMessage() {
// // //         System.out.println("Welcome to Kodnest.");
// // //     }
// // // }

// // //Method with parameter & without return values /////////////////////////
// // public class Method {
// //     public static void main(String[] args) {
// //         inviteMessage("Asutosh");
// //     }
// //     static void inviteMessage(String name) {
// //         System.out.println("Hello " + name + ", You are welcome to kodnest.");
// //     }
// // }

// //Methods without parameter but with return values ////////////////////////
// public class Method{
//     public static void main(String[] args) {
//         String name = name();
//         System.out.println("Hello " + name + ", welcome to kodnest.");
//     }
//     static String name() {
//         return "Asutosh";
//     }
// }

// Methods with paarmeter with return value ///////////////////
public class Method {
    public static void main(String[] args ) {
        int length = 10;
        int width = 5;
        int area = area(length, width);
        System.out.println("The  area of rectangle with length " + length + " & width " + width + " is " + area);
    }
    static int area(int length, int width) {
        return length * width;
    }
}