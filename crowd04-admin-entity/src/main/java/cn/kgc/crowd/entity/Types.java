package cn.kgc.crowd.entity;

public class Types {
    private Integer id;
    private  String typename;

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                '}';
    }

    public Types() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Types(Integer id, String typename) {
        this.id = id;
        this.typename = typename;
    }
}
