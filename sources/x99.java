// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x99 implements gk7 {
    public final int a;
    public final xsa b;
    public final q99 c;
    public u99 d;
    public boolean e;

    public x99(int i, long j) {
        this.a = i;
        xsa xsaVar = new xsa(i, 0L, false);
        this.b = xsaVar;
        xsaVar.p = j;
        q99 q99Var = new q99(i, j, new zf7(this, (byte) 28));
        q99Var.x = true;
        this.c = q99Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        kk7.f(this.a).b(this, kk7.H3);
        this.b.a();
        this.c.l(false);
        this.e = true;
    }

    public final void b() {
        if (this.e) {
            kk7.f(this.a).n(this, kk7.H3);
            this.b.f();
            this.c.i();
            this.e = false;
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        u99 u99Var;
        if (i == kk7.H3 && objArr[1] == this.b && (u99Var = this.d) != null) {
            u99Var.run();
        }
    }
}
