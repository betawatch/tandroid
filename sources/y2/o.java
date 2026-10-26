package y2;

import android.net.Uri;
import e2.n0;
import g2.b0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o implements i {
    public final long a = u.g.getAndIncrement();
    public final g2.m b;
    public final int c;
    public final b0 d;
    public final n e;
    public volatile Object f;

    public o(g2.h hVar, g2.m mVar, int i10, n nVar) {
        this.d = new b0(hVar);
        this.b = mVar;
        this.c = i10;
        this.e = nVar;
    }

    @Override // y2.i
    public final void b() {
        this.d.b = 0L;
        g2.k kVar = new g2.k(this.d, this.b);
        try {
            kVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.S1(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = n0.a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // y2.i
    public final void f0() {
    }
}
