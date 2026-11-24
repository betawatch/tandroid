// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;
    public final /* synthetic */ vh5 c;

    public /* synthetic */ v32(c42 c42Var, vh5 vh5Var, byte b) {
        this.a = b;
        this.b = c42Var;
        this.c = vh5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vh5 vh5Var = this.c;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((gl2) vh5Var).G();
                } catch (Exception unused) {
                }
                gl.c3(new v32(c42Var, vh5Var, (byte) 1));
                break;
            default:
                c42Var.U(vh5Var);
                break;
        }
    }
}
