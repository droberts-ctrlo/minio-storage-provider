package blog.davetheitguy.miniostorageprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MinioStorageProviderApplication

fun main(args: Array<String>) {
    runApplication<MinioStorageProviderApplication>(*args)
}
