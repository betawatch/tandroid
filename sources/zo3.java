// default package

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zo3 extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ zo3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float A;
        float A2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ap3 ap3Var = (ap3) obj;
                LinearGradient linearGradient = ap3Var.k;
                if (linearGradient != null && ap3Var.m > 0.0f) {
                    textPaint.setShader(linearGradient);
                    textPaint.setColor(-1);
                    break;
                }
                break;
            case 1:
                wkc wkcVar = (wkc) obj;
                float f = (ykc.y3 - wkcVar.c) / 360.0f;
                if (f <= 0.0f) {
                    A = wkcVar.d;
                } else if (f >= 1.0f) {
                    A = 1.0f;
                } else {
                    float f2 = wkcVar.d;
                    A = td4.A(1.0f, (float) Math.pow(1.0f - f, 3.0d), 1.0f - f2, f2);
                }
                float max = Math.max(0.0f, Math.min(1.0f, (((ykc.y3 - wkcVar.c) / 1500.0f) - 0.2f) / 0.8f));
                float B = mlb.B(max, 2.0f, 3.0f, max * max);
                int alpha = textPaint.getAlpha();
                textPaint.setColor(on2.f(B, ykc.z3, ykc.A3));
                textPaint.setAlpha((int) (alpha * A));
                float f3 = ykc.B3;
                if (f3 > 0.0f && B < 1.0f) {
                    textPaint.setShadowLayer(f3, 0.0f, 0.0f, cmb.p1((1.0f - B) * 0.55f * A, ykc.z3));
                    break;
                }
                break;
            default:
                ilc ilcVar = (ilc) obj;
                float f4 = (jlc.b2 - ilcVar.c) / 360.0f;
                if (f4 <= 0.0f) {
                    A2 = ilcVar.d;
                } else if (f4 >= 1.0f) {
                    A2 = 1.0f;
                } else {
                    float f5 = ilcVar.d;
                    A2 = td4.A(1.0f, (float) Math.pow(1.0f - f4, 3.0d), 1.0f - f5, f5);
                }
                float b2 = jlc.b((((jlc.b2 - ilcVar.c) / 1900.0f) - 0.2f) / 0.8f);
                float B2 = mlb.B(b2, 2.0f, 3.0f, b2 * b2);
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(on2.f(B2, jlc.X1, jlc.Y1));
                textPaint.setAlpha((int) (alpha2 * A2));
                if (B2 < 1.0f) {
                    textPaint.setShadowLayer(jlc.Z1, 0.0f, 0.0f, cmb.p1((1.0f - B2) * 0.55f * A2, jlc.X1));
                    break;
                }
                break;
        }
    }
}
