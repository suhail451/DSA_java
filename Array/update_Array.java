
package javadatastrucutres;


public class update_Array {
   
    
    public static void main(String[] args) {
//      variable         
        int array[]={45, 94, 34, 45, 56};
        int num=45;
        int replace = 99;
// loop for update the number if found 
        for (int i=0;i<array.length;i++){
             if (array[i]==num){
             array[i]=replace;       
            }
        }
//  for each loop for display the array 
        for(int el:array){
            System.out.println(el);
        }
              }
    
    
                     }
         
    



