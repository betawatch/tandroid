package ye;

import bf.o;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class k extends df.a {
    public final bf.n a;
    public boolean b;
    public int c;

    public k(bf.n nVar) {
        this.a = nVar;
    }

    @Override // df.a
    public final boolean b(bf.a aVar) {
        if (!(aVar instanceof o)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
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
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return q3.h.a(dVar.b);
    }
}
