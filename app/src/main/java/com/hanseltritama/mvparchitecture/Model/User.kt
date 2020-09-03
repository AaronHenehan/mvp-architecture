package com.hanseltritama.mvparchitecture.Model

import android.text.TextUtils
import android.util.Patterns

class User(email: String, password: String) : IUser {

    private val email = email
    private val password = password

    override fun getEmail(): String {
        return email
    }

    override fun getPassword(): String {
        return password
    }

    override fun isValidData(): Boolean {
        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length > 6
    }

}