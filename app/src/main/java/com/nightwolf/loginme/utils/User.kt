package com.nightwolf.loginme.utils

object UserManager {
    private val users = mutableMapOf<String, String>()

    init {
        // Add the static user
        users["pengguna"] = "masuk"
    }

    fun registerUser(username: String, password: String): Boolean {
        if (users.containsKey(username)) {
            return false
        }
        users[username] = password
        return true
    }

    fun validateCredentials(username: String, password: String): Boolean {
        return users[username] == password
    }
}
