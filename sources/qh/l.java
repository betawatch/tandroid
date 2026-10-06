package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class l extends s0 {
    public final /* synthetic */ p a;
    public final /* synthetic */ q b;

    public l(q qVar, p pVar) {
        this.b = qVar;
        this.a = pVar;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.a;
        if (pVar.h || pVar.i) {
            return;
        }
        if ((r2.c.f3.x.size() - 1) - this.b.c.e3.M0() < 5) {
            pVar.a();
        }
    }
}
