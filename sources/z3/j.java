package z3;

import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int c(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.c(j10 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long e(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(i10) + this.b;
    }

    @Override // z3.d
    public final List g(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(j10 - this.b);
    }

    @Override // z3.d
    public final int k() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k();
    }
}
