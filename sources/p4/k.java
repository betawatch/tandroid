package p4;

import j3.t0;
import java.util.ArrayList;
import java.util.List;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends m implements o4.i {
    public final n n;

    public k(t0 t0Var, z zVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // o4.i
    public final long F(long j10) {
        return this.n.d(j10);
    }

    @Override // o4.i
    public final long H(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // p4.m
    public final String a() {
        return null;
    }

    @Override // o4.i
    public final long b(long j10) {
        return this.n.g(j10);
    }

    @Override // p4.m
    public final j d() {
        return null;
    }

    @Override // o4.i
    public final long g(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // o4.i
    public final long n(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // o4.i
    public final long o(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // o4.i
    public final j p(long j10) {
        return this.n.h(this, j10);
    }

    @Override // o4.i
    public final long r(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // o4.i
    public final boolean y() {
        return this.n.i();
    }

    @Override // o4.i
    public final long z() {
        return this.n.d;
    }

    @Override // p4.m
    public final o4.i c() {
        return this;
    }
}
