package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab, LabStatus> map;


    public Student() {
        this.map =(new TreeMap<>());
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
        Lab lab = getLab(labName);
        if(lab == null){
            throw new UnsupportedOperationException();
        }
        map.put(lab,labStatus);

    }

    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.PENDING);

    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return map.get(lab);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<Lab, LabStatus> entry : map.entrySet()){
            builder.append(entry.getKey(). getName());
            builder.append(" > ");
            builder.append(entry.getValue().toString());
            builder.append("\n");
        }
        return null;
    }


}

