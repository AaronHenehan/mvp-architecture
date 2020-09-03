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

    override fun isValidData(): Int {
        return if (TextUtils.isEmpty(getEmail())) {
            0
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()) {
            1
        } else if (getPassword().length <= 6) {
            2
        } else {
            -1
        }
    }

}