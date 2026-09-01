package wh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements f5, c1 {
    public final /* synthetic */ r3 a;

    public /* synthetic */ o2(r3 r3Var) {
        this.a = r3Var;
    }

    public void a(e1 e1Var, e4 e4Var, boolean z4) {
        r3 r3Var = this.a;
        p3 p3Var = r3Var.e3;
        Editable text = e1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(e4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(e4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z4) {
            r3Var.o3(false);
            p3Var.x(new q3(r3Var, e1Var, spanStart, spanEnd, e4Var), e1Var);
            return;
        }
        TL_iv.textButton textbutton = e4Var.a;
        if (textbutton == null) {
            return;
        }
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.d();
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
        Editable text2 = e1Var.getText();
        if (text2 == null || text2.getSpanStart(e4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = e4Var.b;
        if (richButtonSpan != null && e4Var.c == e1Var) {
            richButtonSpan.detach(e1Var);
            e4Var.c = null;
        }
        text2.removeSpan(e4Var);
        e4 e4Var2 = new e4(textbutton);
        e4Var2.a(r3Var.c3, e1Var, r3Var.d3);
        text2.setSpan(e4Var2, spanStart, spanEnd, 33);
        e1Var.notifySpansChanged();
        e1Var.requestLayout();
        e1Var.invalidateEffects();
        p3Var.onContentChanged();
    }
}
