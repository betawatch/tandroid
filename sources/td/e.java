package td;

import b8.jc;
import java.util.Iterator;
import wd.j1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // td.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.b;
                c cVar = new c();
                cVar.c = jc.a(cVar, cVar, j1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new ud.b((CharSequence) this.b);
        }
    }
}
