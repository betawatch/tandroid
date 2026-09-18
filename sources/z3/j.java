package z3;

import java.util.List;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int A() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.A();
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final int d(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j3 - this.b);
    }

    @Override // z3.d
    public final long g(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(i10) + this.b;
    }

    @Override // z3.d
    public final List l(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.l(j3 - this.b);
    }
}
