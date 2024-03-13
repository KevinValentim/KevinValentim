class carro{
    String cor;
    String modelo;
    double velAtual;
    double velMax;

    void liga(){
        System.out.println("O	carro	está	ligado");
    }
    void acelera(double quant){
        double velNova = this.velAtual + quant;
        this.velAtual = velNova;
    }
    int pegaMarcha(){
        if (this.velAtual < 0) {
            return -1;
        }
        if (this.velAtual >= 0 && this.velAtual < 40) {
            return 1;
        }
        if	(this.velAtual	>=	40	&&	this.velAtual	<	80)	{
            return	2;
        }
        return	3;
    }
}
class Motor	{
    int	potencia;
    String	tipo;
}

public class TestaCarro {
    public static void main(String[] args) {
        carro meuCarro;
        meuCarro = new carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Cadillac";
        meuCarro.velAtual = 0;
        meuCarro. velMax = 80;

        meuCarro.liga();

        meuCarro.acelera(20);
        System.err.println(meuCarro.velAtual);
    }
}
