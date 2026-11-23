package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k extends m implements o2.i {
    public final n n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // o2.i
    public final long a(long j3) {
        return this.n.g(j3);
    }

    @Override // p2.m
    public final String b() {
        return null;
    }

    @Override // o2.i
    public final long c(long j3, long j10) {
        return this.n.e(j3, j10);
    }

    @Override // o2.i
    public final long e(long j3, long j10) {
        return this.n.c(j3, j10);
    }

    @Override // o2.i
    public final long f(long j3, long j10) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.i;
    }

    @Override // o2.i
    public final j g(long j3) {
        return this.n.h(this, j3);
    }

    @Override // p2.m
    public final j h() {
        return null;
    }

    @Override // o2.i
    public final long n(long j3, long j10) {
        return this.n.f(j3, j10);
    }

    @Override // o2.i
    public final boolean r() {
        return this.n.i();
    }

    @Override // o2.i
    public final long s() {
        return this.n.d;
    }

    @Override // o2.i
    public final long x(long j3) {
        return this.n.d(j3);
    }

    @Override // o2.i
    public final long z(long j3, long j10) {
        return this.n.b(j3, j10);
    }

    @Override // p2.m
    public final o2.i d() {
        return this;
    }
}
