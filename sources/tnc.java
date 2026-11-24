// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tnc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ p8c c;
    public final /* synthetic */ String d;

    public /* synthetic */ tnc(WalletEngine2 walletEngine2, p8c p8cVar, String str) {
        this.b = walletEngine2;
        this.c = p8cVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        p8c p8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, p8cVar);
                break;
            default:
                walletEngine2.lambda$previewSignMessage$10(p8cVar, str);
                break;
        }
    }

    public /* synthetic */ tnc(WalletEngine2 walletEngine2, String str, p8c p8cVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = p8cVar;
    }
}
