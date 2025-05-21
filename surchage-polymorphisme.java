
// surchage meme declaration mais parametres differents 

public Cafe faireUnCafe(){
    Cafe cafe = new Cafe(); 
    return cafe; 
}

public Cafe faireUnCafe (boolean ajouterSucre){
    Cafe cafe = faireUnCafe(); 

    if (ajouterSucre){
        cafe.mettreSucre();
    }
}