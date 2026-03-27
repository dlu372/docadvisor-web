package com.example.medicine_integration.net.data_base;

public class UserRunnables extends BaseRunnables {

    public Runnable LoginSuccess;
    public Runnable WrongPassword;
    public Runnable NoAccount;
    public Runnable RegisterSuccess;
    public Runnable AccountAlreadyHave;
    public Runnable ResetSuccess;

    public void setLoginSuccess(Runnable loginSuccess) {
        LoginSuccess = loginSuccess;
    }

    public void setWrongPassword(Runnable wrongPassword) {
        WrongPassword = wrongPassword;
    }

    public void setNoAccount(Runnable noAccount) {
        NoAccount = noAccount;
    }

    public void setRegisterSuccess(Runnable registerSuccess) {
        RegisterSuccess = registerSuccess;
    }

    public void setAccountAlreadyHave(Runnable accountAlreadyHave) {
        AccountAlreadyHave = accountAlreadyHave;
    }

    public void setResetSuccess(Runnable resetSuccess) {
        ResetSuccess = resetSuccess;
    }

    public void setConnectException(Runnable connectException) {
        ConnectException = connectException;
    }

    public void setSocketTimeOut(Runnable socketTimeOut) {
        SocketTimeOut = socketTimeOut;
    }
}
