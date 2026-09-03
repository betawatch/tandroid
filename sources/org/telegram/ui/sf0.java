package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sf0 extends TimerTask {
    public final /* synthetic */ tf0 a;

    public sf0(tf0 tf0Var) {
        this.a = tf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.O == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d10(this, 24));
    }
}
