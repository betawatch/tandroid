package wh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q3 {
    public final e1 a;
    public final int b;
    public final int c;
    public final e4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ r3 f;

    public q3(r3 r3Var, e1 e1Var, int i10, int i11, e4 e4Var) {
        TL_iv.textButton textbutton;
        this.f = r3Var;
        this.a = e1Var;
        this.b = i10;
        this.c = i11;
        this.d = e4Var;
        if (e4Var == null || (textbutton = e4Var.a) == null) {
            this.e = x5.f(new SpannableStringBuilder(e1Var.getText().subSequence(i10, i11)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        e1 e1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (e4.c(inlineButtonType) && (text = (e1Var = this.a).getText()) != null && (i10 = this.b) >= 0) {
            int length = text.length();
            int i11 = this.c;
            if (i11 > length || i10 >= i11) {
                return;
            }
            r3 r3Var = this.f;
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            f3 f3Var = r3Var.k3;
            if (f3Var != null) {
                f3Var.f(false);
            }
            e1Var.setLocked(false);
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
            e4Var3.a(r3Var.c3, e1Var, r3Var.d3);
            text.setSpan(e4Var3, i10, i11, 33);
            e4Var3.d(text);
            e1Var.setSelection(Math.min(i11, e1Var.length()));
            r3Var.F3 = true;
            try {
                e1Var.notifySpansChanged();
                e1Var.requestLayout();
                e1Var.invalidateEffects();
                r3Var.F3 = false;
                d2 d2Var2 = r3Var.G3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                r3Var.e3.onContentChanged();
            } catch (Throwable th2) {
                r3Var.F3 = false;
                throw th2;
            }
        }
    }
}
