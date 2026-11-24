// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd9 implements fi9, kc9 {
    public final /* synthetic */ ye9 a;

    public /* synthetic */ wd9(ye9 ye9Var) {
        this.a = ye9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mc9 mc9Var, mf9 mf9Var, boolean z) {
        int spanEnd;
        int i;
        char c;
        Editable text;
        ye9 ye9Var = this.a;
        we9 we9Var = ye9Var.p3;
        Editable text2 = mc9Var.getText();
        if (text2 == null) {
            i = -1;
            spanEnd = -1;
        } else {
            int spanStart = text2.getSpanStart(mf9Var);
            spanEnd = text2.getSpanEnd(mf9Var);
            i = spanStart;
        }
        if (i < 0 || spanEnd <= i) {
            return;
        }
        if (z) {
            ye9Var.k3(false);
            we9Var.H(new xe9(ye9Var, mc9Var, i, spanEnd, mf9Var), mc9Var);
            return;
        }
        TL_iv.textButton textbutton = mf9Var.a;
        if (textbutton != null) {
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
            if (richButtonStyle != null) {
                if (richButtonStyle.bg_primary) {
                    c = 2;
                } else if (richButtonStyle.bg_danger) {
                    c = 3;
                } else if (richButtonStyle.bg_success) {
                    c = 0;
                }
                if (richButtonStyle == null) {
                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                }
                richButtonStyle.flags = 0;
                richButtonStyle.bg_primary = c != 1;
                richButtonStyle.bg_danger = c != 2;
                richButtonStyle.bg_success = c != 3;
                richButtonStyle.link = false;
                textbutton.style = richButtonStyle;
                text = mc9Var.getText();
                if (text != null || text.getSpanStart(mf9Var) < 0) {
                }
                qg9 qg9Var = mf9Var.b;
                if (qg9Var != null && mf9Var.c == mc9Var) {
                    qg9Var.h = null;
                    qg9Var.a.a.f(mc9Var);
                    mf9Var.c = null;
                }
                text.removeSpan(mf9Var);
                mf9 mf9Var2 = new mf9(textbutton);
                mf9Var2.a(ye9Var.n3, ye9Var.o3, mc9Var);
                text.setSpan(mf9Var2, i, spanEnd, 33);
                et3 et3Var = mc9Var.T1;
                if (et3Var != null) {
                    et3Var.m();
                }
                mc9Var.v2 = true;
                mc9Var.invalidate();
                mc9Var.requestLayout();
                mc9Var.f();
                we9Var.onContentChanged();
                return;
            }
            c = 1;
            if (richButtonStyle == null) {
            }
            richButtonStyle.flags = 0;
            richButtonStyle.bg_primary = c != 1;
            richButtonStyle.bg_danger = c != 2;
            richButtonStyle.bg_success = c != 3;
            richButtonStyle.link = false;
            textbutton.style = richButtonStyle;
            text = mc9Var.getText();
            if (text != null) {
            }
        }
    }
}
