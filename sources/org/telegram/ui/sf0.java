package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sf0 extends TimerTask {
    public final /* synthetic */ tf0 a;

    public sf0(tf0 tf0Var) {
        this.a = tf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c10(this, 24));
    }
}
