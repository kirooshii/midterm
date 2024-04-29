package midterm.makar_lavrov_1.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Makar Lavrov";

    public String toString() {
        String result = "";

        result = "Fantasy Object: studentName= " + studentName;
        return result;
    }

    @Override
    public String getLiterature1() {
        return "Literature1";
    }

    @Override
    public String getSocks2() {
        return "getSocks2";
    }

    @Override
    public String methodControl3(String argEnterprise5) {
        return "argEnterprise5";
    }

    @Override
    public List<String> methodVibrations4(String argMap6) {
        return new ArrayList<>();
    }
}