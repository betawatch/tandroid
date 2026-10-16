package qh;

import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.r2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c {
    public final p1 a;
    public b c = b.a;
    public final r2 d = new r2(this, 19);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(p1 p1Var) {
        this.a = p1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            r2 r2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(r2Var, this.b);
            }
        }
    }
}
