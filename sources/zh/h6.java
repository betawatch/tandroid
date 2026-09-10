package zh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ h6(p6 p6Var, float f7, float f10, int i10) {
        this.a = i10;
        this.b = p6Var;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p6 p6Var = this.b;
                p6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                o6 o6Var = p6Var.b0;
                o6Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                o6Var.invalidate();
                break;
            default:
                p6 p6Var2 = this.b;
                p6Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((p6Var2.getMeasuredHeight() - p6Var2.u0) - AndroidUtilities.dp(64.0f), p6Var2.r0.getBottom() - p6Var2.getMeasuredHeight()), floatValue2));
                o6 o6Var2 = p6Var2.b0;
                o6Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                o6Var2.invalidate();
                break;
        }
    }
}
