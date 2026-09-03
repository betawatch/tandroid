package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ek;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ w0(x1 x1Var, int i10) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        x1 x1Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                x1.m(x1Var);
                break;
            case 1:
                ek ekVar = x1Var.f;
                ValueAnimator valueAnimator = ekVar.N;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && ekVar.getCurrentPosition() != num.intValue()) {
                    ekVar.D(num.intValue());
                    w1 w1Var = x1Var.h;
                    w1Var.C = num.intValue();
                    w1Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = x1.D;
                x1Var.p0(intValue);
                break;
        }
    }
}
