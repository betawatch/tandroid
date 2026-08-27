package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qt extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.yk0 c;

    public /* synthetic */ qt(org.telegram.ui.Components.yk0 yk0Var, String str, int i10) {
        this.a = i10;
        this.c = yk0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((rt) this.c).d.cancel();
                    ((rt) this.c).d = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.r61(6, (rt) this.c, this.b));
                break;
            default:
                pf.c1 c1Var = (pf.c1) this.c;
                try {
                    c1Var.n.cancel();
                    c1Var.n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.b;
                c1Var.getClass();
                AndroidUtilities.runOnUIThread(new zh1(16, c1Var, str));
                break;
        }
    }
}
