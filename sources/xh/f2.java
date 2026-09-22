package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import yh.l5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ f2(n2 n2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = n2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        n2 n2Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                n2Var.a.e.b((String) obj, new f2(n2Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0 nr0Var = n2Var.a;
                l5 l5Var = nr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                l5Var.a(i12, arrayList);
                nr0Var.f(true);
                h81 h81Var = nr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                h81Var.d(i13, nr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var2 = nr0Var.a;
                if (n2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var2).G4(true);
                }
                nr0Var.n();
                vc.a0(n2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.z3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
