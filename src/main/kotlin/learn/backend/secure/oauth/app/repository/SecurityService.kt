package learn.backend.secure.oauth.app.repository

import mu.KLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class SecurityService {

    @Value("\${message}")
    lateinit var message: String

    companion object: KLogging()

    fun receiveUserInformation(userName: String) : String {

        logger.info("Name is: $userName")
        return "Customer's introductory remarks: $userName, $message"
    }
}