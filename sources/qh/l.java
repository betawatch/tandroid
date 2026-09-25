package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        if ((r2.c.Y2.x.size() - 1) - this.b.c.X2.M0() < 5) {
            pVar.a();
        }
    }
}
