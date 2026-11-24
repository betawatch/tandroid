// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w69 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c79 b;

    public /* synthetic */ w69(c79 c79Var, byte b) {
        this.a = b;
        this.b = c79Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c79 c79Var = this.b;
        switch (b) {
            case 0:
                b79 b79Var = c79Var.a;
                if (b79Var != null) {
                    b79Var.r();
                    break;
                }
                break;
            case 1:
                c79Var.c.a(c79Var.r);
                a79 a79Var = c79Var.d;
                a79Var.getClass();
                a79Var.postRunnable(new z69(a79Var, (byte) 2));
                c79Var.d = null;
                break;
            default:
                c79Var.c.q(c79Var.y);
                break;
        }
    }
}
