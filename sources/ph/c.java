package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.t0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c {
    public final q1 a;
    public b c = b.a;
    public final t0 d = new t0(this, 13);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(q1 q1Var) {
        this.a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            t0 t0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(t0Var, this.b);
            }
        }
    }
}
