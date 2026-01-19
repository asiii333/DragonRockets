package src.main.java;

import java.util.List;

public interface RocketRepository {
    void addRocket(Rocket rocket);
    void assignRocket(Rocket rocket, Mission mission);
    void changeRocketStatus(Rocket rocket, RocketStatus rocketStatus);

    void addNewMission(Mission mission);
    void assignRocketToMission(Mission mission, Rocket rocket);
    void changeMissionStatus(Mission mission, MissionStatus status);

    List<Mission> getMissionSummary();

}
