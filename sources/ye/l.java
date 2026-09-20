package ye;

import bf.o;
import bf.p;
import bf.r;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
            bf.a e = dVar.h().e();
            this.c = (e instanceof r) || (e instanceof o);
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
