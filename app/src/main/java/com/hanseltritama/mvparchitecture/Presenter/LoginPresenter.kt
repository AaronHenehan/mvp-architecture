package com.hanseltritama.mvparchitecture.Presenter

import com.hanseltritama.mvparchitecture.Model.User
import com.hanseltritama.mvparchitecture.View.ILoginView

class LoginPresenter(iLoginView: ILoginView) : ILoginPresenter {

    private val loginView: ILoginView = iLoginView

    override fun onLogin(email: String, password: String) {
        // get User from Model
        val user = User(email, password)
        val isLoginSuccess: Boolean = user.isValidData()

        if (isLoginSuccess) {
            loginView.onLoginResult("Login Success!")
        } else {
            loginView.onLoginResult("Login Error!")
        }
    }

}