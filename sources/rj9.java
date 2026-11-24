// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rj9 extends MetricAffectingSpan {
    public final uj9 a;
    public final int b;
    public final boolean c;
    public boolean d;
    public int e;

    public rj9(uj9 uj9Var, int i, boolean z) {
        this.a = uj9Var;
        this.b = i;
        this.c = z;
    }

    public final void a(TextPaint textPaint) {
        Typeface n1;
        int L;
        int v0;
        int i = this.b;
        int i2 = i & 15;
        if (i2 == 8) {
            n1 = Typeface.MONOSPACE;
        } else if (i2 == 11) {
            n1 = gm.o();
        } else if (i2 >= 1 && i2 <= 6) {
            n1 = TLObject.hasFlag(i, 32) ? gm.n1("fonts/rmediumitalic.ttf") : gm.o();
        } else if (TLObject.hasFlag(i, 256)) {
            n1 = Typeface.MONOSPACE;
        } else {
            boolean hasFlag = TLObject.hasFlag(i, 16);
            boolean z = TLObject.hasFlag(i, 32) || i2 == 12;
            n1 = hasFlag ? z ? gm.n1("fonts/rmediumitalic.ttf") : gm.o() : z ? gm.n1("fonts/ritalic.ttf") : null;
        }
        if (n1 != null) {
            textPaint.setTypeface(n1);
        }
        int i3 = gda.S0;
        if (i2 != 14 || !this.d) {
            switch (i2) {
                case 1:
                    L = gm.L(i3 + 4);
                    break;
                case 2:
                    L = gm.L(i3 + 2);
                    break;
                case 3:
                    L = gm.L(i3 + 1);
                    break;
                case 4:
                case 5:
                case 6:
                    L = gm.L(i3);
                    break;
                case 7:
                case 13:
                    L = gm.L(i3 - 2);
                    break;
                case 8:
                    int i4 = i3 - 2;
                    L = gm.L(Math.max(Math.min(10, i4), i4 - this.e));
                    break;
                case 9:
                case 11:
                case 12:
                    L = gm.L(i3 - 2);
                    break;
                case 10:
                    L = gm.L(i3 - 2);
                    break;
                case 14:
                    L = gm.L(Math.max(8, i3 - 2));
                    break;
                case 15:
                    L = gm.L(i3 - 2);
                    break;
                default:
                    L = gm.L(i3);
                    break;
            }
        } else {
            L = gm.L(i3);
        }
        if (TLObject.hasFlag(i, 6144)) {
            L -= gm.L(4.0f);
        }
        textPaint.setTextSize(L);
        if (!this.c) {
            textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(i, 64)), 16, TLObject.hasFlag(i, 128)));
            if (i2 != 8) {
                uj9 uj9Var = this.a;
                if (i2 == 11) {
                    v0 = cmb.v0(uj9Var.D() ? cmb.Sb : cmb.Md, uj9Var.D);
                } else if (i2 == 10) {
                    v0 = cmb.p1(0.5f, cmb.v0(uj9Var.D() ? cmb.Vc : cmb.Uc, uj9Var.D));
                } else {
                    v0 = cmb.v0(uj9Var.D() ? cmb.Vc : cmb.Uc, uj9Var.D);
                }
                textPaint.setColor(v0);
            }
        }
        if (TLObject.hasFlag(i, TLObject.FLAG_12)) {
            textPaint.baselineShift -= gm.L(6.0f);
        } else if (TLObject.hasFlag(i, 2048)) {
            textPaint.baselineShift = gm.L(2.0f) + textPaint.baselineShift;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
