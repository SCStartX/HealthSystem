package healthsystem;
class Healthsystem {
  public static void main(String[] args) { 
    Jugador Jprincipal = new Jugador("Messi", 10);

    System.out.println("Sistema de salud (Healthsystem)/n");

    Jprincipal.recibirDanio(10);
    System.out.println(">> El Zombie ataca a Jugador Principal.Jugador Principal tiene "+Jprincipal.getVida()+" de vida");

    
    
  }
}