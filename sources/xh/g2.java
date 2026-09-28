package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import yh.j5;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                bs0 bs0Var = o2Var.a;
                j5 j5Var = bs0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j5Var.a(i12, arrayList);
                bs0Var.f(true);
                x81 x81Var = bs0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                x81Var.d(i13, bs0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.m2 m2Var = bs0Var.a;
                if (m2Var instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var).G4(true);
                }
                bs0Var.n();
                xc.a0(m2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
