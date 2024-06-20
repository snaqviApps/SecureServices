package learn.backend.secure.oauth.app.repository

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class SecurityService {

    @Value("\${message}")
    lateinit var message: String

    fun receiveUserInformation(username: String) = "Customer's introductory remarks: $username, $message"
}