package zh;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.ea;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.jl0;
import org.telegram.ui.ql0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements a20, cj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(org.telegram.ui.ActionBar.v2 v2Var, Object obj) {
        this.a = v2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        l3 l3Var = (l3) this.a;
        k3 k3Var = (k3) this.b;
        x31 G = l3Var.a2.G(i7 - 1);
        if (G == null) {
            return;
        }
        Object obj = G.G;
        if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z9 = G.r;
            if (!TextUtils.isEmpty(starGift.gift_address) && l3Var.Z1) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l3Var.getContext(), l3Var.I0);
                String M0 = hd.M0(2131749791, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131749792, null);
                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                return;
            }
            if (z9 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, l3Var.getContext(), null);
                u1Var2.r(400L);
                long e10 = p10.i(l3Var.a).e();
                cg.b bVar = tL_starGiftUnique.resale_ton_only ? cg.b.b : cg.b.a;
                ea.x(l3Var.a, bVar).H(tL_starGiftUnique, e10, null, true, new jl0(l3Var, u1Var2, bVar, tL_starGiftUnique, e10));
                return;
            }
            if (!z9) {
                ArrayList arrayList = k3Var.b.l;
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
                if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(l3Var.a).getCurrentTime()) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l3Var.getContext());
                    String M02 = hd.M0(2131749754, null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
                    u1Var3.R = M02;
                    u1Var3.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749755, hd.x(savedStarGift.can_craft_at, true)));
                    jg.g.C(null, 2131747830, alertDialog$Builder2, null);
                    return;
                }
            }
            l3Var.X1.a(starGift);
            l3Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e2 e2Var = (e2) this.a;
        fi.d dVar = (fi.d) this.b;
        View view = (View) obj2;
        long j3 = ((TL_stars.SavedStarGift) ((x31) obj).G).gift.id;
        if (e2Var.i1 == j3) {
            e2Var.i1 = 0L;
        } else {
            e2Var.i1 = j3;
        }
        dVar.setEnabled(e2Var.i1 != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ql0) {
                    ql0 ql0Var = (ql0) childAt;
                    ql0Var.b(e2Var.i1 == ql0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
