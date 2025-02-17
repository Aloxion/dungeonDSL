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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDungeonDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LARGE'", "'MEDIUM'", "'SMALL'", "'COMBAT'", "'TREASURE'", "'BOSS'", "'PUZZLE'", "'SHOP'", "'Dungeon'", "'{'", "'theme'", "'='", "'lvl'", "'}'", "'Floor'", "'Room'", "'size'", "'type'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDungeonDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDungeonDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDungeonDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDungeonDSL.g"; }


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



    // $ANTLR start "entryRuleDungeon"
    // InternalDungeonDSL.g:53:1: entryRuleDungeon : ruleDungeon EOF ;
    public final void entryRuleDungeon() throws RecognitionException {
        try {
            // InternalDungeonDSL.g:54:1: ( ruleDungeon EOF )
            // InternalDungeonDSL.g:55:1: ruleDungeon EOF
            {
             before(grammarAccess.getDungeonRule()); 
            pushFollow(FOLLOW_1);
            ruleDungeon();

            state._fsp--;

             after(grammarAccess.getDungeonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDungeon"


    // $ANTLR start "ruleDungeon"
    // InternalDungeonDSL.g:62:1: ruleDungeon : ( ( rule__Dungeon__Group__0 ) ) ;
    public final void ruleDungeon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:66:2: ( ( ( rule__Dungeon__Group__0 ) ) )
            // InternalDungeonDSL.g:67:2: ( ( rule__Dungeon__Group__0 ) )
            {
            // InternalDungeonDSL.g:67:2: ( ( rule__Dungeon__Group__0 ) )
            // InternalDungeonDSL.g:68:3: ( rule__Dungeon__Group__0 )
            {
             before(grammarAccess.getDungeonAccess().getGroup()); 
            // InternalDungeonDSL.g:69:3: ( rule__Dungeon__Group__0 )
            // InternalDungeonDSL.g:69:4: rule__Dungeon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDungeonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDungeon"


    // $ANTLR start "entryRuleFloor"
    // InternalDungeonDSL.g:78:1: entryRuleFloor : ruleFloor EOF ;
    public final void entryRuleFloor() throws RecognitionException {
        try {
            // InternalDungeonDSL.g:79:1: ( ruleFloor EOF )
            // InternalDungeonDSL.g:80:1: ruleFloor EOF
            {
             before(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getFloorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalDungeonDSL.g:87:1: ruleFloor : ( ( rule__Floor__Group__0 ) ) ;
    public final void ruleFloor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:91:2: ( ( ( rule__Floor__Group__0 ) ) )
            // InternalDungeonDSL.g:92:2: ( ( rule__Floor__Group__0 ) )
            {
            // InternalDungeonDSL.g:92:2: ( ( rule__Floor__Group__0 ) )
            // InternalDungeonDSL.g:93:3: ( rule__Floor__Group__0 )
            {
             before(grammarAccess.getFloorAccess().getGroup()); 
            // InternalDungeonDSL.g:94:3: ( rule__Floor__Group__0 )
            // InternalDungeonDSL.g:94:4: rule__Floor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleRoom"
    // InternalDungeonDSL.g:103:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalDungeonDSL.g:104:1: ( ruleRoom EOF )
            // InternalDungeonDSL.g:105:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalDungeonDSL.g:112:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:116:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalDungeonDSL.g:117:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalDungeonDSL.g:117:2: ( ( rule__Room__Group__0 ) )
            // InternalDungeonDSL.g:118:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalDungeonDSL.g:119:3: ( rule__Room__Group__0 )
            // InternalDungeonDSL.g:119:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "ruleSizes"
    // InternalDungeonDSL.g:128:1: ruleSizes : ( ( rule__Sizes__Alternatives ) ) ;
    public final void ruleSizes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:132:1: ( ( ( rule__Sizes__Alternatives ) ) )
            // InternalDungeonDSL.g:133:2: ( ( rule__Sizes__Alternatives ) )
            {
            // InternalDungeonDSL.g:133:2: ( ( rule__Sizes__Alternatives ) )
            // InternalDungeonDSL.g:134:3: ( rule__Sizes__Alternatives )
            {
             before(grammarAccess.getSizesAccess().getAlternatives()); 
            // InternalDungeonDSL.g:135:3: ( rule__Sizes__Alternatives )
            // InternalDungeonDSL.g:135:4: rule__Sizes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sizes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSizesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSizes"


    // $ANTLR start "ruleRoomTypes"
    // InternalDungeonDSL.g:144:1: ruleRoomTypes : ( ( rule__RoomTypes__Alternatives ) ) ;
    public final void ruleRoomTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:148:1: ( ( ( rule__RoomTypes__Alternatives ) ) )
            // InternalDungeonDSL.g:149:2: ( ( rule__RoomTypes__Alternatives ) )
            {
            // InternalDungeonDSL.g:149:2: ( ( rule__RoomTypes__Alternatives ) )
            // InternalDungeonDSL.g:150:3: ( rule__RoomTypes__Alternatives )
            {
             before(grammarAccess.getRoomTypesAccess().getAlternatives()); 
            // InternalDungeonDSL.g:151:3: ( rule__RoomTypes__Alternatives )
            // InternalDungeonDSL.g:151:4: rule__RoomTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoomTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoomTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoomTypes"


    // $ANTLR start "rule__Sizes__Alternatives"
    // InternalDungeonDSL.g:159:1: rule__Sizes__Alternatives : ( ( ( 'LARGE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'SMALL' ) ) );
    public final void rule__Sizes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:163:1: ( ( ( 'LARGE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'SMALL' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDungeonDSL.g:164:2: ( ( 'LARGE' ) )
                    {
                    // InternalDungeonDSL.g:164:2: ( ( 'LARGE' ) )
                    // InternalDungeonDSL.g:165:3: ( 'LARGE' )
                    {
                     before(grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0()); 
                    // InternalDungeonDSL.g:166:3: ( 'LARGE' )
                    // InternalDungeonDSL.g:166:4: 'LARGE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:170:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalDungeonDSL.g:170:2: ( ( 'MEDIUM' ) )
                    // InternalDungeonDSL.g:171:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalDungeonDSL.g:172:3: ( 'MEDIUM' )
                    // InternalDungeonDSL.g:172:4: 'MEDIUM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDungeonDSL.g:176:2: ( ( 'SMALL' ) )
                    {
                    // InternalDungeonDSL.g:176:2: ( ( 'SMALL' ) )
                    // InternalDungeonDSL.g:177:3: ( 'SMALL' )
                    {
                     before(grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2()); 
                    // InternalDungeonDSL.g:178:3: ( 'SMALL' )
                    // InternalDungeonDSL.g:178:4: 'SMALL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sizes__Alternatives"


    // $ANTLR start "rule__RoomTypes__Alternatives"
    // InternalDungeonDSL.g:186:1: rule__RoomTypes__Alternatives : ( ( ( 'COMBAT' ) ) | ( ( 'TREASURE' ) ) | ( ( 'BOSS' ) ) | ( ( 'PUZZLE' ) ) | ( ( 'SHOP' ) ) );
    public final void rule__RoomTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:190:1: ( ( ( 'COMBAT' ) ) | ( ( 'TREASURE' ) ) | ( ( 'BOSS' ) ) | ( ( 'PUZZLE' ) ) | ( ( 'SHOP' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDungeonDSL.g:191:2: ( ( 'COMBAT' ) )
                    {
                    // InternalDungeonDSL.g:191:2: ( ( 'COMBAT' ) )
                    // InternalDungeonDSL.g:192:3: ( 'COMBAT' )
                    {
                     before(grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0()); 
                    // InternalDungeonDSL.g:193:3: ( 'COMBAT' )
                    // InternalDungeonDSL.g:193:4: 'COMBAT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:197:2: ( ( 'TREASURE' ) )
                    {
                    // InternalDungeonDSL.g:197:2: ( ( 'TREASURE' ) )
                    // InternalDungeonDSL.g:198:3: ( 'TREASURE' )
                    {
                     before(grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1()); 
                    // InternalDungeonDSL.g:199:3: ( 'TREASURE' )
                    // InternalDungeonDSL.g:199:4: 'TREASURE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDungeonDSL.g:203:2: ( ( 'BOSS' ) )
                    {
                    // InternalDungeonDSL.g:203:2: ( ( 'BOSS' ) )
                    // InternalDungeonDSL.g:204:3: ( 'BOSS' )
                    {
                     before(grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2()); 
                    // InternalDungeonDSL.g:205:3: ( 'BOSS' )
                    // InternalDungeonDSL.g:205:4: 'BOSS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDungeonDSL.g:209:2: ( ( 'PUZZLE' ) )
                    {
                    // InternalDungeonDSL.g:209:2: ( ( 'PUZZLE' ) )
                    // InternalDungeonDSL.g:210:3: ( 'PUZZLE' )
                    {
                     before(grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3()); 
                    // InternalDungeonDSL.g:211:3: ( 'PUZZLE' )
                    // InternalDungeonDSL.g:211:4: 'PUZZLE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDungeonDSL.g:215:2: ( ( 'SHOP' ) )
                    {
                    // InternalDungeonDSL.g:215:2: ( ( 'SHOP' ) )
                    // InternalDungeonDSL.g:216:3: ( 'SHOP' )
                    {
                     before(grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4()); 
                    // InternalDungeonDSL.g:217:3: ( 'SHOP' )
                    // InternalDungeonDSL.g:217:4: 'SHOP'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomTypes__Alternatives"


    // $ANTLR start "rule__Dungeon__Group__0"
    // InternalDungeonDSL.g:225:1: rule__Dungeon__Group__0 : rule__Dungeon__Group__0__Impl rule__Dungeon__Group__1 ;
    public final void rule__Dungeon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:229:1: ( rule__Dungeon__Group__0__Impl rule__Dungeon__Group__1 )
            // InternalDungeonDSL.g:230:2: rule__Dungeon__Group__0__Impl rule__Dungeon__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dungeon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__0"


    // $ANTLR start "rule__Dungeon__Group__0__Impl"
    // InternalDungeonDSL.g:237:1: rule__Dungeon__Group__0__Impl : ( 'Dungeon' ) ;
    public final void rule__Dungeon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:241:1: ( ( 'Dungeon' ) )
            // InternalDungeonDSL.g:242:1: ( 'Dungeon' )
            {
            // InternalDungeonDSL.g:242:1: ( 'Dungeon' )
            // InternalDungeonDSL.g:243:2: 'Dungeon'
            {
             before(grammarAccess.getDungeonAccess().getDungeonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getDungeonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__0__Impl"


    // $ANTLR start "rule__Dungeon__Group__1"
    // InternalDungeonDSL.g:252:1: rule__Dungeon__Group__1 : rule__Dungeon__Group__1__Impl rule__Dungeon__Group__2 ;
    public final void rule__Dungeon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:256:1: ( rule__Dungeon__Group__1__Impl rule__Dungeon__Group__2 )
            // InternalDungeonDSL.g:257:2: rule__Dungeon__Group__1__Impl rule__Dungeon__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Dungeon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__1"


    // $ANTLR start "rule__Dungeon__Group__1__Impl"
    // InternalDungeonDSL.g:264:1: rule__Dungeon__Group__1__Impl : ( ( rule__Dungeon__NameAssignment_1 ) ) ;
    public final void rule__Dungeon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:268:1: ( ( ( rule__Dungeon__NameAssignment_1 ) ) )
            // InternalDungeonDSL.g:269:1: ( ( rule__Dungeon__NameAssignment_1 ) )
            {
            // InternalDungeonDSL.g:269:1: ( ( rule__Dungeon__NameAssignment_1 ) )
            // InternalDungeonDSL.g:270:2: ( rule__Dungeon__NameAssignment_1 )
            {
             before(grammarAccess.getDungeonAccess().getNameAssignment_1()); 
            // InternalDungeonDSL.g:271:2: ( rule__Dungeon__NameAssignment_1 )
            // InternalDungeonDSL.g:271:3: rule__Dungeon__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dungeon__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDungeonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__1__Impl"


    // $ANTLR start "rule__Dungeon__Group__2"
    // InternalDungeonDSL.g:279:1: rule__Dungeon__Group__2 : rule__Dungeon__Group__2__Impl rule__Dungeon__Group__3 ;
    public final void rule__Dungeon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:283:1: ( rule__Dungeon__Group__2__Impl rule__Dungeon__Group__3 )
            // InternalDungeonDSL.g:284:2: rule__Dungeon__Group__2__Impl rule__Dungeon__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Dungeon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__2"


    // $ANTLR start "rule__Dungeon__Group__2__Impl"
    // InternalDungeonDSL.g:291:1: rule__Dungeon__Group__2__Impl : ( '{' ) ;
    public final void rule__Dungeon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:295:1: ( ( '{' ) )
            // InternalDungeonDSL.g:296:1: ( '{' )
            {
            // InternalDungeonDSL.g:296:1: ( '{' )
            // InternalDungeonDSL.g:297:2: '{'
            {
             before(grammarAccess.getDungeonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__2__Impl"


    // $ANTLR start "rule__Dungeon__Group__3"
    // InternalDungeonDSL.g:306:1: rule__Dungeon__Group__3 : rule__Dungeon__Group__3__Impl rule__Dungeon__Group__4 ;
    public final void rule__Dungeon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:310:1: ( rule__Dungeon__Group__3__Impl rule__Dungeon__Group__4 )
            // InternalDungeonDSL.g:311:2: rule__Dungeon__Group__3__Impl rule__Dungeon__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Dungeon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__3"


    // $ANTLR start "rule__Dungeon__Group__3__Impl"
    // InternalDungeonDSL.g:318:1: rule__Dungeon__Group__3__Impl : ( 'theme' ) ;
    public final void rule__Dungeon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:322:1: ( ( 'theme' ) )
            // InternalDungeonDSL.g:323:1: ( 'theme' )
            {
            // InternalDungeonDSL.g:323:1: ( 'theme' )
            // InternalDungeonDSL.g:324:2: 'theme'
            {
             before(grammarAccess.getDungeonAccess().getThemeKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getThemeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__3__Impl"


    // $ANTLR start "rule__Dungeon__Group__4"
    // InternalDungeonDSL.g:333:1: rule__Dungeon__Group__4 : rule__Dungeon__Group__4__Impl rule__Dungeon__Group__5 ;
    public final void rule__Dungeon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:337:1: ( rule__Dungeon__Group__4__Impl rule__Dungeon__Group__5 )
            // InternalDungeonDSL.g:338:2: rule__Dungeon__Group__4__Impl rule__Dungeon__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Dungeon__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__4"


    // $ANTLR start "rule__Dungeon__Group__4__Impl"
    // InternalDungeonDSL.g:345:1: rule__Dungeon__Group__4__Impl : ( '=' ) ;
    public final void rule__Dungeon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:349:1: ( ( '=' ) )
            // InternalDungeonDSL.g:350:1: ( '=' )
            {
            // InternalDungeonDSL.g:350:1: ( '=' )
            // InternalDungeonDSL.g:351:2: '='
            {
             before(grammarAccess.getDungeonAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__4__Impl"


    // $ANTLR start "rule__Dungeon__Group__5"
    // InternalDungeonDSL.g:360:1: rule__Dungeon__Group__5 : rule__Dungeon__Group__5__Impl rule__Dungeon__Group__6 ;
    public final void rule__Dungeon__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:364:1: ( rule__Dungeon__Group__5__Impl rule__Dungeon__Group__6 )
            // InternalDungeonDSL.g:365:2: rule__Dungeon__Group__5__Impl rule__Dungeon__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Dungeon__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__5"


    // $ANTLR start "rule__Dungeon__Group__5__Impl"
    // InternalDungeonDSL.g:372:1: rule__Dungeon__Group__5__Impl : ( ( rule__Dungeon__ThemeAssignment_5 ) ) ;
    public final void rule__Dungeon__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:376:1: ( ( ( rule__Dungeon__ThemeAssignment_5 ) ) )
            // InternalDungeonDSL.g:377:1: ( ( rule__Dungeon__ThemeAssignment_5 ) )
            {
            // InternalDungeonDSL.g:377:1: ( ( rule__Dungeon__ThemeAssignment_5 ) )
            // InternalDungeonDSL.g:378:2: ( rule__Dungeon__ThemeAssignment_5 )
            {
             before(grammarAccess.getDungeonAccess().getThemeAssignment_5()); 
            // InternalDungeonDSL.g:379:2: ( rule__Dungeon__ThemeAssignment_5 )
            // InternalDungeonDSL.g:379:3: rule__Dungeon__ThemeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Dungeon__ThemeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDungeonAccess().getThemeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__5__Impl"


    // $ANTLR start "rule__Dungeon__Group__6"
    // InternalDungeonDSL.g:387:1: rule__Dungeon__Group__6 : rule__Dungeon__Group__6__Impl rule__Dungeon__Group__7 ;
    public final void rule__Dungeon__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:391:1: ( rule__Dungeon__Group__6__Impl rule__Dungeon__Group__7 )
            // InternalDungeonDSL.g:392:2: rule__Dungeon__Group__6__Impl rule__Dungeon__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Dungeon__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__6"


    // $ANTLR start "rule__Dungeon__Group__6__Impl"
    // InternalDungeonDSL.g:399:1: rule__Dungeon__Group__6__Impl : ( 'lvl' ) ;
    public final void rule__Dungeon__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:403:1: ( ( 'lvl' ) )
            // InternalDungeonDSL.g:404:1: ( 'lvl' )
            {
            // InternalDungeonDSL.g:404:1: ( 'lvl' )
            // InternalDungeonDSL.g:405:2: 'lvl'
            {
             before(grammarAccess.getDungeonAccess().getLvlKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getLvlKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__6__Impl"


    // $ANTLR start "rule__Dungeon__Group__7"
    // InternalDungeonDSL.g:414:1: rule__Dungeon__Group__7 : rule__Dungeon__Group__7__Impl rule__Dungeon__Group__8 ;
    public final void rule__Dungeon__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:418:1: ( rule__Dungeon__Group__7__Impl rule__Dungeon__Group__8 )
            // InternalDungeonDSL.g:419:2: rule__Dungeon__Group__7__Impl rule__Dungeon__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Dungeon__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__7"


    // $ANTLR start "rule__Dungeon__Group__7__Impl"
    // InternalDungeonDSL.g:426:1: rule__Dungeon__Group__7__Impl : ( '=' ) ;
    public final void rule__Dungeon__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:430:1: ( ( '=' ) )
            // InternalDungeonDSL.g:431:1: ( '=' )
            {
            // InternalDungeonDSL.g:431:1: ( '=' )
            // InternalDungeonDSL.g:432:2: '='
            {
             before(grammarAccess.getDungeonAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__7__Impl"


    // $ANTLR start "rule__Dungeon__Group__8"
    // InternalDungeonDSL.g:441:1: rule__Dungeon__Group__8 : rule__Dungeon__Group__8__Impl rule__Dungeon__Group__9 ;
    public final void rule__Dungeon__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:445:1: ( rule__Dungeon__Group__8__Impl rule__Dungeon__Group__9 )
            // InternalDungeonDSL.g:446:2: rule__Dungeon__Group__8__Impl rule__Dungeon__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Dungeon__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__8"


    // $ANTLR start "rule__Dungeon__Group__8__Impl"
    // InternalDungeonDSL.g:453:1: rule__Dungeon__Group__8__Impl : ( ( rule__Dungeon__LvlAssignment_8 ) ) ;
    public final void rule__Dungeon__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:457:1: ( ( ( rule__Dungeon__LvlAssignment_8 ) ) )
            // InternalDungeonDSL.g:458:1: ( ( rule__Dungeon__LvlAssignment_8 ) )
            {
            // InternalDungeonDSL.g:458:1: ( ( rule__Dungeon__LvlAssignment_8 ) )
            // InternalDungeonDSL.g:459:2: ( rule__Dungeon__LvlAssignment_8 )
            {
             before(grammarAccess.getDungeonAccess().getLvlAssignment_8()); 
            // InternalDungeonDSL.g:460:2: ( rule__Dungeon__LvlAssignment_8 )
            // InternalDungeonDSL.g:460:3: rule__Dungeon__LvlAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Dungeon__LvlAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDungeonAccess().getLvlAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__8__Impl"


    // $ANTLR start "rule__Dungeon__Group__9"
    // InternalDungeonDSL.g:468:1: rule__Dungeon__Group__9 : rule__Dungeon__Group__9__Impl rule__Dungeon__Group__10 ;
    public final void rule__Dungeon__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:472:1: ( rule__Dungeon__Group__9__Impl rule__Dungeon__Group__10 )
            // InternalDungeonDSL.g:473:2: rule__Dungeon__Group__9__Impl rule__Dungeon__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Dungeon__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__9"


    // $ANTLR start "rule__Dungeon__Group__9__Impl"
    // InternalDungeonDSL.g:480:1: rule__Dungeon__Group__9__Impl : ( ( rule__Dungeon__FloorsAssignment_9 )* ) ;
    public final void rule__Dungeon__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:484:1: ( ( ( rule__Dungeon__FloorsAssignment_9 )* ) )
            // InternalDungeonDSL.g:485:1: ( ( rule__Dungeon__FloorsAssignment_9 )* )
            {
            // InternalDungeonDSL.g:485:1: ( ( rule__Dungeon__FloorsAssignment_9 )* )
            // InternalDungeonDSL.g:486:2: ( rule__Dungeon__FloorsAssignment_9 )*
            {
             before(grammarAccess.getDungeonAccess().getFloorsAssignment_9()); 
            // InternalDungeonDSL.g:487:2: ( rule__Dungeon__FloorsAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDungeonDSL.g:487:3: rule__Dungeon__FloorsAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Dungeon__FloorsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDungeonAccess().getFloorsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__9__Impl"


    // $ANTLR start "rule__Dungeon__Group__10"
    // InternalDungeonDSL.g:495:1: rule__Dungeon__Group__10 : rule__Dungeon__Group__10__Impl ;
    public final void rule__Dungeon__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:499:1: ( rule__Dungeon__Group__10__Impl )
            // InternalDungeonDSL.g:500:2: rule__Dungeon__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dungeon__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__10"


    // $ANTLR start "rule__Dungeon__Group__10__Impl"
    // InternalDungeonDSL.g:506:1: rule__Dungeon__Group__10__Impl : ( '}' ) ;
    public final void rule__Dungeon__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:510:1: ( ( '}' ) )
            // InternalDungeonDSL.g:511:1: ( '}' )
            {
            // InternalDungeonDSL.g:511:1: ( '}' )
            // InternalDungeonDSL.g:512:2: '}'
            {
             before(grammarAccess.getDungeonAccess().getRightCurlyBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__Group__10__Impl"


    // $ANTLR start "rule__Floor__Group__0"
    // InternalDungeonDSL.g:522:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:526:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalDungeonDSL.g:527:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Floor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0"


    // $ANTLR start "rule__Floor__Group__0__Impl"
    // InternalDungeonDSL.g:534:1: rule__Floor__Group__0__Impl : ( 'Floor' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:538:1: ( ( 'Floor' ) )
            // InternalDungeonDSL.g:539:1: ( 'Floor' )
            {
            // InternalDungeonDSL.g:539:1: ( 'Floor' )
            // InternalDungeonDSL.g:540:2: 'Floor'
            {
             before(grammarAccess.getFloorAccess().getFloorKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0__Impl"


    // $ANTLR start "rule__Floor__Group__1"
    // InternalDungeonDSL.g:549:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:553:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalDungeonDSL.g:554:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1"


    // $ANTLR start "rule__Floor__Group__1__Impl"
    // InternalDungeonDSL.g:561:1: rule__Floor__Group__1__Impl : ( ( rule__Floor__NameAssignment_1 ) ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:565:1: ( ( ( rule__Floor__NameAssignment_1 ) ) )
            // InternalDungeonDSL.g:566:1: ( ( rule__Floor__NameAssignment_1 ) )
            {
            // InternalDungeonDSL.g:566:1: ( ( rule__Floor__NameAssignment_1 ) )
            // InternalDungeonDSL.g:567:2: ( rule__Floor__NameAssignment_1 )
            {
             before(grammarAccess.getFloorAccess().getNameAssignment_1()); 
            // InternalDungeonDSL.g:568:2: ( rule__Floor__NameAssignment_1 )
            // InternalDungeonDSL.g:568:3: rule__Floor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1__Impl"


    // $ANTLR start "rule__Floor__Group__2"
    // InternalDungeonDSL.g:576:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:580:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalDungeonDSL.g:581:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Floor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2"


    // $ANTLR start "rule__Floor__Group__2__Impl"
    // InternalDungeonDSL.g:588:1: rule__Floor__Group__2__Impl : ( '{' ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:592:1: ( ( '{' ) )
            // InternalDungeonDSL.g:593:1: ( '{' )
            {
            // InternalDungeonDSL.g:593:1: ( '{' )
            // InternalDungeonDSL.g:594:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2__Impl"


    // $ANTLR start "rule__Floor__Group__3"
    // InternalDungeonDSL.g:603:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:607:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalDungeonDSL.g:608:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Floor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3"


    // $ANTLR start "rule__Floor__Group__3__Impl"
    // InternalDungeonDSL.g:615:1: rule__Floor__Group__3__Impl : ( ( rule__Floor__RoomsAssignment_3 )* ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:619:1: ( ( ( rule__Floor__RoomsAssignment_3 )* ) )
            // InternalDungeonDSL.g:620:1: ( ( rule__Floor__RoomsAssignment_3 )* )
            {
            // InternalDungeonDSL.g:620:1: ( ( rule__Floor__RoomsAssignment_3 )* )
            // InternalDungeonDSL.g:621:2: ( rule__Floor__RoomsAssignment_3 )*
            {
             before(grammarAccess.getFloorAccess().getRoomsAssignment_3()); 
            // InternalDungeonDSL.g:622:2: ( rule__Floor__RoomsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDungeonDSL.g:622:3: rule__Floor__RoomsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Floor__RoomsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFloorAccess().getRoomsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__4"
    // InternalDungeonDSL.g:630:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:634:1: ( rule__Floor__Group__4__Impl )
            // InternalDungeonDSL.g:635:2: rule__Floor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4"


    // $ANTLR start "rule__Floor__Group__4__Impl"
    // InternalDungeonDSL.g:641:1: rule__Floor__Group__4__Impl : ( '}' ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:645:1: ( ( '}' ) )
            // InternalDungeonDSL.g:646:1: ( '}' )
            {
            // InternalDungeonDSL.g:646:1: ( '}' )
            // InternalDungeonDSL.g:647:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalDungeonDSL.g:657:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:661:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalDungeonDSL.g:662:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalDungeonDSL.g:669:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:673:1: ( ( 'Room' ) )
            // InternalDungeonDSL.g:674:1: ( 'Room' )
            {
            // InternalDungeonDSL.g:674:1: ( 'Room' )
            // InternalDungeonDSL.g:675:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalDungeonDSL.g:684:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:688:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalDungeonDSL.g:689:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalDungeonDSL.g:696:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:700:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalDungeonDSL.g:701:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalDungeonDSL.g:701:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalDungeonDSL.g:702:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalDungeonDSL.g:703:2: ( rule__Room__NameAssignment_1 )
            // InternalDungeonDSL.g:703:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalDungeonDSL.g:711:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:715:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalDungeonDSL.g:716:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalDungeonDSL.g:723:1: rule__Room__Group__2__Impl : ( '{' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:727:1: ( ( '{' ) )
            // InternalDungeonDSL.g:728:1: ( '{' )
            {
            // InternalDungeonDSL.g:728:1: ( '{' )
            // InternalDungeonDSL.g:729:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalDungeonDSL.g:738:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:742:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalDungeonDSL.g:743:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalDungeonDSL.g:750:1: rule__Room__Group__3__Impl : ( 'size' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:754:1: ( ( 'size' ) )
            // InternalDungeonDSL.g:755:1: ( 'size' )
            {
            // InternalDungeonDSL.g:755:1: ( 'size' )
            // InternalDungeonDSL.g:756:2: 'size'
            {
             before(grammarAccess.getRoomAccess().getSizeKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getSizeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalDungeonDSL.g:765:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:769:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalDungeonDSL.g:770:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalDungeonDSL.g:777:1: rule__Room__Group__4__Impl : ( '=' ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:781:1: ( ( '=' ) )
            // InternalDungeonDSL.g:782:1: ( '=' )
            {
            // InternalDungeonDSL.g:782:1: ( '=' )
            // InternalDungeonDSL.g:783:2: '='
            {
             before(grammarAccess.getRoomAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalDungeonDSL.g:792:1: rule__Room__Group__5 : rule__Room__Group__5__Impl rule__Room__Group__6 ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:796:1: ( rule__Room__Group__5__Impl rule__Room__Group__6 )
            // InternalDungeonDSL.g:797:2: rule__Room__Group__5__Impl rule__Room__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Room__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalDungeonDSL.g:804:1: rule__Room__Group__5__Impl : ( ( rule__Room__SizeAssignment_5 ) ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:808:1: ( ( ( rule__Room__SizeAssignment_5 ) ) )
            // InternalDungeonDSL.g:809:1: ( ( rule__Room__SizeAssignment_5 ) )
            {
            // InternalDungeonDSL.g:809:1: ( ( rule__Room__SizeAssignment_5 ) )
            // InternalDungeonDSL.g:810:2: ( rule__Room__SizeAssignment_5 )
            {
             before(grammarAccess.getRoomAccess().getSizeAssignment_5()); 
            // InternalDungeonDSL.g:811:2: ( rule__Room__SizeAssignment_5 )
            // InternalDungeonDSL.g:811:3: rule__Room__SizeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Room__SizeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSizeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group__6"
    // InternalDungeonDSL.g:819:1: rule__Room__Group__6 : rule__Room__Group__6__Impl rule__Room__Group__7 ;
    public final void rule__Room__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:823:1: ( rule__Room__Group__6__Impl rule__Room__Group__7 )
            // InternalDungeonDSL.g:824:2: rule__Room__Group__6__Impl rule__Room__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6"


    // $ANTLR start "rule__Room__Group__6__Impl"
    // InternalDungeonDSL.g:831:1: rule__Room__Group__6__Impl : ( 'type' ) ;
    public final void rule__Room__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:835:1: ( ( 'type' ) )
            // InternalDungeonDSL.g:836:1: ( 'type' )
            {
            // InternalDungeonDSL.g:836:1: ( 'type' )
            // InternalDungeonDSL.g:837:2: 'type'
            {
             before(grammarAccess.getRoomAccess().getTypeKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6__Impl"


    // $ANTLR start "rule__Room__Group__7"
    // InternalDungeonDSL.g:846:1: rule__Room__Group__7 : rule__Room__Group__7__Impl rule__Room__Group__8 ;
    public final void rule__Room__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:850:1: ( rule__Room__Group__7__Impl rule__Room__Group__8 )
            // InternalDungeonDSL.g:851:2: rule__Room__Group__7__Impl rule__Room__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Room__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7"


    // $ANTLR start "rule__Room__Group__7__Impl"
    // InternalDungeonDSL.g:858:1: rule__Room__Group__7__Impl : ( '=' ) ;
    public final void rule__Room__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:862:1: ( ( '=' ) )
            // InternalDungeonDSL.g:863:1: ( '=' )
            {
            // InternalDungeonDSL.g:863:1: ( '=' )
            // InternalDungeonDSL.g:864:2: '='
            {
             before(grammarAccess.getRoomAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7__Impl"


    // $ANTLR start "rule__Room__Group__8"
    // InternalDungeonDSL.g:873:1: rule__Room__Group__8 : rule__Room__Group__8__Impl rule__Room__Group__9 ;
    public final void rule__Room__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:877:1: ( rule__Room__Group__8__Impl rule__Room__Group__9 )
            // InternalDungeonDSL.g:878:2: rule__Room__Group__8__Impl rule__Room__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Room__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8"


    // $ANTLR start "rule__Room__Group__8__Impl"
    // InternalDungeonDSL.g:885:1: rule__Room__Group__8__Impl : ( ( rule__Room__TypeAssignment_8 ) ) ;
    public final void rule__Room__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:889:1: ( ( ( rule__Room__TypeAssignment_8 ) ) )
            // InternalDungeonDSL.g:890:1: ( ( rule__Room__TypeAssignment_8 ) )
            {
            // InternalDungeonDSL.g:890:1: ( ( rule__Room__TypeAssignment_8 ) )
            // InternalDungeonDSL.g:891:2: ( rule__Room__TypeAssignment_8 )
            {
             before(grammarAccess.getRoomAccess().getTypeAssignment_8()); 
            // InternalDungeonDSL.g:892:2: ( rule__Room__TypeAssignment_8 )
            // InternalDungeonDSL.g:892:3: rule__Room__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Room__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8__Impl"


    // $ANTLR start "rule__Room__Group__9"
    // InternalDungeonDSL.g:900:1: rule__Room__Group__9 : rule__Room__Group__9__Impl ;
    public final void rule__Room__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:904:1: ( rule__Room__Group__9__Impl )
            // InternalDungeonDSL.g:905:2: rule__Room__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9"


    // $ANTLR start "rule__Room__Group__9__Impl"
    // InternalDungeonDSL.g:911:1: rule__Room__Group__9__Impl : ( '}' ) ;
    public final void rule__Room__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:915:1: ( ( '}' ) )
            // InternalDungeonDSL.g:916:1: ( '}' )
            {
            // InternalDungeonDSL.g:916:1: ( '}' )
            // InternalDungeonDSL.g:917:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9__Impl"


    // $ANTLR start "rule__Dungeon__NameAssignment_1"
    // InternalDungeonDSL.g:927:1: rule__Dungeon__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dungeon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:931:1: ( ( RULE_ID ) )
            // InternalDungeonDSL.g:932:2: ( RULE_ID )
            {
            // InternalDungeonDSL.g:932:2: ( RULE_ID )
            // InternalDungeonDSL.g:933:3: RULE_ID
            {
             before(grammarAccess.getDungeonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__NameAssignment_1"


    // $ANTLR start "rule__Dungeon__ThemeAssignment_5"
    // InternalDungeonDSL.g:942:1: rule__Dungeon__ThemeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Dungeon__ThemeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:946:1: ( ( RULE_STRING ) )
            // InternalDungeonDSL.g:947:2: ( RULE_STRING )
            {
            // InternalDungeonDSL.g:947:2: ( RULE_STRING )
            // InternalDungeonDSL.g:948:3: RULE_STRING
            {
             before(grammarAccess.getDungeonAccess().getThemeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getThemeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__ThemeAssignment_5"


    // $ANTLR start "rule__Dungeon__LvlAssignment_8"
    // InternalDungeonDSL.g:957:1: rule__Dungeon__LvlAssignment_8 : ( RULE_INT ) ;
    public final void rule__Dungeon__LvlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:961:1: ( ( RULE_INT ) )
            // InternalDungeonDSL.g:962:2: ( RULE_INT )
            {
            // InternalDungeonDSL.g:962:2: ( RULE_INT )
            // InternalDungeonDSL.g:963:3: RULE_INT
            {
             before(grammarAccess.getDungeonAccess().getLvlINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDungeonAccess().getLvlINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__LvlAssignment_8"


    // $ANTLR start "rule__Dungeon__FloorsAssignment_9"
    // InternalDungeonDSL.g:972:1: rule__Dungeon__FloorsAssignment_9 : ( ruleFloor ) ;
    public final void rule__Dungeon__FloorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:976:1: ( ( ruleFloor ) )
            // InternalDungeonDSL.g:977:2: ( ruleFloor )
            {
            // InternalDungeonDSL.g:977:2: ( ruleFloor )
            // InternalDungeonDSL.g:978:3: ruleFloor
            {
             before(grammarAccess.getDungeonAccess().getFloorsFloorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getDungeonAccess().getFloorsFloorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dungeon__FloorsAssignment_9"


    // $ANTLR start "rule__Floor__NameAssignment_1"
    // InternalDungeonDSL.g:987:1: rule__Floor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Floor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:991:1: ( ( RULE_ID ) )
            // InternalDungeonDSL.g:992:2: ( RULE_ID )
            {
            // InternalDungeonDSL.g:992:2: ( RULE_ID )
            // InternalDungeonDSL.g:993:3: RULE_ID
            {
             before(grammarAccess.getFloorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__NameAssignment_1"


    // $ANTLR start "rule__Floor__RoomsAssignment_3"
    // InternalDungeonDSL.g:1002:1: rule__Floor__RoomsAssignment_3 : ( ruleRoom ) ;
    public final void rule__Floor__RoomsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:1006:1: ( ( ruleRoom ) )
            // InternalDungeonDSL.g:1007:2: ( ruleRoom )
            {
            // InternalDungeonDSL.g:1007:2: ( ruleRoom )
            // InternalDungeonDSL.g:1008:3: ruleRoom
            {
             before(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__RoomsAssignment_3"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalDungeonDSL.g:1017:1: rule__Room__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:1021:1: ( ( RULE_ID ) )
            // InternalDungeonDSL.g:1022:2: ( RULE_ID )
            {
            // InternalDungeonDSL.g:1022:2: ( RULE_ID )
            // InternalDungeonDSL.g:1023:3: RULE_ID
            {
             before(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__SizeAssignment_5"
    // InternalDungeonDSL.g:1032:1: rule__Room__SizeAssignment_5 : ( ruleSizes ) ;
    public final void rule__Room__SizeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:1036:1: ( ( ruleSizes ) )
            // InternalDungeonDSL.g:1037:2: ( ruleSizes )
            {
            // InternalDungeonDSL.g:1037:2: ( ruleSizes )
            // InternalDungeonDSL.g:1038:3: ruleSizes
            {
             before(grammarAccess.getRoomAccess().getSizeSizesEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSizes();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSizeSizesEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__SizeAssignment_5"


    // $ANTLR start "rule__Room__TypeAssignment_8"
    // InternalDungeonDSL.g:1047:1: rule__Room__TypeAssignment_8 : ( ruleRoomTypes ) ;
    public final void rule__Room__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDungeonDSL.g:1051:1: ( ( ruleRoomTypes ) )
            // InternalDungeonDSL.g:1052:2: ( ruleRoomTypes )
            {
            // InternalDungeonDSL.g:1052:2: ( ruleRoomTypes )
            // InternalDungeonDSL.g:1053:3: ruleRoomTypes
            {
             before(grammarAccess.getRoomAccess().getTypeRoomTypesEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRoomTypes();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getTypeRoomTypesEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__TypeAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}