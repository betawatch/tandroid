package ze;

import cf.o;
import cf.p;
import cf.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l extends ef.a {
    public final o a = new o();
    public final int b;
    public boolean c;

    public l(int i10) {
        this.b = i10;
    }

    @Override // ef.a
    public final boolean b(cf.a aVar) {
        if (!this.c) {
            return true;
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
            if (((p) this.a.c) == null) {
                return null;
            }
            cf.a e7 = dVar.h().e();
            this.c = (e7 instanceof r) || (e7 instanceof o);
            return q3.h.a(dVar.e);
        }
        int i10 = dVar.g;
        int i11 = this.b;
        if (i10 >= i11) {
            return new q3.h(-1, dVar.c + i11, false);
        }
        return null;
    }
}
