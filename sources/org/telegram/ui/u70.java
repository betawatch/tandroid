package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ v70 b;

    public u70(v70 v70Var, String str) {
        this.b = v70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        v70 v70Var = this.b;
        try {
            v70Var.f.cancel();
            v70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new t70(this, this.a, 0));
    }
}
