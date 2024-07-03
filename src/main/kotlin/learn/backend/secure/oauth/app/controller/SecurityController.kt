package learn.backend.secure.oauth.app.controller

import learn.backend.secure.oauth.app.repository.ImageryService
import learn.backend.secure.oauth.app.repository.SecurityService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.io.IOException


@RestController
@RequestMapping("/v1/securities")
class SecurityController(val securityService: SecurityService) {

    @GetMapping("/{userIntro}")
    fun introduce(@PathVariable("userIntro") inputReceived: String): String {
        return securityService.getIntroduction(inputReceived)
    }
}

@RestController
@RequestMapping("/v2/socialservices")
class ResourcesController (val imageryService: ImageryService) {

    lateinit var image: ByteArray

    @GetMapping("/image/{imageId}",
        produces = [MediaType.IMAGE_JPEG_VALUE]
        )
    @ResponseBody
    fun getImageResource(@PathVariable("imageId") imageId: String): ByteArray {
        try {
            imageryService.getImage(imageId)?.let { it: ByteArray ->
                image = it
            }
        } catch (e: IOException) {
            println("Image-service-rendering error: ${e.message}")
        }
       return image
    }
}