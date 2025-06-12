package school;

public class EmailNotification extends Notification<String[]> {

    private final String cc;
    private final String bcc;

    // constructor 
    private EmailNotification(Builder builder) {
        super(new String[]{builder.recipient, builder.subject, builder.body});
        this.cc = builder.cc;
        this.bcc = builder.bcc;
    }

    public String getRecipient() {
        return getContent()[0];
    }

    public String getSubject() {
        return getContent()[1];
    }

    public String getBody() {
        return getContent()[2];
    }

    // getters
    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public static class Builder {

        private final String recipient;
        private final String subject;
        private final String body;

        // Optional
        private String cc = null;
        private String bcc = null;

        public Builder(String recipient, String subject, String body) {
            this.recipient = recipient;
            this.subject = subject;
            this.body = body;
        }

        public Builder withCc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder withBcc(String bcc) {
            this.bcc = bcc;
            return this;
        }

        
        public EmailNotification build() {
            return new EmailNotification(this);
        }
    }
}