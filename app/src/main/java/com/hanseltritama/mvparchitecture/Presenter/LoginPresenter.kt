package com.hanseltritama.mvparchitecture.Presenter

import com.hanseltritama.mvparchitecture.Model.User
import com.hanseltritama.mvparchitecture.View.ILoginView

class LoginPresenter(iLoginView: ILoginView) : ILoginPresenter {

    private val loginView: ILoginView = iLoginView

    override fun onLogin(email: String, password: String) {
        // get User from Model
        val user = User(email, password)
        val loginCode: Int = user.isValidData()

        when (loginCode) {
            0 -> {
                loginView.onLoginError("You must enter you email!")
            }
            1 -> {
                loginView.onLoginError("You must enter valid email!")
            }
            2 -> {
                loginView.onLoginError("Password length must be greater than 6")
            }
            else -> {
                loginView.onLoginResult("Login Success")
            }
        }
    }

}