package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p implements j {
    public final long a = t.b.getAndIncrement();
    public final g2.m b;
    public final int c;
    public final b0 d;
    public final o e;
    public volatile Object f;

    public p(g2.h hVar, g2.m mVar, int i10, o oVar) {
        this.d = new b0(hVar);
        this.b = mVar;
        this.c = i10;
        this.e = oVar;
    }

    @Override // y2.j
    public final void a() {
        this.d.b = 0L;
        g2.k kVar = new g2.k(this.d, this.b);
        try {
            kVar.a.open(kVar.b);
            kVar.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.f2(uri, kVar);
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

    @Override // y2.j
    public final void W() {
    }
}
