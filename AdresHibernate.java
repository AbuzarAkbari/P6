import javax.persistence.*;

@Entity
@Table(name="adres")
public class AdresHibernate {
    @Id
    @Column(name = "adres_id")
    private int    id;
    private String huisnummer;
    private String straat;
    private String woonplaats;
    private String postcode;
    private int reiziger_id;

    @OneToOne
    @Transient
    private ReizigerHibernate reiziger;

    public AdresHibernate() {

    }

    public AdresHibernate (int id, String straat, String huisnummer, String woonplaats, String postcode, int reiziger_id) {
        this.id = id;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.woonplaats = woonplaats;
        this.postcode = postcode;
        this.reiziger_id = reiziger_id;
    }


    @Override
    public String toString() {
        return "AdresDAOHibernate{" +
                "id=" + id +
                ", huisnummer='" + huisnummer + '\'' +
                ", straat='" + straat + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", postcode='" + postcode + '\'' +
                ", reiziger_id=" + reiziger_id +
                ", reiziger=" + reiziger +
                '}';
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getStraat() {return straat;}
    public void setStraat(String straat) {this.straat = straat;}

    public String getHuisnummer() {return huisnummer;}
    public void setHuisnummer(String huisnummer) {this.huisnummer = huisnummer;}

    public String getWoonplaats() {return woonplaats;}
    public void setWoonplaats(String woonplaats) {this.woonplaats = woonplaats;}

    public String getPostcode() {return postcode;}
    public void setPostcode(String postcode) {this.postcode = postcode;}

    public int getReiziger_id() {return this.reiziger_id;}
    public void setReiziger_id(int reiziger_id) {this.reiziger_id = reiziger_id;}

    public ReizigerHibernate getReiziger() {return this.reiziger;}

    public void setReiziger(ReizigerHibernate reiziger) {
        this.reiziger = reiziger;
    }
}
