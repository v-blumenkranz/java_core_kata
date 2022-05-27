package Lecture4.Post;

public class UntrustworthyMailWorker implements MailService{
    MailService [] otherWorkers;
    private final RealMailService realMailService = new RealMailService();


    UntrustworthyMailWorker (MailService [] otherWorkers) {
        this.otherWorkers = otherWorkers;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (MailService otherWorker : otherWorkers) {
            processed = otherWorker.processMail(processed);
            }
        return realMailService.processMail(processed);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }


}
