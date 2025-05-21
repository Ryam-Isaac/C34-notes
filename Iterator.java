// iterateur permet de regarder des elements dans des arraylists


public class MyClass {

    public static void main (String[] args){
        
        ArrayList<String> foods = new ArrayList<String> (); 
        foods.add ("pizza"); 
        foods.add ("icem cream"); 
        foods.add ("bourbon chicken"); 

        Iterator<String> it = foods.iterator (); 
        // get the next elements

        while (it.hasNext()){
            System.out.println (it.next()); 
        }
      
       


    }
}

