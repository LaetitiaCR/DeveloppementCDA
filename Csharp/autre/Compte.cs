Class Compte{
    private int decouvertAutorise;
    private String nom;
    private int numero;
    private int solde;

    public void Compte(){

    }
    public void Compte(int _numero, string _nom, int solde, int decouvertAutorise){

    }
    public void Crediter(){

    }
    public boolean Debiter(){

    }
    public boolean Superieur(Compte _autreCompte){

    }
    public string ToString(){

    }
    public boolean transferer(int _montant, Compte _compteDestinataire){

    }
}

Class Program{
    static void Main(){
        Compte c = new Compte();
        Compte c1 = new Compte(12345, 'toto', 1000, -500);
        Console.writeLine(c.ToString());
        Console.writeLine(c1.ToString());
    }
}