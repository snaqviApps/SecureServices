package learn.backend.secure.oauth.app.controller


import learn.backend.secure.oauth.app.repository.SecurityService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/securities")
class SecurityController(val securityService: SecurityService) {

    @GetMapping("/{userIntro}")
    fun introduce(@PathVariable("userIntro") inputReceived: String): String {
        return securityService.receiveUserInformation(inputReceived)
    }
}