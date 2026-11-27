// default package

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u5c extends zo {
    public final /* synthetic */ d6c c;

    public u5c(d6c d6cVar) {
        this.c = d6cVar;
    }

    @Override // zo
    public final int i(int i) {
        d6c d6cVar = this.c;
        j79 adapter = d6cVar.n.getAdapter();
        c6c c6cVar = d6cVar.s;
        if (adapter == c6cVar) {
            if ((c6cVar.d.get(i) instanceof Integer) || i >= c6cVar.x) {
                return c6cVar.w;
            }
            return 1;
        }
        z4b z4bVar = d6cVar.w;
        SparseArray sparseArray = z4bVar.s;
        if (i == z4bVar.E || !(sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return z4bVar.e.a();
        }
        return 1;
    }
}
