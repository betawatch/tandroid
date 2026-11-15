package wd;

import c8.v0;
import java.util.Iterator;
import zd.j1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // wd.b
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.b;
                c cVar = new c();
                cVar.c = v0.a(cVar, cVar, j1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new xd.b((CharSequence) this.b);
        }
    }
}
