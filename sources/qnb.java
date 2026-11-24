// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
