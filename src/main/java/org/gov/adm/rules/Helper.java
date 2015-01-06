package org.gov.adm.rules;

import org.drools.runtime.KnowledgeRuntime;
import org.drools.runtime.rule.RuleContext;

public class Helper {

	public static void addString(RuleContext kcontext, String str) {
		
		KnowledgeRuntime knowledgeRuntime = kcontext.getKnowledgeRuntime();
		StringUtil util = (StringUtil) knowledgeRuntime.getGlobal("util");
		
		util.addString(str);
	}
}
