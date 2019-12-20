package by.bsuir.ppvis.familybudjet.domain;

public interface FamilyBudgetManager {
	public static final String OWNER = "";
    public static final String FOREIGN_USER = "";
    public static final String PROGRAM_NAME = "";
    public static final String AUTHORIZATION_HEADER = "";
    public static final String OWNER_IMAGE = "";
    public static final String FOREIGNER_IMAGE = "";

    public void load();

    public void show();

    public void authorization();

    public void authorizationValidation();

    public void loadImage();
}
