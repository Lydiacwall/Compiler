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
    void caseADefFuncFunction(ADefFuncFunction node);
    void caseAArgArgument(AArgArgument node);
    void caseACommaIdCiav(ACommaIdCiav node);
    void caseAAsvalueAssignValue(AAsvalueAssignValue node);
    void caseAIfStatementStatement(AIfStatementStatement node);
    void caseAWhileStatementStatement(AWhileStatementStatement node);
    void caseAForStatementStatement(AForStatementStatement node);
    void caseAReturnStatementStatement(AReturnStatementStatement node);
    void caseAPrintStatementStatement(APrintStatementStatement node);
    void caseAAssignStatementStatement(AAssignStatementStatement node);
    void caseAIdMineqStatementStatement(AIdMineqStatementStatement node);
    void caseAIdPluseqStatementStatement(AIdPluseqStatementStatement node);
    void caseAIdDiveqStatementStatement(AIdDiveqStatementStatement node);
    void caseAArrayStatementStatement(AArrayStatementStatement node);
    void caseAAssertionStatementStatement(AAssertionStatementStatement node);
    void caseAFuncCallStatementStatement(AFuncCallStatementStatement node);
    void caseAFuncCallFunctionCall(AFuncCallFunctionCall node);
    void caseAArglistArglist(AArglistArglist node);
    void caseAOrComparisons(AOrComparisons node);
    void caseAAndComparisons(AAndComparisons node);
    void caseANotComparisons(ANotComparisons node);
    void caseATrueComparisons(ATrueComparisons node);
    void caseAFalseComparisons(AFalseComparisons node);
    void caseALesseqComparisons(ALesseqComparisons node);
    void caseAGreateqComparisons(AGreateqComparisons node);
    void caseADiffComparisons(ADiffComparisons node);
    void caseAEqeqComparisons(AEqeqComparisons node);
    void caseALesscComparisons(ALesscComparisons node);
    void caseAGreatcComparisons(AGreatcComparisons node);
    void caseAValueExpression(AValueExpression node);
    void caseAAdditionExExpression(AAdditionExExpression node);
    void caseASubtractionExExpression(ASubtractionExExpression node);
    void caseAMaxExprExpression(AMaxExprExpression node);
    void caseAMinExprExpression(AMinExprExpression node);
    void caseAPlplExpression(APlplExpression node);
    void caseAMinminExpression(AMinminExpression node);
    void caseADivisionExpression(ADivisionExpression node);
    void caseAModuloExpression(AModuloExpression node);
    void caseAMultiplicationExpression(AMultiplicationExpression node);
    void caseAPowerExpression(APowerExpression node);
    void caseAPinakasExprExpression(APinakasExprExpression node);
    void caseAFuncCallExprExpression(AFuncCallExprExpression node);
    void caseALenExpExpression(ALenExpExpression node);
    void caseAParenthesisExprValueExpression(AParenthesisExprValueExpression node);
    void caseABracketsExprValueExpression(ABracketsExprValueExpression node);
    void caseAIdentifierExpression(AIdentifierExpression node);
    void caseAFuncCallValueValueno(AFuncCallValueValueno node);
    void caseAIdValueno(AIdValueno node);
    void caseANumberValueno(ANumberValueno node);
    void caseADoubleQuotesValueno(ADoubleQuotesValueno node);
    void caseASingleQuotesValueno(ASingleQuotesValueno node);
    void caseANoneValueno(ANoneValueno node);
    void caseANumNum(ANumNum node);
    void caseAIdId(AIdId node);

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
    void caseTNoteq(TNoteq node);
    void caseTLesseq(TLesseq node);
    void caseTGreateq(TGreateq node);
    void caseTLess(TLess node);
    void caseTGreat(TGreat node);
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
    void caseTTrue(TTrue node);
    void caseTSemi(TSemi node);
    void caseTFalse(TFalse node);
    void caseTElse(TElse node);
    void caseTNone(TNone node);
    void caseTQuote(TQuote node);
    void caseTBlank(TBlank node);
    void caseTLineComment(TLineComment node);
    void caseTNumber(TNumber node);
    void caseTDot(TDot node);
    void caseTIdent(TIdent node);
    void caseTStringDoubleQuotes(TStringDoubleQuotes node);
    void caseTStringSingleQuotes(TStringSingleQuotes node);
    void caseTEverythingElse(TEverythingElse node);
    void caseEOF(EOF node);
}
