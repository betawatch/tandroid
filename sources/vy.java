// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz b;

    public /* synthetic */ vy(fz fzVar, byte b) {
        this.a = b;
        this.b = fzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fz fzVar = this.b;
        switch (b) {
            case 0:
                fzVar.onBackPressed();
                break;
            default:
                fzVar.b1();
                break;
        }
    }
}
