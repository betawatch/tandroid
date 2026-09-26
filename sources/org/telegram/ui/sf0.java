package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
