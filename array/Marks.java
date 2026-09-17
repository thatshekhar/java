package array;

 class Marks {
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,};
        // System.out.println(marks[2]);
        // marks[2] = 100;
        // // System.out.println(marks[2]);
        // for(int i=0; i<marks.length; i++){
            // System.out.println(marks[i]);
        // }
        int i=0;
        // while(i<marks.length){
        //     System.out.println(marks[i]);
        //     i++; 
        // }
        for (int x : marks) {
            System.out.println(x);
        }
    }
}
 