class Mesa {
  String color;
  int numPatas;
  String forma;
  static int numMesasFabricadas = 0;
  
/*  void cambioColor(String nuevoColor){
  	 color = nuevoColor;
    }
*/
  
  Mesa(String colorInicial, int patasIniciales, String formaInicial){
    color = colorInicial;
    numPatas = patasIniciales;
    forma = formaInicial; 
    numMesasFabricadas = numMesasFabricadas + 1;
  }
  
  Mesa(){
    color ="azul";
    numPatas = 4;
    forma ="redonda";
    numMesasFabricadas = numMesasFabricadas + 1;
  }
  
  void setColor (String nuevoColor){
    color = nuevoColor;
  }
  
  void setPatas (int nuevoNumPatas){
    numPatas = nuevoNumPatas;
  }
  
  void setForma (String nuevaForma){
    forma = nuevaForma;
  }

  String getColor(){
    return color;
  }
  
  int getNumPatas(){
    return numPatas;
  }
  
  String getForma(){
    return forma;
  }
  
  int getNumMesasFabricadas(){
    return numMesasFabricadas;
  }

  
}

