// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bh6 b;

    public /* synthetic */ xg6(bh6 bh6Var, byte b) {
        this.a = b;
        this.b = bh6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        bh6 bh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh6Var.d.setAlpha(floatValue);
                bh6Var.e.setAlpha(floatValue);
                bh6Var.f.setProgress(floatValue);
                FrameLayout frameLayout = bh6Var.x;
                frameLayout.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                break;
            default:
                bh6Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh6Var.f.setProgress(floatValue2);
                bh6Var.d.setAlpha(floatValue2);
                bh6Var.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = bh6Var.x;
                frameLayout2.setAlpha(floatValue2);
                float f2 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                break;
        }
    }
}
