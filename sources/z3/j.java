package z3;

import java.util.List;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int G() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.G();
    }

    @Override // z3.d
    public final int c(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.c(j3 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long m(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.m(i10) + this.b;
    }

    @Override // z3.d
    public final List z(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.z(j3 - this.b);
    }
}
