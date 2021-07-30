 package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
       Lutador l[] = new Lutador[6];
        
        l[0] =  new Lutador("Pretty Boy", "França", 31, 1.75f, 
                                69.3f, 11, 20, 21);
        l[1] =  new Lutador("Putscript", "Brasil", 29, 1.68f, 
                                57.8f, 14, 2, 3);
        l[2] =  new Lutador("Snapshadow", "eua", 35, 1.65f, 
                                80.9f, 12, 2, 1);
        l[3] =  new Lutador("Dead Code", "Australia", 28, 1.93f, 
                                81.6f, 13, 0, 0);
        l[4] =  new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 
                                119.3f,  5, 4, 3);
        l[5] =  new Lutador("Nerdaart", "EUA", 30, 1.81f, 
                               105.7f, 13, 2, 4);
        
     

        Luta UEC01 = new Luta();
        UEC01.marcarluta(l[4], l[5]);
        l[2].cartelInicial();
        l[3].cartelInicial();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("                                            ");
        UEC01.lutar();
        l[2].cartelFinal();
        l[3].cartelFinal();
  
      
        
        
        
        
       
       
    }
    
}
