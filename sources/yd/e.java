package yd;

import be.r1;
import java.util.Iterator;
import w7.n;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // yd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.b;
                c cVar = new c();
                cVar.c = n.a(cVar, cVar, r1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new zd.b((String) this.b);
        }
    }
}
