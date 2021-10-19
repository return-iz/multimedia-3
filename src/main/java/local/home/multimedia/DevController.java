package local.home.multimedia;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dev")
public class DevController {

    @CrossOrigin
    @GetMapping
    public Iterable<Dev> getDevs() {
        List<Dev> res = new ArrayList<Dev>();
        res.add(new Dev("https://sun9-49.userapi.com/impg/NprNL9x_IrlwMr6XyodLufkW0ZhAbrdGVPyLDQ/kWoJaAt_5xE.jpg?size=1620x2160&quality=96&sign=6aa79c319c24d6e8de2865e511c6c1b4&type=album", "Игорь Жигулин", "Родился, пожил и умер"));
        res.add(new Dev("https://sun9-73.userapi.com/impg/c857232/v857232163/1c901d/RICYVxeCpYU.jpg?size=1229x1229&quality=96&sign=51bf92cfdaf5f30ed2e7862805a78644&type=album", "Елена Сороковикова", "Родился, пожил и умер"));
        return res;
    }
}
