package Lecture7.MailService;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new ArrayList<>());
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> tSendable) {
        mailBox.computeIfAbsent(tSendable.getTo(), value -> new ArrayList<>());
        mailBox.get(tSendable.getTo()).add(tSendable.getContent());
    }
}
