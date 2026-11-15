package v4;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.y50;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ((k) this.b).P((e1) this.c);
                break;
            default:
                y50 y50Var = (y50) this.b;
                Drawable drawable = (Drawable) this.c;
                y50Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((ug.g1) y50Var.c).w2;
                if (!(view instanceof q1)) {
                    view.invalidate();
                    break;
                } else {
                    ((q1) view).q2();
                    break;
                }
        }
    }
}
