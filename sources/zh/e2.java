package zh;

import bi.h7;
import bi.q9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                vs0 vs0Var = m2Var.a;
                q9 q9Var = vs0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                q9Var.a(i12, arrayList);
                vs0Var.f(true);
                t91 t91Var = vs0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                t91Var.d(i13, vs0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.r2 r2Var = vs0Var.a;
                if (r2Var instanceof ProfileActivity) {
                    ((ProfileActivity) r2Var).O4(true);
                }
                vs0Var.o();
                wc.b0(r2Var).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
