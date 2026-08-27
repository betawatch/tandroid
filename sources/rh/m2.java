package rh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements d5, b1 {
    public final /* synthetic */ p3 a;

    public /* synthetic */ m2(p3 p3Var) {
        this.a = p3Var;
    }

    public void a(d1 d1Var, c4 c4Var, boolean z10) {
        p3 p3Var = this.a;
        n3 n3Var = p3Var.d3;
        Editable text = d1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(c4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(c4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            p3Var.o3(false);
            n3Var.S1(new o3(p3Var, d1Var, spanStart, spanEnd, c4Var), d1Var);
            return;
        }
        TL_iv.textButton textbutton = c4Var.a;
        if (textbutton == null) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
        char c10 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
        if (richButtonStyle == null) {
            richButtonStyle = new TL_keyboard.RichButtonStyle();
        }
        richButtonStyle.flags = 0;
        richButtonStyle.bg_primary = c10 == 1;
        richButtonStyle.bg_danger = c10 == 2;
        richButtonStyle.bg_success = c10 == 3;
        richButtonStyle.link = false;
        textbutton.style = richButtonStyle;
        Editable text2 = d1Var.getText();
        if (text2 == null || text2.getSpanStart(c4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = c4Var.b;
        if (richButtonSpan != null && c4Var.c == d1Var) {
            richButtonSpan.detach(d1Var);
            c4Var.c = null;
        }
        text2.removeSpan(c4Var);
        c4 c4Var2 = new c4(textbutton);
        c4Var2.a(p3Var.b3, d1Var, p3Var.c3);
        text2.setSpan(c4Var2, spanStart, spanEnd, 33);
        d1Var.notifySpansChanged();
        d1Var.requestLayout();
        d1Var.invalidateEffects();
        n3Var.onContentChanged();
    }
}
