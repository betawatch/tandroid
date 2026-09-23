package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import yh.k5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
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
                nr0 nr0Var = o2Var.a;
                k5 k5Var = nr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k5Var.a(i12, arrayList);
                nr0Var.f(true);
                g81 g81Var = nr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                g81Var.d(i13, nr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = nr0Var.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                nr0Var.n();
                xc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
