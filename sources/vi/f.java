package vi;

import android.os.SystemClock;
import android.support.v4.media.session.a0;
import b8.gg;
import b8.kg;
import b8.lb;
import b8.me;
import b8.nb;
import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f implements gg {
    public final long a;
    public final Object b;
    public final Object c;

    public /* synthetic */ f(xb.d dVar, nb nbVar, long j10) {
        this.b = dVar;
        this.c = nbVar;
        this.a = j10;
    }

    @Override // b8.gg
    public kg zza() {
        xb.d dVar = (xb.d) this.b;
        nb nbVar = (nb) this.c;
        fa.f fVar = new fa.f(1);
        fVar.d = lb.b;
        a0 a0Var = new a0(10, false);
        a0Var.d = dVar.e.a();
        a0Var.b = nbVar;
        a0Var.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        fVar.f = new me(a0Var);
        return new kg(fVar, 0);
    }

    public f(File file, long j10, byte[] bArr) {
        this.b = file;
        this.a = j10;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public f(long j10, i iVar, j jVar) {
        this.c = jVar;
        this.a = j10;
        this.b = iVar;
    }
}
