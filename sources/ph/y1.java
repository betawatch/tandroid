package ph;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ProfileActivity;
import rh.u5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ y1(f2 f2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = f2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        f2 f2Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                f2Var.a.e.b((String) obj, new y1(f2Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vq0 vq0Var = f2Var.a;
                u5 u5Var = vq0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                u5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                u5Var.a(i12, arrayList);
                vq0Var.f(true);
                v71 v71Var = vq0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                v71Var.d(i13, vq0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = vq0Var.a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).T4(true);
                }
                vq0Var.o();
                cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
