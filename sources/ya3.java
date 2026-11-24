// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ya3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb3 b;

    public /* synthetic */ ya3(gb3 gb3Var, s49 s49Var, byte b) {
        this.a = b;
        this.b = gb3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gb3 gb3Var = this.b;
        switch (b) {
            case 0:
                gb3Var.Q();
                break;
            default:
                gb3Var.M();
                break;
        }
    }
}
