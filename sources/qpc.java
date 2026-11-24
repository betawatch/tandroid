// default package

import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ v45 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ jac f;

    public /* synthetic */ qpc(WalletEngine2 walletEngine2, byte[] bArr, v45 v45Var, String str, jac jacVar, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = bArr;
        this.d = v45Var;
        this.e = str;
        this.f = jacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jac jacVar = this.f;
        String str = this.e;
        v45 v45Var = this.d;
        byte[] bArr = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$signMessage$14(bArr, v45Var, str, jacVar);
                break;
            default:
                walletEngine2.lambda$prepareTonConnectTransfer$5(bArr, v45Var, str, jacVar);
                break;
        }
    }
}
