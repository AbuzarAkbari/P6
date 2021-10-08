import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="reiziger")
public class ReizigerHibernate {
    @Id
    @Column(name = "reiziger_id")
    private int id;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboorteDatum;

    @OneToOne
    @Transient
    private AdresHibernate adres;

    @OneToMany
    @Transient
    private ArrayList<OVChipkaartHibernate> ovChipkaart;

    public ReizigerHibernate() {

    }

    public ReizigerHibernate(int id, String voorletters, String tussenvoegsel, String achternaam, Date geboorteDatum) {
        this.id = id;
        this.voorletters = voorletters;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.geboorteDatum = geboorteDatum;
    }


    @Override
    public String toString() {
        return "ReizigerDAOHibernate{" +
                "id=" + id +
                ", voorletters='" + voorletters + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", geboorteDatum=" + geboorteDatum +
                ", adres=" + adres +
                ", ovChipkaart=" + ovChipkaart +
                '}';
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }
    public String getVoorletters() {
        return voorletters;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }
    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    public String getAchternaam() {
        return achternaam;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }
    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setOvChipkaart(ArrayList<OVChipkaartHibernate> ovChipkaart) {
        this.ovChipkaart = ovChipkaart;
    }
    public ArrayList<OVChipkaartHibernate> getOvChipkaart() {
        return ovChipkaart;
    }

    public void setAdres(AdresHibernate adres) {
        this.adres = adres;
    }
    public AdresHibernate getAdres() {
        return adres;
    }
}