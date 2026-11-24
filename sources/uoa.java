// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uoa implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ uoa(vqa vqaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = tL_starGiftUnique;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                updatestargiftprice.stargift = vqaVar.u1();
                updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
                ConnectionsManager.getInstance(vqaVar.a).sendRequest(updatestargiftprice, new ck8((Object) vqaVar, (Object) g, (Object) tL_starGiftUnique, (byte) 15));
                break;
            default:
                d01.v(vqaVar.getContext(), "https://fragment.com/gift/" + tL_starGiftUnique.slug, false);
                break;
        }
    }
}
