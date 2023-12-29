/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFuncCommands extends PCommands
{
    private PFunction _function_;

    public AFuncCommands()
    {
    }

    public AFuncCommands(
        PFunction _function_)
    {
        setFunction(_function_);

    }
    public Object clone()
    {
        return new AFuncCommands(
            (PFunction) cloneNode(_function_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncCommands(this);
    }

    public PFunction getFunction()
    {
        return _function_;
    }

    public void setFunction(PFunction node)
    {
        if(_function_ != null)
        {
            _function_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _function_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_function_);
    }

    void removeChild(Node child)
    {
        if(_function_ == child)
        {
            _function_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_function_ == oldChild)
        {
            setFunction((PFunction) newChild);
            return;
        }

    }
}
