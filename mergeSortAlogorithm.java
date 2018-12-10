/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author cst16045
 */
public class mergeSortAlogorithm {
    
    void merge(int inArray[],int p,int m, int r){
        int n1 = m - p + 1;
        int n2 = r - m;
        
        int Left[] = new int [n1];
        int Right[] = new int [n2];
        
        for (int i = 0; i < n1; ++i) {
            Left[i] = inArray[p+i];
        }
        for (int j = 0; j < n2; ++j) {
            Right[j] = inArray[m+1+j];
        }
        
        int i=0;
        int j=0;
        
        int k = p;
        
        while(i< n1 && j < n2){
            if(Left[i] <= Right[j]){
                inArray[k] = Left[i];
                i++;
            }else{
                inArray[k] = Right[j];
                j++;
            }
            k++;
        }
        
        while(i <n1){
            inArray[k] = Left[i];
            i++;
            k++;
        }
        
        while(j < n2){
            inArray[k] = Right[j];
            j++;
            k++;
        }
    }
    
    void sort(int[] inArray,int l, int r){
        if(l<r){
            int m = (l+r)/2;
            sort(inArray,l,m);
            sort(inArray,m+1,r);
            
            merge(inArray, l, m, r);
        }
    }
     
    void printArray(int[] inArray){
        for (int i = 0; i < inArray.length; i++) {
            System.out.print(" "+inArray[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] unsort = {12,566,78,45,3,21,36,98,41,23,12,8,23,132,84};
        
        mergeSortAlogorithm test = new mergeSortAlogorithm();
        test.sort(unsort, 0, unsort.length-1);
        test.printArray(unsort);
    }
}
