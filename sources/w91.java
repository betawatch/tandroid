// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ da1 b;

    public /* synthetic */ w91(da1 da1Var, byte b) {
        this.a = b;
        this.b = da1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        da1 da1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da1Var.Z = floatValue;
                da1Var.b.setAlpha(1.0f - floatValue);
                if (da1Var.X == 3) {
                    da1Var.c.setAlpha(1.0f - da1Var.Z);
                }
                da1Var.s.setAlpha(1.0f - da1Var.Z);
                da1Var.x = (da1Var.Z * 0.25f) + 0.5f;
                da1Var.fragmentView.invalidate();
                break;
            default:
                da1Var.s.invalidate();
                break;
        }
    }
}
