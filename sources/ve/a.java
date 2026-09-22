package ve;

import bf.p;
import bf.s;
import ye.b;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a implements ef.a {
    @Override // ef.a
    public final char a() {
        return '~';
    }

    @Override // ef.a
    public final int b(b bVar, b bVar2) {
        return (bVar.g < 2 || bVar2.g < 2) ? 0 : 2;
    }

    @Override // ef.a
    public final int c() {
        return 2;
    }

    @Override // ef.a
    public final void d(s sVar, s sVar2, int i10) {
        ue.a aVar = new ue.a();
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

    @Override // ef.a
    public final char e() {
        return '~';
    }
}
