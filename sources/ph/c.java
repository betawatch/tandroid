package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.u0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c {
    public final b1 a;
    public b c = b.a;
    public final u0 d = new u0(this, 13);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            u0 u0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(u0Var, this.b);
            }
        }
    }
}
