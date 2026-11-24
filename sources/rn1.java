// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rn1(int i, int i2, String str, boolean z) {
        this.e = str;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                mu1Var.getMessagesController().Z(mu1Var.l6, hc2.T(mu1Var.e) ? mu1Var.l6 : 0L, this.b, this.d, this.c, new vm1(mu1Var, (byte) 23));
                break;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                final int i2 = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: wp7
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gl.c3(new v11(tLObject, i, z, i2, str));
                    }
                });
                break;
        }
    }

    public /* synthetic */ rn1(mu1 mu1Var, int i, int i2, boolean z) {
        this.e = mu1Var;
        this.b = i;
        this.d = i2;
        this.c = z;
    }
}
