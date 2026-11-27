// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class u25 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_wallet.nftItem d;
    public final /* synthetic */ String e;
    public final /* synthetic */ icc f;
    public final /* synthetic */ c h;

    public u25(c cVar, String str, TL_wallet.nftItem nftitem, String str2, icc iccVar) {
        this.h = cVar;
        this.c = str;
        this.d = nftitem;
        this.e = str2;
        this.f = iccVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        try {
            try {
                if (this.a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.b;
                String str = this.c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.b = walletEngine2.emulateSendNFT(str, str2, str3, new nu0((Object) this, (Object) nftitem, (Object) str3, (Object) this.f, (byte) 6));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
