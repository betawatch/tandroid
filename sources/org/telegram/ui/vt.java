package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vt extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.rl0 c;

    public /* synthetic */ vt(org.telegram.ui.Components.rl0 rl0Var, String str, int i10) {
        this.a = i10;
        this.c = rl0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((wt) this.c).d.cancel();
                    ((wt) this.c).d = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.k41(12, (wt) this.c, this.b));
                break;
            default:
                tf.c1 c1Var = (tf.c1) this.c;
                try {
                    c1Var.n.cancel();
                    c1Var.n = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                String str = this.b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new ph.f6(24, c1Var, str));
                break;
        }
    }
}
