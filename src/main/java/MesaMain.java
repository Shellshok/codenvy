class MesaMain{
  public static void main(String[] args){
    Mesa Margarita = new Mesa(args[0], 4, args[1]);
	 System.out.println("Hemos creado una mesa");
    System.out.println("con" + Margarita.getNumPatas() + " patas,");
 	 System.out.println("de color " + Margarita.getColor());
 	 System.out.println("y de forma " + Margarita.getForma());
    
  }
}