package by.parf.services.event;

import by.parf.domain.Auditorium;
import by.parf.services.auditorium.AuditoriumService;
import by.parf.services.auditorium.AuditoriumServiceImpl;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Kiryl_Parfiankou on 4/8/2017.
 */
public class AuditoriumServiceTest {

    @Test
    public void getAuditoriums() {


        List<Auditorium> auditoriumsForAdd = generateAuditoriums();
        AuditoriumService auditoriumService = new AuditoriumServiceImpl(auditoriumsForAdd);
        List<Auditorium> auditoriumsFromService = auditoriumService.getAuditoriums();

        Assert.assertEquals("Failure - size of array not equals", auditoriumsForAdd.size(), auditoriumsFromService.size());

    }



    private List<Auditorium> generateAuditoriums() {

        List<Auditorium> auditoriums = new ArrayList<>();

        IntStream.range(0, 10).forEach( i -> auditoriums.add(new Auditorium()));
        return auditoriums;
    }
}
