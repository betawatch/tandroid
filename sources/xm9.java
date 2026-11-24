// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xm9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ xm9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                on9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                on9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pha phaVar = on9Var.F;
                if (phaVar.getTitleTextView() != null) {
                    phaVar.getTitleTextView().invalidate();
                    break;
                }
                break;
            default:
                on9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on9Var.f.requestLayout();
                break;
        }
    }
}
