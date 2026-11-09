package zh;

import android.widget.HorizontalScrollView;
import bi.v9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 17;
        int i14 = 3;
        int i15 = 0;
        int i16 = 1;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((g1) obj3).d1((ArrayList) obj, (m41) obj2);
                break;
            case 1:
                z1 z1Var = (z1) obj3;
                ArrayList arrayList = (ArrayList) obj;
                g6 g6Var = z1Var.c;
                vp0 vp0Var = z1Var.a;
                v9 v9Var = z1Var.e;
                if (v9Var != null) {
                    if ((!v9Var.e || v9Var.g != 783) && v9Var.l.size() <= 0) {
                        v9 v9Var2 = z1Var.e;
                        if (v9Var2.j && !v9Var2.i) {
                        }
                    }
                    v9 v9Var3 = z1Var.e;
                    if (v9Var3 == null || (i11 = v9Var3.n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i11);
                    }
                    int max = Math.max(1, i10);
                    v9 v9Var4 = z1Var.e;
                    if (v9Var4 != null) {
                        ArrayList arrayList2 = v9Var4.l;
                        int size = arrayList2.size();
                        int i17 = i7;
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj4 = arrayList2.get(i18);
                            i18++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z9 = z1Var.d;
                            int i19 = x0.b;
                            y31 K = y31.K(x0.class);
                            K.u = 1;
                            K.z = 0;
                            K.G = savedStarGift;
                            K.q = true;
                            K.f = false;
                            K.r = z9;
                            K.h = z1Var.h && (z1Var.e != vp0Var.d || savedStarGift.pinned_to_top);
                            arrayList.add(K);
                            i17--;
                            if (i17 == 0) {
                                i17 = 3;
                            }
                        }
                        v9 v9Var5 = z1Var.e;
                        if (v9Var5.i || !v9Var5.j) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < (i17 <= 0 ? 3 : i17)) {
                                    i20++;
                                    y31 q10 = y31.q(i20, 34);
                                    q10.u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (vp0Var.d == z1Var.e) {
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (vp0Var.c == p10.i(z1Var.b).e()) {
                            int i21 = l6.z6;
                            int w02 = l6.w0(i21, g6Var);
                            String M0 = id.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i22 = a2.b;
                            y31 K2 = y31.K(a2.class);
                            K2.l = M0;
                            K2.z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.q = false;
                            K2.G = g6Var;
                            K2.H = Integer.valueOf(i21);
                            arrayList.add(K2);
                        }
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(y31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.add(0, y31.D(org.telegram.messenger.g0.L(z1Var.H ? 42.0f : 12.0f)));
                    }
                    if (z1Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new k1(z1Var, max, 1));
                    }
                    vp0Var.p();
                    vp0Var.post(new wg.a0(vp0Var, 9));
                    break;
                }
                break;
            case 2:
                m3 m3Var = (m3) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                c3 c3Var = m3Var.d;
                ArrayList arrayList4 = c3Var.d;
                int size2 = arrayList4.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj5 = arrayList4.get(i23);
                    i23++;
                    arrayList3.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (c3Var.t || !c3Var.u) {
                    y31 q11 = y31.q(-1, 34);
                    q11.u = 1;
                    arrayList3.add(q11);
                    y31 q12 = y31.q(-2, 34);
                    q12.u = 1;
                    arrayList3.add(q12);
                    y31 q13 = y31.q(-3, 34);
                    q13.u = 1;
                    arrayList3.add(q13);
                    if (c3Var.d.isEmpty()) {
                        y31 q14 = y31.q(-4, 34);
                        q14.u = 1;
                        arrayList3.add(q14);
                        y31 q15 = y31.q(-5, 34);
                        q15.u = 1;
                        arrayList3.add(q15);
                        y31 q16 = y31.q(-6, 34);
                        q16.u = 1;
                        arrayList3.add(q16);
                        y31 q17 = y31.q(-7, 34);
                        q17.u = 1;
                        arrayList3.add(q17);
                        y31 q18 = y31.q(-8, 34);
                        q18.u = 1;
                        arrayList3.add(q18);
                        y31 q19 = y31.q(-9, 34);
                        q19.u = 1;
                        arrayList3.add(q19);
                        y31 q20 = y31.q(-10, 34);
                        q20.u = 1;
                        arrayList3.add(q20);
                        y31 q21 = y31.q(-11, 34);
                        q21.u = 1;
                        arrayList3.add(q21);
                        y31 q22 = y31.q(-12, 34);
                        q22.u = 1;
                        arrayList3.add(q22);
                        y31 q23 = y31.q(-13, 34);
                        q23.u = 1;
                        arrayList3.add(q23);
                        y31 q24 = y31.q(-14, 34);
                        q24.u = 1;
                        arrayList3.add(q24);
                        y31 q25 = y31.q(-15, 34);
                        q25.u = 1;
                        arrayList3.add(q25);
                    }
                }
                boolean z10 = arrayList3.isEmpty() && !c3Var.t;
                if (m3Var.x != z10) {
                    m3Var.x = z10;
                    m3Var.w.setVisibility(0);
                    m3Var.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(xq.h).setDuration(320L).setListener(new b50(i13, m3Var, z10)).start();
                    break;
                }
                break;
            case 3:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                k3 k3Var = l3Var.Q1;
                if (k3Var != null) {
                    v9 v9Var6 = k3Var.b;
                    c3 c3Var2 = k3Var.c;
                    if (v9Var6 != null && c3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(l3Var.a).getCurrentTime();
                        arrayList5.add(y31.t(-1, id.M0(2131749770, null)));
                        ArrayList arrayList6 = v9Var6.l;
                        int size3 = arrayList6.size();
                        int i24 = 0;
                        int i25 = 0;
                        boolean z11 = true;
                        while (i25 < size3) {
                            Object obj6 = arrayList6.get(i25);
                            i25++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            int i26 = i16;
                            l3 l3Var2 = l3Var;
                            if (l3Var.Y1.contains(Long.valueOf(savedStarGift2.gift.id))) {
                                i16 = i26;
                                l3Var = l3Var2;
                            } else {
                                boolean z12 = savedStarGift2.can_craft_at <= currentTime ? i26 : 0;
                                y31 i27 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i27.g = z12;
                                arrayList5.add(i27);
                                i24++;
                                i16 = i26;
                                l3Var = l3Var2;
                                z11 = false;
                            }
                        }
                        int i28 = i16;
                        l3 l3Var3 = l3Var;
                        if (v9Var6.i || !v9Var6.j) {
                            int i29 = i24 % 3;
                            int i30 = 6 - i29;
                            int i31 = 0;
                            while (i31 < i30) {
                                y31 q26 = y31.q((i31 - i29) + 1, 35);
                                q26.u = i28;
                                arrayList5.add(q26);
                                i31++;
                                i28 = 1;
                            }
                        } else if (z11) {
                            arrayList5.add(y31.g(id.M0(2131749769, null)));
                        }
                        if (c3Var2.e > 0 || l3Var3.b2) {
                            l3Var3.b2 = true;
                            String M02 = id.M0(2131749772, null);
                            y31 y31Var = new y31(42);
                            y31Var.d = -2;
                            y31Var.o = M02;
                            arrayList5.add(y31Var);
                            HorizontalScrollView horizontalScrollView = l3Var3.R1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(y31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList7 = c3Var2.d;
                            int size4 = arrayList7.size();
                            int i32 = 0;
                            while (i32 < size4) {
                                Object obj7 = arrayList7.get(i32);
                                i32++;
                                arrayList5.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (c3Var2.t || !c3Var2.u) {
                                y31 q27 = y31.q(10, 35);
                                q27.u = 1;
                                arrayList5.add(q27);
                                y31 q28 = y31.q(11, 35);
                                q28.u = 1;
                                arrayList5.add(q28);
                                y31 q29 = y31.q(12, 35);
                                q29.u = 1;
                                arrayList5.add(q29);
                                y31 q30 = y31.q(13, 35);
                                q30.u = 1;
                                arrayList5.add(q30);
                                y31 q31 = y31.q(14, 35);
                                q31.u = 1;
                                arrayList5.add(q31);
                                y31 q32 = y31.q(15, 35);
                                q32.u = 1;
                                arrayList5.add(q32);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                o3 o3Var = (o3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                v9 v9Var7 = o3Var.Q1;
                if (v9Var7 != null) {
                    ArrayList arrayList9 = v9Var7.l;
                    arrayList8.add(y31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v9Var7.i && arrayList9.isEmpty()) {
                        y31 q33 = y31.q(1, 34);
                        q33.u = 1;
                        arrayList8.add(q33);
                        y31 q34 = y31.q(2, 34);
                        q34.u = 1;
                        arrayList8.add(q34);
                        y31 q35 = y31.q(3, 34);
                        q35.u = 1;
                        arrayList8.add(q35);
                        y31 q36 = y31.q(4, 34);
                        q36.u = 1;
                        arrayList8.add(q36);
                        y31 q37 = y31.q(5, 34);
                        q37.u = 1;
                        arrayList8.add(q37);
                        y31 q38 = y31.q(6, 34);
                        q38.u = 1;
                        arrayList8.add(q38);
                        y31 q39 = y31.q(7, 34);
                        q39.u = 1;
                        arrayList8.add(q39);
                        y31 q40 = y31.q(8, 34);
                        q40.u = 1;
                        arrayList8.add(q40);
                        y31 q41 = y31.q(9, 34);
                        q41.u = 1;
                        arrayList8.add(q41);
                    } else {
                        int size5 = arrayList9.size();
                        int i33 = 3;
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj8 = arrayList9.get(i34);
                            i34++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(o3Var.P1))) {
                                int i35 = x0.b;
                                y31 K3 = y31.K(x0.class);
                                K3.u = 1;
                                K3.z = 0;
                                K3.G = savedStarGift3;
                                K3.q = true;
                                K3.f = true;
                                K3.r = false;
                                HashSet hashSet = o3Var.R1;
                                int i36 = i14;
                                int i37 = savedStarGift3.msg_id;
                                K3.L(hashSet.contains(Long.valueOf(i37 == 0 ? savedStarGift3.saved_id : i37)));
                                K3.u = 1;
                                arrayList8.add(K3);
                                i33--;
                                if (i33 == 0) {
                                    i33 = i36;
                                }
                                i14 = i36;
                            }
                        }
                        int i38 = i14;
                        if (v9Var7.i || !v9Var7.j) {
                            while (true) {
                                if (i15 < (i33 <= 0 ? i38 : i33)) {
                                    i15++;
                                    y31 q42 = y31.q(i15, 34);
                                    q42.u = 1;
                                    arrayList8.add(q42);
                                }
                            }
                        }
                    }
                    arrayList8.add(y31.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
        }
    }
}
