package v4;

import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class k extends n3.j implements f {
    public f e;
    public long f;

    @Override // v4.f
    public final int b(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.b(j10 - this.f);
    }

    @Override // n3.a
    public final void c() {
        this.b = 0;
        this.e = null;
    }

    @Override // v4.f
    public final long g(int i10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.g(i10) + this.f;
    }

    public final void k(long j10, f fVar, long j11) {
        this.c = j10;
        this.e = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f = j10;
    }

    @Override // v4.f
    public final List m(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.m(j10 - this.f);
    }

    @Override // v4.f
    public final int p() {
        f fVar = this.e;
        fVar.getClass();
        return fVar.p();
    }
}
