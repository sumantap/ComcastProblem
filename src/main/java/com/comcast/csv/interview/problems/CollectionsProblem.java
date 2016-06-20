package com.comcast.csv.interview.problems;


import java.util.Collection;
import java.util.List;

import com.poc.java.comcast.entity.Meme;


public interface CollectionsProblem {

    /**
     * Sorts a Collection of Memes by year
     * @param memes The Collection to sort
     * @param ascending true if the collection should be sorting in ascending order, otherwise false.
     */
    public void sort(List<Meme> meme, boolean ascending);

    /**
     * Adds a tag to all meme's that contain another tag
     * @param memes The collection of memes to mutate
     * @param tag The tag that is to be added
     */
    public void addTag(List<Meme> memes, String tag);

}
