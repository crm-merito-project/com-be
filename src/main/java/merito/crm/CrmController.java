package merito.crm;

import io.micronaut.http.annotation.*;

@Controller("/crm")
public class CrmController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}