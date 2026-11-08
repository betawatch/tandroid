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
import org.telegram.messenger.id;
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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements a20, b20 {
    public final /* synthetic */ z1 a;

    public /* synthetic */ u1(z1 z1Var) {
        this.a = z1Var;
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
        z1 z1Var;
        y0 y0Var;
        final z1 z1Var2;
        final TL_stars.SavedStarGift savedStarGift;
        y0 y0Var2;
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
        z1 z1Var3 = this.a;
        int i10 = z1Var3.b;
        up0 up0Var = z1Var3.a;
        boolean z12 = false;
        if (z1Var3.e != null) {
            if (view instanceof y0) {
                Object obj2 = x31Var.G;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    y0 y0Var3 = (y0) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.f2 f2Var = up0Var.a;
                    t9 t9Var2 = up0Var.e;
                    k60 I = k60.I(f2Var, view);
                    up0Var.I = I;
                    int i11 = 5;
                    int i12 = 2;
                    if (t9Var2.h()) {
                        if (!z1Var3.d) {
                            t9Var2.d().size();
                        }
                        k60 J = I.J();
                        J.c(R.drawable.ic_ab_back, id.M0(2131753756, null), new li.h(I, i12), false);
                        J.k();
                        h60 h60Var = new h60(z1Var3.getContext(), i11);
                        LinearLayout linearLayout2 = new LinearLayout(z1Var3.getContext());
                        h60Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(h60Var, ha.o(-1, -2));
                        if (t9Var2.d().size() + 1 < ((org.telegram.messenger.j0) qp.s1(i10).x7.t.b).c) {
                            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, z1Var3.getContext(), z1Var3.c, false, false);
                            z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i13 = k6.E8;
                            z0Var.c(i13, k6.F8);
                            z0Var.h(0.12f, i13);
                            z0Var.j(id.M0(2131750099, null), R.drawable.menu_folder_add, null);
                            z0Var.setOnClickListener(new td0(z1Var3, I, savedStarGift2, 8));
                            linearLayout2.addView(z0Var, ha.o(-1, -2));
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
                            y0 y0Var4 = y0Var3;
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
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(2, z1Var3.getContext(), z1Var3.c, false, false);
                            z0Var2.setChecked(z11);
                            z1 z1Var4 = z1Var3;
                            LinearLayout linearLayout4 = linearLayout;
                            z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                            int i18 = k6.E8;
                            z0Var2.c(i18, k6.F8);
                            z0Var2.h(0.12f, i18);
                            if (tL_starGiftCollection.icon != null) {
                                x1 x1Var = new x1(3, i10, tL_starGiftCollection.icon);
                                z0Var2.getImageView().addOnAttachStateChangeListener(new m6(x1Var, 6));
                                z0Var2.j(tL_starGiftCollection.title, 0, x1Var);
                                obj = null;
                            } else {
                                obj = null;
                                z0Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            z0Var2.setOnClickListener(new t90(z1Var4, z11, tL_starGiftCollection, savedStarGift2, I, 1));
                            linearLayout4.addView(z0Var2, ha.o(-1, -2));
                            linearLayout3 = linearLayout4;
                            d = arrayList2;
                            z1Var3 = z1Var4;
                            size = size;
                            i14 = i15;
                            y0Var3 = y0Var4;
                        }
                        z1Var = z1Var3;
                        y0Var = y0Var3;
                        z9 = false;
                        I.c(R.drawable.msg_addfolder, id.M0(2131750396, null), new hi.h2(I, J, 11), false);
                        I.k();
                    } else {
                        z1Var = z1Var3;
                        z9 = false;
                        y0Var = y0Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!up0Var.c() || z1Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            z1Var2 = z1Var;
                            savedStarGift = savedStarGift2;
                            y0Var2 = y0Var;
                            str = null;
                            t9Var = t9Var2;
                            if (up0Var.c() && z1Var2.d) {
                                z10 = true;
                                I.c(R.drawable.tabs_reorder, id.M0(2131750034, null), new p1(z1Var2, true ? 1 : 0), z9);
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
                                    String M0 = id.M0(M1 ? 2131749880 : 2131749843, str);
                                    final int i20 = z9 ? 1 : 0;
                                    I.c(i19, M0, new Runnable() { // from class: zh.q1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    z1 z1Var5 = z1Var2;
                                                    y1 y1Var = new y1(z1Var5, z1Var5.getContext(), z1Var5.b, z1Var5.a.c, z1Var5.c, 0);
                                                    y1Var.j2(savedStarGift, null);
                                                    y1Var.t2(false);
                                                    break;
                                                case 1:
                                                    z1 z1Var6 = z1Var2;
                                                    y1 y1Var2 = new y1(z1Var6, z1Var6.getContext(), z1Var6.b, z1Var6.a.c, z1Var6.c, 1);
                                                    y1Var2.j2(savedStarGift, null);
                                                    y1Var2.O1();
                                                    break;
                                                default:
                                                    z1 z1Var7 = z1Var2;
                                                    y1 y1Var3 = new y1(z1Var7, z1Var7.getContext(), z1Var7.b, z1Var7.a.c, z1Var7.c, 2);
                                                    y1Var3.j2(savedStarGift, null);
                                                    y1Var3.W1();
                                                    break;
                                            }
                                        }
                                    }, z9);
                                }
                                I.l(R.drawable.msg_link2, id.M0(2131751762, str), new yf.b(9, z1Var2, str2), str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0);
                                boolean z13 = str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0;
                                String M02 = id.M0(2131745462, str);
                                final int i21 = z10 ? 1 : 0;
                                I.l(R.drawable.msg_share, M02, new Runnable() { // from class: zh.q1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i21) {
                                            case 0:
                                                z1 z1Var5 = z1Var2;
                                                y1 y1Var = new y1(z1Var5, z1Var5.getContext(), z1Var5.b, z1Var5.a.c, z1Var5.c, 0);
                                                y1Var.j2(savedStarGift, null);
                                                y1Var.t2(false);
                                                break;
                                            case 1:
                                                z1 z1Var6 = z1Var2;
                                                y1 y1Var2 = new y1(z1Var6, z1Var6.getContext(), z1Var6.b, z1Var6.a.c, z1Var6.c, 1);
                                                y1Var2.j2(savedStarGift, null);
                                                y1Var2.O1();
                                                break;
                                            default:
                                                z1 z1Var7 = z1Var2;
                                                y1 y1Var3 = new y1(z1Var7, z1Var7.getContext(), z1Var7.b, z1Var7.a.c, z1Var7.c, 2);
                                                y1Var3.j2(savedStarGift, null);
                                                y1Var3.W1();
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
                                i7 = 2131749885;
                                str3 = null;
                            } else {
                                str3 = null;
                                i7 = 2131750079;
                            }
                            String M03 = id.M0(i7, str3);
                            str = str3;
                            savedStarGift = savedStarGift2;
                            z1Var2 = z1Var;
                            t9Var = t9Var2;
                            y0Var2 = y0Var;
                            I.c(i22, M03, new wg.r(z1Var2, savedStarGift, y0Var2, view, 2), z9);
                            I.l(R.drawable.tabs_reorder, id.M0(2131750034, str), new p1(z1Var2, z9 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        z10 = true;
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (k7.L1(i10, m5.o(tL_starGiftUnique.owner_id))) {
                        }
                        I.l(R.drawable.msg_link2, id.M0(2131751762, str), new yf.b(9, z1Var2, str2), str2 == null ? z10 ? 1 : 0 : z9 ? 1 : 0);
                        if (str2 == null) {
                        }
                        String M022 = id.M0(2131745462, str);
                        final int i212 = z10 ? 1 : 0;
                        I.l(R.drawable.msg_share, M022, new Runnable() { // from class: zh.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i212) {
                                    case 0:
                                        z1 z1Var5 = z1Var2;
                                        y1 y1Var = new y1(z1Var5, z1Var5.getContext(), z1Var5.b, z1Var5.a.c, z1Var5.c, 0);
                                        y1Var.j2(savedStarGift, null);
                                        y1Var.t2(false);
                                        break;
                                    case 1:
                                        z1 z1Var6 = z1Var2;
                                        y1 y1Var2 = new y1(z1Var6, z1Var6.getContext(), z1Var6.b, z1Var6.a.c, z1Var6.c, 1);
                                        y1Var2.j2(savedStarGift, null);
                                        y1Var2.O1();
                                        break;
                                    default:
                                        z1 z1Var7 = z1Var2;
                                        y1 y1Var3 = new y1(z1Var7, z1Var7.getContext(), z1Var7.b, z1Var7.a.c, z1Var7.c, 2);
                                        y1Var3.j2(savedStarGift, null);
                                        y1Var3.W1();
                                        break;
                                }
                            }
                        }, z13);
                        r52 = z10;
                    } else {
                        z1Var2 = z1Var;
                        savedStarGift = savedStarGift2;
                        y0Var2 = y0Var;
                        str = null;
                        t9Var = t9Var2;
                        r52 = 1;
                        r52 = 1;
                        r52 = 1;
                        if (up0Var.c() && z1Var2.d) {
                            I.c(R.drawable.tabs_reorder, id.M0(2131750034, null), new p1(z1Var2, 3), z9);
                        }
                    }
                    if (k7.L1(i10, up0Var.c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, id.M0(z15 ? 2131749982 : 2131750188, str), new o1(z1Var2, savedStarGift, y0Var2, r52), z9);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i23 = 2;
                        I.l(R.drawable.menu_transfer, id.M0(2131749919, str), new Runnable() { // from class: zh.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i23) {
                                    case 0:
                                        z1 z1Var5 = z1Var2;
                                        y1 y1Var = new y1(z1Var5, z1Var5.getContext(), z1Var5.b, z1Var5.a.c, z1Var5.c, 0);
                                        y1Var.j2(savedStarGift, null);
                                        y1Var.t2(false);
                                        break;
                                    case 1:
                                        z1 z1Var6 = z1Var2;
                                        y1 y1Var2 = new y1(z1Var6, z1Var6.getContext(), z1Var6.b, z1Var6.a.c, z1Var6.c, 1);
                                        y1Var2.j2(savedStarGift, null);
                                        y1Var2.O1();
                                        break;
                                    default:
                                        z1 z1Var7 = z1Var2;
                                        y1 y1Var3 = new y1(z1Var7, z1Var7.getContext(), z1Var7.b, z1Var7.a.c, z1Var7.c, 2);
                                        y1Var3.j2(savedStarGift, null);
                                        y1Var3.W1();
                                        break;
                                }
                            }
                        }, m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == p10.i(i10).e() ? r52 : z9 ? 1 : 0);
                    }
                    if (t9Var.h() && z1Var2.d) {
                        I.c(R.drawable.msg_removefolder, id.M0(2131750040, str), new o1(z1Var2, savedStarGift, I, z9 ? 1 : 0), r52);
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
                        y0Var2.D.getImageReceiver().P0(r52);
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
        z1 z1Var = this.a;
        up0 up0Var = z1Var.a;
        int i7 = z1Var.b;
        if (z1Var.e == null) {
            return;
        }
        Object obj3 = x31Var.G;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!z1Var.h) {
                k7 k7Var = new k7(z1Var.getContext(), z1Var.b, up0Var.c, z1Var.c, null);
                k7Var.c3 = new p1(z1Var, 2);
                k7Var.J2 = new org.telegram.ui.web.a0(28, z1Var, savedStarGift);
                k7Var.j2(savedStarGift, z1Var.e);
                k7Var.show();
                return;
            }
            if (!z1Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z9 = savedStarGift.pinned_to_top;
                boolean z10 = !z9;
                if (!z9 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = z1Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                }
                if (z1Var.e.o(savedStarGift, z10, true)) {
                    hc.a0(up0Var.a).Q(R.raw.chats_infotip, 36, id.H(',', "GiftsPinLimit", qp.s1(i7).K6)).j();
                }
                if (z9) {
                    return;
                }
                z1Var.f.v0(0);
            }
        }
    }
}
