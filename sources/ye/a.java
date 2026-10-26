package ye;

import bf.e;
import ef.p;
import ef.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements hf.a {
    @Override // hf.a
    public final int a(e eVar, e eVar2) {
        return (eVar.g < 2 || eVar2.g < 2) ? 0 : 2;
    }

    @Override // hf.a
    public final char b() {
        return '~';
    }

    @Override // hf.a
    public final int c() {
        return 2;
    }

    @Override // hf.a
    public final void d(s sVar, s sVar2, int i10) {
        xe.a aVar = new xe.a();
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

    @Override // hf.a
    public final char e() {
        return '~';
    }
}
