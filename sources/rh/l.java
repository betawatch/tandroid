package rh;

import androidx.recyclerview.widget.RecyclerView;
import s4.r0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class l extends r0 {
    public final /* synthetic */ p a;
    public final /* synthetic */ q b;

    public l(q qVar, p pVar) {
        this.b = qVar;
        this.a = pVar;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p pVar = this.a;
        if (pVar.h || pVar.i) {
            return;
        }
        if ((r2.c.W2.x.size() - 1) - this.b.c.V2.M0() < 5) {
            pVar.a();
        }
    }
}
