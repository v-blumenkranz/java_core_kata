package Lecture4.Post;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    private Logger logger;

    Spy (Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (((MailMessage) mail).getFrom() == TestAll.AUSTIN_POWERS) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[]{
                                ((MailMessage) mail).getFrom(), ((MailMessage) mail).getTo(), (((MailMessage) mail).getMessage())});
                return mail;
            }
            if (((MailMessage) mail).getTo() == TestAll.AUSTIN_POWERS) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[]{
                                ((MailMessage) mail).getFrom(), ((MailMessage) mail).getTo(), (((MailMessage) mail).getMessage())});
                return mail;
            }
            logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                    new Object[]{((MailMessage) mail).getFrom(), ((MailMessage) mail).getTo()});
        }
        return mail;
    }
}

