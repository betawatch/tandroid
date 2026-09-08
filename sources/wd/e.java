package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
