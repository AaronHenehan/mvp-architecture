package com.hanseltritama.mvparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hanseltritama.mvparchitecture.Presenter.LoginPresenter
import com.hanseltritama.mvparchitecture.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    private lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        btn_login.setOnClickListener {
            loginPresenter.onLogin(edit_email.text.toString(), edit_password.text.toString())
        }

    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
