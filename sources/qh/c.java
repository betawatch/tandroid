package qh;

import ig.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class c {
    public final l0 a;
    public b c = b.a;
    public final z1 d = new z1(this, 8);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(l0 l0Var) {
        this.a = l0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            z1 z1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(z1Var, this.b);
            }
        }
    }
}
