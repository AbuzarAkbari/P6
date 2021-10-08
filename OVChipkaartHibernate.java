import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ov_chipkaart")
public class OVChipkaartHibernate {
    @Id
    @Column(name = "kaart_nummer")
    private int kaart_nummer;

    @Column(name = "geldig_tot")
    private Date geldigTot;
    private int klasse;
    private Double saldo;

    private int reiziger_id;

    @ManyToOne
    @Transient
    private ReizigerHibernate reiziger;

    @ManyToMany
    @Transient
    private List<ProductHibernate> product;

    public OVChipkaartHibernate() {

    }

    public OVChipkaartHibernate(int kaart_nummer, Date geldigTot, int klasse, Double saldo, int reiziger_id) {
        this.kaart_nummer = kaart_nummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger_id = reiziger_id;
    }


    @Override
    public String toString() {
        return "OVChipkaartDAOHibernate{" +
                "kaart_nummer=" + kaart_nummer +
                ", geldigTot=" + geldigTot +
                ", klasse=" + klasse +
                ", saldo=" + saldo +
                ", reiziger_id=" + reiziger_id +
                ", reiziger=" + reiziger +
                ", product=" + product +
                '}';
    }

    public int getKaart_nummer() {return kaart_nummer;}
    public void setKaart_nummer(int kaart_nummer) {this.kaart_nummer = kaart_nummer;}

    public Date getGeldigTot() {return geldigTot;}
    public void setGeldigTot(Date geldigTot) {this.geldigTot = geldigTot;}

    public int getKlasse() {return klasse;}
    public void setKlasse(int klasse) {this.klasse = klasse;}

    public Double getSaldo() {return saldo;}
    public void setSaldo(Double saldo) {this.saldo = saldo;}

    public int getReiziger_id() {return reiziger_id;}
    public void setReiziger_id(int reiziger_id) {this.reiziger_id = reiziger_id;}

    public ReizigerHibernate getReiziger() {
        return reiziger;
    }

    public void setReiziger(ReizigerHibernate reiziger) {
        this.reiziger = reiziger;
    }

    public List<ProductHibernate> getProduct() {
        return product;
    }

    public void setProduct(List<ProductHibernate> product) {
        this.product = product;
    }
}