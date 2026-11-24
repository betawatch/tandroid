// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class spc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ jac c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ spc(WalletEngine2 walletEngine2, jac jacVar, TL_wallet.walletTransaction wallettransaction, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = jacVar;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.walletTransaction wallettransaction = this.d;
        jac jacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$32(jacVar, wallettransaction, str);
                break;
            default:
                walletEngine2.lambda$previewTonConnect$1(jacVar, wallettransaction, str);
                break;
        }
    }
}
