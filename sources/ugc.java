// default package

import android.animation.ValueAnimator;
import android.view.WindowManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ugc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xgc b;

    public /* synthetic */ ugc(xgc xgcVar, byte b) {
        this.a = b;
        this.b = xgcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xgc xgcVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams = xgcVar.d;
                layoutParams.x = (int) floatValue;
                gl.O3(xgcVar.c, xgcVar.a, layoutParams);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WindowManager.LayoutParams layoutParams2 = xgcVar.d;
                layoutParams2.y = (int) floatValue2;
                gl.O3(xgcVar.c, xgcVar.a, layoutParams2);
                break;
        }
    }
}
