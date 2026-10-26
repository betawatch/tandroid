package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s70 extends TimerTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ t70 b;

    public s70(t70 t70Var, String str) {
        this.b = t70Var;
        this.a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        t70 t70Var = this.b;
        try {
            t70Var.f.cancel();
            t70Var.f = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new r70(this, this.a, 0));
    }
}
