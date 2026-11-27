// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sb9 extends ub9 implements j63 {
    public final iz9 f;

    public sb9(ko4 ko4Var, po5 po5Var, iz9 iz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ko4Var, po5Var, iz9Var, arrayList, arrayList2, arrayList3);
        this.f = iz9Var;
    }

    @Override // j63
    public final long I(long j, long j2) {
        return this.f.g(j, j2);
    }

    @Override // j63
    public final boolean R() {
        return this.f.j();
    }

    @Override // j63
    public final long V() {
        return this.f.d;
    }

    @Override // j63
    public final long Y(long j) {
        return this.f.e(j);
    }

    @Override // j63
    public final long a0(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // j63
    public final long f(long j) {
        return this.f.h(j);
    }

    @Override // j63
    public final long j(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // j63
    public final long r(long j, long j2) {
        return this.f.d(j, j2);
    }

    @Override // j63
    public final long v(long j, long j2) {
        iz9 iz9Var = this.f;
        if (iz9Var.f != null) {
            return -9223372036854775807L;
        }
        long c = iz9Var.c(j, j2) + iz9Var.d(j, j2);
        return (iz9Var.f(c, j) + iz9Var.h(c)) - iz9Var.i;
    }

    @Override // j63
    public final n29 z(long j) {
        return this.f.i(this, j);
    }

    @Override // ub9
    public final j63 b() {
        return this;
    }
}
