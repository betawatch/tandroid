package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ y70 b;

    public x70(y70 y70Var, String str) {
        this.b = y70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        y70 y70Var = this.b;
        try {
            y70Var.f.cancel();
            y70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new w70(this, this.a, 0));
    }
}
