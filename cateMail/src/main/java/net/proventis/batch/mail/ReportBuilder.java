/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
 *
 * @author gd
 */
public class ReportBuilder {

    private final ProjectInformation p;

    public ReportBuilder(ProjectInformation p){
        this.p = p;
    }

    public String buildReport() throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append(getHeader()).append(getContent()).append(getfooter());
        return sb.toString();
    }

    private String getHeader() throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Head.html")));
        String line;
        while ( (line=bf.readLine())!=null){
            sb.append(line);
        }
        return sb.toString().replace("{projectname}", p.getProject()).replace("{date}",getReportDate() );
    }

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

    private String getfooter() throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Footer.html")));
        String line;
        while ( (line=bf.readLine())!=null){
            sb.append(line);
        }
        return sb.toString();
    }

    private String getReportDate() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
    }

    private String formatDate(Date d){
        DecimalFormat df = new DecimalFormat("00");
        return df.format(d.getDate())+"."+df.format(d.getMonth()+1)+"."+(d.getYear()+1900);
    }
}
