/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AWeValue extends PValue
{
    private TStringSingleQuotes _stringSingleQuotes_;

    public AWeValue()
    {
    }

    public AWeValue(
        TStringSingleQuotes _stringSingleQuotes_)
    {
        setStringSingleQuotes(_stringSingleQuotes_);

    }
    public Object clone()
    {
        return new AWeValue(
            (TStringSingleQuotes) cloneNode(_stringSingleQuotes_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWeValue(this);
    }

    public TStringSingleQuotes getStringSingleQuotes()
    {
        return _stringSingleQuotes_;
    }

    public void setStringSingleQuotes(TStringSingleQuotes node)
    {
        if(_stringSingleQuotes_ != null)
        {
            _stringSingleQuotes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stringSingleQuotes_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_stringSingleQuotes_);
    }

    void removeChild(Node child)
    {
        if(_stringSingleQuotes_ == child)
        {
            _stringSingleQuotes_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_stringSingleQuotes_ == oldChild)
        {
            setStringSingleQuotes((TStringSingleQuotes) newChild);
            return;
        }

    }
}
