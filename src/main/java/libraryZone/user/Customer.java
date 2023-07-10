package libraryZone.user;

import static libraryZone.user.UserType.customer;

public class Customer extends User{
    public Customer(long id, String userName, String password) {
        super(id, userName, password);
    }

    @Override
    public UserType getType() {
        return customer;
    }
}
