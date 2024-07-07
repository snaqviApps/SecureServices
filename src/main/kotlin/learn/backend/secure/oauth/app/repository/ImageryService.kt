package learn.backend.secure.oauth.app.repository

import org.springframework.stereotype.Service
import java.io.InputStream

@Service
class ImageryService {

    lateinit var inStreamImage: InputStream

    fun getImage(imageId: String): ByteArray? {
        if(imageId.toInt() > 0) {
            javaClass.getResourceAsStream(
                "/images/morning.jpg")?.let {
                inStreamImage = it
            }
        }
        return inStreamImage.readAllBytes() as ByteArray
    }
}