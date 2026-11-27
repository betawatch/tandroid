// default package

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
