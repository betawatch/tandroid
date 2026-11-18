package wd;

import c8.x0;
import java.util.Iterator;
import zd.j1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                cVar.c = x0.a(cVar, cVar, j1Var);
                return cVar;
            case 1:
                return (Iterator) this.b;
            default:
                return new xd.b((CharSequence) this.b);
        }
    }
}
