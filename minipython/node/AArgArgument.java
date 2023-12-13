/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AArgArgument extends PArgument
{
    private PId _id_;
    private final LinkedList _assignValue_ = new TypedLinkedList(new AssignValue_Cast());
    private final LinkedList _ciav_ = new TypedLinkedList(new Ciav_Cast());

    public AArgArgument()
    {
    }

    public AArgArgument(
        PId _id_,
        List _assignValue_,
        List _ciav_)
    {
        setId(_id_);

        {
            this._assignValue_.clear();
            this._assignValue_.addAll(_assignValue_);
        }

        {
            this._ciav_.clear();
            this._ciav_.addAll(_ciav_);
        }

    }
    public Object clone()
    {
        return new AArgArgument(
            (PId) cloneNode(_id_),
            cloneList(_assignValue_),
            cloneList(_ciav_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArgArgument(this);
    }

    public PId getId()
    {
        return _id_;
    }

    public void setId(PId node)
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

    public LinkedList getAssignValue()
    {
        return _assignValue_;
    }

    public void setAssignValue(List list)
    {
        _assignValue_.clear();
        _assignValue_.addAll(list);
    }

    public LinkedList getCiav()
    {
        return _ciav_;
    }

    public void setCiav(List list)
    {
        _ciav_.clear();
        _ciav_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_assignValue_)
            + toString(_ciav_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_assignValue_.remove(child))
        {
            return;
        }

        if(_ciav_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((PId) newChild);
            return;
        }

        for(ListIterator i = _assignValue_.listIterator(); i.hasNext();)
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

        for(ListIterator i = _ciav_.listIterator(); i.hasNext();)
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

    private class AssignValue_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PAssignValue node = (PAssignValue) o;

            if((node.parent() != null) &&
                (node.parent() != AArgArgument.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AArgArgument.this))
            {
                node.parent(AArgArgument.this);
            }

            return node;
        }
    }

    private class Ciav_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCiav node = (PCiav) o;

            if((node.parent() != null) &&
                (node.parent() != AArgArgument.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AArgArgument.this))
            {
                node.parent(AArgArgument.this);
            }

            return node;
        }
    }
}
