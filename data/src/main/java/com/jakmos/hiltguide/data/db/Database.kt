package com.jakmos.hiltguide.data.db

import com.jakmos.hiltguide.domain.model.User
import javax.inject.Inject

/**
 * Simple in-memory database.
 */
internal class Database @Inject constructor() {

    private val users: MutableList<User> = mutableListOf(
        User("1", "John Doe"),
        User("2", "Jane Doe"),
    )

    fun getUser(id: String): User? = users.find { it.id == id }
}
