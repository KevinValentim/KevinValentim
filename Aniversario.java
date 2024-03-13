class pessoa{
    String nome;
    int idade;
    void fazAniversario(){
        idade += 1;
    }
}
public class Aniversario {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        p1.nome = "kevin";
        p1.idade = 23;
        p1.fazAniversario();
        System.out.println(p1.idade);
    } 
    }

