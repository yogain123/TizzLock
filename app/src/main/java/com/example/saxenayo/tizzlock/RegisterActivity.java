package com.example.saxenayo.tizzlock;

/**
 * Created by SaxenaYo on 4/15/2016.
 */
        import android.R.string;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class RegisterActivity extends Activity {

        EditText name, username, email, password, tizzkey;
        Button register;
        DatabaseHandler db;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        name= (EditText)findViewById(R.id.name);
        username =(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        email =(EditText)findViewById(R.id.emailid);
        tizzkey=(EditText)findViewById(R.id.tizzkey);


        register=(Button)findViewById(R.id.register);



        register.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {
        // TODO Auto-generated method stub

        String edname = name.getText().toString();
        String edusername = username.getText().toString();
        String edpassword = password.getText().toString();
        String edemailid = email.getText().toString();
        String edtizzkey = tizzkey.getText().toString();



        db = new DatabaseHandler(RegisterActivity.this, null, null, 2);
        RegisterData reg = new RegisterData();

        reg.setName(edname);
        reg.setUsername(edusername);
        reg.setPassword(edpassword);
        reg.setEmailid(edemailid);
        reg.setTizzkey(edtizzkey);
        db.addregister(reg);

        Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(), ContentPage.class));
        }
        });
        }



        }
