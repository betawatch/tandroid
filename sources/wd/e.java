package wd;

import c8.y0;
import java.util.Iterator;
import zd.j1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                cVar.c = y0.a(cVar, cVar, j1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new xd.b((CharSequence) this.b);
        }
    }
}
