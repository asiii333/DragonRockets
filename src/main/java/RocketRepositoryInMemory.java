package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class RocketRepositoryInMemory implements RocketRepository{

    List<Mission> missions = new ArrayList<>();
    List<Rocket> rockets = new ArrayList<>();


    @Override
    public void addRocket(Rocket rocket) {
        rocket.setStatus(RocketStatus.ON_GROUND);
        rockets.add(rocket);
    }

    @Override
    public void assignRocket(Rocket rocket, Mission mission) {


    }

    @Override
    public void changeRocketStatus(Rocket rocket, RocketStatus rocketStatus) {

    }

    @Override
    public void addNewMission(Mission mission) {

    }

    @Override
    public void assignRocketToMission(Mission mission, Rocket rocket) {

    }

    @Override
    public void changeMissionStatus(Mission mission, MissionStatus status) {

    }

    @Override
    public List<Mission> getMissionSummary() {
        return List.of();
    }
}
