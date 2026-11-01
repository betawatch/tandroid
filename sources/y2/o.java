package y2;

import android.net.Uri;
import e2.l0;
import g2.c0;
import java.io.IOException;
import u2.u;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o implements i {
    public final long a = u.g.getAndIncrement();
    public final g2.n b;
    public final int c;
    public final c0 d;
    public final n e;
    public volatile Object f;

    public o(g2.h hVar, g2.n nVar, int i10, n nVar2) {
        this.d = new c0(hVar);
        this.b = nVar;
        this.c = i10;
        this.e = nVar2;
    }

    @Override // y2.i
    public final void b() {
        this.d.b = 0L;
        g2.l lVar = new g2.l(this.d, this.b);
        try {
            lVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.g1(uri, lVar);
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.a;
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // y2.i
    public final void R1() {
    }
}
