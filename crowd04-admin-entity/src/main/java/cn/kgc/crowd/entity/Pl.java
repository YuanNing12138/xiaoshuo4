package cn.kgc.crowd.entity;

public class Pl {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pl.id
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pl.xiaoshuoid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    private Integer xiaoshuoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pl.content
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pl.userid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pl.createtime
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    private String createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pl.id
     *
     * @return the value of pl.id
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pl.id
     *
     * @param id the value for pl.id
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pl.xiaoshuoid
     *
     * @return the value of pl.xiaoshuoid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public Integer getXiaoshuoid() {
        return xiaoshuoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pl.xiaoshuoid
     *
     * @param xiaoshuoid the value for pl.xiaoshuoid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public void setXiaoshuoid(Integer xiaoshuoid) {
        this.xiaoshuoid = xiaoshuoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pl.content
     *
     * @return the value of pl.content
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pl.content
     *
     * @param content the value for pl.content
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pl.userid
     *
     * @return the value of pl.userid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pl.userid
     *
     * @param userid the value for pl.userid
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pl.createtime
     *
     * @return the value of pl.createtime
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */
    public String getCreatetime() {
        return createtime;
    }

    @Override
    public String toString() {
        return "Pl{" +
                "id=" + id +
                ", xiaoshuoid=" + xiaoshuoid +
                ", content='" + content + '\'' +
                ", userid=" + userid +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public Pl() {
    }

    public Pl(Integer id, Integer xiaoshuoid, String content, Integer userid, String createtime) {
        this.id = id;
        this.xiaoshuoid = xiaoshuoid;
        this.content = content;
        this.userid = userid;
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pl.createtime
     *
     * @param createtime the value for pl.createtime
     *
     * @mbg.generated Fri Aug 07 21:29:12 CST 2020
     */


    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}