package xg;

import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c {
    public final i9 a;
    public b c = b.a;
    public final o1 d = new o1(this, 15);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(i9 i9Var) {
        this.a = i9Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            o1 o1Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(o1Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(o1Var, this.b);
            }
        }
    }
}
