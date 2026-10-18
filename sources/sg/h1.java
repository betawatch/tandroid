package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h1(int i10, Object obj, Object obj2) {
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
                View view = ((l1) ml0Var.c).A0;
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
