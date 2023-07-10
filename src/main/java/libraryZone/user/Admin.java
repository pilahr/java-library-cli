package libraryZone.user;

import static libraryZone.user.UserType.admin;

public class Admin extends User{


    public Admin(long id, String userName, String password) {
        super(id, userName, password);
    }

    @Override
    public UserType getType() {
        return admin;
    }


}
