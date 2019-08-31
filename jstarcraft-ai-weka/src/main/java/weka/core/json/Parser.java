
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

package weka.core.json;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Stack;

import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.SymbolFactory;

/**
 * CUP v0.11b 20141202 (SVN rev 60) generated parser.
 */
@SuppressWarnings({ "rawtypes" })
public class Parser extends java_cup.runtime.lr_parser {

    public final Class getSymbolContainer() {
        return sym.class;
    }

    /** Default constructor. */
    public Parser() {
        super();
    }

    /** Constructor which sets the default scanner. */
    public Parser(java_cup.runtime.Scanner s) {
        super(s);
    }

    /** Constructor which sets the default scanner. */
    public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /** Production table. */
    protected static final short _production_table[][] = unpackFromStrings(new String[] { "\000\053\000\002\002\004\000\002\002\004\000\002\002" + "\005\000\002\003\005\000\002\003\003\000\002\004\003" + "\000\002\004\003\000\002\004\003\000\002\005\003\000" + "\002\005\003\000\002\005\003\000\002\005\003\000\002" + "\005\003\000\002\006\005\000\002\007\005\000\002\010" + "\005\000\002\011\005\000\002\012\005\000\002\014\004" + "\000\002\014\005\000\002\015\005\000\002\013\004\000" + "\002\013\005\000\002\016\003\000\002\017\003\000\002" + "\020\003\000\002\022\004\000\002\022\005\000\002\023" + "\005\000\002\021\004\000\002\021\005\000\002\024\003" + "\000\002\025\003\000\002\026\003\000\002\027\005\000" + "\002\027\003\000\002\030\003\000\002\030\003\000\002" + "\030\003\000\002\030\003\000\002\030\003\000\002\030" + "\003\000\002\030\003" });

    /** Access to production table. */
    public short[][] production_table() {
        return _production_table;
    }

    /** Parse-action table. */
    protected static final short[][] _action_table = unpackFromStrings(new String[] { "\000\073\000\004\007\005\001\002\000\004\002\075\001" + "\002\000\006\010\020\016\014\001\002\000\006\004\062" + "\010\074\001\002\000\006\010\060\016\014\001\002\000" + "\022\005\035\006\043\007\051\012\042\013\041\014\037" + "\015\047\016\045\001\002\000\006\004\ufffd\010\ufffd\001" + "\002\000\006\004\ufffb\010\ufffb\001\002\000\006\004\ufff7" + "\010\ufff7\001\002\000\004\011\024\001\002\000\006\004" + "\ufff9\010\ufff9\001\002\000\006\004\ufffc\010\ufffc\001\002" + "\000\006\004\ufff5\010\ufff5\001\002\000\004\002\001\001" + "\002\000\006\004\ufff6\010\ufff6\001\002\000\006\004\ufffa" + "\010\ufffa\001\002\000\006\004\ufff8\010\ufff8\001\002\000" + "\020\005\025\007\031\012\032\013\033\014\026\015\027" + "\016\030\001\002\000\022\005\uffe5\006\uffe5\007\uffe5\012" + "\uffe5\013\uffe5\014\uffe5\015\uffe5\016\uffe5\001\002\000\006" + "\004\ufff2\010\ufff2\001\002\000\006\004\ufff1\010\ufff1\001"
            + "\002\000\006\004\ufff0\010\ufff0\001\002\000\006\010\uffed" + "\016\uffed\001\002\000\006\004\ufff4\010\ufff4\001\002\000" + "\006\004\ufff3\010\ufff3\001\002\000\006\004\067\006\uffe1" + "\001\002\000\022\005\uffe2\006\uffe2\007\uffe2\012\uffe2\013" + "\uffe2\014\uffe2\015\uffe2\016\uffe2\001\002\000\022\005\035" + "\006\043\007\051\012\042\013\041\014\037\015\047\016" + "\045\001\002\000\006\004\uffdb\006\uffdb\001\002\000\006" + "\004\uffe7\010\uffe7\001\002\000\006\004\uffdc\006\uffdc\001" + "\002\000\006\004\uffdd\006\uffdd\001\002\000\010\004\uffe0" + "\006\uffe0\010\uffe0\001\002\000\006\004\uffde\006\uffde\001" + "\002\000\006\004\uffd9\006\uffd9\001\002\000\006\010\060" + "\016\014\001\002\000\006\004\uffda\006\uffda\001\002\000" + "\004\006\043\001\002\000\006\010\uffea\016\uffea\001\002" + "\000\006\004\uffd7\006\uffd7\001\002\000\006\004\uffd8\006" + "\uffd8\001\002\000\006\004\uffe6\010\uffe6\001\002\000\006"
            + "\004\062\010\uffe9\001\002\000\004\010\060\001\002\000" + "\006\004\uffec\006\uffec\001\002\000\010\004\uffe8\006\uffe8" + "\010\uffe8\001\002\000\006\004\uffeb\006\uffeb\001\002\000" + "\004\016\014\001\002\000\006\004\ufffe\010\ufffe\001\002" + "\000\006\004\uffe4\006\uffe4\001\002\000\004\006\043\001" + "\002\000\006\004\uffe3\006\uffe3\001\002\000\020\005\035" + "\007\051\012\042\013\041\014\037\015\047\016\045\001" + "\002\000\006\004\uffdf\006\uffdf\001\002\000\004\010\060" + "\001\002\000\006\004\uffef\010\uffef\001\002\000\006\004" + "\uffee\010\uffee\001\002\000\004\002\uffff\001\002\000\004" + "\002\000\001\002" });

