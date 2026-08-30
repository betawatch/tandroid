package r4;

import android.net.Uri;
import b4.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import java.io.IOException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d implements h0 {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    @Override // g5.h0
    public void A(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.a;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.n(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.M = ((Long) p0Var.f).longValue() - j10;
        gVar.u(true);
    }

    public void a() {
        long j10;
        g gVar = this.a;
        synchronized (h5.a.i) {
            try {
                j10 = h5.a.j ? h5.a.k : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.M = j10;
        gVar.u(true);
    }

    @Override // g5.h0
    public c4.e m(j0 j0Var, IOException iOException, int i10) {
        p0 p0Var = (p0) j0Var;
        g gVar = this.a;
        e0 e0Var = gVar.r;
        long j10 = p0Var.a;
        Uri uri = p0Var.d.c;
        e0Var.r(new o4.j(), p0Var.c, iOException, true);
        gVar.n.getClass();
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    @Override // g5.h0
    public void s(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        g gVar = this.a;
        gVar.n.getClass();
        gVar.r.l(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
