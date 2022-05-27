package Lecture4.Bank;

public class Main {
    public static boolean getCreditForClient (BankWorker bankWorker, BankClient bankClient)  {
        try {
            if (bankWorker.checkClientForCredit(bankClient) == true) {
                return true;
            }
        } catch (BadCreditHistoryException b) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException p) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        BankWorker bankWorker = new BankWorker() {
            @Override
            public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
                if (bankClient.lawHistory == false) {
                    throw new ProblemWithLawException();
                }
                if (bankClient.creditHistory == false) {
                    throw new BadCreditHistoryException();
                }
                return (bankClient.creditHistory == true && bankClient.lawHistory == true) ? true : false;
            }
        };
        BankClient bankClient = new BankClient(false, false);
        System.out.println(getCreditForClient(bankWorker, bankClient));
    }

}