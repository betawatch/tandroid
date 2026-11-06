package zh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import bi.ea;
import bi.k7;
import bi.m6;
import bi.t9;
import c8.ha;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements a20, b20 {
    public final /* synthetic */ a2 a;

    public /* synthetic */ v1(a2 a2Var) {
        this.a = a2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b2  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // org.telegram.messenger.b20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        a2 a2Var;
        z0 z0Var;
        final a2 a2Var2;
        final TL_stars.SavedStarGift savedStarGift;
        z0 z0Var2;
        String str;
        t9 t9Var;
        ?? r52;
        boolean z10;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        String str3;
        int i7;
        LinearLayout linearLayout;
        boolean z11;
        Object obj;
        a2 a2Var3 = this.a;
        int i10 = a2Var3.b;
        up0 up0Var = a2Var3.a;
        boolean z12 = false;
        if (a2Var3.e != null) {
            if (view instanceof z0) {
                Object obj2 = x31Var.G;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    z0 z0Var3 = (z0) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.f2 f2Var = up0Var.a;
                    t9 t9Var2 = up0Var.e;
                    k60 I = k60.I(f2Var, view);
                    up0Var.I = I;
                    int i11 = 5;
                    int i12 = 2;
                    if (t9Var2.h()) {
                        if (!a2Var3.d) {
                            t9Var2.d().size();
                        }
                        k60 J = I.J();
                        J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new li.h(I, i12), false);
                        J.k();
                        h60 h60Var = new h60(a2Var3.getContext(), i11);
                        LinearLayout linearLayout2 = new LinearLayout(a2Var3.getContext());
                        h60Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(h60Var, ha.o(-1, -2));
                        if (t9Var2.d().size() + 1 < ((org.telegram.messenger.j0) qp.s1(i10).x7.t.b).c) {
                            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, a2Var3.getContext(), a2Var3.c, false, false);
                            z0Var4.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i13 = k6.E8;
                            z0Var4.c(i13, k6.F8);
                            z0Var4.h(0.12f, i13);
                            z0Var4.j(hd.M0(2131750097, null), R.drawable.menu_folder_add, null);
                            z0Var4.setOnClickListener(new td0(a2Var3, I, savedStarGift2, 8));
                            linearLayout2.addView(z0Var4, ha.o(-1, -2));
                        }
                        ArrayList d = t9Var2.d();
                        int size = d.size();
                        int i14 = 0;
                        LinearLayout linearLayout3 = linearLayout2;
                        while (i14 < size) {
                            int i15 = i14 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i14);
                            ArrayList arrayList = t9Var2.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            z0 z0Var5 = z0Var3;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size2) {
                                    linearLayout = linearLayout3;
                                    z11 = false;
                                    break;
                                }
                                Object obj3 = arrayList.get(i16);
                                i16++;
                                int i17 = size2;
                                if (ea.k((TL_stars.SavedStarGift) obj3, savedStarGift2)) {
                                    linearLayout = linearLayout3;
                                    z11 = true;
                                    break;
                                }
                                size2 = i17;
                            }
                            org.telegram.ui.ActionBar.z0 z0Var6 = new org.telegram.ui.ActionBar.z0(2, a2Var3.getContext(), a2Var3.c, false, false);
                            z0Var6.setChecked(z11);
                            a2 a2Var4 = a2Var3;
                            LinearLayout linearLayout4 = linearLayout;
                            z0Var6.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i18 = k6.E8;
                            z0Var6.c(i18, k6.F8);
                            z0Var6.h(0.12f, i18);
                            if (tL_starGiftCollection.icon != null) {
                                y1 y1Var = new y1(3, i10, tL_starGiftCollection.icon);
                                z0Var6.getImageView().addOnAttachStateChangeListener(new m6(y1Var, 6));
                                z0Var6.j(tL_starGiftCollection.title, 0, y1Var);
                                obj = null;
                            } else {
                                obj = null;
                                z0Var6.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            z0Var6.setOnClickListener(new t90(a2Var4, z11, tL_starGiftCollection, savedStarGift2, I, 1));
                            linearLayout4.addView(z0Var6, ha.o(-1, -2));
                            linearLayout3 = linearLayout4;
                            d = arrayList2;
                            a2Var3 = a2Var4;
                            size = size;
                            i14 = i15;
                            z0Var3 = z0Var5;
                        }
                        a2Var = a2Var3;
                        z0Var = z0Var3;
                        z9 = false;
                        I.c(R.drawable.msg_addfolder, hd.M0(2131750394, null), new hi.h2(I, J, 11), false);
                        I.k();
                    } else {
                        a2Var = a2Var3;
                        z9 = false;
                        z0Var = z0Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!up0Var.c() || a2Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            a2Var2 = a2Var;
                            savedStarGift = savedStarGift2;
                            z0Var2 = z0Var;
                            str = null;
                            t9Var = t9Var2;
                            if (up0Var.c() && a2Var2.d) {
                                z10 = true;
                                I.c(R.drawable.tabs_reorder, hd.M0(2131750032, null), new q1(a2Var2, true ? 1 : 0), z9);
                                starGift = savedStarGift.gift;
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (starGift.slug == null) {
                                    str2 = qp.s1(i10).U2 + "/nft/" + savedStarGift.gift.slug;
                                } else {
                                    str2 = str;
                                }
                                if (k7.L1(i10, m5.o(tL_starGiftUnique.owner_id))) {
                                    boolean M1 = k7.M1(i10, tL_starGiftUnique);
                                    int i19 = M1 ? R.drawable.menu_takeoff : R.drawable.menu_wear;
                                    String M0 = hd.M0(M1 ? 2131749878 : 2131749841, str);
                                    final int i20 = z9 ? 1 : 0;
                                    I.c(i19, M0, new Runnable() { // from class: zh.r1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    a2 a2Var5 = a2Var2;
                                                    z1 z1Var = new z1(a2Var5, a2Var5.getContext(), a2Var5.b, a2Var5.a.c, a2Var5.c, 0);
                                                    z1Var.j2(savedStarGift, null);
                                                    z1Var.t2(false);
                                                    break;
                                                case 1:
                                                    a2 a2Var6 = a2Var2;
                                                    z1 z1Var2 = new z1(a2Var6, a2Var6.getContext(), a2Var6.b, a2Var6.a.c, a2Var6.c, 1);
                                                    z1Var2.j2(savedStarGift, null);
                                                    z1Var2.O1();
                                                    break;
                                                default:
                                                    a2 a2Var7 = a2Var2;
                                                    z1 z1Var3 = new z1(a2Var7, a2Var7.getContext(), a2Var7.b, a2Var7.a.c, a2Var7.c, 2);
                                                    z1Var3.j2(savedStarGift, null);
                                                    z1Var3.W1();
                                                    break;
                                            }
                                        }
                                    }, z9);
                                }
                                I.l(R.drawable.msg_link2, hd.M0(2131751762, str), new wi.q(14, a2Var2, str2), str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0);
                                boolean z13 = str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0;
                                String M02 = hd.M0(2131745460, str);
                                final int i21 = z10 ? 1 : 0;
                                I.l(R.drawable.msg_share, M02, new Runnable() { // from class: zh.r1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i21) {
                                            case 0:
                                                a2 a2Var5 = a2Var2;
                                                z1 z1Var = new z1(a2Var5, a2Var5.getContext(), a2Var5.b, a2Var5.a.c, a2Var5.c, 0);
                                                z1Var.j2(savedStarGift, null);
                                                z1Var.t2(false);
                                                break;
                                            case 1:
                                                a2 a2Var6 = a2Var2;
                                                z1 z1Var2 = new z1(a2Var6, a2Var6.getContext(), a2Var6.b, a2Var6.a.c, a2Var6.c, 1);
                                                z1Var2.j2(savedStarGift, null);
                                                z1Var2.O1();
                                                break;
                                            default:
                                                a2 a2Var7 = a2Var2;
                                                z1 z1Var3 = new z1(a2Var7, a2Var7.getContext(), a2Var7.b, a2Var7.a.c, a2Var7.c, 2);
                                                z1Var3.j2(savedStarGift, null);
                                                z1Var3.W1();
                                                break;
                                        }
                                    }
                                }, z13);
                                r52 = z10;
                            }
                        } else {
                            boolean z14 = savedStarGift2.pinned_to_top;
                            int i22 = z14 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z14) {
                                i7 = 2131749883;
                                str3 = null;
                            } else {
                                str3 = null;
                                i7 = 2131750077;
                            }
                            String M03 = hd.M0(i7, str3);
                            str = str3;
                            savedStarGift = savedStarGift2;
                            a2Var2 = a2Var;
                            t9Var = t9Var2;
                            z0Var2 = z0Var;
                            I.c(i22, M03, new wg.r(a2Var2, savedStarGift, z0Var2, view, 2), z9);
                            I.l(R.drawable.tabs_reorder, hd.M0(2131750032, str), new q1(a2Var2, z9 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        z10 = true;
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (k7.L1(i10, m5.o(tL_starGiftUnique.owner_id))) {
                        }
                        I.l(R.drawable.msg_link2, hd.M0(2131751762, str), new wi.q(14, a2Var2, str2), str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0);
                        if (str2 == null) {
                        }
                        String M022 = hd.M0(2131745460, str);
                        final int i212 = z10 ? 1 : 0;
                        I.l(R.drawable.msg_share, M022, new Runnable() { // from class: zh.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i212) {
                                    case 0:
                                        a2 a2Var5 = a2Var2;
                                        z1 z1Var = new z1(a2Var5, a2Var5.getContext(), a2Var5.b, a2Var5.a.c, a2Var5.c, 0);
                                        z1Var.j2(savedStarGift, null);
                                        z1Var.t2(false);
                                        break;
                                    case 1:
                                        a2 a2Var6 = a2Var2;
                                        z1 z1Var2 = new z1(a2Var6, a2Var6.getContext(), a2Var6.b, a2Var6.a.c, a2Var6.c, 1);
                                        z1Var2.j2(savedStarGift, null);
                                        z1Var2.O1();
                                        break;
                                    default:
                                        a2 a2Var7 = a2Var2;
                                        z1 z1Var3 = new z1(a2Var7, a2Var7.getContext(), a2Var7.b, a2Var7.a.c, a2Var7.c, 2);
                                        z1Var3.j2(savedStarGift, null);
                                        z1Var3.W1();
                                        break;
                                }
                            }
                        }, z13);
                        r52 = z10;
                    } else {
                        a2Var2 = a2Var;
                        savedStarGift = savedStarGift2;
                        z0Var2 = z0Var;
                        str = null;
                        t9Var = t9Var2;
                        r52 = 1;
                        r52 = 1;
                        r52 = 1;
                        if (up0Var.c() && a2Var2.d) {
                            I.c(R.drawable.tabs_reorder, hd.M0(2131750032, null), new q1(a2Var2, 3), z9);
                        }
                    }
                    if (k7.L1(i10, up0Var.c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, hd.M0(z15 ? 2131749980 : 2131750186, str), new p1(a2Var2, savedStarGift, z0Var2, r52), z9);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i23 = 2;
                        I.l(R.drawable.menu_transfer, hd.M0(2131749917, str), new Runnable() { // from class: zh.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i23) {
                                    case 0:
                                        a2 a2Var5 = a2Var2;
                                        z1 z1Var = new z1(a2Var5, a2Var5.getContext(), a2Var5.b, a2Var5.a.c, a2Var5.c, 0);
                                        z1Var.j2(savedStarGift, null);
                                        z1Var.t2(false);
                                        break;
                                    case 1:
                                        a2 a2Var6 = a2Var2;
                                        z1 z1Var2 = new z1(a2Var6, a2Var6.getContext(), a2Var6.b, a2Var6.a.c, a2Var6.c, 1);
                                        z1Var2.j2(savedStarGift, null);
                                        z1Var2.O1();
                                        break;
                                    default:
                                        a2 a2Var7 = a2Var2;
                                        z1 z1Var3 = new z1(a2Var7, a2Var7.getContext(), a2Var7.b, a2Var7.a.c, a2Var7.c, 2);
                                        z1Var3.j2(savedStarGift, null);
                                        z1Var3.W1();
                                        break;
                                }
                            }
                        }, m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == p10.i(i10).e() ? r52 : z9 ? 1 : 0);
                    }
                    if (t9Var.h() && a2Var2.d) {
                        I.c(R.drawable.msg_removefolder, hd.M0(2131750038, str), new p1(a2Var2, savedStarGift, I, z9 ? 1 : 0), r52);
                        I.E();
                        I.t();
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.u = r52;
                        I.v = r52;
                        I.L = r52;
                        Point point = org.telegram.messenger.g0.q;
                        int min = Math.min(point.x, point.y);
                        I.N = min - org.telegram.messenger.g0.L(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = r52;
                        I.W = r52;
                        I.Z();
                        z0Var2.D.getImageReceiver().P0(r52);
                        z12 = r52;
                    }
                    z12 = z9;
                }
            }
            z9 = false;
            z12 = z9;
        }
        return Boolean.valueOf(z12);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        a2 a2Var = this.a;
        up0 up0Var = a2Var.a;
        int i7 = a2Var.b;
        if (a2Var.e == null) {
            return;
        }
        Object obj3 = x31Var.G;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!a2Var.h) {
                k7 k7Var = new k7(a2Var.getContext(), a2Var.b, up0Var.c, a2Var.c, null);
                k7Var.c3 = new q1(a2Var, 2);
                k7Var.J2 = new org.telegram.ui.web.a0(29, a2Var, savedStarGift);
                k7Var.j2(savedStarGift, a2Var.e);
                k7Var.show();
                return;
            }
            if (!a2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z9 = savedStarGift.pinned_to_top;
                boolean z10 = !z9;
                if (!z9 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = a2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                }
                if (a2Var.e.o(savedStarGift, z10, true)) {
                    hc.a0(up0Var.a).Q(R.raw.chats_infotip, 36, hd.H(',', "GiftsPinLimit", qp.s1(i7).K6)).j();
                }
                if (z9) {
                    return;
                }
                a2Var.f.v0(0);
            }
        }
    }
}
