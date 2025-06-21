package com.tut.hibernatemapping;

import javax.persistence.*;

@Entity
public class Question {
	@Id

private int questionId;
private String question;
public Question(int questionId, String question, Answer answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
@Override
public String toString() {
	return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
@OneToOne(cascade = CascadeType.PERSIST) 
private Answer answer;
}
