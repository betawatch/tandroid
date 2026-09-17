package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class c {
    public final b1 a;
    public b c = b.a;
    public final org.telegram.ui.web.b d = new org.telegram.ui.web.b(this, 16);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            org.telegram.ui.web.b bVar2 = this.d;
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(bVar2, this.b);
            }
        }
    }
}
