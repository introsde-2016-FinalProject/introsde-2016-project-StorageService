package lifecoach.storageservice.soap.ws;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.Holder;

import org.glassfish.jersey.client.ClientConfig;

import lifecoach.localdb.soap.ws.Achievement;
import lifecoach.localdb.soap.ws.Goal;
import lifecoach.localdb.soap.ws.HealthMeasureHistory;
import lifecoach.localdb.soap.ws.Lifecoach;
import lifecoach.localdb.soap.ws.LifecoachService;
import lifecoach.localdb.soap.ws.Measure;
import lifecoach.localdb.soap.ws.Person;


//Service Implementation

@WebService(endpointInterface = "lifecoach.storageservice.soap.ws.Storage",
	serviceName="StorageService")
public class StorageImpl implements Storage {	
    
	private final String externalUrl = "https://virtual-lifecoach-external.herokuapp.com/adapter";
    //--- Start of Goal table operations 
	
	@Override
	public List<Goal> readGoalList(long personId) {
		
        LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
		
		System.out.println("Retrieving Goals");
		return localdb.readGoalList(personId);
	}
	
	@Override
	public Goal readGoal(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
		Goal g = localdb.readGoal(id);
		return g;
	}

	@Override
	public Goal updateGoal(Goal g) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
		Holder<Goal> goal = new Holder<Goal>(g);
		localdb.updateGoal(goal);

		return goal.value;
	}

	@Override
	public Goal createGoal(Goal g, long personId) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
		Goal goal = localdb.createGoal(g, personId);

		return goal;     
	}

	@Override
	public long deleteGoal(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
		
		Holder<Long> goal = new Holder<Long>(id);
		localdb.deleteGoal(goal);
		
		return goal.value;
	}	
	
	// --- End of Goal table operations
	
	//--- Start of AchievedGoals table operations 
	
	@Override
	public List<Achievement> readAchievementList(long personId) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
		
		return localdb.readAchievementList(personId);
	}
	
	@Override
	public Achievement readAchievement(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
		return localdb.readAchievement(id);
	}

	@Override
	public Achievement updateAchievement(Achievement a) {
		
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
    	Holder<Achievement> achievement = new Holder<Achievement>(a);
        localdb.updateAchievement(achievement);
        
        return achievement.value;
	}

	@Override
	public Achievement createAchievement(Achievement a, long personId) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.createAchievement(a, personId);
	}

	@Override
	public long deleteAchievement(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
		
		Holder<Long> achievement = new Holder<Long>(id);
		localdb.deleteGoal(achievement);
		
		return achievement.value;
	}	
		
	// --- End of AchievedGoals table operations
    
    //--- Start of Person table operations
	
	//Task 1
	@Override
	public List<Person> readPersonList() {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();

		return localdb.readPersonList();
	}

	//Task 2
	@Override
	public Person readPerson(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
		
		return localdb.readPerson(id);
	}
	
	//Task 3
	@Override
	public Person updatePerson(Person p) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
    	Holder<Person> person = new Holder<Person>(p);
		localdb.updatePerson(person);
		
		return person.value;
	}

	//Task 4
	@Override
	public Person createPerson(Person p) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();

    	Holder<Person> person = new Holder<Person>(p);
        localdb.createPerson(person);
        
        return person.value;
	}

	//Task 5
	@Override
	public long deletePerson(long id) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
    	Holder<Long> person = new Holder<Long>(id);
    	localdb.deletePerson(person);
    	
    	return person.value;
	}
    
    // --- End of Person table operations
    
    //--- Start of Measures operations
	
	//Task 6
	@Override
	public List<HealthMeasureHistory> readPersonHistory(long id, String measureType) {

		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.readPersonHistory(id, measureType);
	}
	
	//Task 7
    public List<String> readMeasureTypes(){
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.readMeasureTypes();
    }
	
	//Task 8
	@Override
	public HealthMeasureHistory readPersonMeasure(long id, String measureType, long mid) {
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.readPersonMeasure(id, measureType, mid);
	}
	
	//Task 9
	public Person savePersonMeasure(long id, Measure measure){
		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.savePersonMeasure(id, measure);
	}
	
	//Task 10.1 Current Measure
	public Measure updatePersonMeasure(long id, Measure measure){

		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.updatePersonMeasure(id, measure);
	}
	
	//Task 10.2 History Measure
	public HealthMeasureHistory updatePersonHistoryMeasure(long id, HealthMeasureHistory measure){

		LifecoachService service = new LifecoachService();
        Lifecoach localdb = service.getLifecoachImplPort();
        
        return localdb.updatePersonHistoryMeasure(id, measure);
	}

    // --- End of Measure operations

	@Override
	public String getPicUrl(String topic) {
    	ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		//https://nijikokun-random-cats.p.mashape.com/random/kitten
		WebTarget service = client.target(externalUrl);
		Response response = service.path("/pixabay/"+topic)
				.request()
				.accept(MediaType.APPLICATION_XML).get();
		String link = response.readEntity(String.class);
		System.out.println(link);
		return link;
	}
}
