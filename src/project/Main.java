package project;
import java.util.Scanner;
import java.util.Arrays;

class GuguDan{
    int seq;
    
    public void gugu(int seq){
        this.seq = seq;
        int q = this.seq;
        int[] result = new int[9];
        
        for (int i=1; i<10;i++){
            int k = i*q;
            System.out.printf("%d ",k);
            result[i-1] = k;
        }
        System.out.println("");
        System.out.println("----------------------------------");        
        System.out.println(Arrays.toString(result));
        }
    
    
    
    
    
}


class Main{
    public static void main(String[] args){
    GuguDan Guu = new GuguDan();
    Scanner sc = new Scanner(System.in);
    int St = Integer.parseInt(sc.next());
    Guu.gugu(St);
    
    
    
