package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qe0 extends TimerTask {
    public final /* synthetic */ re0 a;

    public qe0(re0 re0Var) {
        this.a = re0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.N == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 22));
    }
}
