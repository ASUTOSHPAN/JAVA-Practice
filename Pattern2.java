// // Pattern 1
// // *
// // **
// // ***
// // ****
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 2
// // ****
// // ***
// // **
// // *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 3
// // *
// // **
// // ***
// // ****
// // ***
// // **
// // *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 3; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 4
// //     *
// //    **
// //   ***
// //  ****
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 5
// //  ****
// //   ***
// //    **
// //     *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 4; k >= i; k--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 6
// //    *
// //   **
// //  ***
// // ****
// //  ***
// //   **
// //    *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 3; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 3; k >= i; k--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 7
// //      *
// //     * *
// //    * * *
// //   * * * *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 8
// //     *
// //    ***
// //   *****
// //  *******
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             for (int l = 2; l <= i; l++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 9
// //  *****
// //   ***
// //    *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 3; k >= i; k--) {
//                 System.out.print("*");
//             }
//             for (int l = 2; l >= i; l--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 10
// // *
// //  *
// //   *
// //    *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (i >= 2 && j <= i - 1) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 11
// //    *
// //   *
// //  *
// // *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 if (i <= 4 && j <= i) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 12
// //     *
// //    * *
// //   *   *
// //  *     *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 if (k >= 2) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             for (int l = 1; l <= i - 1; l++) {
//                 if (l >= i - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // Print Pattern 13
// //  * * * *
// //  *     *
// //  *     *
// //  * * * *
// public class Pattern2 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 4; j++) {
//                 if (i >= 2 && i <= 3 && j >= 2 && j <= 3) {
//                     System.out.print("  ");
//                 } else {
//                     System.out.print(" *");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }