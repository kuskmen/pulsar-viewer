package net.osomahe.pulsarviewer.read.entity;

public class PulsarReaderException extends RuntimeException {

    public PulsarReaderException(String topicName, Exception e) {
        super("Cannot create pulsar reader for topic: " + topicName, e);
    }

    public PulsarReaderException(String topicName, String messageId, Exception e) {
        super("Cannot create pulsar reader for topic: " + topicName + ", and messageId: " + messageId, e);
    }
}
