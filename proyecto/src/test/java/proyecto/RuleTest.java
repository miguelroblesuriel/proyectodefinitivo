
package proyecto;

import java.time.LocalDate;
import java.util.List;

import org.drools.ruleunits.api.RuleUnitProvider;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    static final Logger LOG = LoggerFactory.getLogger(RuleTest.class);

    @Test
    public void test() {
        TestGeneral testgeneral= new TestGeneral();
        LocalDate fecha;
        fecha=LocalDate.now();
        Driver conductor= new Driver("Paco",22,"Madrid","Madrid",15);
        Violation infraccion= new Violation("Codigo",fecha,"driving under the influence",120,120);

        RuleUnitInstance<TestGeneral> instance= RuleUnitProvider.get().createRuleUnitInstance(testgeneral);
        try{
            testgeneral.getDrivers().add(conductor);
            testgeneral.getViolations().add(infraccion);
            instance.fire();
            assertTrue("Pérdida de permiso",conductor.getPoints()<20);
        }finally {
            instance.close();
        }
        /* LOG.info("Creating RuleUnit");
        MeasurementUnit measurementUnit = new MeasurementUnit();

        RuleUnitInstance<MeasurementUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(measurementUnit);
        try {
            LOG.info("Insert data");
            measurementUnit.getMeasurements().add(new Measurement("color", "red"));
            measurementUnit.getMeasurements().add(new Measurement("color", "green"));
            measurementUnit.getMeasurements().add(new Measurement("color", "blue"));

            LOG.info("Run query. Rules are also fired");
            List<Measurement> queryResult = instance.executeQuery("FindColor").toList("$m");

            assertEquals(3, queryResult.size());
            assertTrue("contains red", measurementUnit.getControlSet().contains("red"));
            assertTrue("contains green", measurementUnit.getControlSet().contains("green"));
            assertTrue("contains blue", measurementUnit.getControlSet().contains("blue"));
        } finally {
            instance.close();
        }
         */
    }
}