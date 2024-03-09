public class Math {
    public static void main(String[] args){
        int idade = 10;
        int anoAtual = 2024;
        int DataNascimento = anoAtual - idade;
        boolean menorDeIdade;


        System.out.println("Nasceu em " + DataNascimento + "\n");
        System.out.println("É menor de idade?\n");
        if(idade >=18){
            menorDeIdade = false;
            System.out.println("Não, pode virar a perna!\n");
        }else if(idade < 18){
            menorDeIdade = true;
            System.out.println("Sim, não pode beber!\n");
        }
    }
}
