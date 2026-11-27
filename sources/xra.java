// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bxa b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ xra(bxa bxaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = bxaVar;
        this.c = tL_starGiftUnique;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        bxa bxaVar = this.b;
        switch (b) {
            case 0:
                if (bxaVar instanceof ed9) {
                    ((ed9) bxaVar).q(tL_starGiftUnique);
                    break;
                }
                break;
            default:
                if (bxaVar instanceof ed9) {
                    ((ed9) bxaVar).q(tL_starGiftUnique);
                    break;
                }
                break;
        }
    }
}
