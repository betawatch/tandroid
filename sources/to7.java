// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class to7 implements b16, ka1 {
    public final w06 a;
    public final yn4 b;
    public uo7 c;
    public final /* synthetic */ vo7 d;

    public to7(vo7 vo7Var, w06 w06Var, yn4 yn4Var) {
        yn4Var.getClass();
        this.d = vo7Var;
        this.a = w06Var;
        this.b = yn4Var;
        w06Var.a(this);
    }

    @Override // b16
    public final void b(e16 e16Var, u06 u06Var) {
        if (u06Var == u06.ON_START) {
            vo7 vo7Var = this.d;
            ks ksVar = vo7Var.b;
            yn4 yn4Var = this.b;
            ksVar.addLast(yn4Var);
            uo7 uo7Var = new uo7(vo7Var, yn4Var);
            yn4Var.b.add(uo7Var);
            vo7Var.c();
            yn4Var.c = new qz2(0, vo7Var, vo7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 4);
            this.c = uo7Var;
            return;
        }
        if (u06Var != u06.ON_STOP) {
            if (u06Var == u06.ON_DESTROY) {
                cancel();
            }
        } else {
            uo7 uo7Var2 = this.c;
            if (uo7Var2 != null) {
                uo7Var2.cancel();
            }
        }
    }

    @Override // ka1
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        uo7 uo7Var = this.c;
        if (uo7Var != null) {
            uo7Var.cancel();
        }
        this.c = null;
    }
}