    /** Access to parse-action table. */
    public short[][] action_table() {
        return _action_table;
    }

    /** <code>reduce_goto</code> table. */
    protected static final short[][] _reduce_table = unpackFromStrings(new String[] { "\000\073\000\004\002\003\001\001\000\002\001\001\000" + "\032\003\005\004\010\005\015\006\014\007\022\010\012" + "\011\020\012\016\014\011\015\006\022\021\023\007\001" + "\001\000\002\001\001\000\036\003\054\004\010\005\015" + "\006\014\007\022\010\012\011\020\012\016\014\011\015" + "\006\017\070\020\071\022\021\023\007\001\001\000\022" + "\013\052\016\045\021\051\024\035\025\047\026\037\027" + "\033\030\043\001\001\000\002\001\001\000\002\001\001" + "\000\002\001\001\000\002\001\001\000\002\001\001\000" + "\002\001\001\000\002\001\001\000\002\001\001\000\002" + "\001\001\000\002\001\001\000\002\001\001\000\002\001" + "\001\000\002\001\001\000\002\001\001\000\002\001\001" + "\000\002\001\001\000\002\001\001\000\002\001\001\000" + "\002\001\001\000\002\001\001\000\002\001\001\000\022" + "\013\052\016\045\021\051\024\035\025\064\026\063\027" + "\033\030\043\001\001\000\002\001\001\000\002\001\001"
            + "\000\002\001\001\000\002\001\001\000\002\001\001\000" + "\002\001\001\000\002\001\001\000\036\003\054\004\010" + "\005\015\006\014\007\022\010\012\011\020\012\016\014" + "\011\015\006\017\055\020\056\022\021\023\007\001\001" + "\000\002\001\001\000\004\026\053\001\001\000\002\001" + "\001\000\002\001\001\000\002\001\001\000\002\001\001" + "\000\002\001\001\000\004\020\060\001\001\000\002\001" + "\001\000\002\001\001\000\002\001\001\000\030\004\062" + "\005\015\006\014\007\022\010\012\011\020\012\016\014" + "\011\015\006\022\021\023\007\001\001\000\002\001\001" + "\000\002\001\001\000\004\026\065\001\001\000\002\001" + "\001\000\014\013\052\016\045\021\051\024\035\030\067" + "\001\001\000\002\001\001\000\004\020\072\001\001\000" + "\002\001\001\000\002\001\001\000\002\001\001\000\002" + "\001\001" });

    /** Access to <code>reduce_goto</code> table. */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /** Instance of action encapsulation class. */
    protected CUP$Parser$actions action_obj;

