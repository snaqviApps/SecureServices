package learn.backend.secure.oauth.app.repository

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.io.InputStream

@Service
class ImageryService {

    lateinit var inStreamImage: InputStream

    fun getImage(imageId: String): ByteArray? {
        if(imageId.toInt() > 0) {
            javaClass.getResourceAsStream(
                "/images/IMG_0847.jpg")?.let {
                inStreamImage = it
            }
        }
        return inStreamImage.readAllBytes() as ByteArray
    }
}