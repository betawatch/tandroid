// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yl extends CharacterStyle {
    public final /* synthetic */ byte a;
    public final Object b;

    public yl(f09 f09Var) {
        this.a = (byte) 1;
        this.b = f09Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(gm.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(cmb.v0(cmb.m6, (ylb) obj));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(cmb.v(cmb.p1(0.55f, textPaint.getColor()), cmb.p1(0.4f, ((f09) obj).J)));
                break;
            case 2:
                textPaint.setColor(cmb.v(cmb.p1(0.55f, textPaint.getColor()), cmb.p1(0.4f, cmb.v0(cmb.Ei, ((xk9) obj).a))));
                break;
            case 3:
                textPaint.setColor(((mmc) obj).t0);
                break;
            default:
                float[] fArr = ((soc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = on2.f(fArr[8], bqc.p(-9577217, 0, fArr), bqc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                break;
        }
    }

    public /* synthetic */ yl(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
