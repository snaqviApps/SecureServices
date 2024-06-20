package learn.backend.secure
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecureAppOauthApplication

fun main(args: Array<String>) {
	runApplication<SecureAppOauthApplication>(*args)
}
