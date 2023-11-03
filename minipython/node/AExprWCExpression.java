/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AExprWCExpression extends PExpression
{
    private PExpressionsWithoutCulc _expressionsWithoutCulc_;

    public AExprWCExpression()
    {
    }

    public AExprWCExpression(
        PExpressionsWithoutCulc _expressionsWithoutCulc_)
    {
        setExpressionsWithoutCulc(_expressionsWithoutCulc_);

    }
    public Object clone()
    {
        return new AExprWCExpression(
            (PExpressionsWithoutCulc) cloneNode(_expressionsWithoutCulc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprWCExpression(this);
    }

    public PExpressionsWithoutCulc getExpressionsWithoutCulc()
    {
        return _expressionsWithoutCulc_;
    }

    public void setExpressionsWithoutCulc(PExpressionsWithoutCulc node)
    {
        if(_expressionsWithoutCulc_ != null)
        {
            _expressionsWithoutCulc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expressionsWithoutCulc_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expressionsWithoutCulc_);
    }

    void removeChild(Node child)
    {
        if(_expressionsWithoutCulc_ == child)
        {
            _expressionsWithoutCulc_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expressionsWithoutCulc_ == oldChild)
        {
            setExpressionsWithoutCulc((PExpressionsWithoutCulc) newChild);
            return;
        }

    }
}
