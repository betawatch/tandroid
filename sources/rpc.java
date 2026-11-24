// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class rpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ jac c;

    public /* synthetic */ rpc(WalletEngine2 walletEngine2, jac jacVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = jacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jac jacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$33(jacVar);
                break;
            case 1:
                walletEngine2.lambda$prepareSendNFT$27(jacVar);
                break;
            default:
                walletEngine2.lambda$balance$17(jacVar);
                break;
        }
    }
}
