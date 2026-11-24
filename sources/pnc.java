// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ i8c c;

    public /* synthetic */ pnc(WalletEngine2 walletEngine2, i8c i8cVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = i8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(i8cVar);
                break;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(i8cVar);
                break;
            default:
                walletEngine2.lambda$balance$17(i8cVar);
                break;
        }
    }
}
