// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tsa implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ tsa(wua wuaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = tL_starGiftUnique;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                l01 g = idVar.g(-1, true, true);
                g.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                updatestargiftprice.stargift = wuaVar.v1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(wuaVar.a).sendRequest(updatestargiftprice, new qn8((Object) wuaVar, (Object) g, (Object) tL_starGiftUnique, (byte) 15));
                break;
            default:
                m01.w(wuaVar.getContext(), "https://fragment.com/gift/" + tL_starGiftUnique.slug, false);
                break;
        }
    }
}
