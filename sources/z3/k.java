package z3;

import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class k extends h2.j implements e {
    public e a;
    public long b;

    @Override // z3.e
    public final int A() {
        e eVar = this.a;
        eVar.getClass();
        return eVar.A();
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.e
    public final int d(long j3) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.d(j3 - this.b);
    }

    @Override // z3.e
    public final long g(int i10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.g(i10) + this.b;
    }

    @Override // z3.e
    public final List l(long j3) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.l(j3 - this.b);
    }
}
