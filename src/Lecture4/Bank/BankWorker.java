package Lecture4.Bank;

public interface BankWorker {
    boolean checkClientForCredit (BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
