import java.util.ArrayList;

public class staff {
    private final ArrayList<Object> departments;
    protected String name;
    protected String staffID;

    public staff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
        this.departments = new ArrayList<>();
    }

    // Method to be overridden
    public String getRoleDetails() {
        String staffId = "";
        return name + " (ID: " + staffId + ") is a university staff member.";
    }

    // Add department (Association)
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}




