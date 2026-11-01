package se;

import ve.o;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class k extends xe.a {
    public final ve.n a;
    public boolean b;
    public int c;

    public k(ve.n nVar) {
        this.a = nVar;
    }

    @Override // xe.a
    public final boolean b(ve.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return q3.h.a(dVar.b);
    }
}
