package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.gk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                gk gkVar = y1Var.f;
                ValueAnimator valueAnimator = gkVar.N;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && gkVar.getCurrentPosition() != num.intValue()) {
                    gkVar.D(num.intValue());
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
