package se.iths.luis.webserviceslabb2;



import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Data
@Entity
@NoArgsConstructor
public class Mail {
    @Id @GeneratedValue private long id;
    private String to;
    private String subject;
    private String text;
    private Date sent;

    public Mail(long id, String to, String subject, String text) {
        this.id = id;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    public Mail(long id, String to, String subject, String text, Date sent) {
        this.id = id;
        this.to = to;
        this.subject = subject;
        this.text = text;
        this.sent = sent;
    }
}