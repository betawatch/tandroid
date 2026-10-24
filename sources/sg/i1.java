package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ql0 ql0Var = (ql0) this.b;
                Drawable drawable = (Drawable) this.c;
                ql0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ql0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.t1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.t1) view).Z2();
                    break;
                }
            default:
                ((s4.k) this.b).P((s4.b1) this.c);
                break;
        }
    }
}
