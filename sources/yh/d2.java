package yh;

import ai.l7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ d2(l2 l2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = l2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        l2 l2Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                l2Var.a.e.b((String) obj, new d2(l2Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ks0 ks0Var = l2Var.a;
                v9 v9Var = ks0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i12, arrayList);
                ks0Var.f(true);
                d91 d91Var = ks0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                d91Var.d(i13, ks0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = ks0Var.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                ks0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.Y1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
