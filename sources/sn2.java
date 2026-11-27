// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sn2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn2 b;

    public /* synthetic */ sn2(xn2 xn2Var, byte b) {
        this.a = b;
        this.b = xn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xn2 xn2Var = this.b;
        switch (b) {
            case 0:
                xn2Var.a0();
                break;
            default:
                jn7 notificationCenter = xn2Var.getNotificationCenter();
                int i = uc7.s5;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
