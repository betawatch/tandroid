// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
