package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.r0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c {
    public final b1 a;
    public b c = b.a;
    public final r0 d = new r0(this, 14);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            r0 r0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(r0Var, this.b);
            }
        }
    }
}
