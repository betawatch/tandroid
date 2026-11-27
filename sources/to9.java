// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jp9 b;
    public final /* synthetic */ fp9 c;

    public /* synthetic */ to9(jp9 jp9Var, fp9 fp9Var, Exception exc) {
        this.a = (byte) 2;
        this.b = jp9Var;
        this.c = fp9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jp9 jp9Var = this.b;
                fp9 fp9Var = this.c;
                ((hkb) jp9Var.e).c(fp9Var.a);
                return;
            case 1:
                jp9 jp9Var2 = this.b;
                fp9 fp9Var2 = this.c;
                ((hkb) jp9Var2.e).c(fp9Var2.a);
                return;
            default:
                jp9 jp9Var3 = this.b;
                fp9 fp9Var3 = this.c;
                gp9 gp9Var = jp9Var3.e;
                long j = fp9Var3.a;
                hkb hkbVar = (hkb) gp9Var;
                synchronized (hkbVar) {
                    hkbVar.c(j);
                }
                return;
        }
    }

    public /* synthetic */ to9(jp9 jp9Var, fp9 fp9Var, int i, byte b) {
        this.a = b;
        this.b = jp9Var;
        this.c = fp9Var;
    }
}
