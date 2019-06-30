package com.dkrenkel.user.control

import com.dkrenkel.user.dto.UserDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class UserController {

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id: String): UserDTO {
        return UserDTO(id = "id", firstName = "David", lastName = "Krenkel", email = "", birthDate = LocalDate.now())
    }
}