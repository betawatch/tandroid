package qh;

import ig.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class c {
    public final l0 a;
    public b c = b.a;
    public final a2 d = new a2(this, 8);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(l0 l0Var) {
        this.a = l0Var;
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
