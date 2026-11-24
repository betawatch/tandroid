// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class q05 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TL_wallet.nftItem d;
    public final /* synthetic */ String e;
    public final /* synthetic */ i8c f;
    public final /* synthetic */ c h;

    public q05(c cVar, String str, TL_wallet.nftItem nftitem, String str2, i8c i8cVar) {
        this.h = cVar;
        this.c = str;
        this.d = nftitem;
        this.e = str2;
        this.f = i8cVar;
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
                this.b = walletEngine2.emulateSendNFT(str, str2, str3, new eu0((Object) this, (Object) nftitem, (Object) str3, (Object) this.f, (byte) 6));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
