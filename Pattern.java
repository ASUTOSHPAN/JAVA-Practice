// Pattern as Kodnest Exercise

// //Print Pattern 1
// //*
// //*
// //*
// //*
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       System.out.println("$");
//     }
//   }
// }


// // // Print Pattern 2
// // // ****
// // // ****
// // // ****
// // // ****
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 1; j <= 4; j++) {
//         System.out.print("$");
//       }
//       System.out.println();
//     }
//   }
// }


// // Print Pattern 3
// // 1111
// // 2222
// // 3333
// // 4444
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 1; j <= 4; j++) {
//         System.out.print(i);
//       }
//       System.out.println();
//     }
//   }
// }


// // // Print pattern 4
// // // $
// // // $$
// // // $$$
// // // $$$$
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print("$");
//       }
//       System.out.println();
//     }
//   }
// }


// // Print Pattern 5
// // 1
// // 12
// // 123
// // 1234
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }


// // // Print Pattern 6
// // // $$$$
// // // $$$
// // // $$
// // // $
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 4; j >= i; j--) {
//         System.out.print("$");
//       }
//       System.out.println();
//     }
//   }
// }


// // // Print Pattern 7
// // // 12345
// // // 1234
// // // 123
// // // 12
// // // 1
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 5; i >= 1; i--) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }


// // Print Pattern 8
//    *
//   **
//  ***
// ****
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 3; j >= i; j--) {
//         System.out.print(" ");
//       }
//       for (int k = 1; k <= i; k++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// Print Pattern 9
//  ****
//   ***
//    **
//     *
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print(" ");
//       }
//       for (int k = 4; k >= i; k--) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// Print Pattern 10
//    *
//   * *
//  * * *
// * * * *
// public class Pattern {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 4; i++) {
//       for (int j = 4; j >= i; j--) {
//         System.out.print(" ");
//       }
//       for (int k = 1; k <= i; k++) {
//         System.out.print(" *");
//       }
//       System.out.println();
//     }
//   }
// }


// Print Pattern 11
//      *
//     * *
//    * * *
//   * * * *
//    * * *
//     * *
//      *
// public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 3; k >= i; k--) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }


// Print Pattern 12
// ***** 
// *   * 
// *   * 
// *   * 
// ***** 
// public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 if (i >= 2 && i <= 4 && j >= 2 && j <= 4) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Print Pattern 13
// A
// BB
// CCC
// DDDD
// CCC
// BB
// A
// public class Pattern {
//     public static void main(String[] args) {
//         char ch = 'A';
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch);
//             }
//             ch++;
//             System.out.println();
//         }
//         ch = 'C';
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 3; j >= i; j--) {
//                 System.out.print(ch);
//             }
//             ch--;
//             System.out.println();
//         }
//     }
// }
