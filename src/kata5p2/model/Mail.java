package kata5p2.model;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        int ini = mail.indexOf("@") + 1;
        if (ini == -1){
            return null;
        }else {
            return mail.substring(ini);
        }
    }
}