package rotorCalculator.data.rotorModel.results;

//TODO: finish this and add javadoc
public class ResultContainer {
    public ParticularResults.JointLimitResults jointLimitResults;
    public ParticularResults.CoriolisLimitResults coriolisLimitResults;
    public ParticularResults.TotalOmegaLimitResults totalOmegaLimitResults;
    public ParticularResults.GravityRequirementResults gravityRequirementResults;
    public ParticularResults.GradientLimitResults gradientLimitResults;
    public ParticularResults.TotalRadiusLimitResults totalRadiusLimitResults;
    public ParticularResults.ActualParameterResults actualParameterResults;

    public ResultContainer() {
        initializeResults();
        setResults();
    }

    private void initializeResults() {
        jointLimitResults = new ParticularResults.JointLimitResults();
        coriolisLimitResults = new ParticularResults.CoriolisLimitResults();
        totalOmegaLimitResults = new ParticularResults.TotalOmegaLimitResults();
        gravityRequirementResults = new ParticularResults.GravityRequirementResults();
        gradientLimitResults = new ParticularResults.GradientLimitResults();
        totalRadiusLimitResults = new ParticularResults.TotalRadiusLimitResults();
        actualParameterResults = new ParticularResults.ActualParameterResults();
    }

    //TODO: get actual results here, finish this
    public final void setResults() {
        jointLimitResults.setResults();
        coriolisLimitResults.setResults();
        totalOmegaLimitResults.setResults();
        gravityRequirementResults.setResults();
        gradientLimitResults.setResults();
        totalRadiusLimitResults.setResults();
        actualParameterResults.setResults();
    }
}