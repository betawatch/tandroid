package ph;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import rh.v5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p3 implements vs {
    public final int a;
    public final v5 b;
    public final h3 c;
    public l3 d;
    public boolean e;

    public p3(int i10, long j10) {
        this.a = i10;
        v5 v5Var = new v5(i10, 0L, false);
        this.b = v5Var;
        v5Var.p = j10;
        h3 h3Var = new h3(i10, j10, new h1(this, 2));
        h3Var.s = true;
        this.c = h3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        at.f(this.a).c(this, at.G3);
        this.b.b();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            at.f(this.a).n(this, at.G3);
            this.b.f();
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l3 l3Var;
        if (i10 == at.G3 && objArr[1] == this.b && (l3Var = this.d) != null) {
            l3Var.run();
        }
    }
}
