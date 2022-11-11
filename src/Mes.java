public enum Mes {
    JANUARY_EXPENSE(1000, "valor do mes"),
    FEBRUARY_EXPENSE(2000, "valor do mes"),
    MARCH_EXPENSE(3000, "valor do mes"),

    ABRIL_EXPENSE(4000, "valor do mes"),
    MAIO_EXPENSE(5000, "valor do mes"),
    JUNHO_EXPENSE(6000, "valor do mes"),
    JULHO_EXPENSE(7000, "valor do mes"),
    AGOSTO_EXPENSE(8000, "valor do mes"),
    SETEMBRO_EXPENSE(9000, "valor do mes"),
    OUTUBRO_EXPENSE(10000, "valor do mes"),
    NOVEMBRO_EXPENSE(11000, "valor do mes"),
    DEZEMBRO_EXPENSE(12000, "valor do mes");

    private int valor;
    private String mes;

    Mes(int valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    public int getValor() {
        return valor;
    }
    public String getMes() {
        return mes;
    }
}