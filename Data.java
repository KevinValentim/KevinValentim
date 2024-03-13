class Data {
    int dia, mes, ano;
    void	preencheData	(int	dia,	int	mes,	int	ano) {
        this.dia	=	dia;
        this.mes	=	mes;
        this.ano	=	ano;
    
    }
    void printData(){
        System.out.println("Data de Abertura: " + dia + "/" + mes + "/" + ano);
    }
}
