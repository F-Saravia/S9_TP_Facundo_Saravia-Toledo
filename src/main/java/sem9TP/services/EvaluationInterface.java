package sem9TP.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import sem9TP.entities.Evaluation;

public interface EvaluationInterface{

	//Create
	public Evaluation createEvaluation(@Valid Evaluation evaluation);

	//Read
	public Optional<Evaluation> readEvaluationById (int evaluationId);
	public List<Evaluation> readEvaluationsByNoteGreaterOrEqual(@Min(value=1) @Max(value=5) int note); 
	public List<Evaluation> readEvaluationsOrderByNoteDesc();
	public List<Evaluation> readEvaluationByRemarqueContains (String contenu);

	//Update
	public void updateEvaluationNote (int note);
	public void updateEvaluationRemarque (String remarque);

	//Delete

}
