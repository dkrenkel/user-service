package com.dkrenkel.user.dto

import java.time.LocalDate

data class UserDTO(
        val id: String,
        val email: String,
        val firstName: String,
        val lastName: String,
        val birthDate: LocalDate
) {
}