// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it3 b;

    public /* synthetic */ r62(it3 it3Var, byte b) {
        this.a = b;
        this.b = it3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        it3 it3Var = this.b;
        switch (b) {
            case 0:
                ht3 ht3Var = it3Var.d;
                ht3Var.requestFocus();
                gl.E3(ht3Var);
                break;
            default:
                gl.t1(it3Var.d);
                break;
        }
    }
}
