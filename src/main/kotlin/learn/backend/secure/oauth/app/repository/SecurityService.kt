package learn.backend.secure.oauth.app.repository

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

/**
 * It is where something called 'Business Logic',
 * implemented
 */
@Service
class SecurityService {

    private val logger = KotlinLogging.logger {}

    @Value("\${message}")
    lateinit var message: String

    fun getIntroduction(userName: String) : String {
        logger.debug { "userName-d: $userName" }
        logger.info { "userName-i: $userName" }
        return "Customer's introductory remarks: $userName, $message"
    }
}