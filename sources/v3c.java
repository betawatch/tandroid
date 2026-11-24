// default package

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v3c extends yp {
    public final /* synthetic */ d4c c;

    public v3c(d4c d4cVar) {
        this.c = d4cVar;
    }

    @Override // yp
    public final int i(int i) {
        d4c d4cVar = this.c;
        y59 adapter = d4cVar.n.getAdapter();
        c4c c4cVar = d4cVar.s;
        if (adapter == c4cVar) {
            if ((c4cVar.d.get(i) instanceof Integer) || i >= c4cVar.x) {
                return c4cVar.w;
            }
            return 1;
        }
        e3b e3bVar = d4cVar.w;
        SparseArray sparseArray = e3bVar.s;
        if (i == e3bVar.E || !(sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return e3bVar.e.a();
        }
        return 1;
    }
}
