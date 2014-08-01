package com.redhat.fuse.example.jaas;

import javax.security.auth.callback.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyCallbackHandler implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws UnsupportedCallbackException {

        String password = null;

        // Loop over all Callbacks
        for (int i = 0; i < callbacks.length; i++) {
            Callback cb = callbacks[i];

            if (cb instanceof NameCallback) {
                ((NameCallback) cb).getName();
            } else if (cb instanceof PasswordCallback) {
                ((PasswordCallback)cb).setPassword(password.toCharArray());
            } else {
                throw new UnsupportedCallbackException(
                        cb, "Unrecognized Callback");
            }
        }

    }

}
