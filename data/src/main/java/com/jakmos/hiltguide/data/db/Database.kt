package com.jakmos.hiltguide.data.db

import com.jakmos.hiltguide.domain.model.User
import javax.inject.Inject

/**
 * Simple in-memory database.
 */
internal class Database @Inject constructor() {

    private val users: MutableList<User> = mutableListOf()

    fun getUsers(): List<User> = users
}
