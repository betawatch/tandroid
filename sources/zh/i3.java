package zh;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import bi.ea;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.jl0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements cj0, ni.p {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // ni.p
    public void b(j2.n nVar) {
        org.telegram.messenger.g0.h3(new l2.z0((SpannableString) this.a, nVar, (org.telegram.ui.ActionBar.p) this.b, 11));
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        k3 k3Var = (k3) this.a;
        j3 j3Var = (j3) this.b;
        x31 G = k3Var.a2.G(i7 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z9 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && k3Var.Z1) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k3Var.getContext(), k3Var.I0);
                String M0 = id.M0(2131749793, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131749794, null);
                jg.g.C(null, 2131747832, alertDialog$Builder, null);
                return;
            }
            if (z9 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, k3Var.getContext(), null);
                u1Var2.r(400L);
                long e10 = p10.i(k3Var.a).e();
                cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
                ea.x(k3Var.a, bVar).H(tL_starGiftUnique, e10, null, true, new jl0(k3Var, u1Var2, bVar, tL_starGiftUnique, e10));
                return;
            }
            if (!z9) {
                ArrayList arrayList = j3Var.b.l;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        savedStarGift = null;
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    savedStarGift = (TL_stars.SavedStarGift) obj2;
                    if (savedStarGift.gift == starGift) {
                        break;
                    }
                }
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(k3Var.a).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k3Var.getContext());
                    String M02 = id.M0(2131749756, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                    u1Var3.R = M02;
                    u1Var3.T = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749757, id.x(savedStarGift.can_craft_at, true)));
                    jg.g.C(null, 2131747832, alertDialog$Builder2, null);
                    return;
                }
            }
            k3Var.X1.a(starGift);
            k3Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
