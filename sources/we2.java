// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class we2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ vob b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ if2 e;

    public we2(if2 if2Var, vob vobVar, float f, boolean z) {
        this.e = if2Var;
        this.b = vobVar;
        this.c = f;
        this.d = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if2 if2Var = this.e;
        if2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || if2Var.L1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
