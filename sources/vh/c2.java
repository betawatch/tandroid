package vh;

import android.animation.ValueAnimator;
import org.telegram.ui.eo0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;

    public /* synthetic */ c2(eo0 eo0Var, int i10) {
        this.a = i10;
        this.b = eo0Var;
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
