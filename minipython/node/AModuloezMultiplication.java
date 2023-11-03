/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AModuloezMultiplication extends PMultiplication
{
    private PMultiplication _multiplication_;
    private TMod _mod_;
    private PExpressionsWithoutCulc _expressionsWithoutCulc_;

    public AModuloezMultiplication()
    {
    }

    public AModuloezMultiplication(
        PMultiplication _multiplication_,
        TMod _mod_,
        PExpressionsWithoutCulc _expressionsWithoutCulc_)
    {
        setMultiplication(_multiplication_);

        setMod(_mod_);

        setExpressionsWithoutCulc(_expressionsWithoutCulc_);

    }
    public Object clone()
    {
        return new AModuloezMultiplication(
            (PMultiplication) cloneNode(_multiplication_),
            (TMod) cloneNode(_mod_),
            (PExpressionsWithoutCulc) cloneNode(_expressionsWithoutCulc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModuloezMultiplication(this);
    }

    public PMultiplication getMultiplication()
    {
        return _multiplication_;
    }

    public void setMultiplication(PMultiplication node)
    {
        if(_multiplication_ != null)
        {
            _multiplication_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multiplication_ = node;
    }

    public TMod getMod()
    {
        return _mod_;
    }

    public void setMod(TMod node)
    {
        if(_mod_ != null)
        {
            _mod_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _mod_ = node;
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
            + toString(_multiplication_)
            + toString(_mod_)
            + toString(_expressionsWithoutCulc_);
    }

    void removeChild(Node child)
    {
        if(_multiplication_ == child)
        {
            _multiplication_ = null;
            return;
        }

        if(_mod_ == child)
        {
            _mod_ = null;
            return;
        }

        if(_expressionsWithoutCulc_ == child)
        {
            _expressionsWithoutCulc_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

        if(_mod_ == oldChild)
        {
            setMod((TMod) newChild);
            return;
        }

        if(_expressionsWithoutCulc_ == oldChild)
        {
            setExpressionsWithoutCulc((PExpressionsWithoutCulc) newChild);
            return;
        }

    }
}
