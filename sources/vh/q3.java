package vh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q3 {
    public final d1 a;
    public final int b;
    public final int c;
    public final e4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ r3 f;

    public q3(r3 r3Var, d1 d1Var, int i10, int i11, e4 e4Var) {
        TL_iv.textButton textbutton;
        this.f = r3Var;
        this.a = d1Var;
        this.b = i10;
        this.c = i11;
        this.d = e4Var;
        if (e4Var == null || (textbutton = e4Var.a) == null) {
            this.e = x5.f(new SpannableStringBuilder(d1Var.getText().subSequence(i10, i11)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        d1 d1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (e4.c(inlineButtonType) && (text = (d1Var = this.a).getText()) != null && (i10 = this.b) >= 0) {
            int length = text.length();
            int i11 = this.c;
            if (i11 > length || i10 >= i11) {
                return;
            }
            r3 r3Var = this.f;
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.d();
            }
            f3 f3Var = r3Var.k3;
            if (f3Var != null) {
                f3Var.f(false);
            }
            d1Var.setLocked(false);
            for (e4 e4Var : (e4[]) text.getSpans(i10, i11, e4.class)) {
                text.removeSpan(e4Var);
            }
            x5.n(text, i10, i11);
            x5.m(text, i10, i11);
            e4 e4Var2 = this.d;
            if (e4Var2 == null || (textbutton = e4Var2.a) == null) {
                textbutton = new TL_iv.textButton();
            }
            textbutton.text = this.e;
            textbutton.type = inlineButtonType;
            if (textbutton.style == null) {
                textbutton.style = new TL_keyboard.RichButtonStyle();
            }
            e4 e4Var3 = new e4(textbutton);
            e4Var3.a(r3Var.c3, d1Var, r3Var.d3);
            text.setSpan(e4Var3, i10, i11, 33);
            e4Var3.d(text);
            d1Var.setSelection(Math.min(i11, d1Var.length()));
            r3Var.F3 = true;
            try {
                d1Var.notifySpansChanged();
                d1Var.requestLayout();
                d1Var.invalidateEffects();
                r3Var.F3 = false;
                c2 c2Var2 = r3Var.G3;
                if (c2Var2 != null) {
                    c2Var2.h();
                }
                r3Var.e3.onContentChanged();
            } catch (Throwable th2) {
                r3Var.F3 = false;
                throw th2;
            }
        }
    }
}
