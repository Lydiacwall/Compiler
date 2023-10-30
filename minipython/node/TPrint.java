/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class TPrint extends Token
{
    public TPrint()
    {
        super.setText("print");
    }

    public TPrint(int line, int pos)
    {
        super.setText("print");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrint(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrint(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrint text.");
    }
}
