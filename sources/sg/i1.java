package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nl0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                nl0 nl0Var = (nl0) this.b;
                Drawable drawable = (Drawable) this.c;
                nl0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) nl0Var.c).A0;
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
