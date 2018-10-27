package controllers;

import play.mvc.*;

import openllet.jena.PelletReasonerFactory;

import org.apache.jena.ontology.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.apache.jena.reasoner.*;
import org.apache.jena.shared.JenaException;

import java.io.InputStream;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private OntModel ontReasoned;

    public void loadOntology() {
        String source_file = "./owl/bingers-project3.owl"; // This is your file on the disk
        String source_url = "http://www.semanticweb.org/bingerso/ontologies/2018/9/csc750.owl"; // Remember that IRI from before?
        String NS = source_url + "#";

        // Read the ontology. No reasoner yet.
        OntModel baseOntology = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
        try
        {
            InputStream in = FileManager.get().open(source_file);
            try
            {
                baseOntology.read(in, null);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (JenaException je)
        {
            System.err.println("ERROR" + je.getMessage());
            je.printStackTrace();
            System.exit(0);
        }

        baseOntology.setNsPrefix( "csc750", NS ); // Just for compact printing; doesn't really matter


        // This will create an ontology that has a reasoner attached.
        // This means that it will automatically infer classes an individual belongs to, according to restrictions, etc.
        this.ontReasoned = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC, baseOntology);
    }

    public HomeController() {
        loadOntology(); // Load the ontology
    }



}
