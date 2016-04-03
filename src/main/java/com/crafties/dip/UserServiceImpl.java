package com.crafties.dip;

public class UserServiceImpl implements UserService {

    private final Sha256HashProvider hashProvider;

    public UserServiceImpl() {
        hashProvider = new Sha256HashProvider();
    }

    @Override
    public User createUser(String firstName, String password) {
        String hashedPassword = hashProvider.hash(password);
        return new User(firstName, hashedPassword);
    }
}
