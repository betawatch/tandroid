package y2;

import android.net.Uri;
import e2.m0;
import g2.b0;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o implements i {
    public final long a = t.g.getAndIncrement();
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
    public final void a() {
        this.d.b = 0L;
        g2.k kVar = new g2.k(this.d, this.b);
        try {
            kVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.d2(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // y2.i
    public final void O() {
    }
}
