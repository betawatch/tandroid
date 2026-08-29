package t4;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class k extends m3.k implements f {
    public f a;
    public long b;

    public final void a(long j10, f fVar, long j11) {
        this.timeUs = j10;
        this.a = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.b = j10;
    }

    @Override // m3.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // t4.f
    public final int e(long j10) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.e(j10 - this.b);
    }

    @Override // t4.f
    public final long m(int i10) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.m(i10) + this.b;
    }

    @Override // t4.f
    public final List q(long j10) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.q(j10 - this.b);
    }

    @Override // t4.f
    public final int v() {
        f fVar = this.a;
        fVar.getClass();
        return fVar.v();
    }
}
