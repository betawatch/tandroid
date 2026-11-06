package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k3 implements ls {
    public final int a;
    public final v9 b;
    public final d3 c;
    public h3 d;
    public boolean e;

    public k3(int i7, long j3) {
        this.a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.b = v9Var;
        v9Var.p = j3;
        d3 d3Var = new d3(i7, j3, new xg.a(this, 5));
        d3Var.s = true;
        this.c = d3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        qs.f(this.a).c(this, qs.G3);
        this.b.a();
        this.c.g(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            qs.f(this.a).n(this, qs.G3);
            this.b.f();
            this.c.f();
            this.e = false;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h3 h3Var;
        if (i7 == qs.G3 && objArr[1] == this.b && (h3Var = this.d) != null) {
            h3Var.run();
        }
    }
}
