package yf;

import org.telegram.messenger.AndroidUtilities;
import rg.s1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n {
    public final m a;
    public long b;
    public boolean c;
    public final s1 d = new s1(this, 20);

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
        s1 s1Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
