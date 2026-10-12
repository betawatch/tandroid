package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m extends r0 {
    public final /* synthetic */ q a;
    public final /* synthetic */ r b;

    public m(r rVar, q qVar) {
        this.b = rVar;
        this.a = qVar;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q qVar = this.a;
        if (qVar.h || qVar.i) {
            return;
        }
        if ((r2.c.W2.x.size() - 1) - this.b.c.V2.M0() < 5) {
            qVar.a();
        }
    }
}
