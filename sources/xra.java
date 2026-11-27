// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
