public class array{
    public static void main(String[] args) {
        int[] marks={70,80,65,90,85};
        int sum=0;
        double average;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];

        }
        average=sum/marks.length;
        System.out.printf("Average= %.2f%n",average);



        
    }
    
}