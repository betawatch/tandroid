package rh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ c2(e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                e4 e4Var = this.b;
                updatestargiftprice.stargift = e4Var.B1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(e4Var.a).sendRequest(updatestargiftprice, new ag.p0(e4Var, h, this.c, 19));
                break;
            default:
                gf.f.t(this.b.getContext(), "https://fragment.com/gift/" + this.c.slug);
                break;
        }
    }
}
