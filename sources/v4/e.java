package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.v50;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((k) this.b).P((d1) this.c);
                break;
            default:
                v50 v50Var = (v50) this.b;
                Drawable drawable = (Drawable) this.c;
                v50Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.f1) v50Var.c).s2;
                if (!(view instanceof q1)) {
                    view.invalidate();
                    break;
                } else {
                    ((q1) view).p2();
                    break;
                }
        }
    }
}
