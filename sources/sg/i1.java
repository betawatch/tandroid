package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                ml0 ml0Var = (ml0) this.b;
                Drawable drawable = (Drawable) this.c;
                ml0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ml0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.u1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    break;
                }
            default:
                ((s4.k) this.b).P((s4.b1) this.c);
                break;
        }
    }
}
