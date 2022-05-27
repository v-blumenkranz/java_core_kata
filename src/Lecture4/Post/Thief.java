package Lecture4.Post;

public class Thief implements MailService{
    private final int minValue;
    private int stolenValue;

    public Thief (int minValue) {
        this.minValue = minValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= minValue) {
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                Package emulatedPackage = new Package("stones instead of" + ((MailPackage) mail).getContent().getContent(), 0);
                MailPackage stolenPackage = new MailPackage(mail.getFrom(), mail.getTo(), emulatedPackage);
                return stolenPackage;
            }
        }
        return mail;
    }

    public int getStolenValue () {
        return stolenValue;
    }


}
