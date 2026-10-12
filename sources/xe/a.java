package xe;

import af.f;
import df.p;
import df.s;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a implements gf.a {
    @Override // gf.a
    public final char a() {
        return '~';
    }

    @Override // gf.a
    public final void b(s sVar, s sVar2, int i10) {
        we.a aVar = new we.a();
        p pVar = (p) sVar.f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f;
            aVar.b(pVar);
            pVar = pVar2;
        }
        aVar.g();
        p pVar3 = (p) sVar.f;
        aVar.f = pVar3;
        if (pVar3 != null) {
            pVar3.e = aVar;
        }
        aVar.e = sVar;
        sVar.f = aVar;
        p pVar4 = (p) sVar.b;
        aVar.b = pVar4;
        if (((p) aVar.f) == null) {
            pVar4.d = aVar;
        }
    }

    @Override // gf.a
    public final int c() {
        return 2;
    }

    @Override // gf.a
    public final int d(f fVar, f fVar2) {
        return (fVar.g < 2 || fVar2.g < 2) ? 0 : 2;
    }

    @Override // gf.a
    public final char e() {
        return '~';
    }
}
