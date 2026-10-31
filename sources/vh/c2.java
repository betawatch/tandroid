package vh;

import android.animation.ValueAnimator;
import org.telegram.ui.go0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;

    public /* synthetic */ c2(go0 go0Var, int i10) {
        this.a = i10;
        this.b = go0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((k2) this.b.c).invalidate();
                break;
            default:
                ((k2) this.b.c).invalidate();
                break;
        }
    }
}
