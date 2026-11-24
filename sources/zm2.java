// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en2 b;

    public /* synthetic */ zm2(en2 en2Var, byte b) {
        this.a = b;
        this.b = en2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                en2Var.a0();
                break;
            default:
                kk7 notificationCenter = en2Var.getNotificationCenter();
                int i = na7.q5;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
