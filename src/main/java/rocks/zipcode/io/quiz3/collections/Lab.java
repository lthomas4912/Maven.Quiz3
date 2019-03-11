package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;

    public Lab() {
        labName = "";
    }

    public Lab(String labName) {
       this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }
}
