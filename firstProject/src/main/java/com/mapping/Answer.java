package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "Ans_Id")
	private int answerID;
	private String answer;
	
	@OneToOne(mappedBy = "ans")
	private Question q;
	
	public Answer(int answerID, String answer, Question q) {
		super();
		this.answerID = answerID;
		this.answer = answer;
		this.q = q;
	}
	
	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public Answer() {
		super();
	}
	public int getAnswerID() {
		return answerID;
	}
	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
