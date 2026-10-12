package qh;

import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.m2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c {
    public final p1 a;
    public b c = b.a;
    public final m2 d = new m2(this, 19);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(p1 p1Var) {
        this.a = p1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            m2 m2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(m2Var, this.b);
            }
        }
    }
}
