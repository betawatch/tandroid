// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xe7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye7 b;

    public /* synthetic */ xe7(ye7 ye7Var, byte b) {
        this.a = b;
        this.b = ye7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ye7 ye7Var = this.b;
        switch (b) {
            case 0:
                ye7Var.x();
                break;
            default:
                ye7Var.m(true);
                break;
        }
    }
}
