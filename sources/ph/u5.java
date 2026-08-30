package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ u5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                y5 y5Var = this.b;
                y5Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.h).setDuration(280L).start();
                y5Var.c = System.currentTimeMillis();
                y5Var.invalidate();
                try {
                    y5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(y5Var.h, 59500L);
                break;
        }
    }
}
