package v4;

import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final int d(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.d(j10 - this.f);
    }

    public final void j(long j10, f fVar, long j11) {
        this.c = j10;
        this.e = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f = j10;
    }

    @Override // v4.f
    public final long l(int i10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.l(i10) + this.f;
    }

    @Override // v4.f
    public final List q(long j10) {
        f fVar = this.e;
        fVar.getClass();
        return fVar.q(j10 - this.f);
    }

    @Override // v4.f
    public final int x() {
        f fVar = this.e;
        fVar.getClass();
        return fVar.x();
    }
}
