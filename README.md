Learning about the bitwise & operator by using it to print a Sierpinski triangle in the console.

Original code taken from [Java program to print a Sierpinski triangle](https://www.geeksforgeeks.org/sierpinski-triangle/) where the Java code was contributed by Sahil_Bansall.

Adapted by Bart Notelaers to learn about the [bitwise operator &](https://www.baeldung.com/java-bitwise-operators), by printing values of x and y instead of a single '*'

Example output;

`Enter a size for the Sierpinski triangle, as a power of 2.
For example 16, 32, 64 etc;
16
                                               0,15
                                            0,14  1,14
                                         0,13    !0  2,13
                                      0,12  1,12  2,12  3,12
                                   0,11    !0    !0    !0  4,11
                                0,10  1,10    !0    !0  4,10  5,10
                              0,9    !0   2,9    !0   4,9    !0   6,9
                           0,8   1,8   2,8   3,8   4,8   5,8   6,8   7,8
                        0,7    !0    !0    !0    !0    !0    !0    !0   8,7
                     0,6   1,6    !0    !0    !0    !0    !0    !0   8,6   9,6
                  0,5    !0   2,5    !0    !0    !0    !0    !0   8,5    !0  10,5
               0,4   1,4   2,4   3,4    !0    !0    !0    !0   8,4   9,4  10,4  11,4
            0,3    !0    !0    !0   4,3    !0    !0    !0   8,3    !0    !0    !0  12,3
         0,2   1,2    !0    !0   4,2   5,2    !0    !0   8,2   9,2    !0    !0  12,2  13,2
      0,1    !0   2,1    !0   4,1    !0   6,1    !0   8,1    !0  10,1    !0  12,1    !0  14,1
   0,0   1,0   2,0   3,0   4,0   5,0   6,0   7,0   8,0   9,0  10,0  11,0  12,0  13,0  14,0  15,0`