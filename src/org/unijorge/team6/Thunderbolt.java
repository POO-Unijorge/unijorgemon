class Pikachu {
    private int hp;
    
    public Pikachu(int initialHp) {
        this.hp = initialHp;
    }
    
    public void thunderboltAttack() {
        int damage = 20; // Quantidade de dano causado pelo Thunderbolt
        hp -= damage;
        System.out.println("Thunderbolt atingiu o oponente! HP restante: " + hp);
    }
    
    public int getHp() {
        return hp;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(100); // Cria um Pikachu com 100 de HP
        
        pikachu.thunderboltAttack(); // Executa o ataque Thunderbolt
        
        int remainingHp = pikachu.getHp(); // Obtém o HP restante do Pikachu
        System.out.println("HP restante do Pikachu: " + remainingHp);
    }
}
*/
