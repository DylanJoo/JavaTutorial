import java.util.Date;

public class cat {
    private String name;
    private Date birthday;

    public cat() {
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setBirthday(Date birthday) { this.birthday = birthday; }
    public Date getBirthday() { return birthday; }

    public boolean equals(Object other) { 
        if (this == other) 
            return true; 

        if (!(other instanceof cat))  //instanceof 是只other 是否是cat的物件實體或是cat子類別的物件實體
            return false; 

        final cat cat = (cat) other; 

        if (!getName().equals(cat.getName())) 
            return false; 

        if (!getBirthday().equals(cat.getBirthday())) 
            return false; 

        return true; 
    } 

    public int hashCode() { 
        int result = getName().hashCode(); 
        result = 29 * result + getBirthday().hashCode(); 
        return result; 
    } 
    public static void main(String arg[]){
	
	cat c1 = new cat();
	cat c2 = c1;
	cat c3 = c2;
	cat c4 = new cat();
        System.out.print(c1.equals(c4));
    }
}
	
