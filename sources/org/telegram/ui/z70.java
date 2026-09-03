package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ a80 b;

    public z70(a80 a80Var, String str) {
        this.b = a80Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a80 a80Var = this.b;
        try {
            a80Var.f.cancel();
            a80Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new y70(this, this.a, 0));
    }
}
