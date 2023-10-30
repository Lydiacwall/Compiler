/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class ALesscComparison extends PComparison
{
    private PExpression _lpar_;
    private TLess _less_;
    private PExpression _rpar_;

    public ALesscComparison()
    {
        // Constructor
    }

    public ALesscComparison(
        @SuppressWarnings("hiding") PExpression _lpar_,
        @SuppressWarnings("hiding") TLess _less_,
        @SuppressWarnings("hiding") PExpression _rpar_)
    {
        // Constructor
        setLpar(_lpar_);

        setLess(_less_);

        setRpar(_rpar_);

    }

    @Override
    public Object clone()
    {
        return new ALesscComparison(
            cloneNode(this._lpar_),
            cloneNode(this._less_),
            cloneNode(this._rpar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALesscComparison(this);
    }

    public PExpression getLpar()
    {
        return this._lpar_;
    }

    public void setLpar(PExpression node)
    {
        if(this._lpar_ != null)
        {
            this._lpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lpar_ = node;
    }

    public TLess getLess()
    {
        return this._less_;
    }

    public void setLess(TLess node)
    {
        if(this._less_ != null)
        {
            this._less_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._less_ = node;
    }

    public PExpression getRpar()
    {
        return this._rpar_;
    }

    public void setRpar(PExpression node)
    {
        if(this._rpar_ != null)
        {
            this._rpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rpar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lpar_)
            + toString(this._less_)
            + toString(this._rpar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lpar_ == child)
        {
            this._lpar_ = null;
            return;
        }

        if(this._less_ == child)
        {
            this._less_ = null;
            return;
        }

        if(this._rpar_ == child)
        {
            this._rpar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lpar_ == oldChild)
        {
            setLpar((PExpression) newChild);
            return;
        }

        if(this._less_ == oldChild)
        {
            setLess((TLess) newChild);
            return;
        }

        if(this._rpar_ == oldChild)
        {
            setRpar((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
