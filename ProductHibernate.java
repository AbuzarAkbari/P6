import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="product")
public class ProductHibernate {
    @Id
    @Column(name = "product_nummer")
    private int product_nummer;
    private String naam;
    private String beschrijving;
    private Double prijs;

    @ManyToMany
    @Transient
    private ArrayList<OVChipkaartHibernate> ovChipkaart;

    public ProductHibernate() {

    }

    public ProductHibernate( int product_nummer, String naam, String beschrijving, Double prijs) {
        this.product_nummer=product_nummer;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
    }


    @Override
    public String toString() {
        return "ProductDAOHibernate{" +
                "product_nummer=" + product_nummer +
                ", naam='" + naam + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                ", prijs=" + prijs +
                ", ovChipkaart=" + ovChipkaart +
                '}';
    }

    public int getProduct_nummer() {
        return product_nummer;
    }
    public void setProduct_nummer(int product_nummer) {
        this.product_nummer = product_nummer;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }
    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Double getPrijs() {
        return prijs;
    }
    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }


    public void setOvChipkaart(ArrayList<OVChipkaartHibernate> ovChipkaart) {
        this.ovChipkaart = ovChipkaart;
    }

    public ArrayList<OVChipkaartHibernate> getOvChipkaart() {
        return ovChipkaart;
    }

}