
package javadatastrucutres;


public class deletion_Array {
    
    public static void main(String[] args) {
       
        System.out.println("Here is the array data strucutres implementation : ");
        
           
        int array[]={45,94,34,45,56};


        int num=34;
        int index = 0;
// loop for find index of given number
        for (int i=0;i<array.length;i++){
            if(array[i]==num){
              index=i;
                System.out.println("found");
                break;
                          }
        }
        
        System.out.println("number index"+index);
//     loop for shift the array to left toword that index
        for(int i=index;i<array.length-1;i++){
            array[i]=array[i+1];
                                }
//    last element equals to 0        
            array[array.length-1]=0;
 
 
// loop for print the final array 
        for(int el:array){
            System.out.println(el);
        }
     
    
                }
                        } 
  