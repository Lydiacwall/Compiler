/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ANoneValueExpression extends PExpression
{

    public ANoneValueExpression()
    {
    }
    public Object clone()
    {
        return new ANoneValueExpression();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoneValueExpression(this);
    }

    public String toString()
    {
        return "";
    }

    void removeChild(Node child)
    {
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }
}
