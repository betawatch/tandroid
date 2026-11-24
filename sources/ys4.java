// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ys4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ys4(Object obj, float f, float f2, float f3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs4 vs4Var = ((ft4) obj).b;
                vs4Var.d = f3 * floatValue;
                vs4Var.e = f2 * floatValue;
                vs4Var.i = floatValue * f;
                break;
            case 1:
                jb5 jb5Var = (jb5) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.z0 = td4.A(1.0f, floatValue2, 1.0f, f3 * floatValue2);
                jb5Var.s0 = f2 * floatValue2;
                jb5Var.t0 = f * floatValue2;
                jb5Var.invalidate();
                break;
            default:
                iic iicVar = (iic) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iicVar.f1 = td4.A(1.0f, floatValue3, 1.0f, f3 * floatValue3);
                iicVar.Y0 = f2 * floatValue3;
                iicVar.Z0 = f * floatValue3;
                iicVar.s.invalidate();
                break;
        }
    }
}
