package cn.kgc.crowd.entity;

public class Xiaoshuo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.id
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.name
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.auther
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private String auther;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.typeid
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.createtime
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private String createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.image
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xiaoshuo.vip
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    private String vip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.id
     *
     * @return the value of xiaoshuo.id
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.id
     *
     * @param id the value for xiaoshuo.id
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.name
     *
     * @return the value of xiaoshuo.name
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.name
     *
     * @param name the value for xiaoshuo.name
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.auther
     *
     * @return the value of xiaoshuo.auther
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public String getAuther() {
        return auther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.auther
     *
     * @param auther the value for xiaoshuo.auther
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setAuther(String auther) {
        this.auther = auther == null ? null : auther.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.typeid
     *
     * @return the value of xiaoshuo.typeid
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.typeid
     *
     * @param typeid the value for xiaoshuo.typeid
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.createtime
     *
     * @return the value of xiaoshuo.createtime
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.createtime
     *
     * @param createtime the value for xiaoshuo.createtime
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.image
     *
     * @return the value of xiaoshuo.image
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.image
     *
     * @param image the value for xiaoshuo.image
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xiaoshuo.vip
     *
     * @return the value of xiaoshuo.vip
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public String getVip() {
        return vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xiaoshuo.vip
     *
     * @param vip the value for xiaoshuo.vip
     *
     * @mbg.generated Sat Aug 08 21:17:23 CST 2020
     */
    public void setVip(String vip) {
        this.vip = vip == null ? null : vip.trim();
    }

    @Override
    public String toString() {
        return "Xiaoshuo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", typeid=" + typeid +
                ", createtime='" + createtime + '\'' +
                ", image='" + image + '\'' +
                ", vip='" + vip + '\'' +
                '}';
    }

    public Xiaoshuo() {
    }

    public Xiaoshuo(Integer id, String name, String auther, Integer typeid, String createtime, String image, String vip) {
        this.id = id;
        this.name = name;
        this.auther = auther;
        this.typeid = typeid;
        this.createtime = createtime;
        this.image = image;
        this.vip = vip;
    }
}