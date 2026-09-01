package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wt extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.sl0 c;

    public /* synthetic */ wt(org.telegram.ui.Components.sl0 sl0Var, String str, int i10) {
        this.a = i10;
        this.c = sl0Var;
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
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.l41(11, (xt) this.c, this.b));
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
                AndroidUtilities.runOnUIThread(new qh.d6(27, c1Var, str));
                break;
        }
    }
}
