package com.example.medicine_integration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medicine_integration.net.data_base.UserDataCommunication;
import com.example.medicine_integration.net.data_base.UserRunnables;

public class LoginActivity extends AppCompatActivity {

    private UserDataCommunication communication;
    private Button btn_main_return_home;
    private Button btn_login;
    private Button btn_sub_return_home;
    private EditText edit_phone;
    private EditText edit_password;
    private TextView text_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        pageTurn();
    }

    private void initView() {
        communication = new UserDataCommunication(getApplicationContext());
        btn_login = findViewById(R.id.button_login_page_login);
        btn_main_return_home = findViewById(R.id.login_return_home_button);
        btn_sub_return_home = findViewById(R.id.button_login_page_return);
        edit_phone = findViewById(R.id.edit_phone);
        edit_password = findViewById(R.id.edit_password);
        text_button = findViewById(R.id.register_to_login_text);
    }

    private void pageTurn() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edit_phone.getText().toString();
                String pwd = edit_password.getText().toString();

                if ("".equals(userName)) {
                    Toast.makeText(LoginActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("".equals(pwd)) {
                    Toast.makeText(LoginActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                UserRunnables runnables = new UserRunnables();

                runnables.setLoginSuccess(() -> {
                    Intent intent = new Intent(LoginActivity.this, MainPageActivity.class);
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                    finish();
                });

                runnables.setNoAccount(() ->
                        Toast.makeText(LoginActivity.this, "账号不存在", Toast.LENGTH_SHORT).show()
                );

                runnables.setWrongPassword(() ->
                        Toast.makeText(LoginActivity.this, "密码错误", Toast.LENGTH_SHORT).show()
                );

                runnables.setConnectException(() ->
                        Toast.makeText(LoginActivity.this, "网络连接错误", Toast.LENGTH_SHORT).show()
                );

                runnables.setSocketTimeOut(() ->
                        Toast.makeText(LoginActivity.this, "网络连接超时", Toast.LENGTH_SHORT).show()
                );

                communication.login(userName, pwd, runnables);
            }
        });

        btn_main_return_home.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
            startActivity(intent);
        });

        btn_sub_return_home.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
            startActivity(intent);
        });

        text_button.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
