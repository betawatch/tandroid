// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ wl1(zu1 zu1Var, long j, long j2, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.V9(j2, j);
                break;
            default:
                zu1Var.t9(j2, j);
                break;
        }
    }
}
