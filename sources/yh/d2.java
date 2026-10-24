package yh;

import ai.l7;
import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ns0 ns0Var = l2Var.a;
                v9 v9Var = ns0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                v9Var.a(i12, arrayList);
                ns0Var.f(true);
                k91 k91Var = ns0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                k91Var.d(i13, ns0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = ns0Var.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).I4(true);
                }
                ns0Var.n();
                xc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
