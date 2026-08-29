package t3;

import o3.s;
import o3.t;
import o3.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements t {
    public final /* synthetic */ t a;
    public final /* synthetic */ f2.c b;

    public c(f2.c cVar, t tVar) {
        this.b = cVar;
        this.a = tVar;
    }

    @Override // o3.t
    public final boolean c() {
        return this.a.c();
    }

    @Override // o3.t
    public final s g(long j10) {
        s g10 = this.a.g(j10);
        u uVar = g10.a;
        long j11 = uVar.a;
        long j12 = uVar.b;
        long j13 = this.b.b;
        u uVar2 = new u(j11, j12 + j13);
        u uVar3 = g10.b;
        return new s(uVar2, new u(uVar3.a, uVar3.b + j13));
    }

    @Override // o3.t
    public final long h() {
        return this.a.h();
    }
}
