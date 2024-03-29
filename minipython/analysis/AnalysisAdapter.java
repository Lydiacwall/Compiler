/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAGoal(AGoal node)
    {
        defaultCase(node);
    }

    public void caseAFuncCommands(AFuncCommands node)
    {
        defaultCase(node);
    }

    public void caseAStatCommands(AStatCommands node)
    {
        defaultCase(node);
    }

    public void caseADefFuncFunction(ADefFuncFunction node)
    {
        defaultCase(node);
    }

    public void caseAArgArgument(AArgArgument node)
    {
        defaultCase(node);
    }

    public void caseACommaIdCiav(ACommaIdCiav node)
    {
        defaultCase(node);
    }

    public void caseAAsvalueAssignValue(AAsvalueAssignValue node)
    {
        defaultCase(node);
    }

    public void caseAIfStatementStatement(AIfStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileStatementStatement(AWhileStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAForStatementStatement(AForStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAReturnStatementStatement(AReturnStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatementStatement(APrintStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssignStatementStatement(AAssignStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAIdMineqStatementStatement(AIdMineqStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAIdPluseqStatementStatement(AIdPluseqStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAIdDiveqStatementStatement(AIdDiveqStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAArrayStatementStatement(AArrayStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssertionStatementStatement(AAssertionStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallStatementStatement(AFuncCallStatementStatement node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallFunctionCall(AFuncCallFunctionCall node)
    {
        defaultCase(node);
    }

    public void caseAArglistArglist(AArglistArglist node)
    {
        defaultCase(node);
    }

    public void caseAOrComparisons(AOrComparisons node)
    {
        defaultCase(node);
    }

    public void caseAAndComparisons(AAndComparisons node)
    {
        defaultCase(node);
    }

    public void caseANotComparisons(ANotComparisons node)
    {
        defaultCase(node);
    }

    public void caseATrueComparisons(ATrueComparisons node)
    {
        defaultCase(node);
    }

    public void caseAFalseComparisons(AFalseComparisons node)
    {
        defaultCase(node);
    }

    public void caseALesseqComparisons(ALesseqComparisons node)
    {
        defaultCase(node);
    }

    public void caseAGreateqComparisons(AGreateqComparisons node)
    {
        defaultCase(node);
    }

    public void caseADiffComparisons(ADiffComparisons node)
    {
        defaultCase(node);
    }

    public void caseAEqeqComparisons(AEqeqComparisons node)
    {
        defaultCase(node);
    }

    public void caseALesscComparisons(ALesscComparisons node)
    {
        defaultCase(node);
    }

    public void caseAGreatcComparisons(AGreatcComparisons node)
    {
        defaultCase(node);
    }

    public void caseAValueExpression(AValueExpression node)
    {
        defaultCase(node);
    }

    public void caseAAdditionExExpression(AAdditionExExpression node)
    {
        defaultCase(node);
    }

    public void caseASubtractionExExpression(ASubtractionExExpression node)
    {
        defaultCase(node);
    }

    public void caseAMaxExprExpression(AMaxExprExpression node)
    {
        defaultCase(node);
    }

    public void caseAMinExprExpression(AMinExprExpression node)
    {
        defaultCase(node);
    }

    public void caseAPlplExpression(APlplExpression node)
    {
        defaultCase(node);
    }

    public void caseAMinminExpression(AMinminExpression node)
    {
        defaultCase(node);
    }

    public void caseADivisionExpression(ADivisionExpression node)
    {
        defaultCase(node);
    }

    public void caseAModuloExpression(AModuloExpression node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultCase(node);
    }

    public void caseAPowerExpression(APowerExpression node)
    {
        defaultCase(node);
    }

    public void caseAPinakasExprExpression(APinakasExprExpression node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallExprExpression(AFuncCallExprExpression node)
    {
        defaultCase(node);
    }

    public void caseALenExpExpression(ALenExpExpression node)
    {
        defaultCase(node);
    }

    public void caseAParenthesisExprValueExpression(AParenthesisExprValueExpression node)
    {
        defaultCase(node);
    }

    public void caseABracketsExprValueExpression(ABracketsExprValueExpression node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierExpression(AIdentifierExpression node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallValueValueno(AFuncCallValueValueno node)
    {
        defaultCase(node);
    }

    public void caseAIdValueno(AIdValueno node)
    {
        defaultCase(node);
    }

    public void caseANumberValueno(ANumberValueno node)
    {
        defaultCase(node);
    }

    public void caseADoubleQuotesValueno(ADoubleQuotesValueno node)
    {
        defaultCase(node);
    }

    public void caseASingleQuotesValueno(ASingleQuotesValueno node)
    {
        defaultCase(node);
    }

    public void caseANoneValueno(ANoneValueno node)
    {
        defaultCase(node);
    }

    public void caseANumNum(ANumNum node)
    {
        defaultCase(node);
    }

    public void caseAIdId(AIdId node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseTPlusplus(TPlusplus node)
    {
        defaultCase(node);
    }

    public void caseTEqualequal(TEqualequal node)
    {
        defaultCase(node);
    }

    public void caseTMinusminus(TMinusminus node)
    {
        defaultCase(node);
    }

    public void caseTMineq(TMineq node)
    {
        defaultCase(node);
    }

    public void caseTPluseq(TPluseq node)
    {
        defaultCase(node);
    }

    public void caseTDiveq(TDiveq node)
    {
        defaultCase(node);
    }

    public void caseTMulteq(TMulteq node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTPow(TPow node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTNoteq(TNoteq node)
    {
        defaultCase(node);
    }

    public void caseTLesseq(TLesseq node)
    {
        defaultCase(node);
    }

    public void caseTGreateq(TGreateq node)
    {
        defaultCase(node);
    }

    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    public void caseTGreat(TGreat node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTDef(TDef node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTLogicAnd(TLogicAnd node)
    {
        defaultCase(node);
    }

    public void caseTLogicOr(TLogicOr node)
    {
        defaultCase(node);
    }

    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTIn(TIn node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    public void caseTLen(TLen node)
    {
        defaultCase(node);
    }

    public void caseTMin(TMin node)
    {
        defaultCase(node);
    }

    public void caseTMax(TMax node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTAssert(TAssert node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTNone(TNone node)
    {
        defaultCase(node);
    }

    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTIdent(TIdent node)
    {
        defaultCase(node);
    }

    public void caseTStringDoubleQuotes(TStringDoubleQuotes node)
    {
        defaultCase(node);
    }

    public void caseTStringSingleQuotes(TStringSingleQuotes node)
    {
        defaultCase(node);
    }

    public void caseTEverythingElse(TEverythingElse node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
