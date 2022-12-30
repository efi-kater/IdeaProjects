import htmlflow.HtmlView;

import model.Priority;
import model.Task;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;


public class App {

    private static HtmlView<Task> taskDetailsView(){
        HtmlView<Task> taskView = new HtmlView<>();
        taskView
                .head()
                .title("Task Details")
                .linkCss("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css");
        taskView
                .body().classAttr("container")
                .heading(1, "Task Details")
                .hr()
                .div()
                .text("Title: ").text(Task::getTitle)
                .br()
                .text("Description: ").text(Task::getDescription)
                .br()
                .text("Priority: ").text(Task::getPriority);
        return taskView;
    }

    public static void main(String [] args) throws IOException{
        HtmlView<Task> taskView = taskDetailsView();
        Task task =  new Task("Special dinner", "Have dinner with someone!", Priority.Normal);

        try(PrintStream out = new PrintStream(new FileOutputStream("Task.html"))){
            taskView.setPrintStream(out).write(task);
            Desktop.getDesktop().browse(URI.create("Task.html"));
        }
    }
}