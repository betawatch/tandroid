package qh;

import ig.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class c {
    public final k0 a;
    public b c = b.a;
    public final a2 d = new a2(this, 8);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(k0 k0Var) {
        this.a = k0Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            a2 a2Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(a2Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(a2Var, this.b);
            }
        }
    }
}
