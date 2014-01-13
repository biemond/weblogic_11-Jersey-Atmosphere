package nl.amis.rest.product.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
    public String author = "";
    public String message = "";

    public Message(){
    }

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
