package ye;

import bf.o;
import bf.p;
import bf.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l extends df.a {
    public final o a = new o();
    public final int b;
    public boolean c;

    public l(int i10) {
        this.b = i10;
    }

    @Override // df.a
    public final boolean b(bf.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // df.a
    public final bf.a e() {
        return this.a;
    }

    @Override // df.a
    public final boolean f() {
        return true;
    }

    @Override // df.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            if (((p) this.a.c) == null) {
                return null;
            }
            bf.a e7 = dVar.h().e();
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
