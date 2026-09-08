package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ i1(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                o1Var.getClass();
                o1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.container.invalidate();
                break;
            default:
                o1 o1Var2 = this.b;
                o1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(o1Var2.O0[0].getHeight(), o1Var2.O0[1].getHeight(), floatValue);
                o1Var2.N0.requestLayout();
                break;
        }
    }
}
