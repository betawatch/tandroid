// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                int i = uc7.r5;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
