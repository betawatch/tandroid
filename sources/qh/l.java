package qh;

import androidx.recyclerview.widget.RecyclerView;
import s4.s0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
