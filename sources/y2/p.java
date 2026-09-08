package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
