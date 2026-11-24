// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uqa implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ uqa(wsa wsaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = tL_starGiftUnique;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                updatestargiftprice.stargift = wsaVar.u1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(wsaVar.a).sendRequest(updatestargiftprice, new fm8((Object) wsaVar, (Object) g, (Object) tL_starGiftUnique, (byte) 15));
                break;
            default:
                l11.w(wsaVar.getContext(), "https://fragment.com/gift/" + tL_starGiftUnique.slug, false);
                break;
        }
    }
}
