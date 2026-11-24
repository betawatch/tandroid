// default package

import android.util.SparseArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v1c extends yo {
    public final /* synthetic */ d2c c;

    public v1c(d2c d2cVar) {
        this.c = d2cVar;
    }

    @Override // yo
    public final int i(int i) {
        d2c d2cVar = this.c;
        w39 adapter = d2cVar.n.getAdapter();
        c2c c2cVar = d2cVar.s;
        if (adapter == c2cVar) {
            if ((c2cVar.d.get(i) instanceof Integer) || i >= c2cVar.x) {
                return c2cVar.w;
            }
            return 1;
        }
        c1b c1bVar = d2cVar.w;
        SparseArray sparseArray = c1bVar.s;
        if (i == c1bVar.E || !(sparseArray.get(i) == null || (sparseArray.get(i) instanceof TLRPC.Document))) {
            return c1bVar.e.a();
        }
        return 1;
    }
}
