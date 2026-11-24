// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yk extends CharacterStyle {
    public final /* synthetic */ byte a;
    public final Object b;

    public yk(ey8 ey8Var) {
        this.a = (byte) 1;
        this.b = ey8Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(gl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.v0(bkb.m6, (wjb) obj));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(bkb.v(bkb.p1(0.55f, textPaint.getColor()), bkb.p1(0.4f, ((ey8) obj).J)));
                break;
            case 2:
                textPaint.setColor(bkb.v(bkb.p1(0.55f, textPaint.getColor()), bkb.p1(0.4f, bkb.v0(bkb.Ei, ((wi9) obj).a))));
                break;
            case 3:
                textPaint.setColor(((nkc) obj).t0);
                break;
            default:
                float[] fArr = ((smc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = bm2.f(fArr[8], znc.p(-9577217, 0, fArr), znc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                break;
        }
    }

    public /* synthetic */ yk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
