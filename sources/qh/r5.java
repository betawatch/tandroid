package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ r5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                v5 v5Var = this.b;
                v5Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.h).setDuration(280L).start();
                v5Var.c = System.currentTimeMillis();
                v5Var.invalidate();
                try {
                    v5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(v5Var.h, 59500L);
                break;
        }
    }
}
