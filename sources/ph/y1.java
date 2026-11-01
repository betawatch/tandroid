package ph;

import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.ProfileActivity;
import rh.u5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ y1(f2 f2Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = f2Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.r20
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
                wq0 wq0Var = f2Var.a;
                u5 u5Var = wq0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                u5Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                u5Var.a(i12, arrayList);
                wq0Var.f(true);
                w71 w71Var = wq0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                w71Var.d(i13, wq0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.k2 k2Var = wq0Var.a;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).U4(true);
                }
                wq0Var.o();
                cc.a0(k2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131750402, rh.e4.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
