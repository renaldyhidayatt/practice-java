package behavior_patterns.comment_patterns;

public class GenerateReportOperation implements ReportOperation {
    private Report report;

    @Override
    public void execute() {
        report = new Report();
        report.generate();
    }
}
