package com.hanseltritama.mvparchitecture.Model

interface IUser {
    fun getEmail(): String
    fun getPassword(): String
    fun isValidData(): Boolean
}