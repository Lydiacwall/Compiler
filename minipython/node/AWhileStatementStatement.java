/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AWhileStatementStatement extends PStatement
{
    private final LinkedList _tab_ = new TypedLinkedList(new Tab_Cast());
    private TWhile _while_;
    private PComparison _comparison_;
    private TSemi _semi_;
    private PStatement _statement_;

    public AWhileStatementStatement()
    {
    }

    public AWhileStatementStatement(
        List _tab_,
        TWhile _while_,
        PComparison _comparison_,
        TSemi _semi_,
        PStatement _statement_)
    {
        {
            this._tab_.clear();
            this._tab_.addAll(_tab_);
        }

        setWhile(_while_);

        setComparison(_comparison_);

        setSemi(_semi_);

        setStatement(_statement_);

    }
    public Object clone()
    {
        return new AWhileStatementStatement(
            cloneList(_tab_),
            (TWhile) cloneNode(_while_),
            (PComparison) cloneNode(_comparison_),
            (TSemi) cloneNode(_semi_),
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileStatementStatement(this);
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

    public TWhile getWhile()
    {
        return _while_;
    }

    public void setWhile(TWhile node)
    {
        if(_while_ != null)
        {
            _while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _while_ = node;
    }

    public PComparison getComparison()
    {
        return _comparison_;
    }

    public void setComparison(PComparison node)
    {
        if(_comparison_ != null)
        {
            _comparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comparison_ = node;
    }

    public TSemi getSemi()
    {
        return _semi_;
    }

    public void setSemi(TSemi node)
    {
        if(_semi_ != null)
        {
            _semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semi_ = node;
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tab_)
            + toString(_while_)
            + toString(_comparison_)
            + toString(_semi_)
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_tab_.remove(child))
        {
            return;
        }

        if(_while_ == child)
        {
            _while_ = null;
            return;
        }

        if(_comparison_ == child)
        {
            _comparison_ = null;
            return;
        }

        if(_semi_ == child)
        {
            _semi_ = null;
            return;
        }

        if(_statement_ == child)
        {
            _statement_ = null;
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

        if(_while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(_comparison_ == oldChild)
        {
            setComparison((PComparison) newChild);
            return;
        }

        if(_semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }

    private class Tab_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TTab node = (TTab) o;

            if((node.parent() != null) &&
                (node.parent() != AWhileStatementStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AWhileStatementStatement.this))
            {
                node.parent(AWhileStatementStatement.this);
            }

            return node;
        }
    }
}