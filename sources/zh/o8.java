package zh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
