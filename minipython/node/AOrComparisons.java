/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AOrComparisons extends PComparisons
{
    private PComparisons _l_;
    private PComparisons _r_;

    public AOrComparisons()
    {
    }

    public AOrComparisons(
        PComparisons _l_,
        PComparisons _r_)
    {
        setL(_l_);

        setR(_r_);

    }
    public Object clone()
    {
        return new AOrComparisons(
            (PComparisons) cloneNode(_l_),
            (PComparisons) cloneNode(_r_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrComparisons(this);
    }

    public PComparisons getL()
    {
        return _l_;
    }

    public void setL(PComparisons node)
    {
        if(_l_ != null)
        {
            _l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _l_ = node;
    }

    public PComparisons getR()
    {
        return _r_;
    }

    public void setR(PComparisons node)
    {
        if(_r_ != null)
        {
            _r_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _r_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_l_)
            + toString(_r_);
    }

    void removeChild(Node child)
    {
        if(_l_ == child)
        {
            _l_ = null;
            return;
        }

        if(_r_ == child)
        {
            _r_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_l_ == oldChild)
        {
            setL((PComparisons) newChild);
            return;
        }

        if(_r_ == oldChild)
        {
            setR((PComparisons) newChild);
            return;
        }

    }
}
