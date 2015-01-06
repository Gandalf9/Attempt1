package org.gov.adm.rules;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.stereotype.Service;
@Service
public class RuleLookUp{
	
	public StatefulKnowledgeSession getSession(String rulename ){
		StatefulKnowledgeSession session = null;
	try {				
		// seed a builder with our rules file from classpath
		KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		//builder.add(ResourceFactory.newClassPathResource("org/gov/adm/rules/discountRules.drl"), ResourceType.DRL);
		builder.add(ResourceFactory.newClassPathResource("org/gov/adm/rules/asylum.drl"), ResourceType.DRL);
		if (builder.hasErrors()) {
			System.out.println(builder.hasErrors());
		    throw new RuntimeException(builder.getErrors().toString());
		}

		// create a knowledgeBase from our builder packages
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
		knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
		
		// initialize a session for usage
		session = knowledgeBase.newStatefulKnowledgeSession();
	}catch(Throwable t) {
            t.printStackTrace();
        } 
	return session;
	}
}

