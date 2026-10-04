package z3;

import java.util.List;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public abstract class k extends h2.j implements d {
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
