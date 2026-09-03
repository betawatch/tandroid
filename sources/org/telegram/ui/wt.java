package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wt extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.rl0 c;

    public /* synthetic */ wt(org.telegram.ui.Components.rl0 rl0Var, String str, int i10) {
        this.a = i10;
        this.c = rl0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((xt) this.c).d.cancel();
                    ((xt) this.c).d = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.q51(10, (xt) this.c, this.b));
                break;
            default:
                uf.c1 c1Var = (uf.c1) this.c;
                try {
                    c1Var.n.cancel();
                    c1Var.n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new qh.l6(26, c1Var, str));
                break;
        }
    }
}
