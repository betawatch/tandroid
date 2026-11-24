// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class u37 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j47 b;

    public /* synthetic */ u37(j47 j47Var, byte b) {
        this.a = b;
        this.b = j47Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                j47Var.l();
                break;
            case 1:
                j47Var.getClass();
                pla.f(false);
                pla plaVar = j47Var.i0;
                if (plaVar != null) {
                    plaVar.b(j47Var.F);
                }
                gl.c3(new u37(j47Var, b2));
                break;
            case 2:
                pla.f(false);
                pla plaVar2 = j47Var.i0;
                if (plaVar2 != null) {
                    plaVar2.b(j47Var.F);
                }
                gl.c3(new u37(j47Var, (byte) 3));
                break;
            default:
                j47Var.k();
                break;
        }
    }
}
