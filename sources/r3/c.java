package r3;

import m3.s;
import m3.t;
import m3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements t {
    public final /* synthetic */ t a;
    public final /* synthetic */ f2.d b;

    public c(f2.d dVar, t tVar) {
        this.b = dVar;
        this.a = tVar;
    }

    @Override // m3.t
    public final boolean e() {
        return this.a.e();
    }

    @Override // m3.t
    public final s h(long j10) {
        s h = this.a.h(j10);
        u uVar = h.a;
        long j11 = uVar.a;
        long j12 = uVar.b;
        long j13 = this.b.b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = h.b;
        return new s(uVar2, new u(uVar3.a, uVar3.b + j13));
    }

    @Override // m3.t
    public final long i() {
        return this.a.i();
    }
}
