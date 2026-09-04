package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import zh.i5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                nr0 nr0Var = m2Var.a;
                i5 i5Var = nr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                i5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                i5Var.a(i12, arrayList);
                nr0Var.f(true);
                h81 h81Var = nr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                h81Var.d(i13, nr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = nr0Var.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                nr0Var.n();
                yc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
