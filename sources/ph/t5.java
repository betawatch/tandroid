package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ t5(x5 x5Var, int i10) {
        this.a = i10;
        this.b = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                x5 x5Var = this.b;
                x5Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(mr.h).setDuration(280L).start();
                x5Var.c = System.currentTimeMillis();
                x5Var.invalidate();
                try {
                    x5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(x5Var.h, 59500L);
                break;
        }
    }
}
