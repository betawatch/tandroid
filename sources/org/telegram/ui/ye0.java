package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ye0 extends TimerTask {
    public final /* synthetic */ ze0 a;

    public ye0(ze0 ze0Var) {
        this.a = ze0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i10(this, 22));
    }
}
