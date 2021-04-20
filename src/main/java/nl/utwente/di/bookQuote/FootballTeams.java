package nl.utwente.di.bookQuote;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FootballTeams", value = "/FootballTeams")
public class FootballTeams extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TeamEvaluator teamevaluator;

    public void init() throws ServletException {
        teamevaluator = new TeamEvaluator();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML>\n";
        String title = "Book Quote";
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                "  <P>Football team: " +
                request.getParameter("team") + "\n" +
                "  <P>Fact about it: " +
                teamevaluator.getTruthAboutATeam(request.getParameter("team")) +
                "</BODY></HTML>");
    }
}
