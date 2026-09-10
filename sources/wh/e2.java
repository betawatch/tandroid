package wh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.ProfileActivity;
import xh.l5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ e2(m2 m2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = m2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        m2 m2Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                m2Var.a.e.b((String) obj, new e2(m2Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wr0 wr0Var = m2Var.a;
                l5 l5Var = wr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                l5Var.a(i12, arrayList);
                wr0Var.f(true);
                u81 u81Var = wr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                u81Var.d(i13, wr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = wr0Var.a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                wr0Var.n();
                wc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
