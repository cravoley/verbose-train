package hellogroovy.posts

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by cravo on 13/09/2016.
 */
@RestController
@RequestMapping("/post")
class PostController {

    @RequestMapping(value = "/{postId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    def getPost(PostRequest request) {
        println request.class.name;
        println request.postId;
        return new Post(request.postId);
    }


}
