package Lecture7.MailService;

public class MailMessage extends SimpleSendable<String>{
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
