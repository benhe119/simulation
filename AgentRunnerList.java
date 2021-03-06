package grakn.simulation;

import grakn.simulation.agents.*;
import grakn.simulation.agents.base.AgentRunner;
import grakn.simulation.agents.common.CityAgentRunner;
import grakn.simulation.agents.common.ContinentAgentRunner;
import grakn.simulation.agents.common.CountryAgentRunner;

public class AgentRunnerList {
    static AgentRunner[] AGENTS = {
            new CityAgentRunner(MarriageAgent.class),
            new CityAgentRunner(PersonBirthAgent.class),
            new CityAgentRunner(AgeUpdateAgent.class),
            new CityAgentRunner(ParentshipAgent.class),
            new CityAgentRunner(RelocationAgent.class),
            new CountryAgentRunner(CompanyAgent.class),
            new CityAgentRunner(EmploymentAgent.class),
            new ContinentAgentRunner(ProductAgent.class),
            new CountryAgentRunner(TransactionAgent.class),
            new CityAgentRunner(FriendshipAgent.class),
    };
}
