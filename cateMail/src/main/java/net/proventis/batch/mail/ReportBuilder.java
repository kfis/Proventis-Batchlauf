
package net.proventis.batch.mail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import net.proventis.criteria.ProjectInformation;
import net.proventis.criteria.TaskInformation;

/**
 * Class for constructing a report from given project information.
 * @author gd
 */
public class ReportBuilder {

	/** project information object */
    private final ProjectInformation p;

    /**
     * Constructs a reportbuilder.
     * @param p
     */
    public ReportBuilder(ProjectInformation p){
        this.p = p;
    }

    /**
     * Builds the report from header, content and footer.
     * @return report as string
     * @throws IOException
     */
    public String buildReport() throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader()).append(getContent()).append(getfooter());
        return sb.toString();
    }

    /**
     * Returns a string with the contents of the file "Head.html". Several placeholders in the file are
     * replaced by the data from the global project information object.
     * @return string with the contents of the file "Head.html"
     * @throws IOException
     */
    private String getHeader() throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Head.html")));
        String line;
        while ( (line=bf.readLine())!=null){
            sb.append(line);
        }
        return sb.toString().replace("{projectname}", p.getProject()).replace("{date}",getReportDate() );
    }

    /**
     * Returns a string with the contents of the file "ReportSnippet.html". Several placeholders in the file are
     * replaced by the data from the global project information object.
     * @return string with the contents of the file "ReportSnippet.html"
     * @throws IOException
     */
    private String getContent() throws IOException{
        String snippet;
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/ReportSnippet.html")));
        String line;
        while ( (line=bf.readLine())!=null){
            sb.append(line);
        }
        snippet = sb.toString();
        StringBuilder content = new StringBuilder();

        for(TaskInformation t : p.getTasks()){
            content.append(snippet
                    .replace("{activity}", t.getTask())
                    .replace("{startTermin}", t.getStartTermin().toString())
                    .replace("{endTermin}", t.getEndTermin().toString())
                    .replace("{progress}", ""+t.getProgress()+"%")
                    .replace("{color}", t.IsCritical()?"RED":"GREEN")
                    .replace("{status}", t.IsCritical()?"!":"&radic;"));
        }
        return content.toString();
    }

    /**
     * Returns a string with the contents of the file "footer.html".
     * @return string with the contents of the file "footer.html"
     * @throws IOException
     */
    private String getfooter() throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Footer.html")));
        String line;
        while ( (line=bf.readLine())!=null){
            sb.append(line);
        }
        return sb.toString();
    }

    /**
     * Returns the current date as string.
     * @return String with the current date
     */
    private String getReportDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
    }

    /**
     * Formats the given date to have two digits and return it as string.
     * @param d date to format
     * @return string of the given date
     */
    private String formatDate(Date d){
        DecimalFormat df = new DecimalFormat("00");
        return df.format(d.getDate())+"."+df.format(d.getMonth()+1)+"."+(d.getYear()+1900);
    }
}
