// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq5 b;
    public final /* synthetic */ j18 c;

    public /* synthetic */ zp5(bq5 bq5Var, j18 j18Var, byte b) {
        this.a = b;
        this.b = bq5Var;
        this.c = j18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j18 j18Var = this.c;
        bq5 bq5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new zp5(bq5Var, j18Var, (byte) 1));
                break;
            default:
                bq5Var.i = j18Var.a;
                break;
        }
    }
}
