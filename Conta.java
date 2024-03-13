class Conta{
    String titular;
    int numero;
    String agencia;
    private double saldo = 0.0;
    Data dataDeAbertura;
    
    
    boolean	saca(double	valor) {
        if(this.saldo < valor){
            return false;
        }
        else{
            this.saldo	=	this.saldo	-	valor;
            return true;
        }
    }    
    void deposita(double valor){
        this.saldo	+=	valor;
    }

    double calculaRend(){
        return this.saldo	*	0.01;
    }

    void recuperaDadosParaImpressao(){

        System.out.println("titular: " + titular);
        System.out.println("numero: " + numero);
        System.out.println("agencia: " + agencia);
        System.out.println("saldo: R$" + saldo);
        dataDeAbertura.printData();
        System.out.println("--------------------------------");
    }
    void mostraSaldo(){
        System.out.println("saldo atual: R$" + saldo);
        System.out.println("rendimento mensal: R$" + calculaRend());
        System.out.println("--------------------------------");
    }
    double passaMes(){
        return this.saldo += calculaRend();
    }
}
