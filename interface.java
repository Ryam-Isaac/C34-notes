// comment creer une interface new - file - interface 

public class Main {

    public static void main (String[] args){

        Rabbit rabbit = new Rabbit(); 
        rabbit.flee(); 

        Hawk hawk = new Hawk (); 
        hawk.flee() ;

        Fish fish = new fish (); 
        fish.hunt(); 
    }

}

public class Rabbit implements Prey {

    @Override
    public void flee(){
        System.out.println("**the rabbit is fleeing"); 
    }

}


public class Hawk implements Predator {

    @Override
    public void hunt(){
     System.out.println("**the hawk is hunting"); 

    }
}

public class Fish implements Predator,Prey {

    @Override
    public void hut (){
        System.out.println("This fish is hunting smaller fish "); 
    }

    @Override
    public void flee(){
        System.out.println("This fish is fleeing from a larger fish "); 
    }

}


public interface Prey {
    void flee();
}


public interface Predator {
    void hunt() ;
}

