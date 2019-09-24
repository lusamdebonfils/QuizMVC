package edu.mum.cs.model;

import java.io.Serializable;

public class Quiz implements Serializable {

    private int score = 0;
    private String [] questions = {
            "{3,1,4,1,5}", //pi
            "{1,1,2,3,5}", //fibonacci
            "{1,4,9,16,25}",//squares
            "{2,3,5,7,11}", //primes
            "{1,2,4,8,16} "//powers of 2
    };
    private int[] answers = {9,8,36,13,32};

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public int[] getAnswers() {
        return answers;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }
}
