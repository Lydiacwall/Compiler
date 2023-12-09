/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TStringDoubleQuotes extends Token
{
    public TStringDoubleQuotes(String text)
    {
        setText(text);
    }

    public TStringDoubleQuotes(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TStringDoubleQuotes(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStringDoubleQuotes(this);
    }
}
