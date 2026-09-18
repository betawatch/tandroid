package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import yh.m5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                or0 or0Var = n2Var.a;
                m5 m5Var = or0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                m5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m5Var.a(i12, arrayList);
                or0Var.f(true);
                i81 i81Var = or0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                i81Var.d(i13, or0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = or0Var.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                or0Var.n();
                vc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.a4.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
