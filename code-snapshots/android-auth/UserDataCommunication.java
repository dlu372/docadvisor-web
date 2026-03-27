package com.example.medicine_integration.net.data_base;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class UserDataCommunication {

    private static final String TAG = "UserDataCommunication";

    private final OkHttpClient client;
    private final Gson gson;
    private final Handler mainHandler;
    private final SharedPreferences preferences;

    private final String userUrl = "http://YOUR_SERVER_ADDRESS/User";
    private int userId = -1;

    public UserDataCommunication(Context context) {
        client = new OkHttpClient();
        gson = new Gson();
        mainHandler = new Handler(Looper.getMainLooper());
        preferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
    }

    public int login(String userName, String pwd, UserRunnables runnables) {
        FormBody formBody = new FormBody.Builder()
                .add("user_name", userName)
                .add("password", pwd)
                .build();

        Request request = new Request.Builder()
                .url(userUrl + "/login")
                .post(formBody)
                .build();

        Call call = client.newCall(request);

        Thread t = new Thread(() -> {
            try {
                Response response = call.execute();
                String json = Objects.requireNonNull(response.body()).string();
                Log.d(TAG, "run: " + json);

                DataBaseRet ret = gson.fromJson(json, DataBaseRet.class);
                runnables.ret = ret;
                preferences.edit().putInt("user_id", ret.id).apply();

                if (ret.ret == 1) {
                    userId = ret.id;
                    mainHandler.post(runnables.LoginSuccess);
                } else if (ret.ret == -1) {
                    mainHandler.post(runnables.NoAccount);
                } else if (ret.ret == -2) {
                    mainHandler.post(runnables.WrongPassword);
                }
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    mainHandler.post(runnables.SocketTimeOut);
                } else if (e instanceof ConnectException) {
                    mainHandler.post(runnables.ConnectException);
                }
            }
        });

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return userId;
    }

    public void register(String userName, String pwd, UserRunnables runnables) {
        FormBody formBody = new FormBody.Builder()
                .add("user_name", userName)
                .add("password", pwd)
                .build();

        Request request = new Request.Builder()
                .url(userUrl + "/register")
                .post(formBody)
                .build();

        Call call = client.newCall(request);

        Thread t = new Thread(() -> {
            try {
                Response response = call.execute();
                String json = Objects.requireNonNull(response.body()).string();
                DataBaseRet ret = gson.fromJson(json, DataBaseRet.class);
                runnables.ret = ret;

                if (ret.ret == 1) {
                    mainHandler.post(runnables.RegisterSuccess);
                } else if (ret.ret == 0) {
                    mainHandler.post(runnables.AccountAlreadyHave);
                }
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    mainHandler.post(runnables.SocketTimeOut);
                } else if (e instanceof ConnectException) {
                    mainHandler.post(runnables.ConnectException);
                }
            }
        });

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void retrieve(String userName, String pwd, String prePwd, UserRunnables runnables) {
        FormBody formBody = new FormBody.Builder()
                .add("user_name", userName)
                .add("old_password", prePwd)
                .add("password", pwd)
                .build();

        Request request = new Request.Builder()
                .url(userUrl + "/retrieve")
                .post(formBody)
                .build();

        Call call = client.newCall(request);

        Thread t = new Thread(() -> {
            try {
                Response response = call.execute();
                String json = Objects.requireNonNull(response.body()).string();
                DataBaseRet ret = gson.fromJson(json, DataBaseRet.class);
                runnables.ret = ret;

                if (ret.ret == 1) {
                    mainHandler.post(runnables.ResetSuccess);
                } else if (ret.ret == -1) {
                    mainHandler.post(runnables.NoAccount);
                } else if (ret.ret == -2) {
                    mainHandler.post(runnables.WrongPassword);
                }
            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    mainHandler.post(runnables.SocketTimeOut);
                } else if (e instanceof ConnectException) {
                    mainHandler.post(runnables.ConnectException);
                }
            }
        });

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
