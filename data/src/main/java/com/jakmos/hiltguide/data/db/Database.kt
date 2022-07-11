package com.jakmos.hiltguide.data.db

import com.jakmos.hiltguide.domain.model.User

/**
 * Simple in-memory database.
 * Let's pretend that's a class from some library (thus missing the @Inject constructor()).
 */
class Database {

    private val users: MutableList<User> = mutableListOf(
        User("1", "John Doe"),
        User("2", "Jane Doe"),
    )

    fun getUser(id: String): User? = users.find { it.id == id }
}
