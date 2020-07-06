// Generated from ConfigOverride.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigOverrideParser}.
 */
public interface ConfigOverrideListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(ConfigOverrideParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(ConfigOverrideParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ConfigOverrideParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ConfigOverrideParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#list_value}.
	 * @param ctx the parse tree
	 */
	void enterList_value(ConfigOverrideParser.List_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#list_value}.
	 * @param ctx the parse tree
	 */
	void exitList_value(ConfigOverrideParser.List_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#choice_sweep}.
	 * @param ctx the parse tree
	 */
	void enterChoice_sweep(ConfigOverrideParser.Choice_sweepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#choice_sweep}.
	 * @param ctx the parse tree
	 */
	void exitChoice_sweep(ConfigOverrideParser.Choice_sweepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#override_key}.
	 * @param ctx the parse tree
	 */
	void enterOverride_key(ConfigOverrideParser.Override_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#override_key}.
	 * @param ctx the parse tree
	 */
	void exitOverride_key(ConfigOverrideParser.Override_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigOverrideParser#override}.
	 * @param ctx the parse tree
	 */
	void enterOverride(ConfigOverrideParser.OverrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigOverrideParser#override}.
	 * @param ctx the parse tree
	 */
	void exitOverride(ConfigOverrideParser.OverrideContext ctx);
}