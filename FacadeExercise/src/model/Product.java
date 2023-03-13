package model;

public class Product {
    private Integer id;
    private Integer qtd;
    private String name;

    public Product(Integer id, Integer qtd, String name) {
        this.id = id;
        this.qtd = qtd;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " -- " + name + " -- " + qtd;
    }
}
