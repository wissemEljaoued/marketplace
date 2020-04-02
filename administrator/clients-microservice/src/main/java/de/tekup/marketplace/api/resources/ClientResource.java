package de.tekup.marketplace.api.resources;

import de.tekup.marketplace.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clients")
@AllArgsConstructor
public class ClientResource {
    private ClientService clientServiceImpl;
}
