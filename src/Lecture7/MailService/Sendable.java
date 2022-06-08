package Lecture7.MailService;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}