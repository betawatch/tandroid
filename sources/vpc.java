// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class vpc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ qac c;
    public final /* synthetic */ String d;

    public /* synthetic */ vpc(WalletEngine2 walletEngine2, qac qacVar, String str) {
        this.b = walletEngine2;
        this.c = qacVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        qac qacVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$getTransactionByHash$42(str, qacVar);
                break;
            default:
                walletEngine2.lambda$previewSignMessage$10(qacVar, str);
                break;
        }
    }

    public /* synthetic */ vpc(WalletEngine2 walletEngine2, String str, qac qacVar) {
        this.b = walletEngine2;
        this.d = str;
        this.c = qacVar;
    }
}
