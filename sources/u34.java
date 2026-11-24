// default package

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u34 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u34(pfa pfaVar, int i, sea seaVar) {
        this.a = (byte) 3;
        this.c = pfaVar;
        this.b = i;
        this.d = seaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                w34 w34Var = (w34) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = 0;
                while (i2 < 3) {
                    w34Var.f[i2] = gm.R1(fArr[i2], i2 == i ? 1.0f : 0.0f, floatValue);
                    i2++;
                }
                w34Var.a();
                break;
            case 1:
                ry5 ry5Var = (ry5) obj2;
                ry5Var.A1.a = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                oy5 oy5Var = ry5Var.S0;
                if (oy5Var != null) {
                    oy5Var.invalidate();
                    break;
                }
                break;
            case 2:
                xv7 xv7Var = (xv7) obj2;
                xv7Var.q1.a = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                uv7 uv7Var = xv7Var.J0;
                if (uv7Var != null) {
                    uv7Var.invalidate();
                    break;
                }
                break;
            default:
                ((pfa) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((sea) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ u34(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
