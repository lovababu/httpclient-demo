package org.avol.httpclient.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lovababu on 9/18/2016.
 */
@RestController
public class SampleResource {

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post() {
        System.out.println("SampleResource.post");
        return "from post";
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String put() {
        System.out.println("SampleResource.put");
        return "from put";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get() {
        System.out.println("SampleResource.get");
        return "from get";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete() {
        System.out.println("SampleResource.delete");
        return "from delete";
    }
}
