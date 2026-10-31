package ph;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import rh.v5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 implements us {
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
        zs.f(this.a).c(this, zs.G3);
        this.b.b();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            zs.f(this.a).n(this, zs.G3);
            this.b.f();
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l3 l3Var;
        if (i10 == zs.G3 && objArr[1] == this.b && (l3Var = this.d) != null) {
            l3Var.run();
        }
    }
}