    /** Action encapsulation object initializer. */
    protected void init_actions() {
        action_obj = new CUP$Parser$actions(this);
    }

    /** Invoke a user supplied parse action. */
    public java_cup.runtime.Symbol do_action(int act_num, java_cup.runtime.lr_parser parser, java.util.Stack stack, int top) throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
    }

    /** Indicates start state. */
    public int start_state() {
        return 0;
    }

    /** Indicates start production. */
    public int start_production() {
        return 1;
    }

    /** <code>EOF</code> Symbol index. */
    public int EOF_sym() {
        return 0;
    }

    /** <code>error</code> Symbol index. */
    public int error_sym() {
        return 1;
    }

    /** User initialization code. */
    public void user_init() throws java.lang.Exception {

        m_Symbols = new HashMap();
        m_Result = new JSONNode();
        m_Stack = new Stack<JSONNode>();
        m_Stack.push(m_Result);

    }

    /** variable - value relation. */
    protected HashMap m_Symbols;

    /** for storing the parsed JSON data structure. */
    protected JSONNode m_Result;

    /** the stack for keeping track of the current parent node. */
    protected Stack<JSONNode> m_Stack;

    /**
     * Returns the JSON data structure.
     * 
     * @return the result
     */
    public JSONNode getResult() {
        return m_Result;
    }

    /**
     * Returns the stack used internally for keeping track of the current parent
     * node.
     * 
     * @return the stack
     */
    protected Stack<JSONNode> getStack() {
        return m_Stack;
    }

    /**
     * Runs the parser from commandline. Expects a filename as first parameter,
     * pointing to a JSON file.
     * 
     * @param args the commandline arguments
     * @throws Exception if something goes wrong
     */
    public static void main(String args[]) throws Exception {
        if (args.length != 1) {
            System.err.println("No JSON file specified!");
            System.exit(1);
        }

        FileInputStream stream = new FileInputStream(args[0]);
        SymbolFactory sf = new DefaultSymbolFactory();
        Parser parser = new Parser(new Scanner(stream, sf), sf);
        parser.parse();
        StringBuffer buffer = new StringBuffer();
        parser.getResult().toString(buffer);
        System.out.println(buffer.toString());
    }

    /** Cup generated class to encapsulate user supplied action code. */
    @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
    class CUP$Parser$actions {
        private final Parser parser;

        /** Constructor */
        CUP$Parser$actions(Parser parser) {
            this.parser = parser;
        }

        /** Method 0 with the actual generated action code for actions 0 to 300. */
        public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(int CUP$Parser$act_num, java_cup.runtime.lr_parser CUP$Parser$parser, java.util.Stack CUP$Parser$stack, int CUP$Parser$top) throws java.lang.Exception {
            /* Symbol object for return from actions */
            java_cup.runtime.Symbol CUP$Parser$result;

            /* select the action based on the action number */
            switch (CUP$Parser$act_num) {
            /* . . . . . . . . . . . . . . . . . . . . */
            case 0: // json ::= LCURLY RCURLY
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("json", 0, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 1: // $START ::= json EOF
            {
                Object RESULT = null;
                Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 1)).value;
                RESULT = start_val;
                CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START", 0, RESULT);
            }
                /* ACCEPT */
                CUP$Parser$parser.done_parsing();
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 2: // json ::= LCURLY pairs RCURLY
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("json", 0, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 3: // pairs ::= pairs COMMA pair
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("pairs", 1, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 4: // pairs ::= pair
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("pairs", 1, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 5: // pair ::= primitive
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("pair", 2, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 6: // pair ::= named_object
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("pair", 2, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 7: // pair ::= named_array
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("pair", 2, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 8: // primitive ::= null
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive", 3, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 9: // primitive ::= boolean
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive", 3, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 10: // primitive ::= integer
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive", 3, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 11: // primitive ::= double
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive", 3, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 12: // primitive ::= string
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("primitive", 3, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 13: // null ::= STRING COLON NULL
            {
                Object RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;

                parser.getStack().peek().addNull(name);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("null", 4, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 14: // boolean ::= STRING COLON BOOLEAN
            {
                Boolean RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;
                Boolean b = (Boolean) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addPrimitive(name, b);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("boolean", 5, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 15: // integer ::= STRING COLON INTEGER
            {
                Integer RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;
                Integer i = (Integer) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addPrimitive(name, i);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("integer", 6, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 16: // double ::= STRING COLON DOUBLE
            {
                Double RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;
                Double d = (Double) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addPrimitive(name, d);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("double", 7, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 17: // string ::= STRING COLON STRING
            {
                String RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;
                String s = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addPrimitive(name, s);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("string", 8, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 18: // named_object ::= named_object_start object_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_object", 10, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 19: // named_object ::= named_object_start object_content object_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_object", 10, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 20: // named_object_start ::= STRING COLON LCURLY
            {
                Object RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;

                JSONNode node = parser.getStack().peek().addObject(name);
                parser.getStack().push(node);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_object_start", 11, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 21: // anon_object ::= anon_object_start object_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_object", 9, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 22: // anon_object ::= anon_object_start object_content object_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_object", 9, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 23: // anon_object_start ::= LCURLY
            {
                Object RESULT = null;

                JSONNode node = parser.getStack().peek().addObject(null);
                parser.getStack().push(node);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_object_start", 12, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 24: // object_content ::= pairs
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("object_content", 13, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 25: // object_end ::= RCURLY
            {
                Object RESULT = null;

                parser.getStack().pop();

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("object_end", 14, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 26: // named_array ::= named_array_start array_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_array", 16, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 27: // named_array ::= named_array_start array_content array_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_array", 16, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 28: // named_array_start ::= STRING COLON LSQUARE
            {
                Object RESULT = null;
                String name = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top - 2)).value;

                JSONNode node = parser.getStack().peek().addArray(name);
                parser.getStack().push(node);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("named_array_start", 17, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 29: // anon_array ::= anon_array_start array_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_array", 15, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 30: // anon_array ::= anon_array_start array_content array_end
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_array", 15, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 31: // anon_array_start ::= LSQUARE
            {
                Object RESULT = null;

                JSONNode node = parser.getStack().peek().addArray(null);
                parser.getStack().push(node);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("anon_array_start", 18, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 32: // array_content ::= elements
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("array_content", 19, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 33: // array_end ::= RSQUARE
            {
                Object RESULT = null;

                parser.getStack().pop();

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("array_end", 20, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 34: // elements ::= elements COMMA element
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("elements", 21, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 35: // elements ::= element
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("elements", 21, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 36: // element ::= NULL
            {
                Object RESULT = null;

                parser.getStack().peek().addArrayElement(null);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 37: // element ::= BOOLEAN
            {
                Object RESULT = null;
                Boolean b = (Boolean) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addArrayElement(b);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 38: // element ::= INTEGER
            {
                Object RESULT = null;
                Integer i = (Integer) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addArrayElement(i);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 39: // element ::= DOUBLE
            {
                Object RESULT = null;
                Double d = (Double) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addArrayElement(d);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 40: // element ::= STRING
            {
                Object RESULT = null;
                String s = (String) ((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

                parser.getStack().peek().addArrayElement(s);

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 41: // element ::= anon_object
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . . . . . . . . . . . . . . . */
            case 42: // element ::= anon_array
            {
                Object RESULT = null;

                CUP$Parser$result = parser.getSymbolFactory().newSymbol("element", 22, RESULT);
            }
                return CUP$Parser$result;

            /* . . . . . . */
            default:
                throw new Exception("Invalid action number " + CUP$Parser$act_num + "found in internal parse table");

            }
        } /* end of method */

        /** Method splitting the generated action code into several parts. */
        public final java_cup.runtime.Symbol CUP$Parser$do_action(int CUP$Parser$act_num, java_cup.runtime.lr_parser CUP$Parser$parser, java.util.Stack CUP$Parser$stack, int CUP$Parser$top) throws java.lang.Exception {
            return CUP$Parser$do_action_part00000000(CUP$Parser$act_num, CUP$Parser$parser, CUP$Parser$stack, CUP$Parser$top);
        }
    }

}
