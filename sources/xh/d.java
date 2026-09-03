package xh;

import android.animation.ValueAnimator;
import o4.h0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                v0 v0Var = (v0) this.c;
                u0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
            default:
                h0 h0Var = (h0) this.b;
                sf.h hVar = (sf.h) this.c;
                h0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h0Var.a = intValue;
                hVar.c(intValue);
                break;
        }
    }
}
