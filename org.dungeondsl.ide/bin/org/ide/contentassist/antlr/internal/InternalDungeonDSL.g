/*
 * generated by Xtext 2.37.0
 */
grammar InternalDungeonDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.services.DungeonDSLGrammarAccess;

}
@parser::members {
	private DungeonDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(DungeonDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDungeon
entryRuleDungeon
:
{ before(grammarAccess.getDungeonRule()); }
	 ruleDungeon
{ after(grammarAccess.getDungeonRule()); } 
	 EOF 
;

// Rule Dungeon
ruleDungeon 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDungeonAccess().getGroup()); }
		(rule__Dungeon__Group__0)
		{ after(grammarAccess.getDungeonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloor
entryRuleFloor
:
{ before(grammarAccess.getFloorRule()); }
	 ruleFloor
{ after(grammarAccess.getFloorRule()); } 
	 EOF 
;

// Rule Floor
ruleFloor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloorAccess().getGroup()); }
		(rule__Floor__Group__0)
		{ after(grammarAccess.getFloorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoom
entryRuleRoom
:
{ before(grammarAccess.getRoomRule()); }
	 ruleRoom
{ after(grammarAccess.getRoomRule()); } 
	 EOF 
;

// Rule Room
ruleRoom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoomAccess().getGroup()); }
		(rule__Room__Group__0)
		{ after(grammarAccess.getRoomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Sizes
ruleSizes
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSizesAccess().getAlternatives()); }
		(rule__Sizes__Alternatives)
		{ after(grammarAccess.getSizesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule RoomTypes
ruleRoomTypes
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomTypesAccess().getAlternatives()); }
		(rule__RoomTypes__Alternatives)
		{ after(grammarAccess.getRoomTypesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sizes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0()); }
		('LARGE')
		{ after(grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1()); }
		('MEDIUM')
		{ after(grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2()); }
		('SMALL')
		{ after(grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomTypes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0()); }
		('COMBAT')
		{ after(grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1()); }
		('TREASURE')
		{ after(grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2()); }
		('BOSS')
		{ after(grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3()); }
		('PUZZLE')
		{ after(grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4()); }
		('SHOP')
		{ after(grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__0__Impl
	rule__Dungeon__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getDungeonKeyword_0()); }
	'Dungeon'
	{ after(grammarAccess.getDungeonAccess().getDungeonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__1__Impl
	rule__Dungeon__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getNameAssignment_1()); }
	(rule__Dungeon__NameAssignment_1)
	{ after(grammarAccess.getDungeonAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__2__Impl
	rule__Dungeon__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDungeonAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__3__Impl
	rule__Dungeon__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getThemeKeyword_3()); }
	'theme'
	{ after(grammarAccess.getDungeonAccess().getThemeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__4__Impl
	rule__Dungeon__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getDungeonAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__5__Impl
	rule__Dungeon__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getThemeAssignment_5()); }
	(rule__Dungeon__ThemeAssignment_5)
	{ after(grammarAccess.getDungeonAccess().getThemeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__6__Impl
	rule__Dungeon__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getLvlKeyword_6()); }
	'lvl'
	{ after(grammarAccess.getDungeonAccess().getLvlKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__7__Impl
	rule__Dungeon__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getEqualsSignKeyword_7()); }
	'='
	{ after(grammarAccess.getDungeonAccess().getEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__8__Impl
	rule__Dungeon__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getLvlAssignment_8()); }
	(rule__Dungeon__LvlAssignment_8)
	{ after(grammarAccess.getDungeonAccess().getLvlAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__9__Impl
	rule__Dungeon__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getFloorsAssignment_9()); }
	(rule__Dungeon__FloorsAssignment_9)*
	{ after(grammarAccess.getDungeonAccess().getFloorsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dungeon__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDungeonAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getDungeonAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Floor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Floor__Group__0__Impl
	rule__Floor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloorAccess().getFloorKeyword_0()); }
	'Floor'
	{ after(grammarAccess.getFloorAccess().getFloorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Floor__Group__1__Impl
	rule__Floor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloorAccess().getNameAssignment_1()); }
	(rule__Floor__NameAssignment_1)
	{ after(grammarAccess.getFloorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Floor__Group__2__Impl
	rule__Floor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Floor__Group__3__Impl
	rule__Floor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloorAccess().getRoomsAssignment_3()); }
	(rule__Floor__RoomsAssignment_3)*
	{ after(grammarAccess.getFloorAccess().getRoomsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Floor__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Room__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__0__Impl
	rule__Room__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getRoomKeyword_0()); }
	'Room'
	{ after(grammarAccess.getRoomAccess().getRoomKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__1__Impl
	rule__Room__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getNameAssignment_1()); }
	(rule__Room__NameAssignment_1)
	{ after(grammarAccess.getRoomAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__2__Impl
	rule__Room__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__3__Impl
	rule__Room__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getSizeKeyword_3()); }
	'size'
	{ after(grammarAccess.getRoomAccess().getSizeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__4__Impl
	rule__Room__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getRoomAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__5__Impl
	rule__Room__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getSizeAssignment_5()); }
	(rule__Room__SizeAssignment_5)
	{ after(grammarAccess.getRoomAccess().getSizeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__6__Impl
	rule__Room__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getRoomAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__7__Impl
	rule__Room__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getEqualsSignKeyword_7()); }
	'='
	{ after(grammarAccess.getRoomAccess().getEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__8__Impl
	rule__Room__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getTypeAssignment_8()); }
	(rule__Room__TypeAssignment_8)
	{ after(grammarAccess.getRoomAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Room__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Dungeon__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDungeonAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDungeonAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__ThemeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDungeonAccess().getThemeSTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getDungeonAccess().getThemeSTRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__LvlAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDungeonAccess().getLvlINTTerminalRuleCall_8_0()); }
		RULE_INT
		{ after(grammarAccess.getDungeonAccess().getLvlINTTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dungeon__FloorsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDungeonAccess().getFloorsFloorParserRuleCall_9_0()); }
		ruleFloor
		{ after(grammarAccess.getDungeonAccess().getFloorsFloorParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFloorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Floor__RoomsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_3_0()); }
		ruleRoom
		{ after(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__SizeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomAccess().getSizeSizesEnumRuleCall_5_0()); }
		ruleSizes
		{ after(grammarAccess.getRoomAccess().getSizeSizesEnumRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Room__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomAccess().getTypeRoomTypesEnumRuleCall_8_0()); }
		ruleRoomTypes
		{ after(grammarAccess.getRoomAccess().getTypeRoomTypesEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
