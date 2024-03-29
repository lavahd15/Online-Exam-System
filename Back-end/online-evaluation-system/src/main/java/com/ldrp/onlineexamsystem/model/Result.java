package com.ldrp.onlineexamsystem.model;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the tbl_result database table.
 */
@Entity
@Table(name = "tbl_result")
@NamedQuery(name = "Result.findAll", query = "SELECT t FROM Result t")
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    private int marks;

    @Column(name = "question_id")
    private int questionId;

    private String result;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private int resultId;

    @Column(name = "user_id")
    private int userId;

    public Result() {
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getResultId() {
        return this.resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}