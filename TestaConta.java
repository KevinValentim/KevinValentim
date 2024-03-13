class TestaConta{
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Data data = new Data();
        c1.dataDeAbertura = data;
        c1.titular = "Andre";
        c1.numero = 123;
        c1.agencia = "42144-9";
        c1.dataDeAbertura.preencheData(12,	3,	2019);

        c1.deposita(10500);
        System.out.println("--------------------------------");
        c1.recuperaDadosParaImpressao();
        c1.passaMes();
        c1.mostraSaldo();
    }
}