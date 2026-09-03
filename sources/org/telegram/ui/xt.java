package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xt extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.ql0 c;

    public /* synthetic */ xt(org.telegram.ui.Components.ql0 ql0Var, String str, int i10) {
        this.a = i10;
        this.c = ql0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((yt) this.c).d.cancel();
                    ((yt) this.c).d = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.k41(11, (yt) this.c, this.b));
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
                AndroidUtilities.runOnUIThread(new ph.e6(26, c1Var, str));
                break;
        }
    }
}
