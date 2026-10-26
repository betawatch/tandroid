package rh;

import ig.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.h1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
