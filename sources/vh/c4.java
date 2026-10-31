package vh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ c4(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                f4Var.getClass();
                f4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e();
                break;
            case 1:
                e4 e4Var = (e4) this.b;
                e4Var.getClass();
                e4Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                break;
            case 2:
                v4 v4Var = (v4) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.E = floatValue;
                u4 u4Var = v4Var.a;
                u4Var.setScaleX(1.0f - floatValue);
                u4Var.setScaleY(1.0f - v4Var.E);
                v4Var.invalidate();
                break;
            case 3:
                w5 w5Var = (w5) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.r = floatValue2;
                q20 q20Var = w5Var.y;
                if (q20Var != null) {
                    q20Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                w5Var.a.invalidate();
                break;
            case 4:
                ((r6) this.b).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                t6 t6Var = (t6) this.b;
                t6Var.getClass();
                t6Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
