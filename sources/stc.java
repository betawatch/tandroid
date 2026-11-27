// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class stc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ euc b;

    public /* synthetic */ stc(euc eucVar, byte b) {
        this.a = b;
        this.b = eucVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        euc eucVar = this.b;
        switch (b) {
            case 0:
                eucVar.q0((String) obj);
                break;
            case 1:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                eucVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
