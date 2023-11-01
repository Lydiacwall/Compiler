/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ABbDisjunction extends PDisjunction
{
    private PConjunction _conjunction_;

    public ABbDisjunction()
    {
    }

    public ABbDisjunction(
        PConjunction _conjunction_)
    {
        setConjunction(_conjunction_);

    }
    public Object clone()
    {
        return new ABbDisjunction(
            (PConjunction) cloneNode(_conjunction_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABbDisjunction(this);
    }

    public PConjunction getConjunction()
    {
        return _conjunction_;
    }

    public void setConjunction(PConjunction node)
    {
        if(_conjunction_ != null)
        {
            _conjunction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _conjunction_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_conjunction_);
    }

    void removeChild(Node child)
    {
        if(_conjunction_ == child)
        {
            _conjunction_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_conjunction_ == oldChild)
        {
            setConjunction((PConjunction) newChild);
            return;
        }

    }
}