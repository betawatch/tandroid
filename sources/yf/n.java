package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.w1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class n {
    public final m a;
    public long b;
    public boolean c;
    public final w1 d = new w1(this, 19);

    public n(m mVar) {
        this.a = mVar;
    }

    public final void a(long j3) {
        if (this.c && this.b == j3) {
            return;
        }
        this.b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.c = true;
        w1 w1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
