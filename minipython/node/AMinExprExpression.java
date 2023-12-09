/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinExprExpression extends PExpression
{
    private PExpression _expression_;
    private final LinkedList _commaValue_ = new TypedLinkedList(new CommaValue_Cast());

    public AMinExprExpression()
    {
    }

    public AMinExprExpression(
        PExpression _expression_,
        List _commaValue_)
    {
        setExpression(_expression_);

        {
            this._commaValue_.clear();
            this._commaValue_.addAll(_commaValue_);
        }

    }
    public Object clone()
    {
        return new AMinExprExpression(
            (PExpression) cloneNode(_expression_),
            cloneList(_commaValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinExprExpression(this);
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public LinkedList getCommaValue()
    {
        return _commaValue_;
    }

    public void setCommaValue(List list)
    {
        _commaValue_.clear();
        _commaValue_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_expression_)
            + toString(_commaValue_);
    }

    void removeChild(Node child)
    {
        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

        if(_commaValue_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator i = _commaValue_.listIterator(); i.hasNext();)
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

    }

    private class CommaValue_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaValue node = (PCommaValue) o;

            if((node.parent() != null) &&
                (node.parent() != AMinExprExpression.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AMinExprExpression.this))
            {
                node.parent(AMinExprExpression.this);
            }

            return node;
        }
    }
}
