public enum Mes {
    JANEIRO_EXPENSE(1000),
    FEVEREIRO_EXPENSE(2000),
    MARCO_EXPENSE(3000),
    ABRIL_EXPENSE(4000),
    MAIO_EXPENSE(5000),
    JUNHO_EXPENSE(6000),
    JULHO_EXPENSE(7000),
    AGOSTO_EXPENSE(8000),
    SETEMBRO_EXPENSE(9000),
    OUTUBRO_EXPENSE(10000),
    NOVEMBRO_EXPENSE(11000),
    DEZEMBRO_EXPENSE(12000);

    private int valor;

    Mes(int valor) {
        this.valor = valor;

    }

    public int getValor() {
        return valor;
    }


}