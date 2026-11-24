// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class skc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hmc b;

    public /* synthetic */ skc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                hmcVar.P0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hmcVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmcVar.X0();
                break;
        }
    }
}
