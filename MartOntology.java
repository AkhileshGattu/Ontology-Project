package com.ontology.project.mart;

import java.io.File;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;

public class MartOntology {

	public static void main(String[] args) throws URISyntaxException, OWLOntologyCreationException, OWLOntologyStorageException{
		// TODO Auto-generated method stub
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLDataFactory factory = manager.getOWLDataFactory();
		IRI ontologyIRI = IRI.create("http://www.semanticweb.org/ontologies/", "myontology_mart");
		
		OWLOntology ontology = manager.createOntology(ontologyIRI);
		OWLOntologyID ontologyID = ontology.getOntologyID();
		IRI versionIRI = IRI.create(ontologyIRI + "/", "version1");
		
		String x="http://www.semanticweb.org/ontologies/myontology_mart#";
		
		IRI iri = IRI.create(x, "Mart");
		OWLClass Mart = factory.getOWLClass(iri);
		OWLDeclarationAxiom declarationAxiom = factory.getOWLDeclarationAxiom(Mart);
        manager.addAxiom(ontology, declarationAxiom);
        
        //Adding subclasses
        OWLClass Clothing = factory.getOWLClass(IRI.create(x+"Clothing"));
        OWLClass Dining = factory.getOWLClass(IRI.create(x+"Dining"));
        OWLClass Electronic = factory.getOWLClass(IRI.create(x+"Electronic"));
        OWLClass Entertainment = factory.getOWLClass(IRI.create(x+"Entertainment"));
        OWLClass Home_and_Kitchen = factory.getOWLClass(IRI.create(x+"Home_and_Kitchen"));
        OWLClass Location = factory.getOWLClass(IRI.create(x+"Location"));
        OWLClass Sports = factory.getOWLClass(IRI.create(x+"Sports"));
        
        OWLAxiom subclass1 = factory.getOWLSubClassOfAxiom(Clothing, Mart);
        OWLAxiom subclass2 = factory.getOWLSubClassOfAxiom(Dining, Mart);
        OWLAxiom subclass3 = factory.getOWLSubClassOfAxiom(Electronic, Mart);
        OWLAxiom subclass4 = factory.getOWLSubClassOfAxiom(Entertainment, Mart);
        OWLAxiom subclass5 = factory.getOWLSubClassOfAxiom(Home_and_Kitchen, Mart);
        OWLAxiom subclass6 = factory.getOWLSubClassOfAxiom(Location, Mart);
        OWLAxiom subclass7 = factory.getOWLSubClassOfAxiom(Sports, Mart);
        
        manager.addAxiom(ontology, subclass1);
        manager.addAxiom(ontology, subclass2);
        manager.addAxiom(ontology, subclass3);
        manager.addAxiom(ontology, subclass4);
        manager.addAxiom(ontology, subclass5);
        manager.addAxiom(ontology, subclass6);
        manager.addAxiom(ontology, subclass7);
        
        //Creating subclasses to subclasses
        OWLClass Brands = factory.getOWLClass(IRI.create(x+"Brands"));
        OWLClass Frozen = factory.getOWLClass(IRI.create(x+"Frozen"));
        OWLClass Non_Frozen = factory.getOWLClass(IRI.create(x+"Non_Frozen"));
        OWLClass Home = factory.getOWLClass(IRI.create(x+"Home"));
        OWLClass Kitchen = factory.getOWLClass(IRI.create(x+"Kitchen"));
        OWLClass Games = factory.getOWLClass(IRI.create(x+"Games"));
        OWLClass Movies = factory.getOWLClass(IRI.create(x+"Movies"));
        OWLClass International = factory.getOWLClass(IRI.create(x+"International"));
        OWLClass Local = factory.getOWLClass(IRI.create(x+"Local"));
        OWLClass Equipment = factory.getOWLClass(IRI.create(x+"Equipment"));
        
        OWLAxiom ssclass1 = factory.getOWLSubClassOfAxiom(Brands, Clothing);
        OWLAxiom ssclass2 = factory.getOWLSubClassOfAxiom(Frozen, Dining);
        OWLAxiom ssclass3 = factory.getOWLSubClassOfAxiom(Non_Frozen, Dining);
        OWLAxiom ssclass4 = factory.getOWLSubClassOfAxiom(Home, Electronic);
        OWLAxiom ssclass5 = factory.getOWLSubClassOfAxiom(Kitchen, Electronic);
        OWLAxiom ssclass6 = factory.getOWLSubClassOfAxiom(Games, Entertainment);
        OWLAxiom ssclass7 = factory.getOWLSubClassOfAxiom(Movies, Entertainment);
        OWLAxiom ssclass8 = factory.getOWLSubClassOfAxiom(International, Location);
        OWLAxiom ssclass9 = factory.getOWLSubClassOfAxiom(Local, Location);
        OWLAxiom ssclass10 = factory.getOWLSubClassOfAxiom(Equipment, Sports);
        OWLAxiom ssclass11 = factory.getOWLSubClassOfAxiom(Home, Home_and_Kitchen);
        OWLAxiom ssclass12 = factory.getOWLSubClassOfAxiom(Kitchen, Home_and_Kitchen);
        OWLAxiom ssclass13 = factory.getOWLSubClassOfAxiom(Games, Sports);
        
        manager.addAxiom(ontology, ssclass1);
        manager.addAxiom(ontology, ssclass2);
        manager.addAxiom(ontology, ssclass3);
        manager.addAxiom(ontology, ssclass4);
        manager.addAxiom(ontology, ssclass5);
        manager.addAxiom(ontology, ssclass6);
        manager.addAxiom(ontology, ssclass7);
        manager.addAxiom(ontology, ssclass8);
        manager.addAxiom(ontology, ssclass9);
        manager.addAxiom(ontology, ssclass10);
        manager.addAxiom(ontology, ssclass11);
        manager.addAxiom(ontology, ssclass12);
        manager.addAxiom(ontology, ssclass13);
        
        //Creating Data Properties
        OWLDataProperty Price = factory.getOWLDataProperty(IRI.create(x+"Price"));
        OWLFunctionalDataPropertyAxiom funcDPAx = factory.getOWLFunctionalDataPropertyAxiom(Price);
        manager.applyChange(new AddAxiom(ontology, funcDPAx));
        
        OWLDatatype integer = factory.getIntegerOWLDatatype();
        OWLDataPropertyRangeAxiom rangeAxiom = factory.getOWLDataPropertyRangeAxiom(Price, integer);
        manager.addAxiom(ontology, rangeAxiom);
        
        OWLDataPropertyDomainAxiom PriceDomain = factory.getOWLDataPropertyDomainAxiom(Price, Mart);
        manager.addAxiom(ontology, PriceDomain);
                
        OWLDataProperty Quantity = factory.getOWLDataProperty(IRI.create(x+"Quantity"));
        OWLFunctionalDataPropertyAxiom funcDPAx1 = factory.getOWLFunctionalDataPropertyAxiom(Quantity);
        manager.applyChange(new AddAxiom(ontology, funcDPAx1));
        
        OWLDatatype integer1 = factory.getIntegerOWLDatatype();
        OWLDataPropertyRangeAxiom rangeAxiom1 = factory.getOWLDataPropertyRangeAxiom(Quantity, integer1);
        manager.addAxiom(ontology, rangeAxiom1);
        
        OWLDataPropertyDomainAxiom QuantityDomain = factory.getOWLDataPropertyDomainAxiom(Quantity, Mart);
        manager.addAxiom(ontology, QuantityDomain);
        
        //Creating Object Properties
        OWLObjectProperty isGame=factory.getOWLObjectProperty(IRI.create(x+"isGame"));
        OWLFunctionalObjectPropertyAxiom fun=factory.getOWLFunctionalObjectPropertyAxiom(isGame);
        OWLSymmetricObjectPropertyAxiom sym=factory.getOWLSymmetricObjectPropertyAxiom(isGame);
        manager.addAxiom(ontology, fun);
        manager.addAxiom(ontology, sym);
        
        //Defining Domain and Range
        OWLObjectPropertyDomainAxiom domainIsGame = factory.getOWLObjectPropertyDomainAxiom(isGame, Games);
        manager.addAxiom(ontology, domainIsGame);
        OWLObjectPropertyRangeAxiom rangeIsGame= factory.getOWLObjectPropertyRangeAxiom(isGame, Sports);
        manager.addAxiom(ontology, rangeIsGame);
        
        //isInternational Object Property
        OWLObjectProperty isInternational=factory.getOWLObjectProperty(IRI.create(x+"isInternational"));
        OWLFunctionalObjectPropertyAxiom FunIsInternational=factory.getOWLFunctionalObjectPropertyAxiom(isInternational);
        manager.addAxiom(ontology, FunIsInternational);
        
        OWLObjectPropertyDomainAxiom domainIsInternational = factory.getOWLObjectPropertyDomainAxiom(isInternational, Brands);
        manager.addAxiom(ontology, domainIsInternational);
        OWLObjectPropertyRangeAxiom rangeIsInternational= factory.getOWLObjectPropertyRangeAxiom(isInternational, International);
        manager.addAxiom(ontology, rangeIsInternational);
        
        //isKitchen Object Property
        OWLObjectProperty isKitchen=factory.getOWLObjectProperty(IRI.create(x+"isKitchen"));
        OWLFunctionalObjectPropertyAxiom FunisKitchen=factory.getOWLFunctionalObjectPropertyAxiom(isKitchen);
        manager.addAxiom(ontology, FunisKitchen);
        
        OWLObjectPropertyDomainAxiom domainIsKitchen = factory.getOWLObjectPropertyDomainAxiom(isKitchen, Brands);
        manager.addAxiom(ontology, domainIsKitchen);
        OWLObjectPropertyRangeAxiom rangeIsKitchen= factory.getOWLObjectPropertyRangeAxiom(isKitchen, International);
        manager.addAxiom(ontology, rangeIsKitchen);
        
        //isSolid Object Property
        OWLObjectProperty isSolid=factory.getOWLObjectProperty(IRI.create(x+"isSolid"));
        OWLFunctionalObjectPropertyAxiom FunisSolid=factory.getOWLFunctionalObjectPropertyAxiom(isSolid);
        manager.addAxiom(ontology, FunisSolid);
        
        OWLObjectPropertyDomainAxiom domainIsSolid= factory.getOWLObjectPropertyDomainAxiom(isSolid, Brands);
        manager.addAxiom(ontology, domainIsSolid);
        OWLObjectPropertyRangeAxiom rangeIsSolid= factory.getOWLObjectPropertyRangeAxiom(isSolid, International);
        manager.addAxiom(ontology, rangeIsSolid);
        
        //LocatedAt Object Property
        OWLObjectProperty LocatedAt=factory.getOWLObjectProperty(IRI.create(x+"LocatedAt"));
        OWLAsymmetricObjectPropertyAxiom AsSym=factory.getOWLAsymmetricObjectPropertyAxiom(LocatedAt);
        manager.addAxiom(ontology, AsSym);
        
        OWLObjectPropertyDomainAxiom domainLocatedAt= factory.getOWLObjectPropertyDomainAxiom(LocatedAt, Brands);
        manager.addAxiom(ontology, domainLocatedAt);
        OWLObjectPropertyRangeAxiom rangeLocatedAt= factory.getOWLObjectPropertyRangeAxiom(LocatedAt, International);
        manager.addAxiom(ontology, rangeLocatedAt);
        
        //isPartOf Object Property
        OWLObjectProperty isPartOf=factory.getOWLObjectProperty(IRI.create(x+"isPartOf"));
        OWLInverseObjectPropertiesAxiom InvIsPartOf = factory.getOWLInverseObjectPropertiesAxiom(isPartOf, LocatedAt);
        manager.addAxiom(ontology, InvIsPartOf);
        
        //Setting Cardinality for Object Properties
        OWLObjectMaxCardinality CarIsGame = factory.getOWLObjectMaxCardinality(2, isGame);
        OWLSubClassOfAxiom subCarIsGame = factory.getOWLSubClassOfAxiom(Mart, CarIsGame);
        manager.addAxiom(ontology, subCarIsGame);
        OWLObjectMaxCardinality CarIsInternational = factory.getOWLObjectMaxCardinality(1, isInternational);
        OWLSubClassOfAxiom subCarIsInternational = factory.getOWLSubClassOfAxiom(Mart, CarIsInternational);
        manager.addAxiom(ontology, subCarIsInternational);
        OWLObjectMaxCardinality CarIsKitchen = factory.getOWLObjectMaxCardinality(2, isKitchen);
        OWLSubClassOfAxiom subCarIsKitchen = factory.getOWLSubClassOfAxiom(Mart, CarIsKitchen);
        manager.addAxiom(ontology, subCarIsKitchen);
        OWLObjectMaxCardinality CarIsSolid = factory.getOWLObjectMaxCardinality(1, isSolid);
        OWLSubClassOfAxiom subCarIsSolid = factory.getOWLSubClassOfAxiom(Mart, CarIsSolid);
        manager.addAxiom(ontology, subCarIsSolid);
        OWLObjectMaxCardinality CarLocatedAt = factory.getOWLObjectMaxCardinality(2, LocatedAt);
        OWLSubClassOfAxiom subCarLocatedAt = factory.getOWLSubClassOfAxiom(Mart, CarLocatedAt);
        manager.addAxiom(ontology, subCarLocatedAt);
        
        //Setting Classes Disjoint Property
        OWLDisjointClassesAxiom DisHome = factory.getOWLDisjointClassesAxiom(Clothing);
        manager.addAxiom(ontology, DisHome);
        OWLDisjointClassesAxiom DisSports = factory.getOWLDisjointClassesAxiom(Dining);
        manager.addAxiom(ontology, DisSports);
        
        Set<OWLClass> s = new HashSet<OWLClass>();
        s.add(Home_and_Kitchen);
        s.add(Dining);
        
        Set<OWLClass> s1 = new HashSet<OWLClass>();
        s1.add(Sports);
        s1.add(Clothing);
        
        OWLDisjointUnionAxiom DisJnt = factory.getOWLDisjointUnionAxiom(Clothing, s);
        OWLDisjointUnionAxiom DisJnt1 = factory.getOWLDisjointUnionAxiom(Dining, s1);
        manager.addAxiom(ontology, DisJnt);
        manager.addAxiom(ontology, DisJnt1);
        
        //Creating Individuals
        OWLNamedIndividual Basket_Ball = factory.getOWLNamedIndividual(IRI.create("Basket_Ball"));
        OWLLiteral qua = factory.getOWLLiteral("6", integer1);
        OWLDataPropertyAssertionAxiom Dpaa = factory.getOWLDataPropertyAssertionAxiom(Quantity, Basket_Ball, qua);
        manager.addAxiom(ontology, Dpaa);
        OWLClassAssertionAxiom Caa = factory.getOWLClassAssertionAxiom(Games, Basket_Ball);
        manager.addAxiom(ontology, Caa);
        
        OWLNamedIndividual Titanic = factory.getOWLNamedIndividual(IRI.create("Titanic"));
        OWLLiteral pri = factory.getOWLLiteral("10", integer1);
        OWLDataPropertyAssertionAxiom Dpaa1 = factory.getOWLDataPropertyAssertionAxiom(Price, Titanic, pri);
        manager.addAxiom(ontology, Dpaa1);
        OWLClassAssertionAxiom Caa1 = factory.getOWLClassAssertionAxiom(Movies, Titanic);
        manager.addAxiom(ontology, Caa1);
        
        OWLNamedIndividual KansasCity = factory.getOWLNamedIndividual(IRI.create("KansasCity"));
        OWLClassAssertionAxiom Caa2 = factory.getOWLClassAssertionAxiom(Location, KansasCity);
        manager.addAxiom(ontology, Caa2);
        
        //Assigning Individuals to Object Properties
        OWLObjectPropertyAssertionAxiom Opaa =factory.getOWLObjectPropertyAssertionAxiom(isInternational, Basket_Ball, KansasCity);
        manager.addAxiom(ontology, Opaa);
        
        OWLObjectPropertyAssertionAxiom Opaa1 =factory.getOWLObjectPropertyAssertionAxiom(LocatedAt, Titanic, KansasCity);
        manager.addAxiom(ontology, Opaa1);
        
        //Storing the Ontology in a File
        File OFile = new File("Mart.owl");
        manager.saveOntology(ontology, IRI.create(OFile.toURI()));
        System.out.println(OFile);
	}

}
