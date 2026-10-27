package zh;

import bi.h7;
import bi.q9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                ws0 ws0Var = m2Var.a;
                q9 q9Var = ws0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                q9Var.a(i12, arrayList);
                ws0Var.f(true);
                u91 u91Var = ws0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                u91Var.d(i13, ws0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.r2 r2Var = ws0Var.a;
                if (r2Var instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var).O4(true);
                }
                ws0Var.o();
                wc.b0(r2Var).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
