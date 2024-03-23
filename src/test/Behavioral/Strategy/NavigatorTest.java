package test.Behavioral.Strategy;

import main.Behavioral.Strategy.BikeStrategy;
import main.Behavioral.Strategy.CarStrategy;
import main.Behavioral.Strategy.Map;
import main.Behavioral.Strategy.NavigationStrategy;
import org.junit.Before;
import org.junit.Test;

public class NavigatorTest {
    Map map;

    @Before
    public void setUP(){
        map = new Map(new CarStrategy());
    }

    @Test
    public void testNavigation(){
        map.navigateRoad("Delhi","Mumbai");
    }
}
