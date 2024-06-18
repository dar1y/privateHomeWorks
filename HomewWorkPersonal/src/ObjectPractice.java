import java.util.Objects;

public class ObjectPractice {
       public static void main(String[] args) {
        ObjectPractice2 op = new ObjectPractice2("hello t everyone");
           ObjectPractice2 op1 = new ObjectPractice2("hello t everyone");
//           System.out.println(op.hashCode());
//           System.out.println(op1.hashCode());
//           System.out.println(op.equals(op1));
           System.out.println(op.getClass());
    }

}
class ObjectPractice2{
    @Override
    public int hashCode() {
        return str.hashCode()+10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectPractice2)) return false;
        ObjectPractice2 that = (ObjectPractice2) o;
        return Objects.equals(str, that.str);
    }

    String str;
    public ObjectPractice2(String str){
        this.str = str;
    }
}
