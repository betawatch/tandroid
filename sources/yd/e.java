package yd;

import be.r1;
import java.util.Iterator;
import w7.n;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
