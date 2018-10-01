package pfr.center.models;

public class Person {
    private Long id;
    private String fa;
    private String im;
    private String ot;
    private String dolzhnost;
    private int pens;

    public Person(Long id, String fa, String im, String ot, String dolzhnost, int pens) {
        this.id = id;
        this.fa = fa;
        this.im = im;
        this.ot = ot;
        this.dolzhnost = dolzhnost;
        this.pens = pens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    public int getPens() {
        return pens;
    }

    public void setPens(int pens) {
        this.pens = pens;
    }
}
