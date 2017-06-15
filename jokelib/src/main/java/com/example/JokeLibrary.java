package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeLibrary {

    private ArrayList<String> jokesList;
    private Random random;

    public JokeLibrary() {
        jokesList = new ArrayList<>();
        jokesList.add("A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"");
        jokesList.add("Q: How many prolog programmers does it take to change a lightbulb? A: Yes.");
        jokesList.add("Why do Java developers wear glasses? Because they can't C#");
        random = new Random();
    }

    public ArrayList<String> getJokes() {
        return jokesList;
    }

    public String getRandomJoke() {
        return jokesList.get(random.nextInt(jokesList.size()));
    }
}
