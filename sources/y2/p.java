package y2;

import android.net.Uri;
import e2.d0;
import g2.b0;
import java.io.IOException;
import u2.t;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
