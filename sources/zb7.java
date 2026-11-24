// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ zb7(ad7 ad7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                kk7 notificationCenter = ad7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                break;
            default:
                kk7 notificationCenter2 = ad7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
