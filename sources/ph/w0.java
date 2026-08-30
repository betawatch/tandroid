package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ek;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ w0(y1 y1Var, int i10) {
        this.a = i10;
        this.b = y1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        y1 y1Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                y1.m(y1Var);
                break;
            case 1:
                ek ekVar = y1Var.f;
                ValueAnimator valueAnimator = ekVar.N;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && ekVar.getCurrentPosition() != num.intValue()) {
                    ekVar.D(num.intValue());
                    x1 x1Var = y1Var.h;
                    x1Var.C = num.intValue();
                    x1Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = y1.D;
                y1Var.p0(intValue);
                break;
        }
    }
}
