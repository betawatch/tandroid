package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ s1(z1 z1Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.a = i7;
        this.b = z1Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        z1 z1Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                z1Var.a.e.b((String) obj, new s1(z1Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                up0 up0Var = z1Var.a;
                t9 t9Var = up0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i11, arrayList);
                up0Var.f(true);
                u61 u61Var = up0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                u61Var.d(i12, up0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = up0Var.a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).X4(true);
                }
                up0Var.o();
                gc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750393, k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
