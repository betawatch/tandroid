package th;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ c6(j6 j6Var, float f7, float f10, int i10) {
        this.a = i10;
        this.b = j6Var;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j6 j6Var = this.b;
                j6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.setScrollY((int) org.telegram.messenger.i0.T1(this.c, 0.0f, floatValue));
                i6 i6Var = j6Var.b0;
                i6Var.x = org.telegram.messenger.i0.T1(this.d, 0.0f, floatValue);
                i6Var.invalidate();
                break;
            default:
                j6 j6Var2 = this.b;
                j6Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var2.setScrollY((int) org.telegram.messenger.i0.T1(this.c, Math.min((j6Var2.getMeasuredHeight() - j6Var2.u0) - org.telegram.messenger.i0.L(64.0f), j6Var2.r0.getBottom() - j6Var2.getMeasuredHeight()), floatValue2));
                i6 i6Var2 = j6Var2.b0;
                i6Var2.x = org.telegram.messenger.i0.T1(this.d, 1.0f, floatValue2);
                i6Var2.invalidate();
                break;
        }
    }
}
