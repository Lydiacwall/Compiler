/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import minipython.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPGoal().apply(this);
        outStart(node);
    }

    public void inAGoal(AGoal node)
    {
        defaultIn(node);
    }

    public void outAGoal(AGoal node)
    {
        defaultOut(node);
    }

    public void caseAGoal(AGoal node)
    {
        inAGoal(node);
        {
            Object temp[] = node.getCommands().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PCommands) temp[i]).apply(this);
            }
        }
        outAGoal(node);
    }

    public void inAFuncCommands(AFuncCommands node)
    {
        defaultIn(node);
    }

    public void outAFuncCommands(AFuncCommands node)
    {
        defaultOut(node);
    }

    public void caseAFuncCommands(AFuncCommands node)
    {
        inAFuncCommands(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFuncCommands(node);
    }

    public void inAStatCommands(AStatCommands node)
    {
        defaultIn(node);
    }

    public void outAStatCommands(AStatCommands node)
    {
        defaultOut(node);
    }

    public void caseAStatCommands(AStatCommands node)
    {
        inAStatCommands(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStatCommands(node);
    }

    public void inADefFuncFunction(ADefFuncFunction node)
    {
        defaultIn(node);
    }

    public void outADefFuncFunction(ADefFuncFunction node)
    {
        defaultOut(node);
    }

    public void caseADefFuncFunction(ADefFuncFunction node)
    {
        inADefFuncFunction(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        {
            Object temp[] = node.getArgument().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PArgument) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outADefFuncFunction(node);
    }

    public void inAArgArgument(AArgArgument node)
    {
        defaultIn(node);
    }

    public void outAArgArgument(AArgArgument node)
    {
        defaultOut(node);
    }

    public void caseAArgArgument(AArgArgument node)
    {
        inAArgArgument(node);
        {
            Object temp[] = node.getCiav().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PCiav) temp[i]).apply(this);
            }
        }
        {
            Object temp[] = node.getAssignValue().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PAssignValue) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArgArgument(node);
    }

    public void inACommaIdCiav(ACommaIdCiav node)
    {
        defaultIn(node);
    }

    public void outACommaIdCiav(ACommaIdCiav node)
    {
        defaultOut(node);
    }

    public void caseACommaIdCiav(ACommaIdCiav node)
    {
        inACommaIdCiav(node);
        {
            Object temp[] = node.getAssignValue().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PAssignValue) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outACommaIdCiav(node);
    }

    public void inAAsvalueAssignValue(AAsvalueAssignValue node)
    {
        defaultIn(node);
    }

    public void outAAsvalueAssignValue(AAsvalueAssignValue node)
    {
        defaultOut(node);
    }

    public void caseAAsvalueAssignValue(AAsvalueAssignValue node)
    {
        inAAsvalueAssignValue(node);
        if(node.getValueno() != null)
        {
            node.getValueno().apply(this);
        }
        outAAsvalueAssignValue(node);
    }

    public void inAIfStatementStatement(AIfStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatementStatement(AIfStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAIfStatementStatement(AIfStatementStatement node)
    {
        inAIfStatementStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getComparisons() != null)
        {
            node.getComparisons().apply(this);
        }
        outAIfStatementStatement(node);
    }

    public void inAWhileStatementStatement(AWhileStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileStatementStatement(AWhileStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAWhileStatementStatement(AWhileStatementStatement node)
    {
        inAWhileStatementStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getComparisons() != null)
        {
            node.getComparisons().apply(this);
        }
        outAWhileStatementStatement(node);
    }

    public void inAForStatementStatement(AForStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAForStatementStatement(AForStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAForStatementStatement(AForStatementStatement node)
    {
        inAForStatementStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getRid() != null)
        {
            node.getRid().apply(this);
        }
        if(node.getLid() != null)
        {
            node.getLid().apply(this);
        }
        outAForStatementStatement(node);
    }

    public void inAReturnStatementStatement(AReturnStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAReturnStatementStatement(AReturnStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAReturnStatementStatement(AReturnStatementStatement node)
    {
        inAReturnStatementStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAReturnStatementStatement(node);
    }

    public void inAPrintStatementStatement(APrintStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintStatementStatement(APrintStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAPrintStatementStatement(APrintStatementStatement node)
    {
        inAPrintStatementStatement(node);
        {
            Object temp[] = node.getR().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAPrintStatementStatement(node);
    }

    public void inAAssignStatementStatement(AAssignStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAAssignStatementStatement(AAssignStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssignStatementStatement(AAssignStatementStatement node)
    {
        inAAssignStatementStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAssignStatementStatement(node);
    }

    public void inAIdMineqStatementStatement(AIdMineqStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAIdMineqStatementStatement(AIdMineqStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAIdMineqStatementStatement(AIdMineqStatementStatement node)
    {
        inAIdMineqStatementStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdMineqStatementStatement(node);
    }

    public void inAIdPluseqStatementStatement(AIdPluseqStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAIdPluseqStatementStatement(AIdPluseqStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAIdPluseqStatementStatement(AIdPluseqStatementStatement node)
    {
        inAIdPluseqStatementStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdPluseqStatementStatement(node);
    }

    public void inAIdDiveqStatementStatement(AIdDiveqStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAIdDiveqStatementStatement(AIdDiveqStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAIdDiveqStatementStatement(AIdDiveqStatementStatement node)
    {
        inAIdDiveqStatementStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdDiveqStatementStatement(node);
    }

    public void inAArrayStatementStatement(AArrayStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAArrayStatementStatement(AArrayStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAArrayStatementStatement(AArrayStatementStatement node)
    {
        inAArrayStatementStatement(node);
        if(node.getRex() != null)
        {
            node.getRex().apply(this);
        }
        if(node.getLex() != null)
        {
            node.getLex().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArrayStatementStatement(node);
    }

    public void inAAssertionStatementStatement(AAssertionStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAAssertionStatementStatement(AAssertionStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssertionStatementStatement(AAssertionStatementStatement node)
    {
        inAAssertionStatementStatement(node);
        {
            Object temp[] = node.getL().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAAssertionStatementStatement(node);
    }

    public void inAFuncCallStatementStatement(AFuncCallStatementStatement node)
    {
        defaultIn(node);
    }

    public void outAFuncCallStatementStatement(AFuncCallStatementStatement node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallStatementStatement(AFuncCallStatementStatement node)
    {
        inAFuncCallStatementStatement(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFuncCallStatementStatement(node);
    }

    public void inAFuncCallFunctionCall(AFuncCallFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAFuncCallFunctionCall(AFuncCallFunctionCall node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallFunctionCall(AFuncCallFunctionCall node)
    {
        inAFuncCallFunctionCall(node);
        {
            Object temp[] = node.getArglist().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PArglist) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAFuncCallFunctionCall(node);
    }

    public void inAArglistArglist(AArglistArglist node)
    {
        defaultIn(node);
    }

    public void outAArglistArglist(AArglistArglist node)
    {
        defaultOut(node);
    }

    public void caseAArglistArglist(AArglistArglist node)
    {
        inAArglistArglist(node);
        {
            Object temp[] = node.getR().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAArglistArglist(node);
    }

    public void inAOrComparisons(AOrComparisons node)
    {
        defaultIn(node);
    }

    public void outAOrComparisons(AOrComparisons node)
    {
        defaultOut(node);
    }

    public void caseAOrComparisons(AOrComparisons node)
    {
        inAOrComparisons(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAOrComparisons(node);
    }

    public void inAAndComparisons(AAndComparisons node)
    {
        defaultIn(node);
    }

    public void outAAndComparisons(AAndComparisons node)
    {
        defaultOut(node);
    }

    public void caseAAndComparisons(AAndComparisons node)
    {
        inAAndComparisons(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAAndComparisons(node);
    }

    public void inANotComparisons(ANotComparisons node)
    {
        defaultIn(node);
    }

    public void outANotComparisons(ANotComparisons node)
    {
        defaultOut(node);
    }

    public void caseANotComparisons(ANotComparisons node)
    {
        inANotComparisons(node);
        if(node.getComparisons() != null)
        {
            node.getComparisons().apply(this);
        }
        outANotComparisons(node);
    }

    public void inATrueComparisons(ATrueComparisons node)
    {
        defaultIn(node);
    }

    public void outATrueComparisons(ATrueComparisons node)
    {
        defaultOut(node);
    }

    public void caseATrueComparisons(ATrueComparisons node)
    {
        inATrueComparisons(node);
        outATrueComparisons(node);
    }

    public void inAFalseComparisons(AFalseComparisons node)
    {
        defaultIn(node);
    }

    public void outAFalseComparisons(AFalseComparisons node)
    {
        defaultOut(node);
    }

    public void caseAFalseComparisons(AFalseComparisons node)
    {
        inAFalseComparisons(node);
        outAFalseComparisons(node);
    }

    public void inALesseqComparisons(ALesseqComparisons node)
    {
        defaultIn(node);
    }

    public void outALesseqComparisons(ALesseqComparisons node)
    {
        defaultOut(node);
    }

    public void caseALesseqComparisons(ALesseqComparisons node)
    {
        inALesseqComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outALesseqComparisons(node);
    }

    public void inAGreateqComparisons(AGreateqComparisons node)
    {
        defaultIn(node);
    }

    public void outAGreateqComparisons(AGreateqComparisons node)
    {
        defaultOut(node);
    }

    public void caseAGreateqComparisons(AGreateqComparisons node)
    {
        inAGreateqComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAGreateqComparisons(node);
    }

    public void inADiffComparisons(ADiffComparisons node)
    {
        defaultIn(node);
    }

    public void outADiffComparisons(ADiffComparisons node)
    {
        defaultOut(node);
    }

    public void caseADiffComparisons(ADiffComparisons node)
    {
        inADiffComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outADiffComparisons(node);
    }

    public void inAEqeqComparisons(AEqeqComparisons node)
    {
        defaultIn(node);
    }

    public void outAEqeqComparisons(AEqeqComparisons node)
    {
        defaultOut(node);
    }

    public void caseAEqeqComparisons(AEqeqComparisons node)
    {
        inAEqeqComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAEqeqComparisons(node);
    }

    public void inALesscComparisons(ALesscComparisons node)
    {
        defaultIn(node);
    }

    public void outALesscComparisons(ALesscComparisons node)
    {
        defaultOut(node);
    }

    public void caseALesscComparisons(ALesscComparisons node)
    {
        inALesscComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outALesscComparisons(node);
    }

    public void inAGreatcComparisons(AGreatcComparisons node)
    {
        defaultIn(node);
    }

    public void outAGreatcComparisons(AGreatcComparisons node)
    {
        defaultOut(node);
    }

    public void caseAGreatcComparisons(AGreatcComparisons node)
    {
        inAGreatcComparisons(node);
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        outAGreatcComparisons(node);
    }

    public void inAValueExpression(AValueExpression node)
    {
        defaultIn(node);
    }

    public void outAValueExpression(AValueExpression node)
    {
        defaultOut(node);
    }

    public void caseAValueExpression(AValueExpression node)
    {
        inAValueExpression(node);
        if(node.getValueno() != null)
        {
            node.getValueno().apply(this);
        }
        outAValueExpression(node);
    }

    public void inAAdditionExExpression(AAdditionExExpression node)
    {
        defaultIn(node);
    }

    public void outAAdditionExExpression(AAdditionExExpression node)
    {
        defaultOut(node);
    }

    public void caseAAdditionExExpression(AAdditionExExpression node)
    {
        inAAdditionExExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAAdditionExExpression(node);
    }

    public void inASubtractionExExpression(ASubtractionExExpression node)
    {
        defaultIn(node);
    }

    public void outASubtractionExExpression(ASubtractionExExpression node)
    {
        defaultOut(node);
    }

    public void caseASubtractionExExpression(ASubtractionExExpression node)
    {
        inASubtractionExExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outASubtractionExExpression(node);
    }

    public void inAMaxExprExpression(AMaxExprExpression node)
    {
        defaultIn(node);
    }

    public void outAMaxExprExpression(AMaxExprExpression node)
    {
        defaultOut(node);
    }

    public void caseAMaxExprExpression(AMaxExprExpression node)
    {
        inAMaxExprExpression(node);
        {
            Object temp[] = node.getR().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMaxExprExpression(node);
    }

    public void inAMinExprExpression(AMinExprExpression node)
    {
        defaultIn(node);
    }

    public void outAMinExprExpression(AMinExprExpression node)
    {
        defaultOut(node);
    }

    public void caseAMinExprExpression(AMinExprExpression node)
    {
        inAMinExprExpression(node);
        {
            Object temp[] = node.getR().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMinExprExpression(node);
    }

    public void inAPlplExpression(APlplExpression node)
    {
        defaultIn(node);
    }

    public void outAPlplExpression(APlplExpression node)
    {
        defaultOut(node);
    }

    public void caseAPlplExpression(APlplExpression node)
    {
        inAPlplExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAPlplExpression(node);
    }

    public void inAMinminExpression(AMinminExpression node)
    {
        defaultIn(node);
    }

    public void outAMinminExpression(AMinminExpression node)
    {
        defaultOut(node);
    }

    public void caseAMinminExpression(AMinminExpression node)
    {
        inAMinminExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAMinminExpression(node);
    }

    public void inADivisionExpression(ADivisionExpression node)
    {
        defaultIn(node);
    }

    public void outADivisionExpression(ADivisionExpression node)
    {
        defaultOut(node);
    }

    public void caseADivisionExpression(ADivisionExpression node)
    {
        inADivisionExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outADivisionExpression(node);
    }

    public void inAModuloExpression(AModuloExpression node)
    {
        defaultIn(node);
    }

    public void outAModuloExpression(AModuloExpression node)
    {
        defaultOut(node);
    }

    public void caseAModuloExpression(AModuloExpression node)
    {
        inAModuloExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAModuloExpression(node);
    }

    public void inAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationExpression(AMultiplicationExpression node)
    {
        defaultOut(node);
    }

    public void caseAMultiplicationExpression(AMultiplicationExpression node)
    {
        inAMultiplicationExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMultiplicationExpression(node);
    }

    public void inAPowerExpression(APowerExpression node)
    {
        defaultIn(node);
    }

    public void outAPowerExpression(APowerExpression node)
    {
        defaultOut(node);
    }

    public void caseAPowerExpression(APowerExpression node)
    {
        inAPowerExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAPowerExpression(node);
    }

    public void inAPinakasExprExpression(APinakasExprExpression node)
    {
        defaultIn(node);
    }

    public void outAPinakasExprExpression(APinakasExprExpression node)
    {
        defaultOut(node);
    }

    public void caseAPinakasExprExpression(APinakasExprExpression node)
    {
        inAPinakasExprExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAPinakasExprExpression(node);
    }

    public void inAFuncCallExprExpression(AFuncCallExprExpression node)
    {
        defaultIn(node);
    }

    public void outAFuncCallExprExpression(AFuncCallExprExpression node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallExprExpression(AFuncCallExprExpression node)
    {
        inAFuncCallExprExpression(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFuncCallExprExpression(node);
    }

    public void inALenExpExpression(ALenExpExpression node)
    {
        defaultIn(node);
    }

    public void outALenExpExpression(ALenExpExpression node)
    {
        defaultOut(node);
    }

    public void caseALenExpExpression(ALenExpExpression node)
    {
        inALenExpExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outALenExpExpression(node);
    }

    public void inAParenthesisExprValueExpression(AParenthesisExprValueExpression node)
    {
        defaultIn(node);
    }

    public void outAParenthesisExprValueExpression(AParenthesisExprValueExpression node)
    {
        defaultOut(node);
    }

    public void caseAParenthesisExprValueExpression(AParenthesisExprValueExpression node)
    {
        inAParenthesisExprValueExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAParenthesisExprValueExpression(node);
    }

    public void inABracketsExprValueExpression(ABracketsExprValueExpression node)
    {
        defaultIn(node);
    }

    public void outABracketsExprValueExpression(ABracketsExprValueExpression node)
    {
        defaultOut(node);
    }

    public void caseABracketsExprValueExpression(ABracketsExprValueExpression node)
    {
        inABracketsExprValueExpression(node);
        {
            Object temp[] = node.getR().toArray();
            for(int i = temp.length - 1; i >= 0; i--)
            {
                ((PExpression) temp[i]).apply(this);
            }
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outABracketsExprValueExpression(node);
    }

    public void inAIdentifierExpression(AIdentifierExpression node)
    {
        defaultIn(node);
    }

    public void outAIdentifierExpression(AIdentifierExpression node)
    {
        defaultOut(node);
    }

    public void caseAIdentifierExpression(AIdentifierExpression node)
    {
        inAIdentifierExpression(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifierExpression(node);
    }

    public void inAFuncCallValueValueno(AFuncCallValueValueno node)
    {
        defaultIn(node);
    }

    public void outAFuncCallValueValueno(AFuncCallValueValueno node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallValueValueno(AFuncCallValueValueno node)
    {
        inAFuncCallValueValueno(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAFuncCallValueValueno(node);
    }

    public void inAIdValueno(AIdValueno node)
    {
        defaultIn(node);
    }

    public void outAIdValueno(AIdValueno node)
    {
        defaultOut(node);
    }

    public void caseAIdValueno(AIdValueno node)
    {
        inAIdValueno(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdValueno(node);
    }

    public void inANumberValueno(ANumberValueno node)
    {
        defaultIn(node);
    }

    public void outANumberValueno(ANumberValueno node)
    {
        defaultOut(node);
    }

    public void caseANumberValueno(ANumberValueno node)
    {
        inANumberValueno(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumberValueno(node);
    }

    public void inADoubleQuotesValueno(ADoubleQuotesValueno node)
    {
        defaultIn(node);
    }

    public void outADoubleQuotesValueno(ADoubleQuotesValueno node)
    {
        defaultOut(node);
    }

    public void caseADoubleQuotesValueno(ADoubleQuotesValueno node)
    {
        inADoubleQuotesValueno(node);
        if(node.getStringDoubleQuotes() != null)
        {
            node.getStringDoubleQuotes().apply(this);
        }
        outADoubleQuotesValueno(node);
    }

    public void inASingleQuotesValueno(ASingleQuotesValueno node)
    {
        defaultIn(node);
    }

    public void outASingleQuotesValueno(ASingleQuotesValueno node)
    {
        defaultOut(node);
    }

    public void caseASingleQuotesValueno(ASingleQuotesValueno node)
    {
        inASingleQuotesValueno(node);
        if(node.getStringSingleQuotes() != null)
        {
            node.getStringSingleQuotes().apply(this);
        }
        outASingleQuotesValueno(node);
    }

    public void inANoneValueno(ANoneValueno node)
    {
        defaultIn(node);
    }

    public void outANoneValueno(ANoneValueno node)
    {
        defaultOut(node);
    }

    public void caseANoneValueno(ANoneValueno node)
    {
        inANoneValueno(node);
        outANoneValueno(node);
    }

    public void inANumNum(ANumNum node)
    {
        defaultIn(node);
    }

    public void outANumNum(ANumNum node)
    {
        defaultOut(node);
    }

    public void caseANumNum(ANumNum node)
    {
        inANumNum(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumNum(node);
    }

    public void inAIdId(AIdId node)
    {
        defaultIn(node);
    }

    public void outAIdId(AIdId node)
    {
        defaultOut(node);
    }

    public void caseAIdId(AIdId node)
    {
        inAIdId(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        outAIdId(node);
    }
}
