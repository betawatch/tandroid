package v3;

import d5.g0;
import m3.s;
import m3.t;
import m3.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements t {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        b bVar = this.a;
        long j11 = bVar.b;
        long j12 = bVar.c;
        u uVar = new u(j10, g0.i(((((j12 - j11) * ((bVar.d.i * j10) / 1000000)) / bVar.f) + j11) - 30000, j11, j12 - 1));
        return new s(uVar, uVar);
    }

    @Override // m3.t
    public final long i() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
