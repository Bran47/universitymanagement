public class universtysystem {
    public static void main(String[] args) {
        // Create offices (Composition)
        Office office1 = new Office("A101", "1234");
        Office office2 = new Office("B202", "5678");

        // Create departments with offices
        Department csDept = new Department("Computer Science", office1);
        Department engDept = new Department("English", office2);

        // Create staff
        Lecturer lect1 = new Lecturer("Dr. Alice", "L001", "AI");
        Lecturer lect2 = new Lecturer("Dr. Bob", "L002", "Literature");
        AdminStaff admin = new AdminStaff("Mr. Smith", "A101", "Registrar");

        // Associate staff with departments (Association)
        lect1.addDepartment(csDept);
        lect2.addDepartment(engDept);
        admin.addDepartment(csDept);
        admin.addDepartment(engDept);

        // Create course (Aggregation)
        Course course1 = new Course("CS101", "Intro to Programming");
        course1.addLecturer(lect1);
        course1.addLecturer(lect2);

        // Display outputs

        System.out.println("----- DEPARTMENTS (Composition) -----");
        System.out.println(csDept.getDepartmentInfo());
        System.out.println(engDept.getDepartmentInfo());

        System.out.println("\n----- STAFF ROLES (Polymorphism) -----");
        System.out.println(lect1.getRoleDetails());
        System.out.println(lect2.getRoleDetails());
        System.out.println(admin.getRoleDetails());

        System.out.println("\n----- COURSE INFO (Aggregation) -----");
        System.out.println(course1.getCourseInfo());

        System.out.println("\n----- STAFF-DEPARTMENT ASSOCIATION -----");
        displayStaffDepartments(lect1);
        displayStaffDepartments(lect2);
        displayStaffDepartments(admin);
    }

    // Helper method to print departments associated with a staff
    public static void displayStaffDepartments(Staff staff) {
        List<Department> departments = staff.getDepartments();
        System.out.print(staff.name + " is associated with: ");
        for (int i = 0; i < departments.size(); i++) {
            System.out.print(departments.get(i).getName());
            if (i < departments.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
    }
}
