// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
