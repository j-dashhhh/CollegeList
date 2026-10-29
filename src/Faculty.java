class Faculty extends Employee {
    private boolean status;

    public void setRegular(boolean newStatus) {
        status = newStatus;
    }

    public boolean isRegular() {
        return status;
    }
}