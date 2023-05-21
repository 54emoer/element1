package pojo;

public class Course {
    private Integer id;
    private String name;
    private Integer hours;
    private Integer sid;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer getHour(){
        return hours;
    }
    public void setHours(Integer hour)
    {
        this.hours=hour;
    }
    public Integer getSid(){
        return sid;
    }
    public void setSid(Integer sid){
        this.sid=sid;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name  +
                ", hours=" + hours +
                ", schools=" + sid +
                '}';
    }
}
