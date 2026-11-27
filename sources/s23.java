// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class s23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ s23(v23 v23Var, Throwable th, byte b) {
        this.a = b;
        this.b = v23Var;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Throwable th = this.c;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(new s13(new i1((byte) 26), th.getMessage()));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    h23Var2.B(new v03(th.getMessage(), (byte) 2));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
        }
    }
}
