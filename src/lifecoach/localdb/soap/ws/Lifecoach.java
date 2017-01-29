
package lifecoach.localdb.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Lifecoach", targetNamespace = "http://ws.soap.localdb.lifecoach/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Lifecoach {


    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Goal>
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoalList", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadGoalList")
    @ResponseWrapper(localName = "readGoalListResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadGoalListResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readGoalListRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readGoalListResponse")
    public List<Goal> readGoalList(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.soap.ws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadGoalResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readGoalRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readGoalResponse")
    public Goal readGoal(
        @WebParam(name = "goalId", targetNamespace = "")
        long goalId);

    /**
     * 
     * @param goal
     */
    @WebMethod
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdateGoalResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/updateGoalRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/updateGoalResponse")
    public void updateGoal(
        @WebParam(name = "goal", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Goal> goal);

    /**
     * 
     * @param goal
     * @return
     *     returns lifecoach.localdb.soap.ws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreateGoalResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/createGoalRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/createGoalResponse")
    public Goal createGoal(
        @WebParam(name = "Goal", targetNamespace = "")
        Goal goal);

    /**
     * 
     * @param goalId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeleteGoalResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/deleteGoalRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/deleteGoalResponse")
    public void deleteGoal(
        @WebParam(name = "goalId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> goalId);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Achievement>
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "readAchievementList", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadAchievementList")
    @ResponseWrapper(localName = "readAchievementListResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadAchievementListResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readAchievementListRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readAchievementListResponse")
    public List<Achievement> readAchievementList(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param achievementId
     * @return
     *     returns lifecoach.localdb.soap.ws.Achievement
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "readAchievement", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadAchievement")
    @ResponseWrapper(localName = "readAchievementResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadAchievementResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readAchievementRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readAchievementResponse")
    public Achievement readAchievement(
        @WebParam(name = "achievementId", targetNamespace = "")
        long achievementId);

    /**
     * 
     * @param achievement
     */
    @WebMethod
    @RequestWrapper(localName = "updateAchievement", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdateAchievement")
    @ResponseWrapper(localName = "updateAchievementResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdateAchievementResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/updateAchievementRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/updateAchievementResponse")
    public void updateAchievement(
        @WebParam(name = "achievement", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Achievement> achievement);

    /**
     * 
     * @param achievement
     * @return
     *     returns lifecoach.localdb.soap.ws.Achievement
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "createAchievement", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreateAchievement")
    @ResponseWrapper(localName = "createAchievementResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreateAchievementResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/createAchievementRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/createAchievementResponse")
    public Achievement createAchievement(
        @WebParam(name = "Achievement", targetNamespace = "")
        Achievement achievement);

    /**
     * 
     * @param achievementId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAchievement", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeleteAchievement")
    @ResponseWrapper(localName = "deleteAchievementResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeleteAchievementResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/deleteAchievementRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/deleteAchievementResponse")
    public void deleteAchievement(
        @WebParam(name = "achievementId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> achievementId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonListResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonListRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePersonResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.CreatePersonResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/createPersonRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.DeletePersonResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/deletePersonRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> personId);

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonHistoryRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonHistoryResponse")
    public List<HealthMeasureHistory> readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readMeasureTypesRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readMeasureTypesResponse")
    public List<String> readMeasureTypes();

    /**
     * 
     * @param mid
     * @param personId
     * @param measureType
     * @return
     *     returns lifecoach.localdb.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonMeasureRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/readPersonMeasureResponse")
    public HealthMeasureHistory readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "mid", targetNamespace = "")
        long mid);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/savePersonMeasureRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/savePersonMeasureResponse")
    public Person savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Measure
     */
    @WebMethod
    @WebResult(name = "measureOut", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonMeasureRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonMeasureResponse")
    public Measure updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param measureHistory
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHistoryMeasure", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePersonHistoryMeasure")
    @ResponseWrapper(localName = "updatePersonHistoryMeasureResponse", targetNamespace = "http://ws.soap.localdb.lifecoach/", className = "lifecoach.localdb.soap.ws.UpdatePersonHistoryMeasureResponse")
    @Action(input = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonHistoryMeasureRequest", output = "http://ws.soap.localdb.lifecoach/Lifecoach/updatePersonHistoryMeasureResponse")
    public HealthMeasureHistory updatePersonHistoryMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureHistory", targetNamespace = "")
        HealthMeasureHistory measureHistory);

}
