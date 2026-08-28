package r4;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k extends k3.k implements f {
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

    @Override // r4.f
    public final int b(long j10) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.b(j10 - this.b);
    }

    @Override // k3.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // r4.f
    public final long h(int i9) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.h(i9) + this.b;
    }

    @Override // r4.f
    public final List m(long j10) {
        f fVar = this.a;
        fVar.getClass();
        return fVar.m(j10 - this.b);
    }

    @Override // r4.f
    public final int r() {
        f fVar = this.a;
        fVar.getClass();
        return fVar.r();
    }
}
