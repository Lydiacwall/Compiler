/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAdFactor extends PFactor
{
    private TPlus _plus_;
    private PFactor _factor_;

    public AAdFactor()
    {
    }

    public AAdFactor(
        TPlus _plus_,
        PFactor _factor_)
    {
        setPlus(_plus_);

        setFactor(_factor_);

    }
    public Object clone()
    {
        return new AAdFactor(
            (TPlus) cloneNode(_plus_),
            (PFactor) cloneNode(_factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdFactor(this);
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public PFactor getFactor()
    {
        return _factor_;
    }

    public void setFactor(PFactor node)
    {
        if(_factor_ != null)
        {
            _factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _factor_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_plus_)
            + toString(_factor_);
    }

    void removeChild(Node child)
    {
        if(_plus_ == child)
        {
            _plus_ = null;
            return;
        }

        if(_factor_ == child)
        {
            _factor_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

    }
}
