/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import minipython.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAGoal(AGoal node);
    void caseAFuncCommands(AFuncCommands node);
    void caseAStatCommands(AStatCommands node);
    void caseADedeFunction(ADedeFunction node);
    void caseAFrfrfArgument(AFrfrfArgument node);
    void caseAFfCiav(AFfCiav node);
    void caseAFrfrfrrfrfAssignValue(AFrfrfrrfrfAssignValue node);
    void caseAIfStatementStatement(AIfStatementStatement node);
    void caseAWhileStatementStatement(AWhileStatementStatement node);
    void caseAForStatementStatement(AForStatementStatement node);
    void caseAReturnStatementStatement(AReturnStatementStatement node);
    void caseAPrintStatementStatement(APrintStatementStatement node);
    void caseAAssignStatement(AAssignStatement node);
    void caseAIdMineqStatement(AIdMineqStatement node);
    void caseAIdDiveqStatement(AIdDiveqStatement node);
    void caseAPinakasStatement(APinakasStatement node);
    void caseAAssertionStatement(AAssertionStatement node);
    void caseAFuncCallStatement(AFuncCallStatement node);
    void caseAEreaFunctionCall(AEreaFunctionCall node);
    void caseADdsasaArglist(ADdsasaArglist node);
    void caseAFrfrfrfrfeCommaExpression(AFrfrfrfrfeCommaExpression node);
    void caseATrueComparison(ATrueComparison node);
    void caseAFalseComparison(AFalseComparison node);
    void caseALesseqComparison(ALesseqComparison node);
    void caseAGreateqComparison(AGreateqComparison node);
    void caseADiffComparison(ADiffComparison node);
    void caseAEqeqComparison(AEqeqComparison node);
    void caseALesscComparison(ALesscComparison node);
    void caseAGreatcComparison(AGreatcComparison node);
    void caseAAdditionExpression(AAdditionExpression node);
    void caseASubtractionExpression(ASubtractionExpression node);
    void caseAMultiplicationExpression(AMultiplicationExpression node);
    void caseAPinakasexpExpression(APinakasexpExpression node);
    void caseARedExpression(ARedExpression node);
    void caseAPowMultiplication(APowMultiplication node);
    void caseADivisionMultiplication(ADivisionMultiplication node);
    void caseAModuloMultiplication(AModuloMultiplication node);
    void caseAMultiplicationMultiplication(AMultiplicationMultiplication node);
    void caseAValuePower(AValuePower node);
    void caseAPowerPower(APowerPower node);
    void caseAIdentifierValue(AIdentifierValue node);
    void caseANumbValue(ANumbValue node);
    void caseADValue(ADValue node);
    void caseAWeValue(AWeValue node);
    void caseANonenonegoodValue(ANonenonegoodValue node);
    void caseAParValue(AParValue node);

    void caseTTab(TTab node);
    void caseTPlusplus(TPlusplus node);
    void caseTEqualequal(TEqualequal node);
    void caseTMinusminus(TMinusminus node);
    void caseTMineq(TMineq node);
    void caseTPluseq(TPluseq node);
    void caseTDiveq(TDiveq node);
    void caseTMulteq(TMulteq node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTPow(TPow node);
    void caseTMult(TMult node);
    void caseTMod(TMod node);
    void caseTDiv(TDiv node);
    void caseTAssign(TAssign node);
    void caseTDef(TDef node);
    void caseTNot(TNot node);
    void caseTLogicAnd(TLogicAnd node);
    void caseTLogicOr(TLogicOr node);
    void caseTLBr(TLBr node);
    void caseTRBr(TRBr node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTComma(TComma node);
    void caseTIn(TIn node);
    void caseTIf(TIf node);
    void caseTWhile(TWhile node);
    void caseTFor(TFor node);
    void caseTLen(TLen node);
    void caseTMin(TMin node);
    void caseTMax(TMax node);
    void caseTPrint(TPrint node);
    void caseTReturn(TReturn node);
    void caseTAssert(TAssert node);
    void caseTNoteq(TNoteq node);
    void caseTLesseq(TLesseq node);
    void caseTGreateq(TGreateq node);
    void caseTLess(TLess node);
    void caseTGreat(TGreat node);
    void caseTTrue(TTrue node);
    void caseTSemi(TSemi node);
    void caseTFalse(TFalse node);
    void caseTElse(TElse node);
    void caseTNone(TNone node);
    void caseTQuote(TQuote node);
    void caseTBlank(TBlank node);
    void caseTWhiteSpace(TWhiteSpace node);
    void caseTLineComment(TLineComment node);
    void caseTNumber(TNumber node);
    void caseTDot(TDot node);
    void caseTId(TId node);
    void caseTStringDoubleQuotes(TStringDoubleQuotes node);
    void caseTStringSingleQuotes(TStringSingleQuotes node);
    void caseTEverythingElse(TEverythingElse node);
    void caseEOF(EOF node);
}
