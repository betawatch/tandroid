package ze;

import cf.o;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k extends ef.a {
    public final cf.n a;
    public boolean b;
    public int c;

    public k(cf.n nVar) {
        this.a = nVar;
    }

    @Override // ef.a
    public final boolean b(cf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // ef.a
    public final cf.a e() {
        return this.a;
    }

    @Override // ef.a
    public final boolean f() {
        return true;
    }

    @Override // ef.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return q3.h.a(dVar.b);
    }
}
