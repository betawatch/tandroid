package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q implements k {
    public final long a = u.b.getAndIncrement();
    public final g2.m b;
    public final int c;
    public final b0 d;
    public final p e;
    public volatile Object f;

    public q(g2.h hVar, g2.m mVar, int i10, p pVar) {
        this.d = new b0(hVar);
        this.b = mVar;
        this.c = i10;
        this.e = pVar;
    }

    @Override // y2.k
    public final void a() {
        this.d.b = 0L;
        g2.k kVar = new g2.k(this.d, this.b);
        try {
            kVar.a.open(kVar.b);
            kVar.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.l2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = d0.a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // y2.k
    public final void k() {
    }
}
