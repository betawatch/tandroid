package se;

import ve.o;
import ve.q;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l extends xe.a {
    public final o a = new o();
    public final int b;
    public boolean c;

    public l(int i10) {
        this.b = i10;
    }

    @Override // xe.a
    public final boolean b(ve.a aVar) {
        if (!this.c) {
            return true;
        }
        return true;
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final boolean f() {
        return true;
    }

    @Override // xe.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            if (((df.c) this.a.c) == null) {
                return null;
            }
            ve.a e = dVar.h().e();
            this.c = (e instanceof q) || (e instanceof o);
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
