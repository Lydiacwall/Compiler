/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AIdentifierValueno extends PValueno
{
    private PIdent _ident_;

    public AIdentifierValueno()
    {
    }

    public AIdentifierValueno(
        PIdent _ident_)
    {
        setIdent(_ident_);

    }
    public Object clone()
    {
        return new AIdentifierValueno(
            (PIdent) cloneNode(_ident_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierValueno(this);
    }

    public PIdent getIdent()
    {
        return _ident_;
    }

    public void setIdent(PIdent node)
    {
        if(_ident_ != null)
        {
            _ident_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ident_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_ident_);
    }

    void removeChild(Node child)
    {
        if(_ident_ == child)
        {
            _ident_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_ident_ == oldChild)
        {
            setIdent((PIdent) newChild);
            return;
        }

    }
}