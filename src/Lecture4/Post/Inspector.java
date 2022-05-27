package Lecture4.Post;

public class Inspector implements MailService{
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent().contains(TestAll.BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (((MailPackage) mail).getContent().getContent().contains(TestAll.WEAPONS)) {
                throw new IllegalPackageException();
            }
            if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
