package sh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ x1(p2 p2Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = p2Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                Paint paint = p2Var.M;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d));
                p2Var.A();
                p2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = p2Var.R0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    p2Var.R0.setBackgroundColor(paint.getColor());
                }
                p2Var.F();
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.getClass();
                p2Var2.O = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c, this.d);
                p2Var2.h();
                break;
        }
    }
}
