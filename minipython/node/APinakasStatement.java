/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class APinakasStatement extends PStatement
{
    private final LinkedList _tab_ = new TypedLinkedList(new Tab_Cast());
    private TId _id_;
    private TLBr _lBr_;
    private PExpression _lex_;
    private TRBr _rBr_;
    private TAssign _assign_;
    private PExpression _rex_;

    public APinakasStatement()
    {
    }

    public APinakasStatement(
        List _tab_,
        TId _id_,
        TLBr _lBr_,
        PExpression _lex_,
        TRBr _rBr_,
        TAssign _assign_,
        PExpression _rex_)
    {
        {
            this._tab_.clear();
            this._tab_.addAll(_tab_);
        }

        setId(_id_);

        setLBr(_lBr_);

        setLex(_lex_);

        setRBr(_rBr_);

        setAssign(_assign_);

        setRex(_rex_);

    }
    public Object clone()
    {
        return new APinakasStatement(
            cloneList(_tab_),
            (TId) cloneNode(_id_),
            (TLBr) cloneNode(_lBr_),
            (PExpression) cloneNode(_lex_),
            (TRBr) cloneNode(_rBr_),
            (TAssign) cloneNode(_assign_),
            (PExpression) cloneNode(_rex_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPinakasStatement(this);
    }

    public LinkedList getTab()
    {
        return _tab_;
    }

    public void setTab(List list)
    {
        _tab_.clear();
        _tab_.addAll(list);
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

    public TLBr getLBr()
    {
        return _lBr_;
    }

    public void setLBr(TLBr node)
    {
        if(_lBr_ != null)
        {
            _lBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBr_ = node;
    }

    public PExpression getLex()
    {
        return _lex_;
    }

    public void setLex(PExpression node)
    {
        if(_lex_ != null)
        {
            _lex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lex_ = node;
    }

    public TRBr getRBr()
    {
        return _rBr_;
    }

    public void setRBr(TRBr node)
    {
        if(_rBr_ != null)
        {
            _rBr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBr_ = node;
    }

    public TAssign getAssign()
    {
        return _assign_;
    }

    public void setAssign(TAssign node)
    {
        if(_assign_ != null)
        {
            _assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _assign_ = node;
    }

    public PExpression getRex()
    {
        return _rex_;
    }

    public void setRex(PExpression node)
    {
        if(_rex_ != null)
        {
            _rex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rex_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tab_)
            + toString(_id_)
            + toString(_lBr_)
            + toString(_lex_)
            + toString(_rBr_)
            + toString(_assign_)
            + toString(_rex_);
    }

    void removeChild(Node child)
    {
        if(_tab_.remove(child))
        {
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_lBr_ == child)
        {
            _lBr_ = null;
            return;
        }

        if(_lex_ == child)
        {
            _lex_ = null;
            return;
        }

        if(_rBr_ == child)
        {
            _rBr_ = null;
            return;
        }

        if(_assign_ == child)
        {
            _assign_ = null;
            return;
        }

        if(_rex_ == child)
        {
            _rex_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _tab_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_lBr_ == oldChild)
        {
            setLBr((TLBr) newChild);
            return;
        }

        if(_lex_ == oldChild)
        {
            setLex((PExpression) newChild);
            return;
        }

        if(_rBr_ == oldChild)
        {
            setRBr((TRBr) newChild);
            return;
        }

        if(_assign_ == oldChild)
        {
            setAssign((TAssign) newChild);
            return;
        }

        if(_rex_ == oldChild)
        {
            setRex((PExpression) newChild);
            return;
        }

    }

    private class Tab_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TTab node = (TTab) o;

            if((node.parent() != null) &&
                (node.parent() != APinakasStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != APinakasStatement.this))
            {
                node.parent(APinakasStatement.this);
            }

            return node;
        }
    }
}
