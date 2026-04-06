import java.util.ArrayList;
import java.util.List;

abstract class Exercise {
    private int duration;

    public Exercise(int duration) {
        if (duration <= 0) {
            System.out.println("Invalid duration! Setting to 10 mins.");
            this.duration = 10;
        } else {
            this.duration = duration;
        }
    }

    public int getDuration() {
        return duration;
    }

    public abstract double calculateCalories();

    public abstract String getName();
}

class Running extends Exercise {

    public Running(int duration) {
        super(duration);
    }

    @Override
    public double calculateCalories() {
        return getDuration() * 10;
    }

    @Override
    public String getName() {
        return "Running";
    }
}

class Cycling extends Exercise {

    public Cycling(int duration) {
        super(duration);
    }

    @Override
    public double calculateCalories() {
        return getDuration() * 8;
    }

    @Override
    public String getName() {
        return "Cycling";
    }
}

class Swimming extends Exercise {

    public Swimming(int duration) {
        super(duration);
    }

    @Override
    public double calculateCalories() {
        return getDuration() * 11;
    }

    @Override
    public String getName() {
        return "Swimming";
    }
}

class Workout {
    private List<Exercise> exercises;

    public Workout() {
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    public double getTotalCalories() {
        double total = 0;
        for (Exercise e : exercises) {
            total += e.calculateCalories();
        }
        return total;
    }

    public void showWorkoutDetails() {
        for (Exercise e : exercises) {
            System.out.println(e.getName() + " - Duration: " + e.getDuration() +
                    " mins, Calories: " + e.calculateCalories());
        }
    }
}

class User {
    private String name;
    private Workout workout;

    public User(String name) {
        this.name = name;
        this.workout = new Workout();
    }

    public String getName() {
        return name;
    }

    public Workout getWorkout() {
        return workout;
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        User user = new User("Rahul");

        user.getWorkout().addExercise(new Running(30));
        user.getWorkout().addExercise(new Cycling(20));
        user.getWorkout().addExercise(new Swimming(25));

        System.out.println("User: " + user.getName());
        System.out.println("\nWorkout Details:");

        user.getWorkout().showWorkoutDetails();

        System.out.println("\nTotal Calories Burned: " +
                user.getWorkout().getTotalCalories());
    }
}
