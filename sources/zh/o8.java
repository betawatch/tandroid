package zh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q8 q8Var = (q8) this.b;
                p8 p8Var = (p8) this.c;
                q8Var.getClass();
                p8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                break;
            default:
                pk0 pk0Var = (pk0) this.b;
                Drawable drawable = (Drawable) this.c;
                pk0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((sg.o1) pk0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.t1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.t1) view).a3();
                    break;
                }
        }
    }
}
