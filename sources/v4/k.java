package v4;

import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class k extends n3.j implements f {
    public f e;
    public long f;

    @Override // n3.a
    public final void b() {
        this.b = 0;
        this.e = null;
    }

    @Override // v4.f
    public final int e(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.e(j10 - this.f);
    }

    @Override // v4.f
    public final long h(int i10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.h(i10) + this.f;
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
    public final List q(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.q(j10 - this.f);
    }

    @Override // v4.f
    public final int r() {
        f fVar = this.e;
        fVar.getClass();
        return fVar.r();
    }
}
