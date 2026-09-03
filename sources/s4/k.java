package s4;

import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k extends m implements r4.h {
    public final n n;

    public k(n0 n0Var, v vVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, nVar, arrayList, list, list2);
        this.n = nVar;
    }

    @Override // r4.h
    public final boolean A() {
        return this.n.i();
    }

    @Override // r4.h
    public final long C() {
        return this.n.d;
    }

    @Override // r4.h
    public final long F(long j10) {
        return this.n.d(j10);
    }

    @Override // r4.h
    public final long I(long j10, long j11) {
        return this.n.b(j10, j11);
    }

    @Override // r4.h
    public final long a(long j10) {
        return this.n.g(j10);
    }

    @Override // s4.m
    public final String b() {
        return null;
    }

    @Override // s4.m
    public final j d() {
        return null;
    }

    @Override // r4.h
    public final long h(long j10, long j11) {
        return this.n.e(j10, j11);
    }

    @Override // r4.h
    public final long m(long j10, long j11) {
        return this.n.c(j10, j11);
    }

    @Override // r4.h
    public final long n(long j10, long j11) {
        n nVar = this.n;
        if (nVar.f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.i;
    }

    @Override // r4.h
    public final j p(long j10) {
        return this.n.h(this, j10);
    }

    @Override // r4.h
    public final long t(long j10, long j11) {
        return this.n.f(j10, j11);
    }

    @Override // s4.m
    public final r4.h c() {
        return this;
    }
}
