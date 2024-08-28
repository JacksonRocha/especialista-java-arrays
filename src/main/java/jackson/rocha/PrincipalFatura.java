package jackson.rocha;

public class PrincipalFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

//        String[] emailsCobranca = {"joão@gmail.com", "maria@gmail.com"};

//        servicoDeCobranca.pagar(fatura, new String[]{"joão@gmail.com", "maria@gmail.com"});

//        servicoDeCobranca.pagar(fatura, new String[0]);
//        servicoDeCobranca.pagar(fatura, new String[]{});

//        servicoDeCobranca.pagar(fatura, "jackson@gmail.com");

        servicoDeCobranca.pagar(fatura);

    }

}
