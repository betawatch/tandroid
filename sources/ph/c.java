package ph;

import ii.q1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.q0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c {
    public final q1 a;
    public b c = b.a;
    public final q0 d = new q0(this, 14);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(q1 q1Var) {
        this.a = q1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            q0 q0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(q0Var, this.b);
            }
        }
    }
}
