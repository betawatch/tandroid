package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // xd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                c cVar = new c();
                cVar.c = h.a(cVar, cVar, s1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new yd.b((String) this.b);
        }
    }
}
