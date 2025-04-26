
package javadatastrucutres;


public class insertion_Array {
    
    
    public static void main(String[] args) {
       
        System.out.println("Here is the array data strucutres implementation : ");
//          variables
        int array[]={45,94,34,45,56};     
        int index=2;
        int num=66;
        int newarray[]=new int[6];
//    copying the array to new array    
        for(int i=0;i<array.length;i++){
        
        newarray[i]=array[i];
        
        }
//    shifting the elements of array to right    
        for(int i=array.length-1;i>=index;i--){
            
            newarray[i+1]=newarray[i];           
        
        }
//        inserting the value
        newarray[index]=num;
        
             
        
//        printing the array
         for(int element:newarray){
             System.out.println(element);
         }        
   
    }
    
}

    
    
