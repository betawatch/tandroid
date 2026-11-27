// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class u23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ w03 c;

    public /* synthetic */ u23(v23 v23Var, w03 w03Var, byte b) {
        this.a = b;
        this.b = v23Var;
        this.c = w03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w03 w03Var = this.c;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(w03Var);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            case 1:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    h23Var2.B(w03Var);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var3 = v23Var.f;
                if (h23Var3 != null) {
                    h23Var3.B(w03Var);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
        }
    }
}
