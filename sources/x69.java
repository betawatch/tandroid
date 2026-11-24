// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x69 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y69 b;

    public /* synthetic */ x69(y69 y69Var, byte b) {
        this.a = b;
        this.b = y69Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y69 y69Var = this.b;
        switch (b) {
            case 0:
                a79 a79Var = y69Var.b.d;
                if (a79Var != null) {
                    a79Var.postRunnable(a79Var.x);
                    break;
                }
                break;
            case 1:
                a79 a79Var2 = y69Var.b.d;
                if (a79Var2 != null) {
                    a79Var2.postRunnable(a79Var2.x);
                    break;
                }
                break;
            default:
                c79 c79Var = y69Var.b;
                a79 a79Var3 = c79Var.d;
                a79Var3.getClass();
                a79Var3.postRunnable(new z69(a79Var3, (byte) 2));
                c79Var.d = null;
                break;
        }
    }
}
