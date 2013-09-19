package aqua.nix.cli.dsl;

// Generated from Input.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InputParser}.
 */
public interface InputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InputParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull InputParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull InputParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link InputParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull InputParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull InputParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link InputParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull InputParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull InputParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link InputParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull InputParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link InputParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull InputParser.InputContext ctx);
}