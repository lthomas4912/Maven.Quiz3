package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab, LabStatus> map;


    public Student() {
        this(new HashMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = map;

    }

    public Lab getLab(String labName) {
        for (Lab key : map.keySet()) {
            if (key.getName().equals(labName))
                return key;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

    }

    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}

