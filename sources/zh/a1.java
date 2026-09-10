package zh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ a1(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b1 b1Var = this.b;
                b1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.n = floatValue;
                View view = b1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - b1Var.n);
                view.setScaleY(1.0f - b1Var.n);
                b1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(b1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                b1Var.a.invalidate();
                break;
        }
    }
}
