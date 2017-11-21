
import java.awt.Desktop;
import java.net.URI;

String s = "http://www.google.com";
Desktop desktop = Desktop.getDesktop();
desktop.browse(URI.create(s));

System.out.print 'Hello world'
