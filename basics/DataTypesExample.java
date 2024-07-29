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
