package z3;

import java.util.List;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final int d(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j10 - this.b);
    }

    @Override // z3.d
    public final long k(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k(i10) + this.b;
    }

    @Override // z3.d
    public final List s(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.s(j10 - this.b);
    }

    @Override // z3.d
    public final int u() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.u();
    }
}
