package xe;

import af.f;
import df.p;
import df.s;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
