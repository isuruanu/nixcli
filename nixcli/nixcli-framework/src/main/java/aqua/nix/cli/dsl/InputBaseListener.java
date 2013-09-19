package aqua.nix.cli.dsl;

// Generated from Input.g4 by ANTLR 4.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link InputListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class InputBaseListener implements InputListener {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterId(@NotNull InputParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitId(@NotNull InputParser.IdContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArg(@NotNull InputParser.ArgContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArg(@NotNull InputParser.ArgContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCmd(@NotNull InputParser.CmdContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCmd(@NotNull InputParser.CmdContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterInput(@NotNull InputParser.InputContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitInput(@NotNull InputParser.InputContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}