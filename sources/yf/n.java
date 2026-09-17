package yf;

import org.telegram.messenger.AndroidUtilities;
import sg.p0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class n {
    public final m a;
    public long b;
    public boolean c;
    public final p0 d = new p0(this, 15);

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
        p0 p0Var = this.d;
        AndroidUtilities.cancelRunOnUIThread(p0Var);
        AndroidUtilities.runOnUIThread(p0Var, 1000L);
    }

    public final void b() {
        this.c = false;
        AndroidUtilities.cancelRunOnUIThread(this.d);
    }
}
