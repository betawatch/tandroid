// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rj3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ nk3 d;

    public rj3(nk3 nk3Var, float f, boolean z, float f2) {
        this.d = nk3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) gm.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        nk3 nk3Var = this.d;
        nk3Var.f0[0].a.scrollBy(0, i);
        View view = nk3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
