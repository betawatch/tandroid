package rh;

import ig.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.h1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c {
    public final o a;
    public b c = b.a;
    public final h1 d = new h1(this, 13);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(o oVar) {
        this.a = oVar;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            h1 h1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(h1Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(h1Var, this.b);
            }
        }
    }
}
