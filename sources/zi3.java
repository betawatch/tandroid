// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zi3 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ uj3 d;

    public zi3(uj3 uj3Var, float f, boolean z, float f2) {
        this.d = uj3Var;
        this.b = f;
        this.c = f2;
        this.a = (int) f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int R1 = (int) hl.R1(this.b, this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i = R1 - this.a;
        this.a = R1;
        uj3 uj3Var = this.d;
        uj3Var.f0[0].a.scrollBy(0, i);
        View view = uj3Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
