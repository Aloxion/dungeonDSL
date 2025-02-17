/*
 * generated by Xtext 2.37.0
 */
package org.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.parser.antlr.internal.InternalDungeonDSLParser;
import org.services.DungeonDSLGrammarAccess;

public class DungeonDSLParser extends AbstractAntlrParser {

	@Inject
	private DungeonDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDungeonDSLParser createParser(XtextTokenStream stream) {
		return new InternalDungeonDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Dungeon";
	}

	public DungeonDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DungeonDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
