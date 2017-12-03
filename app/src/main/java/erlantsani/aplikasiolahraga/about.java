package erlantsani.aplikasiolahraga;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView browser = (WebView) findViewById(R.id.about);
        browser.loadData("" +
                "<html>" +
                " <body>" +
                " <title>About Aplikasi </title>" +
                "<p>" +
                "<p>" +
                "Aplikasi ini aplikasi pencatatan waktu olahraga." +
                "<p>" +
                "Aplikasi ini dibuat oleh : <br/>" +
                "(1406044) - Erlan Darmawan <br/>" +
                "(1406089) - Muhammad Tsani Alrosid <br/>" +
                "Teknik Informatika C <br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}