// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WalletEngine2 b;
    public final /* synthetic */ i8c c;
    public final /* synthetic */ TL_wallet.walletTransaction d;
    public final /* synthetic */ String e;

    public /* synthetic */ qnc(WalletEngine2 walletEngine2, i8c i8cVar, TL_wallet.walletTransaction wallettransaction, String str, byte b) {
        this.a = b;
        this.b = walletEngine2;
        this.c = i8cVar;
        this.d = wallettransaction;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_wallet.walletTransaction wallettransaction = this.d;
        i8c i8cVar = this.c;
        WalletEngine2 walletEngine2 = this.b;
        switch (b) {
            case 0:
                walletEngine2.lambda$emulateRotateKey$32(i8cVar, wallettransaction, str);
                break;
            default:
                walletEngine2.lambda$previewTonConnect$1(i8cVar, wallettransaction, str);
                break;
        }
    }
}
