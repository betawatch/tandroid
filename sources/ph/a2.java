package ph;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.o20;
import org.telegram.messenger.o5;
import org.telegram.messenger.p20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.px0;
import rh.e6;
import rh.u5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements o20, p20 {
    public final /* synthetic */ f2 a;

    public /* synthetic */ a2(f2 f2Var) {
        this.a = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b3  */
    @Override // org.telegram.messenger.p20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        f2 f2Var;
        c1 c1Var;
        final f2 f2Var2;
        final TL_stars.SavedStarGift savedStarGift;
        c1 c1Var2;
        String str;
        u5 u5Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str2;
        String str3;
        int i10;
        LinearLayout linearLayout;
        boolean z12;
        Object obj;
        f2 f2Var3 = this.a;
        int i11 = f2Var3.b;
        vq0 vq0Var = f2Var3.a;
        boolean z13 = false;
        if (f2Var3.e != null) {
            if (view instanceof c1) {
                Object obj2 = a51Var.G;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    c1 c1Var3 = (c1) view;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    org.telegram.ui.ActionBar.k2 k2Var = vq0Var.a;
                    u5 u5Var2 = vq0Var.e;
                    z60 I = z60.I(k2Var, view);
                    vq0Var.I = I;
                    int i12 = 5;
                    int i13 = 2;
                    if (u5Var2.h()) {
                        if (!f2Var3.d) {
                            u5Var2.d().size();
                        }
                        z60 J = I.J();
                        J.c(R.drawable.ic_ab_back, cd.L0(2131753756, null), new bi.j(I, i13), false);
                        J.k();
                        w60 w60Var = new w60(f2Var3.getContext(), i12);
                        LinearLayout linearLayout2 = new LinearLayout(f2Var3.getContext());
                        w60Var.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(w60Var, b6.o(-1, -2));
                        if (u5Var2.d().size() + 1 < ((org.telegram.messenger.l0) vp.r1(i11).y7.t.a).c) {
                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, f2Var3.getContext(), f2Var3.c, false, false);
                            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                            int i14 = t6.E8;
                            b1Var.c(i14, t6.F8);
                            b1Var.h(0.12f, i14);
                            b1Var.j(cd.L0(2131750107, null), R.drawable.menu_folder_add, null);
                            b1Var.setOnClickListener(new ag.i(f2Var3, I, savedStarGift2, 27));
                            linearLayout2.addView(b1Var, b6.o(-1, -2));
                        }
                        ArrayList d = u5Var2.d();
                        int size = d.size();
                        int i15 = 0;
                        LinearLayout linearLayout3 = linearLayout2;
                        while (i15 < size) {
                            int i16 = i15 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i15);
                            ArrayList arrayList = u5Var2.e(tL_starGiftCollection.collection_id).l;
                            int size2 = arrayList.size();
                            c1 c1Var4 = c1Var3;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    linearLayout = linearLayout3;
                                    z12 = false;
                                    break;
                                }
                                Object obj3 = arrayList.get(i17);
                                i17++;
                                int i18 = size2;
                                if (e6.k((TL_stars.SavedStarGift) obj3, savedStarGift2)) {
                                    linearLayout = linearLayout3;
                                    z12 = true;
                                    break;
                                }
                                size2 = i18;
                            }
                            org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(2, f2Var3.getContext(), f2Var3.c, false, false);
                            b1Var2.setChecked(z12);
                            f2 f2Var4 = f2Var3;
                            LinearLayout linearLayout4 = linearLayout;
                            b1Var2.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                            int i19 = t6.E8;
                            b1Var2.c(i19, t6.F8);
                            b1Var2.h(0.12f, i19);
                            if (tL_starGiftCollection.icon != null) {
                                d2 d2Var = new d2(3, i11, tL_starGiftCollection.icon);
                                b1Var2.getImageView().addOnAttachStateChangeListener(new l.d(d2Var, 4));
                                b1Var2.j(tL_starGiftCollection.title, 0, d2Var);
                                obj = null;
                            } else {
                                obj = null;
                                b1Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            b1Var2.setOnClickListener(new ma0(f2Var4, z12, tL_starGiftCollection, savedStarGift2, I, 1));
                            linearLayout4.addView(b1Var2, b6.o(-1, -2));
                            linearLayout3 = linearLayout4;
                            d = arrayList2;
                            f2Var3 = f2Var4;
                            size = size;
                            i15 = i16;
                            c1Var3 = c1Var4;
                        }
                        f2Var = f2Var3;
                        c1Var = c1Var3;
                        z10 = false;
                        I.c(R.drawable.msg_addfolder, cd.L0(2131750404, null), new bi.k(I, J, 10), false);
                        I.k();
                    } else {
                        f2Var = f2Var3;
                        z10 = false;
                        c1Var = c1Var3;
                    }
                    if (savedStarGift2.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (!vq0Var.c() || f2Var.d || (savedStarGift2.unsaved && savedStarGift2.pinned_to_top)) {
                            f2Var2 = f2Var;
                            savedStarGift = savedStarGift2;
                            c1Var2 = c1Var;
                            str = null;
                            u5Var = u5Var2;
                            if (vq0Var.c() && f2Var2.d) {
                                z11 = true;
                                I.c(R.drawable.tabs_reorder, cd.L0(2131750042, null), new u1(f2Var2, true ? 1 : 0), z10);
                                starGift = savedStarGift.gift;
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (starGift.slug == null) {
                                    str2 = vp.r1(i11).U2 + "/nft/" + savedStarGift.gift.slug;
                                } else {
                                    str2 = str;
                                }
                                if (rh.e4.L1(i11, o5.o(tL_starGiftUnique.owner_id))) {
                                    boolean M1 = rh.e4.M1(i11, tL_starGiftUnique);
                                    int i20 = M1 ? R.drawable.menu_takeoff : R.drawable.menu_wear;
                                    String L0 = cd.L0(M1 ? 2131749888 : 2131749851, str);
                                    final int i21 = z10 ? 1 : 0;
                                    I.c(i20, L0, new Runnable() { // from class: ph.v1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i21) {
                                                case 0:
                                                    f2 f2Var5 = f2Var2;
                                                    e2 e2Var = new e2(f2Var5, f2Var5.getContext(), f2Var5.b, f2Var5.a.c, f2Var5.c, 0);
                                                    e2Var.j2(savedStarGift, null);
                                                    e2Var.t2(false);
                                                    break;
                                                case 1:
                                                    f2 f2Var6 = f2Var2;
                                                    e2 e2Var2 = new e2(f2Var6, f2Var6.getContext(), f2Var6.b, f2Var6.a.c, f2Var6.c, 1);
                                                    e2Var2.j2(savedStarGift, null);
                                                    e2Var2.O1();
                                                    break;
                                                default:
                                                    f2 f2Var7 = f2Var2;
                                                    e2 e2Var3 = new e2(f2Var7, f2Var7.getContext(), f2Var7.b, f2Var7.a.c, f2Var7.c, 2);
                                                    e2Var3.j2(savedStarGift, null);
                                                    e2Var3.W1();
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                                I.l(R.drawable.msg_link2, cd.L0(2131751762, str), new org.telegram.ui.web.v1(11, f2Var2, str2), str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0);
                                boolean z14 = str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0;
                                String L02 = cd.L0(2131745477, str);
                                final int i22 = z11 ? 1 : 0;
                                I.l(R.drawable.msg_share, L02, new Runnable() { // from class: ph.v1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i22) {
                                            case 0:
                                                f2 f2Var5 = f2Var2;
                                                e2 e2Var = new e2(f2Var5, f2Var5.getContext(), f2Var5.b, f2Var5.a.c, f2Var5.c, 0);
                                                e2Var.j2(savedStarGift, null);
                                                e2Var.t2(false);
                                                break;
                                            case 1:
                                                f2 f2Var6 = f2Var2;
                                                e2 e2Var2 = new e2(f2Var6, f2Var6.getContext(), f2Var6.b, f2Var6.a.c, f2Var6.c, 1);
                                                e2Var2.j2(savedStarGift, null);
                                                e2Var2.O1();
                                                break;
                                            default:
                                                f2 f2Var7 = f2Var2;
                                                e2 e2Var3 = new e2(f2Var7, f2Var7.getContext(), f2Var7.b, f2Var7.a.c, f2Var7.c, 2);
                                                e2Var3.j2(savedStarGift, null);
                                                e2Var3.W1();
                                                break;
                                        }
                                    }
                                }, z14);
                            }
                        } else {
                            boolean z15 = savedStarGift2.pinned_to_top;
                            int i23 = z15 ? R.drawable.msg_unpin : R.drawable.msg_pin;
                            if (z15) {
                                i10 = 2131749893;
                                str3 = null;
                            } else {
                                str3 = null;
                                i10 = 2131750087;
                            }
                            String L03 = cd.L0(i10, str3);
                            str = str3;
                            savedStarGift = savedStarGift2;
                            f2Var2 = f2Var;
                            u5Var = u5Var2;
                            c1Var2 = c1Var;
                            I.c(i23, L03, new px0(f2Var2, savedStarGift, c1Var2, view, 11), z10);
                            I.l(R.drawable.tabs_reorder, cd.L0(2131750042, str), new u1(f2Var2, z10 ? 1 : 0), savedStarGift.pinned_to_top);
                        }
                        z11 = true;
                        starGift = savedStarGift.gift;
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug == null) {
                        }
                        if (rh.e4.L1(i11, o5.o(tL_starGiftUnique.owner_id))) {
                        }
                        I.l(R.drawable.msg_link2, cd.L0(2131751762, str), new org.telegram.ui.web.v1(11, f2Var2, str2), str2 == null ? z11 ? 1 : 0 : z10 ? 1 : 0);
                        if (str2 == null) {
                        }
                        String L022 = cd.L0(2131745477, str);
                        final int i222 = z11 ? 1 : 0;
                        I.l(R.drawable.msg_share, L022, new Runnable() { // from class: ph.v1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i222) {
                                    case 0:
                                        f2 f2Var5 = f2Var2;
                                        e2 e2Var = new e2(f2Var5, f2Var5.getContext(), f2Var5.b, f2Var5.a.c, f2Var5.c, 0);
                                        e2Var.j2(savedStarGift, null);
                                        e2Var.t2(false);
                                        break;
                                    case 1:
                                        f2 f2Var6 = f2Var2;
                                        e2 e2Var2 = new e2(f2Var6, f2Var6.getContext(), f2Var6.b, f2Var6.a.c, f2Var6.c, 1);
                                        e2Var2.j2(savedStarGift, null);
                                        e2Var2.O1();
                                        break;
                                    default:
                                        f2 f2Var7 = f2Var2;
                                        e2 e2Var3 = new e2(f2Var7, f2Var7.getContext(), f2Var7.b, f2Var7.a.c, f2Var7.c, 2);
                                        e2Var3.j2(savedStarGift, null);
                                        e2Var3.W1();
                                        break;
                                }
                            }
                        }, z14);
                    } else {
                        f2Var2 = f2Var;
                        savedStarGift = savedStarGift2;
                        c1Var2 = c1Var;
                        str = null;
                        u5Var = u5Var2;
                        z11 = true;
                        z11 = true;
                        z11 = true;
                        if (vq0Var.c() && f2Var2.d) {
                            I.c(R.drawable.tabs_reorder, cd.L0(2131750042, null), new u1(f2Var2, 3), z10);
                        }
                    }
                    if (rh.e4.L1(i11, vq0Var.c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, cd.L0(z16 ? 2131749990 : 2131750196, str), new u41(f2Var2, savedStarGift, c1Var2, 15), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        final int i24 = 2;
                        I.l(R.drawable.menu_transfer, cd.L0(2131749927, str), new Runnable() { // from class: ph.v1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i24) {
                                    case 0:
                                        f2 f2Var5 = f2Var2;
                                        e2 e2Var = new e2(f2Var5, f2Var5.getContext(), f2Var5.b, f2Var5.a.c, f2Var5.c, 0);
                                        e2Var.j2(savedStarGift, null);
                                        e2Var.t2(false);
                                        break;
                                    case 1:
                                        f2 f2Var6 = f2Var2;
                                        e2 e2Var2 = new e2(f2Var6, f2Var6.getContext(), f2Var6.b, f2Var6.a.c, f2Var6.c, 1);
                                        e2Var2.j2(savedStarGift, null);
                                        e2Var2.O1();
                                        break;
                                    default:
                                        f2 f2Var7 = f2Var2;
                                        e2 e2Var3 = new e2(f2Var7, f2Var7.getContext(), f2Var7.b, f2Var7.a.c, f2Var7.c, 2);
                                        e2Var3.j2(savedStarGift, null);
                                        e2Var3.W1();
                                        break;
                                }
                            }
                        }, o5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == d20.i(i11).e() ? z11 : z10 ? 1 : 0);
                    }
                    if (u5Var.h() && f2Var2.d) {
                        I.c(R.drawable.msg_removefolder, cd.L0(2131750048, str), new u41(f2Var2, savedStarGift, I, 14), z11);
                        I.E();
                        I.t();
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = org.telegram.messenger.i0.q;
                        int min = Math.min(point.x, point.y);
                        I.N = min - org.telegram.messenger.i0.L(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        c1Var2.D.getImageReceiver().P0(z11);
                        z13 = z11;
                    }
                    z13 = z10;
                }
            }
            z10 = false;
            z13 = z10;
        }
        return Boolean.valueOf(z13);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a51 a51Var = (a51) obj;
        f2 f2Var = this.a;
        vq0 vq0Var = f2Var.a;
        int i10 = f2Var.b;
        if (f2Var.e == null) {
            return;
        }
        Object obj3 = a51Var.G;
        if (obj3 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
            if (!f2Var.h) {
                rh.e4 e4Var = new rh.e4(f2Var.getContext(), f2Var.b, vq0Var.c, f2Var.c, null);
                e4Var.c3 = new u1(f2Var, 2);
                e4Var.J2 = new org.telegram.ui.web.k0(4, f2Var, savedStarGift);
                e4Var.j2(savedStarGift, f2Var.e);
                e4Var.show();
                return;
            }
            if (!f2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                boolean z10 = savedStarGift.pinned_to_top;
                boolean z11 = !z10;
                if (!z10 && savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = f2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                }
                if (f2Var.e.o(savedStarGift, z11, true)) {
                    cc.a0(vq0Var.a).Q(R.raw.chats_infotip, 36, cd.H(',', "GiftsPinLimit", vp.r1(i10).L6)).j();
                }
                if (z10) {
                    return;
                }
                f2Var.f.v0(0);
            }
        }
    }
}
