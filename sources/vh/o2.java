package vh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements g5, c1 {
    public final /* synthetic */ s3 a;

    public /* synthetic */ o2(s3 s3Var) {
        this.a = s3Var;
    }

    public void a(e1 e1Var, f4 f4Var, boolean z4) {
        s3 s3Var = this.a;
        q3 q3Var = s3Var.e3;
        Editable text = e1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(f4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(f4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z4) {
            s3Var.n3(false);
            q3Var.w(new r3(s3Var, e1Var, spanStart, spanEnd, f4Var), e1Var);
            return;
        }
        TL_iv.textButton textbutton = f4Var.a;
        if (textbutton == null) {
            return;
        }
        d2 d2Var = s3Var.G3;
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
        if (text2 == null || text2.getSpanStart(f4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = f4Var.b;
        if (richButtonSpan != null && f4Var.c == e1Var) {
            richButtonSpan.detach(e1Var);
            f4Var.c = null;
        }
        text2.removeSpan(f4Var);
        f4 f4Var2 = new f4(textbutton);
        f4Var2.a(s3Var.c3, e1Var, s3Var.d3);
        text2.setSpan(f4Var2, spanStart, spanEnd, 33);
        e1Var.notifySpansChanged();
        e1Var.requestLayout();
        e1Var.invalidateEffects();
        q3Var.onContentChanged();
    }
}
