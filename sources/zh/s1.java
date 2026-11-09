package zh;

import bi.k7;
import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                vp0 vp0Var = z1Var.a;
                t9 t9Var = vp0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                t9Var.a(i11, arrayList);
                vp0Var.f(true);
                v61 v61Var = vp0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                v61Var.d(i12, vp0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.f2 f2Var = vp0Var.a;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).X4(true);
                }
                vp0Var.o();
                hc.a0(f2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750393, k7.z1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
