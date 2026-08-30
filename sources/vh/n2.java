package vh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements f5, b1 {
    public final /* synthetic */ r3 a;

    public /* synthetic */ n2(r3 r3Var) {
        this.a = r3Var;
    }

    public void a(d1 d1Var, e4 e4Var, boolean z4) {
        r3 r3Var = this.a;
        p3 p3Var = r3Var.e3;
        Editable text = d1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(e4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(e4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z4) {
            r3Var.o3(false);
            p3Var.w(new q3(r3Var, d1Var, spanStart, spanEnd, e4Var), d1Var);
            return;
        }
        TL_iv.textButton textbutton = e4Var.a;
        if (textbutton == null) {
            return;
        }
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
        char c3 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
        if (richButtonStyle == null) {
            richButtonStyle = new TL_keyboard.RichButtonStyle();
        }
        richButtonStyle.flags = 0;
        richButtonStyle.bg_primary = c3 == 1;
        richButtonStyle.bg_danger = c3 == 2;
        richButtonStyle.bg_success = c3 == 3;
        richButtonStyle.link = false;
        textbutton.style = richButtonStyle;
        Editable text2 = d1Var.getText();
        if (text2 == null || text2.getSpanStart(e4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = e4Var.b;
        if (richButtonSpan != null && e4Var.c == d1Var) {
            richButtonSpan.detach(d1Var);
            e4Var.c = null;
        }
        text2.removeSpan(e4Var);
        e4 e4Var2 = new e4(textbutton);
        e4Var2.a(r3Var.c3, d1Var, r3Var.d3);
        text2.setSpan(e4Var2, spanStart, spanEnd, 33);
        d1Var.notifySpansChanged();
        d1Var.requestLayout();
        d1Var.invalidateEffects();
        p3Var.onContentChanged();
    }
}
