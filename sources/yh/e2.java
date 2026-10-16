package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import zh.e5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ns0 ns0Var = m2Var.a;
                e5 e5Var = ns0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                e5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                e5Var.a(i12, arrayList);
                ns0Var.f(true);
                k91 k91Var = ns0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                k91Var.d(i13, ns0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.m2 m2Var2 = ns0Var.a;
                if (m2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) m2Var2).G4(true);
                }
                ns0Var.n();
                zc.a0(m2Var2).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.r3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
