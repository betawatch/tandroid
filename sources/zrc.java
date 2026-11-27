// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zrc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ icc c;
    public final /* synthetic */ TL_wallet.sendTransfer d;
    public final /* synthetic */ String e;

    public /* synthetic */ zrc(WalletEngine2 walletEngine2, icc iccVar, TL_wallet.sendTransfer sendtransfer, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = iccVar;
        this.d = sendtransfer;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.sendTransfer sendtransfer = this.d;
        icc iccVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$prepareTonConnectTransfer$4(iccVar, sendtransfer, str);
                break;
            case 1:
                walletEngine2.lambda$prepareTonConnectTransferPair$7(iccVar, sendtransfer, str);
                break;
            default:
                walletEngine2.lambda$prepareSendNFT$28(iccVar, sendtransfer, str);
                break;
        }
    }
}
