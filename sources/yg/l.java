package yg;

import androidx.recyclerview.widget.RecyclerView;
import f2.d1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends d1 {
    public final /* synthetic */ p a;
    public final /* synthetic */ q b;

    public l(q qVar, p pVar) {
        this.b = qVar;
        this.a = pVar;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        p pVar = this.a;
        if (pVar.h || pVar.i) {
            return;
        }
        if ((r2.c.U2.x.size() - 1) - this.b.c.T2.M0() < 5) {
            pVar.a();
        }
    }
}
