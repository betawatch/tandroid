package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                cVar.c = g.a(cVar, cVar, q1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new xd.b((String) this.b);
        }
    }
}
