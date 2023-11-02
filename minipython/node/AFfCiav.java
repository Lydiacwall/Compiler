/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFfCiav extends PCiav
{
    private TComma _comma_;
    private TId _id_;
    private PAssignValue _assignValue_;

    public AFfCiav()
    {
    }

    public AFfCiav(
        TComma _comma_,
        TId _id_,
        PAssignValue _assignValue_)
    {
        setComma(_comma_);

        setId(_id_);

        setAssignValue(_assignValue_);

    }
    public Object clone()
    {
        return new AFfCiav(
            (TComma) cloneNode(_comma_),
            (TId) cloneNode(_id_),
            (PAssignValue) cloneNode(_assignValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFfCiav(this);
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if(_comma_ != null)
        {
            _comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public PAssignValue getAssignValue()
    {
        return _assignValue_;
    }

    public void setAssignValue(PAssignValue node)
    {
        if(_assignValue_ != null)
        {
            _assignValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _assignValue_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comma_)
            + toString(_id_)
            + toString(_assignValue_);
    }

    void removeChild(Node child)
    {
        if(_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_assignValue_ == child)
        {
            _assignValue_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_assignValue_ == oldChild)
        {
            setAssignValue((PAssignValue) newChild);
            return;
        }

    }
}