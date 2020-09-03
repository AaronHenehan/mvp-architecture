package com.hanseltritama.mvparchitecture.View

interface ILoginView {
    fun onLoginResult(message: String)
    fun onLoginError(message: String)
}