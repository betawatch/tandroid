package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // wd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                q1 q1Var = (q1) this.b;
                c cVar = new c();
                cVar.c = t8.a(cVar, cVar, q1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new xd.b((String) this.b);
        }
    }
}
