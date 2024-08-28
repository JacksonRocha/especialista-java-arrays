package jackson.rocha;

public class PrincipalFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
        servicoDeCobranca.pagar(fatura, "Jackson@gmail.com", "Jakeline@gmail.com");
        servicoDeCobranca.pagar(fatura, "Helen@gmail.com");

    }

}
