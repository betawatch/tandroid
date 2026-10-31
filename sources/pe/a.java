package pe;

import df.c;
import se.b;
import ve.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements ye.a {
    @Override // ye.a
    public final int a(b bVar, b bVar2) {
        return (bVar.g < 2 || bVar2.g < 2) ? 0 : 2;
    }

    @Override // ye.a
    public final char b() {
        return '~';
    }

    @Override // ye.a
    public final void c(r rVar, r rVar2, int i10) {
        oe.a aVar = new oe.a();
        c cVar = (c) rVar.f;
        while (cVar != null && cVar != rVar2) {
            c cVar2 = (c) cVar.f;
            aVar.b(cVar);
            cVar = cVar2;
        }
        aVar.g();
        c cVar3 = (c) rVar.f;
        aVar.f = cVar3;
        if (cVar3 != null) {
            cVar3.e = aVar;
        }
        aVar.e = rVar;
        rVar.f = aVar;
        c cVar4 = (c) rVar.b;
        aVar.b = cVar4;
        if (((c) aVar.f) == null) {
            cVar4.d = aVar;
        }
    }

    @Override // ye.a
    public final int d() {
        return 2;
    }

    @Override // ye.a
    public final char e() {
        return '~';
    }
}
