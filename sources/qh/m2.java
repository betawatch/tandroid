package qh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements c5, b1 {
    public final /* synthetic */ o3 a;

    public /* synthetic */ m2(o3 o3Var) {
        this.a = o3Var;
    }

    public void a(d1 d1Var, b4 b4Var, boolean z10) {
        o3 o3Var = this.a;
        m3 m3Var = o3Var.d3;
        Editable text = d1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(b4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(b4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            o3Var.o3(false);
            m3Var.X1(new n3(o3Var, d1Var, spanStart, spanEnd, b4Var), d1Var);
            return;
        }
        TL_iv.textButton textbutton = b4Var.a;
        if (textbutton == null) {
            return;
        }
        b2 b2Var = o3Var.F3;
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
        if (text2 == null || text2.getSpanStart(b4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = b4Var.b;
        if (richButtonSpan != null && b4Var.c == d1Var) {
            richButtonSpan.detach(d1Var);
            b4Var.c = null;
        }
        text2.removeSpan(b4Var);
        b4 b4Var2 = new b4(textbutton);
        b4Var2.a(o3Var.b3, d1Var, o3Var.c3);
        text2.setSpan(b4Var2, spanStart, spanEnd, 33);
        d1Var.notifySpansChanged();
        d1Var.requestLayout();
        d1Var.invalidateEffects();
        m3Var.onContentChanged();
    }
}
