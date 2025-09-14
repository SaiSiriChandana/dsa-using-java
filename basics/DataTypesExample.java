class Solution {
    static int dataTypeSize(String str) {
        switch(str){
            case "Integer":return 4;
            case "Character":return 1;
            case "Long":return 8;
            case "Float":return 4;
            case "Double":return 8;
            default:return -1;
        }
    }

}

/* after a return statement any code is considered unreachable and will cause compilation error so break after return is removed

Java Primitive Data Types

Data Type   | Size (bits) | Size (bytes) | Range                                      | Default Value
------------|-------------|--------------|-------------------------------------------|---------------
byte        | 8           | 1            | -128 to 127                               | 0
short       | 16          | 2            | -32,768 to 32,767                         | 0
int         | 32          | 4            | -2,147,483,648 to 2,147,483,647           | 0
long        | 64          | 8            | -2^63 to 2^63 - 1                         | 0L
float       | 32          | 4            | ~6–7 decimal digits precision             | 0.0f
double      | 64          | 8            | ~15 decimal digits precision              | 0.0d
char        | 16          | 2            | 0 to 65,535 (Unicode characters)          | '\u0000'
boolean     | JVM Dep.    | ~1 byte      | true / false                              | false


    */
