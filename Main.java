import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new NotificacaoEmail());
        notificacoes.add(new NotificacaoSms());
        notificacoes.add(new NotificacaoWhatsApp());

        ServicoNotificacao servico = new ServicoNotificacao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("  SISTEMA DE NOTIFICAÇÕES");
        System.out.println("=============================");
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1 - E-mail 📧");
        System.out.println("2 - SMS 📱");
        System.out.println("3 - WhatsApp 💬");
        System.out.print("Digite sua opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        if (opcao >= 1 && opcao <= 3) {
            Notificacao notificacaoEscolhida = notificacoes.get(opcao - 1);
            servico.notificarCliente(notificacaoEscolhida, mensagem);
        } else {
            System.out.println("❌ Opção inválida! Escolha 1, 2 ou 3.");
        }

        scanner.close();
    }
}
