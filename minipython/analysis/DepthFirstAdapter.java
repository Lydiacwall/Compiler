/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPGoal().apply(this);
        node.getEOF().apply(this);
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
            for(int i = 0; i < temp.length; i++)
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

    public void inADedeFunction(ADedeFunction node)
    {
        defaultIn(node);
    }

    public void outADedeFunction(ADedeFunction node)
    {
        defaultOut(node);
    }

    public void caseADedeFunction(ADedeFunction node)
    {
        inADedeFunction(node);
        if(node.getDef() != null)
        {
            node.getDef().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArgument() != null)
        {
            node.getArgument().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outADedeFunction(node);
    }

    public void inAFrfrfArgument(AFrfrfArgument node)
    {
        defaultIn(node);
    }

    public void outAFrfrfArgument(AFrfrfArgument node)
    {
        defaultOut(node);
    }

    public void caseAFrfrfArgument(AFrfrfArgument node)
    {
        inAFrfrfArgument(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssignValue() != null)
        {
            node.getAssignValue().apply(this);
        }
        {
            Object temp[] = node.getCiav().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCiav) temp[i]).apply(this);
            }
        }
        outAFrfrfArgument(node);
    }

    public void inAFfCiav(AFfCiav node)
    {
        defaultIn(node);
    }

    public void outAFfCiav(AFfCiav node)
    {
        defaultOut(node);
    }

    public void caseAFfCiav(AFfCiav node)
    {
        inAFfCiav(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssignValue() != null)
        {
            node.getAssignValue().apply(this);
        }
        outAFfCiav(node);
    }

    public void inAFrfrfrrfrfAssignValue(AFrfrfrrfrfAssignValue node)
    {
        defaultIn(node);
    }

    public void outAFrfrfrrfrfAssignValue(AFrfrfrrfrfAssignValue node)
    {
        defaultOut(node);
    }

    public void caseAFrfrfrrfrfAssignValue(AFrfrfrrfrfAssignValue node)
    {
        inAFrfrfrrfrfAssignValue(node);
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAFrfrfrrfrfAssignValue(node);
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
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
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
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
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
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getLid() != null)
        {
            node.getLid().apply(this);
        }
        if(node.getIn() != null)
        {
            node.getIn().apply(this);
        }
        if(node.getRid() != null)
        {
            node.getRid().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
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
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
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
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommaExpression() != null)
        {
            node.getCommaExpression().apply(this);
        }
        outAPrintStatementStatement(node);
    }

    public void inAAssignStatement(AAssignStatement node)
    {
        defaultIn(node);
    }

    public void outAAssignStatement(AAssignStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssignStatement(AAssignStatement node)
    {
        inAAssignStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAAssignStatement(node);
    }

    public void inAIdMineqStatement(AIdMineqStatement node)
    {
        defaultIn(node);
    }

    public void outAIdMineqStatement(AIdMineqStatement node)
    {
        defaultOut(node);
    }

    public void caseAIdMineqStatement(AIdMineqStatement node)
    {
        inAIdMineqStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getMineq() != null)
        {
            node.getMineq().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAIdMineqStatement(node);
    }

    public void inAIdDiveqStatement(AIdDiveqStatement node)
    {
        defaultIn(node);
    }

    public void outAIdDiveqStatement(AIdDiveqStatement node)
    {
        defaultOut(node);
    }

    public void caseAIdDiveqStatement(AIdDiveqStatement node)
    {
        inAIdDiveqStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getDiveq() != null)
        {
            node.getDiveq().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAIdDiveqStatement(node);
    }

    public void inAPinakasStatement(APinakasStatement node)
    {
        defaultIn(node);
    }

    public void outAPinakasStatement(APinakasStatement node)
    {
        defaultOut(node);
    }

    public void caseAPinakasStatement(APinakasStatement node)
    {
        inAPinakasStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getLex() != null)
        {
            node.getLex().apply(this);
        }
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getRex() != null)
        {
            node.getRex().apply(this);
        }
        outAPinakasStatement(node);
    }

    public void inAAssertionStatement(AAssertionStatement node)
    {
        defaultIn(node);
    }

    public void outAAssertionStatement(AAssertionStatement node)
    {
        defaultOut(node);
    }

    public void caseAAssertionStatement(AAssertionStatement node)
    {
        inAAssertionStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getAssert() != null)
        {
            node.getAssert().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommaExpression() != null)
        {
            node.getCommaExpression().apply(this);
        }
        outAAssertionStatement(node);
    }

    public void inAFuncCallStatement(AFuncCallStatement node)
    {
        defaultIn(node);
    }

    public void outAFuncCallStatement(AFuncCallStatement node)
    {
        defaultOut(node);
    }

    public void caseAFuncCallStatement(AFuncCallStatement node)
    {
        inAFuncCallStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFuncCallStatement(node);
    }

    public void inAEreaFunctionCall(AEreaFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAEreaFunctionCall(AEreaFunctionCall node)
    {
        defaultOut(node);
    }

    public void caseAEreaFunctionCall(AEreaFunctionCall node)
    {
        inAEreaFunctionCall(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArglist() != null)
        {
            node.getArglist().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAEreaFunctionCall(node);
    }

    public void inADdsasaArglist(ADdsasaArglist node)
    {
        defaultIn(node);
    }

    public void outADdsasaArglist(ADdsasaArglist node)
    {
        defaultOut(node);
    }

    public void caseADdsasaArglist(ADdsasaArglist node)
    {
        inADdsasaArglist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            Object temp[] = node.getCommaExpression().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCommaExpression) temp[i]).apply(this);
            }
        }
        outADdsasaArglist(node);
    }

    public void inAFrfrfrfrfeCommaExpression(AFrfrfrfrfeCommaExpression node)
    {
        defaultIn(node);
    }

    public void outAFrfrfrfrfeCommaExpression(AFrfrfrfrfeCommaExpression node)
    {
        defaultOut(node);
    }

    public void caseAFrfrfrfrfeCommaExpression(AFrfrfrfrfeCommaExpression node)
    {
        inAFrfrfrfrfeCommaExpression(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAFrfrfrfrfeCommaExpression(node);
    }

    public void inATrueComparison(ATrueComparison node)
    {
        defaultIn(node);
    }

    public void outATrueComparison(ATrueComparison node)
    {
        defaultOut(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        inATrueComparison(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueComparison(node);
    }

    public void inAFalseComparison(AFalseComparison node)
    {
        defaultIn(node);
    }

    public void outAFalseComparison(AFalseComparison node)
    {
        defaultOut(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        inAFalseComparison(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseComparison(node);
    }

    public void inALesseqComparison(ALesseqComparison node)
    {
        defaultIn(node);
    }

    public void outALesseqComparison(ALesseqComparison node)
    {
        defaultOut(node);
    }

    public void caseALesseqComparison(ALesseqComparison node)
    {
        inALesseqComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getLesseq() != null)
        {
            node.getLesseq().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outALesseqComparison(node);
    }

    public void inAGreateqComparison(AGreateqComparison node)
    {
        defaultIn(node);
    }

    public void outAGreateqComparison(AGreateqComparison node)
    {
        defaultOut(node);
    }

    public void caseAGreateqComparison(AGreateqComparison node)
    {
        inAGreateqComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getGreateq() != null)
        {
            node.getGreateq().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outAGreateqComparison(node);
    }

    public void inADiffComparison(ADiffComparison node)
    {
        defaultIn(node);
    }

    public void outADiffComparison(ADiffComparison node)
    {
        defaultOut(node);
    }

    public void caseADiffComparison(ADiffComparison node)
    {
        inADiffComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getNoteq() != null)
        {
            node.getNoteq().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outADiffComparison(node);
    }

    public void inAEqeqComparison(AEqeqComparison node)
    {
        defaultIn(node);
    }

    public void outAEqeqComparison(AEqeqComparison node)
    {
        defaultOut(node);
    }

    public void caseAEqeqComparison(AEqeqComparison node)
    {
        inAEqeqComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getEqualequal() != null)
        {
            node.getEqualequal().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outAEqeqComparison(node);
    }

    public void inALesscComparison(ALesscComparison node)
    {
        defaultIn(node);
    }

    public void outALesscComparison(ALesscComparison node)
    {
        defaultOut(node);
    }

    public void caseALesscComparison(ALesscComparison node)
    {
        inALesscComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outALesscComparison(node);
    }

    public void inAGreatcComparison(AGreatcComparison node)
    {
        defaultIn(node);
    }

    public void outAGreatcComparison(AGreatcComparison node)
    {
        defaultOut(node);
    }

    public void caseAGreatcComparison(AGreatcComparison node)
    {
        inAGreatcComparison(node);
        if(node.getLpar() != null)
        {
            node.getLpar().apply(this);
        }
        if(node.getGreat() != null)
        {
            node.getGreat().apply(this);
        }
        if(node.getRpar() != null)
        {
            node.getRpar().apply(this);
        }
        outAGreatcComparison(node);
    }

    public void inACalculationExpression(ACalculationExpression node)
    {
        defaultIn(node);
    }

    public void outACalculationExpression(ACalculationExpression node)
    {
        defaultOut(node);
    }

    public void caseACalculationExpression(ACalculationExpression node)
    {
        inACalculationExpression(node);
        if(node.getCalculation() != null)
        {
            node.getCalculation().apply(this);
        }
        outACalculationExpression(node);
    }

    public void inAExprWCExpression(AExprWCExpression node)
    {
        defaultIn(node);
    }

    public void outAExprWCExpression(AExprWCExpression node)
    {
        defaultOut(node);
    }

    public void caseAExprWCExpression(AExprWCExpression node)
    {
        inAExprWCExpression(node);
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outAExprWCExpression(node);
    }

    public void inAPinakasexpExpressionsWithoutCulc(APinakasexpExpressionsWithoutCulc node)
    {
        defaultIn(node);
    }

    public void outAPinakasexpExpressionsWithoutCulc(APinakasexpExpressionsWithoutCulc node)
    {
        defaultOut(node);
    }

    public void caseAPinakasexpExpressionsWithoutCulc(APinakasexpExpressionsWithoutCulc node)
    {
        inAPinakasexpExpressionsWithoutCulc(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        outAPinakasexpExpressionsWithoutCulc(node);
    }

    public void inARedExpressionsWithoutCulc(ARedExpressionsWithoutCulc node)
    {
        defaultIn(node);
    }

    public void outARedExpressionsWithoutCulc(ARedExpressionsWithoutCulc node)
    {
        defaultOut(node);
    }

    public void caseARedExpressionsWithoutCulc(ARedExpressionsWithoutCulc node)
    {
        inARedExpressionsWithoutCulc(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outARedExpressionsWithoutCulc(node);
    }

    public void inAAdditionCalculation(AAdditionCalculation node)
    {
        defaultIn(node);
    }

    public void outAAdditionCalculation(AAdditionCalculation node)
    {
        defaultOut(node);
    }

    public void caseAAdditionCalculation(AAdditionCalculation node)
    {
        inAAdditionCalculation(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        outAAdditionCalculation(node);
    }

    public void inASubtractionCalculation(ASubtractionCalculation node)
    {
        defaultIn(node);
    }

    public void outASubtractionCalculation(ASubtractionCalculation node)
    {
        defaultOut(node);
    }

    public void caseASubtractionCalculation(ASubtractionCalculation node)
    {
        inASubtractionCalculation(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        outASubtractionCalculation(node);
    }

    public void inAMultiplicationCalculation(AMultiplicationCalculation node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationCalculation(AMultiplicationCalculation node)
    {
        defaultOut(node);
    }

    public void caseAMultiplicationCalculation(AMultiplicationCalculation node)
    {
        inAMultiplicationCalculation(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        outAMultiplicationCalculation(node);
    }

    public void inAAdditionExCalculation(AAdditionExCalculation node)
    {
        defaultIn(node);
    }

    public void outAAdditionExCalculation(AAdditionExCalculation node)
    {
        defaultOut(node);
    }

    public void caseAAdditionExCalculation(AAdditionExCalculation node)
    {
        inAAdditionExCalculation(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outAAdditionExCalculation(node);
    }

    public void inASubtractionExCalculation(ASubtractionExCalculation node)
    {
        defaultIn(node);
    }

    public void outASubtractionExCalculation(ASubtractionExCalculation node)
    {
        defaultOut(node);
    }

    public void caseASubtractionExCalculation(ASubtractionExCalculation node)
    {
        inASubtractionExCalculation(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outASubtractionExCalculation(node);
    }

    public void inAPowMultiplication(APowMultiplication node)
    {
        defaultIn(node);
    }

    public void outAPowMultiplication(APowMultiplication node)
    {
        defaultOut(node);
    }

    public void caseAPowMultiplication(APowMultiplication node)
    {
        inAPowMultiplication(node);
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        outAPowMultiplication(node);
    }

    public void inADivisionMultiplication(ADivisionMultiplication node)
    {
        defaultIn(node);
    }

    public void outADivisionMultiplication(ADivisionMultiplication node)
    {
        defaultOut(node);
    }

    public void caseADivisionMultiplication(ADivisionMultiplication node)
    {
        inADivisionMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        outADivisionMultiplication(node);
    }

    public void inAModuloMultiplication(AModuloMultiplication node)
    {
        defaultIn(node);
    }

    public void outAModuloMultiplication(AModuloMultiplication node)
    {
        defaultOut(node);
    }

    public void caseAModuloMultiplication(AModuloMultiplication node)
    {
        inAModuloMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        outAModuloMultiplication(node);
    }

    public void inAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultOut(node);
    }

    public void caseAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        inAMultiplicationMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        outAMultiplicationMultiplication(node);
    }

    public void inADivisionezMultiplication(ADivisionezMultiplication node)
    {
        defaultIn(node);
    }

    public void outADivisionezMultiplication(ADivisionezMultiplication node)
    {
        defaultOut(node);
    }

    public void caseADivisionezMultiplication(ADivisionezMultiplication node)
    {
        inADivisionezMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outADivisionezMultiplication(node);
    }

    public void inAModuloezMultiplication(AModuloezMultiplication node)
    {
        defaultIn(node);
    }

    public void outAModuloezMultiplication(AModuloezMultiplication node)
    {
        defaultOut(node);
    }

    public void caseAModuloezMultiplication(AModuloezMultiplication node)
    {
        inAModuloezMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outAModuloezMultiplication(node);
    }

    public void inAMultiplicationezMultiplication(AMultiplicationezMultiplication node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationezMultiplication(AMultiplicationezMultiplication node)
    {
        defaultOut(node);
    }

    public void caseAMultiplicationezMultiplication(AMultiplicationezMultiplication node)
    {
        inAMultiplicationezMultiplication(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outAMultiplicationezMultiplication(node);
    }

    public void inAValuePower(AValuePower node)
    {
        defaultIn(node);
    }

    public void outAValuePower(AValuePower node)
    {
        defaultOut(node);
    }

    public void caseAValuePower(AValuePower node)
    {
        inAValuePower(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAValuePower(node);
    }

    public void inAPowerPower(APowerPower node)
    {
        defaultIn(node);
    }

    public void outAPowerPower(APowerPower node)
    {
        defaultOut(node);
    }

    public void caseAPowerPower(APowerPower node)
    {
        inAPowerPower(node);
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        if(node.getPow() != null)
        {
            node.getPow().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAPowerPower(node);
    }

    public void inAPowe2rPower(APowe2rPower node)
    {
        defaultIn(node);
    }

    public void outAPowe2rPower(APowe2rPower node)
    {
        defaultOut(node);
    }

    public void caseAPowe2rPower(APowe2rPower node)
    {
        inAPowe2rPower(node);
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        if(node.getPow() != null)
        {
            node.getPow().apply(this);
        }
        if(node.getExpressionsWithoutCulc() != null)
        {
            node.getExpressionsWithoutCulc().apply(this);
        }
        outAPowe2rPower(node);
    }

    public void inAIdentifierValue(AIdentifierValue node)
    {
        defaultIn(node);
    }

    public void outAIdentifierValue(AIdentifierValue node)
    {
        defaultOut(node);
    }

    public void caseAIdentifierValue(AIdentifierValue node)
    {
        inAIdentifierValue(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifierValue(node);
    }

    public void inANumbValue(ANumbValue node)
    {
        defaultIn(node);
    }

    public void outANumbValue(ANumbValue node)
    {
        defaultOut(node);
    }

    public void caseANumbValue(ANumbValue node)
    {
        inANumbValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumbValue(node);
    }

    public void inADValue(ADValue node)
    {
        defaultIn(node);
    }

    public void outADValue(ADValue node)
    {
        defaultOut(node);
    }

    public void caseADValue(ADValue node)
    {
        inADValue(node);
        if(node.getStringDoubleQuotes() != null)
        {
            node.getStringDoubleQuotes().apply(this);
        }
        outADValue(node);
    }

    public void inAWeValue(AWeValue node)
    {
        defaultIn(node);
    }

    public void outAWeValue(AWeValue node)
    {
        defaultOut(node);
    }

    public void caseAWeValue(AWeValue node)
    {
        inAWeValue(node);
        if(node.getStringSingleQuotes() != null)
        {
            node.getStringSingleQuotes().apply(this);
        }
        outAWeValue(node);
    }

    public void inANonenonegoodValue(ANonenonegoodValue node)
    {
        defaultIn(node);
    }

    public void outANonenonegoodValue(ANonenonegoodValue node)
    {
        defaultOut(node);
    }

    public void caseANonenonegoodValue(ANonenonegoodValue node)
    {
        inANonenonegoodValue(node);
        if(node.getNone() != null)
        {
            node.getNone().apply(this);
        }
        outANonenonegoodValue(node);
    }
}
