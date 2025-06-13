public class lecturer extends staff{
    public String specialization;

    public lecturer(String name, String staffId, String specialization) {
        super (name, staffId);
        this.specialization = specialization;
    }

    @Override
    public String getRoleDetails() {
        return "Lecturer: " + name + ", Specialization: " + specialization;
    }
}

