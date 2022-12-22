package proyecto;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class TestGeneral implements RuleUnitData {
    private final DataStore<Violation> violations;
    private final DataStore<Driver> drivers;

    public TestGeneral() {
        this(DataSource.createStore(), DataSource.createStore());
    }

    public TestGeneral(DataStore<Violation> violations, DataStore<Driver> drivers) {
        this.violations = violations;
        this.drivers = drivers;
    }

    public DataStore<Violation> getViolations() {
        return this.violations;
    }

    public DataStore<Driver> getDrivers() {
        return this.drivers;
    }
}