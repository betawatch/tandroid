// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class zk extends CharacterStyle {
    public final /* synthetic */ byte a;
    public final Object b;

    public zk(r19 r19Var) {
        this.a = (byte) 1;
        this.b = r19Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                textPaint.setTypeface(hl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(aob.v0(aob.n6, (vnb) obj));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(aob.v(aob.p1(0.55f, textPaint.getColor()), aob.p1(0.4f, ((r19) obj).J)));
                break;
            case 2:
                textPaint.setColor(aob.v(aob.p1(0.55f, textPaint.getColor()), aob.p1(0.4f, aob.v0(aob.Fi, ((km9) obj).a))));
                break;
            case 3:
                textPaint.setColor(((zoc) obj).t0);
                break;
            default:
                float[] fArr = ((frc) obj).b0;
                int i = -9577217;
                if (fArr != null) {
                    i = vm2.f(fArr[8], lsc.p(-9577217, 0, fArr), lsc.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i);
                break;
        }
    }

    public /* synthetic */ zk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
