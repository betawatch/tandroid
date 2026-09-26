package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class o implements i {
    public final long a = t.b.getAndIncrement();
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
            kVar.a.open(kVar.b);
            kVar.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.n2(uri, kVar);
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

    @Override // y2.i
    public final void D() {
    }
}
