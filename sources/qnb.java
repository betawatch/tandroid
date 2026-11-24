// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qnb implements ip9 {
    public final ip9 a;
    public final long b;

    public qnb(ip9 ip9Var, long j) {
        this.a = ip9Var;
        this.b = j;
    }

    @Override // ip9
    public final int a() {
        return this.a.a();
    }

    @Override // ip9
    public final void b() {
        this.a.b();
    }

    @Override // ip9
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        int h = this.a.h(sk4Var, z83Var, i);
        if (h == -4) {
            z83Var.e += this.b;
        }
        return h;
    }

    @Override // ip9
    public final boolean j() {
        return this.a.j();
    }

    @Override // ip9
    public final int n(long j) {
        return this.a.n(j - this.b);
    }
}
