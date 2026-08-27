package yg;

import lh.n6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c {
    public final n6 a;
    public b c = b.a;
    public final qf.b d = new qf.b(this, 23);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(n6 n6Var) {
        this.a = n6Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            qf.b bVar2 = this.d;
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
