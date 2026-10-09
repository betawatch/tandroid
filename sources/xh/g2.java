package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.ProfileActivity;
import yh.d5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ g2(o2 o2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = o2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        o2 o2Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                o2Var.a.e.b((String) obj, new g2(o2Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                rs0 rs0Var = o2Var.a;
                d5 d5Var = rs0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                d5Var.a(i12, arrayList);
                rs0Var.f(true);
                n91 n91Var = rs0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                n91Var.d(i13, rs0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = rs0Var.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                rs0Var.n();
                ad.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
