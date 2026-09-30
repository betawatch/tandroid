package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
