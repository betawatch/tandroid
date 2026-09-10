package ze;

import bf.g;
import bf.p;
import bf.s;
import ye.b;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements ef.a {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // ef.a
    public final char a() {
        return this.a;
    }

    @Override // ef.a
    public final int b(b bVar, b bVar2) {
        if (bVar.d || bVar2.c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (bVar.g < 2 || bVar2.g < 2) ? 1 : 2;
    }

    @Override // ef.a
    public final int c() {
        return 1;
    }

    @Override // ef.a
    public final void d(s sVar, s sVar2, int i10) {
        String.valueOf(this.a);
        g gVar = i10 == 1 ? new g(0) : new g(3);
        p pVar = (p) sVar.f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f;
            gVar.b(pVar);
            pVar = pVar2;
        }
        gVar.g();
        p pVar3 = (p) sVar.f;
        gVar.f = pVar3;
        if (pVar3 != null) {
            pVar3.e = gVar;
        }
        gVar.e = sVar;
        sVar.f = gVar;
        p pVar4 = (p) sVar.b;
        gVar.b = pVar4;
        if (((p) gVar.f) == null) {
            pVar4.d = gVar;
        }
    }

    @Override // ef.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
