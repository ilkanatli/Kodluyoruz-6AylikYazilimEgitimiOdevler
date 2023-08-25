import com.patikadev.Model.Operator;
import com.patikadev.View.OperatorGUI;

public class Main {
    public static void main(String[] args) {
        Operator op = new Operator();
        op.setId(1);
        op.setName("İlkan Atlı");
        op.setPass("1234");
        op.setType("OPERATOR");
        op.setU_name("ilkan");

        OperatorGUI opGUI = new OperatorGUI(op);
    }
}
