package nl.amis.rest.product.entities;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Response {

    public String text;
    public String author;
    public long time;

    public Response(String author, String text) {
        this.author = author;
        this.text = text;
        this.time = new Date().getTime();
    }

    public Response() {
    }
}
