package z3;

import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int a(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.a(j3 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long d(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(i10) + this.b;
    }

    @Override // z3.d
    public final List f(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.f(j3 - this.b);
    }

    @Override // z3.d
    public final int g() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g();
    }
}
