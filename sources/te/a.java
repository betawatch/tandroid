package te;

import df.c;
import se.b;
import ve.g;
import ve.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements ye.a {
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

    @Override // ye.a
    public final int a(b bVar, b bVar2) {
        if (bVar.d || bVar2.c) {
            int i10 = bVar2.h;
            if (i10 % 3 != 0 && (bVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (bVar.g < 2 || bVar2.g < 2) ? 1 : 2;
    }

    @Override // ye.a
    public final char b() {
        return this.a;
    }

    @Override // ye.a
    public final void c(r rVar, r rVar2, int i10) {
        String.valueOf(this.a);
        g gVar = i10 == 1 ? new g(0) : new g(3);
        c cVar = (c) rVar.f;
        while (cVar != null && cVar != rVar2) {
            c cVar2 = (c) cVar.f;
            gVar.b(cVar);
            cVar = cVar2;
        }
        gVar.g();
        c cVar3 = (c) rVar.f;
        gVar.f = cVar3;
        if (cVar3 != null) {
            cVar3.e = gVar;
        }
        gVar.e = rVar;
        rVar.f = gVar;
        c cVar4 = (c) rVar.b;
        gVar.b = cVar4;
        if (((c) gVar.f) == null) {
            cVar4.d = gVar;
        }
    }

    @Override // ye.a
    public final int d() {
        return 1;
    }

    @Override // ye.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
