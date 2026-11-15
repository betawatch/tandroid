package p2;

import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k extends m implements o2.i {
    public final n n;

    public k(u uVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // o2.i
    public final long D(long j3, long j10) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.i;
    }

    @Override // o2.i
    public final j E(long j3) {
        return this.n.h(this, j3);
    }

    @Override // o2.i
    public final long L(long j3, long j10) {
        return this.n.f(j3, j10);
    }

    @Override // p2.m
    public final String a() {
        return null;
    }

    @Override // o2.i
    public final long b(long j3) {
        return this.n.g(j3);
    }

    @Override // p2.m
    public final j d() {
        return null;
    }

    @Override // o2.i
    public final boolean g0() {
        return this.n.i();
    }

    @Override // o2.i
    public final long i(long j3, long j10) {
        return this.n.e(j3, j10);
    }

    @Override // o2.i
    public final long k0() {
        return this.n.d;
    }

    @Override // o2.i
    public final long t0(long j3) {
        return this.n.d(j3);
    }

    @Override // o2.i
    public final long v0(long j3, long j10) {
        return this.n.b(j3, j10);
    }

    @Override // o2.i
    public final long y(long j3, long j10) {
        return this.n.c(j3, j10);
    }

    @Override // p2.m
    public final o2.i c() {
        return this;
    }
}
