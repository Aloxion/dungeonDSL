package org.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.DungeonDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDungeonDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Dungeon'", "'{'", "'theme'", "'='", "'lvl'", "'}'", "'Floor'", "'Room'", "'size'", "'type'", "'floorID'", "'connections'", "'['", "','", "']'", "'Trap'", "'trigger'", "'disarmable'", "'triggerChance'", "'true'", "'false'", "'LARGE'", "'MEDIUM'", "'SMALL'", "'COMBAT'", "'TREASURE'", "'BOSS'", "'PUZZLE'", "'SHOP'", "'stepOn'", "'openDoor'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
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

        public InternalDungeonDSLParser(TokenStream input, DungeonDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dungeon";
       	}

       	@Override
       	protected DungeonDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDungeon"
    // InternalDungeonDSL.g:65:1: entryRuleDungeon returns [EObject current=null] : iv_ruleDungeon= ruleDungeon EOF ;
    public final EObject entryRuleDungeon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDungeon = null;


        try {
            // InternalDungeonDSL.g:65:48: (iv_ruleDungeon= ruleDungeon EOF )
            // InternalDungeonDSL.g:66:2: iv_ruleDungeon= ruleDungeon EOF
            {
             newCompositeNode(grammarAccess.getDungeonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDungeon=ruleDungeon();

            state._fsp--;

             current =iv_ruleDungeon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDungeon"


    // $ANTLR start "ruleDungeon"
    // InternalDungeonDSL.g:72:1: ruleDungeon returns [EObject current=null] : (otherlv_0= 'Dungeon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' otherlv_4= '=' ( (lv_theme_5_0= RULE_STRING ) ) otherlv_6= 'lvl' otherlv_7= '=' ( (lv_lvl_8_0= RULE_INT ) ) ( (lv_floors_9_0= ruleFloor ) )* otherlv_10= '}' ) ;
    public final EObject ruleDungeon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_theme_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_lvl_8_0=null;
        Token otherlv_10=null;
        EObject lv_floors_9_0 = null;



        	enterRule();

        try {
            // InternalDungeonDSL.g:78:2: ( (otherlv_0= 'Dungeon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' otherlv_4= '=' ( (lv_theme_5_0= RULE_STRING ) ) otherlv_6= 'lvl' otherlv_7= '=' ( (lv_lvl_8_0= RULE_INT ) ) ( (lv_floors_9_0= ruleFloor ) )* otherlv_10= '}' ) )
            // InternalDungeonDSL.g:79:2: (otherlv_0= 'Dungeon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' otherlv_4= '=' ( (lv_theme_5_0= RULE_STRING ) ) otherlv_6= 'lvl' otherlv_7= '=' ( (lv_lvl_8_0= RULE_INT ) ) ( (lv_floors_9_0= ruleFloor ) )* otherlv_10= '}' )
            {
            // InternalDungeonDSL.g:79:2: (otherlv_0= 'Dungeon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' otherlv_4= '=' ( (lv_theme_5_0= RULE_STRING ) ) otherlv_6= 'lvl' otherlv_7= '=' ( (lv_lvl_8_0= RULE_INT ) ) ( (lv_floors_9_0= ruleFloor ) )* otherlv_10= '}' )
            // InternalDungeonDSL.g:80:3: otherlv_0= 'Dungeon' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'theme' otherlv_4= '=' ( (lv_theme_5_0= RULE_STRING ) ) otherlv_6= 'lvl' otherlv_7= '=' ( (lv_lvl_8_0= RULE_INT ) ) ( (lv_floors_9_0= ruleFloor ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDungeonAccess().getDungeonKeyword_0());
            		
            // InternalDungeonDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDungeonDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDungeonDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDungeonDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDungeonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDungeonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDungeonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDungeonAccess().getThemeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDungeonAccess().getEqualsSignKeyword_4());
            		
            // InternalDungeonDSL.g:114:3: ( (lv_theme_5_0= RULE_STRING ) )
            // InternalDungeonDSL.g:115:4: (lv_theme_5_0= RULE_STRING )
            {
            // InternalDungeonDSL.g:115:4: (lv_theme_5_0= RULE_STRING )
            // InternalDungeonDSL.g:116:5: lv_theme_5_0= RULE_STRING
            {
            lv_theme_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_theme_5_0, grammarAccess.getDungeonAccess().getThemeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDungeonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"theme",
            						lv_theme_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDungeonAccess().getLvlKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getDungeonAccess().getEqualsSignKeyword_7());
            		
            // InternalDungeonDSL.g:140:3: ( (lv_lvl_8_0= RULE_INT ) )
            // InternalDungeonDSL.g:141:4: (lv_lvl_8_0= RULE_INT )
            {
            // InternalDungeonDSL.g:141:4: (lv_lvl_8_0= RULE_INT )
            // InternalDungeonDSL.g:142:5: lv_lvl_8_0= RULE_INT
            {
            lv_lvl_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_lvl_8_0, grammarAccess.getDungeonAccess().getLvlINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDungeonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lvl",
            						lv_lvl_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDungeonDSL.g:158:3: ( (lv_floors_9_0= ruleFloor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDungeonDSL.g:159:4: (lv_floors_9_0= ruleFloor )
            	    {
            	    // InternalDungeonDSL.g:159:4: (lv_floors_9_0= ruleFloor )
            	    // InternalDungeonDSL.g:160:5: lv_floors_9_0= ruleFloor
            	    {

            	    					newCompositeNode(grammarAccess.getDungeonAccess().getFloorsFloorParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_floors_9_0=ruleFloor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDungeonRule());
            	    					}
            	    					add(
            	    						current,
            	    						"floors",
            	    						lv_floors_9_0,
            	    						"org.DungeonDSL.Floor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDungeonAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDungeon"


    // $ANTLR start "entryRuleFloor"
    // InternalDungeonDSL.g:185:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // InternalDungeonDSL.g:185:46: (iv_ruleFloor= ruleFloor EOF )
            // InternalDungeonDSL.g:186:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalDungeonDSL.g:192:1: ruleFloor returns [EObject current=null] : (otherlv_0= 'Floor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) )* otherlv_4= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rooms_3_0 = null;



        	enterRule();

        try {
            // InternalDungeonDSL.g:198:2: ( (otherlv_0= 'Floor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) )* otherlv_4= '}' ) )
            // InternalDungeonDSL.g:199:2: (otherlv_0= 'Floor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) )* otherlv_4= '}' )
            {
            // InternalDungeonDSL.g:199:2: (otherlv_0= 'Floor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) )* otherlv_4= '}' )
            // InternalDungeonDSL.g:200:3: otherlv_0= 'Floor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rooms_3_0= ruleRoom ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloorAccess().getFloorKeyword_0());
            		
            // InternalDungeonDSL.g:204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDungeonDSL.g:205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDungeonDSL.g:205:4: (lv_name_1_0= RULE_ID )
            // InternalDungeonDSL.g:206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFloorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDungeonDSL.g:226:3: ( (lv_rooms_3_0= ruleRoom ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDungeonDSL.g:227:4: (lv_rooms_3_0= ruleRoom )
            	    {
            	    // InternalDungeonDSL.g:227:4: (lv_rooms_3_0= ruleRoom )
            	    // InternalDungeonDSL.g:228:5: lv_rooms_3_0= ruleRoom
            	    {

            	    					newCompositeNode(grammarAccess.getFloorAccess().getRoomsRoomParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_rooms_3_0=ruleRoom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rooms",
            	    						lv_rooms_3_0,
            	    						"org.DungeonDSL.Room");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleRoom"
    // InternalDungeonDSL.g:253:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalDungeonDSL.g:253:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalDungeonDSL.g:254:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalDungeonDSL.g:260:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleSizes ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleRoomTypes ) ) otherlv_9= 'floorID' otherlv_10= '=' ( (lv_floor_11_0= RULE_ID ) ) otherlv_12= 'connections' otherlv_13= '=' otherlv_14= '[' ( (lv_connections_15_0= RULE_ID ) ) (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )* otherlv_18= ']' ( (lv_traps_19_0= ruleTrap ) )* otherlv_20= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_floor_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_connections_15_0=null;
        Token otherlv_16=null;
        Token lv_connections_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_size_5_0 = null;

        Enumerator lv_type_8_0 = null;

        EObject lv_traps_19_0 = null;



        	enterRule();

        try {
            // InternalDungeonDSL.g:266:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleSizes ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleRoomTypes ) ) otherlv_9= 'floorID' otherlv_10= '=' ( (lv_floor_11_0= RULE_ID ) ) otherlv_12= 'connections' otherlv_13= '=' otherlv_14= '[' ( (lv_connections_15_0= RULE_ID ) ) (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )* otherlv_18= ']' ( (lv_traps_19_0= ruleTrap ) )* otherlv_20= '}' ) )
            // InternalDungeonDSL.g:267:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleSizes ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleRoomTypes ) ) otherlv_9= 'floorID' otherlv_10= '=' ( (lv_floor_11_0= RULE_ID ) ) otherlv_12= 'connections' otherlv_13= '=' otherlv_14= '[' ( (lv_connections_15_0= RULE_ID ) ) (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )* otherlv_18= ']' ( (lv_traps_19_0= ruleTrap ) )* otherlv_20= '}' )
            {
            // InternalDungeonDSL.g:267:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleSizes ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleRoomTypes ) ) otherlv_9= 'floorID' otherlv_10= '=' ( (lv_floor_11_0= RULE_ID ) ) otherlv_12= 'connections' otherlv_13= '=' otherlv_14= '[' ( (lv_connections_15_0= RULE_ID ) ) (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )* otherlv_18= ']' ( (lv_traps_19_0= ruleTrap ) )* otherlv_20= '}' )
            // InternalDungeonDSL.g:268:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleSizes ) ) otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleRoomTypes ) ) otherlv_9= 'floorID' otherlv_10= '=' ( (lv_floor_11_0= RULE_ID ) ) otherlv_12= 'connections' otherlv_13= '=' otherlv_14= '[' ( (lv_connections_15_0= RULE_ID ) ) (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )* otherlv_18= ']' ( (lv_traps_19_0= ruleTrap ) )* otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalDungeonDSL.g:272:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDungeonDSL.g:273:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDungeonDSL.g:273:4: (lv_name_1_0= RULE_ID )
            // InternalDungeonDSL.g:274:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getSizeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getEqualsSignKeyword_4());
            		
            // InternalDungeonDSL.g:302:3: ( (lv_size_5_0= ruleSizes ) )
            // InternalDungeonDSL.g:303:4: (lv_size_5_0= ruleSizes )
            {
            // InternalDungeonDSL.g:303:4: (lv_size_5_0= ruleSizes )
            // InternalDungeonDSL.g:304:5: lv_size_5_0= ruleSizes
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getSizeSizesEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_size_5_0=ruleSizes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_5_0,
            						"org.DungeonDSL.Sizes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getEqualsSignKeyword_7());
            		
            // InternalDungeonDSL.g:329:3: ( (lv_type_8_0= ruleRoomTypes ) )
            // InternalDungeonDSL.g:330:4: (lv_type_8_0= ruleRoomTypes )
            {
            // InternalDungeonDSL.g:330:4: (lv_type_8_0= ruleRoomTypes )
            // InternalDungeonDSL.g:331:5: lv_type_8_0= ruleRoomTypes
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getTypeRoomTypesEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_8_0=ruleRoomTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"org.DungeonDSL.RoomTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getFloorIDKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getRoomAccess().getEqualsSignKeyword_10());
            		
            // InternalDungeonDSL.g:356:3: ( (lv_floor_11_0= RULE_ID ) )
            // InternalDungeonDSL.g:357:4: (lv_floor_11_0= RULE_ID )
            {
            // InternalDungeonDSL.g:357:4: (lv_floor_11_0= RULE_ID )
            // InternalDungeonDSL.g:358:5: lv_floor_11_0= RULE_ID
            {
            lv_floor_11_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_floor_11_0, grammarAccess.getRoomAccess().getFloorIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"floor",
            						lv_floor_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getRoomAccess().getConnectionsKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getRoomAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getRoomAccess().getLeftSquareBracketKeyword_14());
            		
            // InternalDungeonDSL.g:386:3: ( (lv_connections_15_0= RULE_ID ) )
            // InternalDungeonDSL.g:387:4: (lv_connections_15_0= RULE_ID )
            {
            // InternalDungeonDSL.g:387:4: (lv_connections_15_0= RULE_ID )
            // InternalDungeonDSL.g:388:5: lv_connections_15_0= RULE_ID
            {
            lv_connections_15_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_connections_15_0, grammarAccess.getRoomAccess().getConnectionsIDTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					addWithLastConsumed(
            						current,
            						"connections",
            						lv_connections_15_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDungeonDSL.g:404:3: (otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDungeonDSL.g:405:4: otherlv_16= ',' ( (lv_connections_17_0= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_16, grammarAccess.getRoomAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalDungeonDSL.g:409:4: ( (lv_connections_17_0= RULE_ID ) )
            	    // InternalDungeonDSL.g:410:5: (lv_connections_17_0= RULE_ID )
            	    {
            	    // InternalDungeonDSL.g:410:5: (lv_connections_17_0= RULE_ID )
            	    // InternalDungeonDSL.g:411:6: lv_connections_17_0= RULE_ID
            	    {
            	    lv_connections_17_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(lv_connections_17_0, grammarAccess.getRoomAccess().getConnectionsIDTerminalRuleCall_16_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRoomRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"connections",
            	    							lv_connections_17_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_18=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_18, grammarAccess.getRoomAccess().getRightSquareBracketKeyword_17());
            		
            // InternalDungeonDSL.g:432:3: ( (lv_traps_19_0= ruleTrap ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDungeonDSL.g:433:4: (lv_traps_19_0= ruleTrap )
            	    {
            	    // InternalDungeonDSL.g:433:4: (lv_traps_19_0= ruleTrap )
            	    // InternalDungeonDSL.g:434:5: lv_traps_19_0= ruleTrap
            	    {

            	    					newCompositeNode(grammarAccess.getRoomAccess().getTrapsTrapParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_traps_19_0=ruleTrap();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"traps",
            	    						lv_traps_19_0,
            	    						"org.DungeonDSL.Trap");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleTrap"
    // InternalDungeonDSL.g:459:1: entryRuleTrap returns [EObject current=null] : iv_ruleTrap= ruleTrap EOF ;
    public final EObject entryRuleTrap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrap = null;


        try {
            // InternalDungeonDSL.g:459:45: (iv_ruleTrap= ruleTrap EOF )
            // InternalDungeonDSL.g:460:2: iv_ruleTrap= ruleTrap EOF
            {
             newCompositeNode(grammarAccess.getTrapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrap=ruleTrap();

            state._fsp--;

             current =iv_ruleTrap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrap"


    // $ANTLR start "ruleTrap"
    // InternalDungeonDSL.g:466:1: ruleTrap returns [EObject current=null] : (otherlv_0= 'Trap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= '=' ( (lv_trigger_5_0= ruleEventTrigger ) ) otherlv_6= 'disarmable' otherlv_7= '=' ( (lv_disarmable_8_0= ruleBOOLEAN ) ) otherlv_9= 'triggerChance' otherlv_10= '=' ( (lv_triggerChance_11_0= RULE_INT ) ) otherlv_12= '}' ) ;
    public final EObject ruleTrap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_triggerChance_11_0=null;
        Token otherlv_12=null;
        Enumerator lv_trigger_5_0 = null;

        Enumerator lv_disarmable_8_0 = null;



        	enterRule();

        try {
            // InternalDungeonDSL.g:472:2: ( (otherlv_0= 'Trap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= '=' ( (lv_trigger_5_0= ruleEventTrigger ) ) otherlv_6= 'disarmable' otherlv_7= '=' ( (lv_disarmable_8_0= ruleBOOLEAN ) ) otherlv_9= 'triggerChance' otherlv_10= '=' ( (lv_triggerChance_11_0= RULE_INT ) ) otherlv_12= '}' ) )
            // InternalDungeonDSL.g:473:2: (otherlv_0= 'Trap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= '=' ( (lv_trigger_5_0= ruleEventTrigger ) ) otherlv_6= 'disarmable' otherlv_7= '=' ( (lv_disarmable_8_0= ruleBOOLEAN ) ) otherlv_9= 'triggerChance' otherlv_10= '=' ( (lv_triggerChance_11_0= RULE_INT ) ) otherlv_12= '}' )
            {
            // InternalDungeonDSL.g:473:2: (otherlv_0= 'Trap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= '=' ( (lv_trigger_5_0= ruleEventTrigger ) ) otherlv_6= 'disarmable' otherlv_7= '=' ( (lv_disarmable_8_0= ruleBOOLEAN ) ) otherlv_9= 'triggerChance' otherlv_10= '=' ( (lv_triggerChance_11_0= RULE_INT ) ) otherlv_12= '}' )
            // InternalDungeonDSL.g:474:3: otherlv_0= 'Trap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'trigger' otherlv_4= '=' ( (lv_trigger_5_0= ruleEventTrigger ) ) otherlv_6= 'disarmable' otherlv_7= '=' ( (lv_disarmable_8_0= ruleBOOLEAN ) ) otherlv_9= 'triggerChance' otherlv_10= '=' ( (lv_triggerChance_11_0= RULE_INT ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTrapAccess().getTrapKeyword_0());
            		
            // InternalDungeonDSL.g:478:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDungeonDSL.g:479:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDungeonDSL.g:479:4: (lv_name_1_0= RULE_ID )
            // InternalDungeonDSL.g:480:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTrapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTrapAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTrapAccess().getTriggerKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getTrapAccess().getEqualsSignKeyword_4());
            		
            // InternalDungeonDSL.g:508:3: ( (lv_trigger_5_0= ruleEventTrigger ) )
            // InternalDungeonDSL.g:509:4: (lv_trigger_5_0= ruleEventTrigger )
            {
            // InternalDungeonDSL.g:509:4: (lv_trigger_5_0= ruleEventTrigger )
            // InternalDungeonDSL.g:510:5: lv_trigger_5_0= ruleEventTrigger
            {

            					newCompositeNode(grammarAccess.getTrapAccess().getTriggerEventTriggerEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_trigger_5_0=ruleEventTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrapRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_5_0,
            						"org.DungeonDSL.EventTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getTrapAccess().getDisarmableKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getTrapAccess().getEqualsSignKeyword_7());
            		
            // InternalDungeonDSL.g:535:3: ( (lv_disarmable_8_0= ruleBOOLEAN ) )
            // InternalDungeonDSL.g:536:4: (lv_disarmable_8_0= ruleBOOLEAN )
            {
            // InternalDungeonDSL.g:536:4: (lv_disarmable_8_0= ruleBOOLEAN )
            // InternalDungeonDSL.g:537:5: lv_disarmable_8_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getTrapAccess().getDisarmableBOOLEANEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_25);
            lv_disarmable_8_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrapRule());
            					}
            					set(
            						current,
            						"disarmable",
            						lv_disarmable_8_0,
            						"org.DungeonDSL.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getTrapAccess().getTriggerChanceKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getTrapAccess().getEqualsSignKeyword_10());
            		
            // InternalDungeonDSL.g:562:3: ( (lv_triggerChance_11_0= RULE_INT ) )
            // InternalDungeonDSL.g:563:4: (lv_triggerChance_11_0= RULE_INT )
            {
            // InternalDungeonDSL.g:563:4: (lv_triggerChance_11_0= RULE_INT )
            // InternalDungeonDSL.g:564:5: lv_triggerChance_11_0= RULE_INT
            {
            lv_triggerChance_11_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_triggerChance_11_0, grammarAccess.getTrapAccess().getTriggerChanceINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"triggerChance",
            						lv_triggerChance_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTrapAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrap"


    // $ANTLR start "ruleBOOLEAN"
    // InternalDungeonDSL.g:588:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDungeonDSL.g:594:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalDungeonDSL.g:595:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalDungeonDSL.g:595:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDungeonDSL.g:596:3: (enumLiteral_0= 'true' )
                    {
                    // InternalDungeonDSL.g:596:3: (enumLiteral_0= 'true' )
                    // InternalDungeonDSL.g:597:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTrueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:604:3: (enumLiteral_1= 'false' )
                    {
                    // InternalDungeonDSL.g:604:3: (enumLiteral_1= 'false' )
                    // InternalDungeonDSL.g:605:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFalseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "ruleSizes"
    // InternalDungeonDSL.g:615:1: ruleSizes returns [Enumerator current=null] : ( (enumLiteral_0= 'LARGE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'SMALL' ) ) ;
    public final Enumerator ruleSizes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDungeonDSL.g:621:2: ( ( (enumLiteral_0= 'LARGE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'SMALL' ) ) )
            // InternalDungeonDSL.g:622:2: ( (enumLiteral_0= 'LARGE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'SMALL' ) )
            {
            // InternalDungeonDSL.g:622:2: ( (enumLiteral_0= 'LARGE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'SMALL' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDungeonDSL.g:623:3: (enumLiteral_0= 'LARGE' )
                    {
                    // InternalDungeonDSL.g:623:3: (enumLiteral_0= 'LARGE' )
                    // InternalDungeonDSL.g:624:4: enumLiteral_0= 'LARGE'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSizesAccess().getLARGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:631:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalDungeonDSL.g:631:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalDungeonDSL.g:632:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSizesAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDungeonDSL.g:639:3: (enumLiteral_2= 'SMALL' )
                    {
                    // InternalDungeonDSL.g:639:3: (enumLiteral_2= 'SMALL' )
                    // InternalDungeonDSL.g:640:4: enumLiteral_2= 'SMALL'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSizesAccess().getSMALLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizes"


    // $ANTLR start "ruleRoomTypes"
    // InternalDungeonDSL.g:650:1: ruleRoomTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'COMBAT' ) | (enumLiteral_1= 'TREASURE' ) | (enumLiteral_2= 'BOSS' ) | (enumLiteral_3= 'PUZZLE' ) | (enumLiteral_4= 'SHOP' ) ) ;
    public final Enumerator ruleRoomTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDungeonDSL.g:656:2: ( ( (enumLiteral_0= 'COMBAT' ) | (enumLiteral_1= 'TREASURE' ) | (enumLiteral_2= 'BOSS' ) | (enumLiteral_3= 'PUZZLE' ) | (enumLiteral_4= 'SHOP' ) ) )
            // InternalDungeonDSL.g:657:2: ( (enumLiteral_0= 'COMBAT' ) | (enumLiteral_1= 'TREASURE' ) | (enumLiteral_2= 'BOSS' ) | (enumLiteral_3= 'PUZZLE' ) | (enumLiteral_4= 'SHOP' ) )
            {
            // InternalDungeonDSL.g:657:2: ( (enumLiteral_0= 'COMBAT' ) | (enumLiteral_1= 'TREASURE' ) | (enumLiteral_2= 'BOSS' ) | (enumLiteral_3= 'PUZZLE' ) | (enumLiteral_4= 'SHOP' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 38:
                {
                alt7=4;
                }
                break;
            case 39:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDungeonDSL.g:658:3: (enumLiteral_0= 'COMBAT' )
                    {
                    // InternalDungeonDSL.g:658:3: (enumLiteral_0= 'COMBAT' )
                    // InternalDungeonDSL.g:659:4: enumLiteral_0= 'COMBAT'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoomTypesAccess().getCOMBATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:666:3: (enumLiteral_1= 'TREASURE' )
                    {
                    // InternalDungeonDSL.g:666:3: (enumLiteral_1= 'TREASURE' )
                    // InternalDungeonDSL.g:667:4: enumLiteral_1= 'TREASURE'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoomTypesAccess().getTREASUREEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDungeonDSL.g:674:3: (enumLiteral_2= 'BOSS' )
                    {
                    // InternalDungeonDSL.g:674:3: (enumLiteral_2= 'BOSS' )
                    // InternalDungeonDSL.g:675:4: enumLiteral_2= 'BOSS'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoomTypesAccess().getBOSSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDungeonDSL.g:682:3: (enumLiteral_3= 'PUZZLE' )
                    {
                    // InternalDungeonDSL.g:682:3: (enumLiteral_3= 'PUZZLE' )
                    // InternalDungeonDSL.g:683:4: enumLiteral_3= 'PUZZLE'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoomTypesAccess().getPUZZLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDungeonDSL.g:690:3: (enumLiteral_4= 'SHOP' )
                    {
                    // InternalDungeonDSL.g:690:3: (enumLiteral_4= 'SHOP' )
                    // InternalDungeonDSL.g:691:4: enumLiteral_4= 'SHOP'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRoomTypesAccess().getSHOPEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomTypes"


    // $ANTLR start "ruleEventTrigger"
    // InternalDungeonDSL.g:701:1: ruleEventTrigger returns [Enumerator current=null] : ( (enumLiteral_0= 'stepOn' ) | (enumLiteral_1= 'openDoor' ) ) ;
    public final Enumerator ruleEventTrigger() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDungeonDSL.g:707:2: ( ( (enumLiteral_0= 'stepOn' ) | (enumLiteral_1= 'openDoor' ) ) )
            // InternalDungeonDSL.g:708:2: ( (enumLiteral_0= 'stepOn' ) | (enumLiteral_1= 'openDoor' ) )
            {
            // InternalDungeonDSL.g:708:2: ( (enumLiteral_0= 'stepOn' ) | (enumLiteral_1= 'openDoor' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDungeonDSL.g:709:3: (enumLiteral_0= 'stepOn' )
                    {
                    // InternalDungeonDSL.g:709:3: (enumLiteral_0= 'stepOn' )
                    // InternalDungeonDSL.g:710:4: enumLiteral_0= 'stepOn'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getEventTriggerAccess().getStepOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTriggerAccess().getStepOnEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDungeonDSL.g:717:3: (enumLiteral_1= 'openDoor' )
                    {
                    // InternalDungeonDSL.g:717:3: (enumLiteral_1= 'openDoor' )
                    // InternalDungeonDSL.g:718:4: enumLiteral_1= 'openDoor'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEventTriggerAccess().getOpenDoorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTriggerAccess().getOpenDoorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventTrigger"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});

}