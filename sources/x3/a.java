package x3;

import f5.d0;
import o3.s;
import o3.t;
import o3.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements t {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // o3.t
    public final boolean c() {
        return true;
    }

    @Override // o3.t
    public final s g(long j10) {
        b bVar = this.a;
        long j11 = bVar.b;
        long j12 = bVar.c;
        u uVar = new u(j10, d0.i(((((j12 - j11) * ((bVar.d.i * j10) / 1000000)) / bVar.f) + j11) - 30000, j11, j12 - 1));
        return new s(uVar, uVar);
    }

    @Override // o3.t
    public final long h() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
