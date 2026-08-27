package zg;

import androidx.recyclerview.widget.RecyclerView;
import f2.b1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m extends b1 {
    public final /* synthetic */ q a;
    public final /* synthetic */ r b;

    public m(r rVar, q qVar) {
        this.b = rVar;
        this.a = qVar;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q qVar = this.a;
        if (qVar.h || qVar.i) {
            return;
        }
        if ((r2.c.U2.x.size() - 1) - this.b.c.T2.M0() < 5) {
            qVar.a();
        }
    }
}
