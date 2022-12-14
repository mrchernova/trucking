package by.trucking.model;

public enum Role {
    ADMINISTRATOR,
    CLIENT,
    ORGANIZATION,
    UNDEFINED;


    public static Role getByOrdinal(int ordinal) {
        Role[] values = Role.values();
        if(ordinal >= values.length || ordinal < 0) {
            return UNDEFINED;
        }
        return values[ordinal];
    }

}
