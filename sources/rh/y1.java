package rh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ y1(q2 q2Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = q2Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                Paint paint = q2Var.M;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                q2Var.A();
                q2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = q2Var.R0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    q2Var.R0.setBackgroundColor(paint.getColor());
                }
                q2Var.F();
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.O = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                q2Var2.h();
                break;
        }
    }
}
