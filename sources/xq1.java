// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xq1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yq1 b;

    public /* synthetic */ xq1(yq1 yq1Var, byte b) {
        this.a = b;
        this.b = yq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yq1 yq1Var = this.b;
        switch (b) {
            case 0:
                yq1Var.W = null;
                zu1 zu1Var = yq1Var.X;
                if (zu1Var.ea != -1) {
                    zu1Var.getNotificationCenter().j(zu1Var.ea);
                    zu1Var.ea = -1;
                }
                if (f11.a) {
                    cc4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
            default:
                yq1Var.W = null;
                zu1 zu1Var2 = yq1Var.X;
                if (zu1Var2.ea != -1) {
                    zu1Var2.getNotificationCenter().j(zu1Var2.ea);
                    zu1Var2.ea = -1;
                }
                if (f11.a) {
                    cc4.b("chatItemAnimator enable notifications");
                    break;
                }
                break;
        }
    }
}
