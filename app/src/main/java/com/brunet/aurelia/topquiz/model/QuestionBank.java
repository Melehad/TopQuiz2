package com.brunet.aurelia.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Aurelia Brunet on 14/09/2018.
 */
public class QuestionBank {

    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        //Shuffle the question list
        //Collections.shuffle(mQuestionList);
        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        //Ensure we loop over the questions
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }
        //Please note the post-incrementation
        return mQuestionList.get(mNextQuestionIndex++);
    }

}
