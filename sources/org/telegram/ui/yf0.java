package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yf0 extends TimerTask {
    public final /* synthetic */ zf0 a;

    public yf0(zf0 zf0Var) {
        this.a = zf0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.a.R == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g10(this, 24));
    }
}
