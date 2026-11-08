package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j3 implements ls {
    public final int a;
    public final v9 b;
    public final b3 c;
    public f3 d;
    public boolean e;

    public j3(int i7, long j3) {
        this.a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.b = v9Var;
        v9Var.p = j3;
        b3 b3Var = new b3(i7, j3, new xg.a(this, 5));
        b3Var.s = true;
        this.c = b3Var;
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
        f3 f3Var;
        if (i7 == qs.G3 && objArr[1] == this.b && (f3Var = this.d) != null) {
            f3Var.run();
        }
    }
}
