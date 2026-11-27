// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
