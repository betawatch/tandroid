// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class q54 implements x56, kx6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q54(int i, nc8 nc8Var, nc8 nc8Var2) {
        this.a = i;
        this.b = nc8Var;
        this.c = nc8Var2;
    }

    @Override // kx6
    public final void a(su6 su6Var, int i) {
        ((ox6) this.b).S(su6Var, i, this.a, (lx6) this.c);
    }

    @Override // x56
    public final void invoke(Object obj) {
        nc8 nc8Var = (nc8) this.b;
        nc8 nc8Var2 = (nc8) this.c;
        mc8 mc8Var = (mc8) obj;
        byte b = this.a;
        mc8Var.f(b);
        mc8Var.A(b, nc8Var, nc8Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q54(ox6 ox6Var, int i, lx6 lx6Var) {
        this.b = ox6Var;
        this.a = i;
        this.c = lx6Var;
    }
}
