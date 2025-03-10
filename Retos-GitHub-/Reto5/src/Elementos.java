package src;
public class Elementos {
    private String papel;
    private String piedra;
    private String tijera;
    private String spock;
    private String lagarto;

    public Elementos() {

    }

    public Elementos(String papel, String piedra, String tijera, String spock, String lagarto) {
        this.papel = papel;
        this.piedra = piedra;
        this.tijera = tijera;
        this.spock = spock;
        this.lagarto = lagarto;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getPiedra() {
        return piedra;
    }

    public void setPiedra(String piedra) {
        this.piedra = piedra;
    }

    public String getTijera() {
        return tijera;
    }

    public void setTijera(String tijera) {
        this.tijera = tijera;
    }

    public String getSpock() {
        return spock;
    }

    public void setSpock(String spock) {
        this.spock = spock;
    }

    public String getLagarto() {
        return lagarto;
    }

    public void setLagarto(String lagarto) {
        this.lagarto = lagarto;
    }
}
