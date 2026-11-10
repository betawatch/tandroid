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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.c50;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                h6 h6Var = z1Var.c;
                up0 up0Var = z1Var.a;
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
                            x31 K = x31.K(x0.class);
                            K.u = 1;
                            K.z = 0;
                            K.G = savedStarGift;
                            K.q = true;
                            K.f = false;
                            K.r = z9;
                            K.h = z1Var.h && (z1Var.e != up0Var.d || savedStarGift.pinned_to_top);
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
                                    x31 q10 = x31.q(i20, 34);
                                    q10.u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (up0Var.d == z1Var.e) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (up0Var.c == p10.i(z1Var.b).e()) {
                            int i21 = m6.z6;
                            int w02 = m6.w0(i21, h6Var);
                            String M0 = id.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i22 = a2.b;
                            x31 K2 = x31.K(a2.class);
                            K2.l = M0;
                            K2.z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.q = false;
                            K2.G = h6Var;
                            K2.H = Integer.valueOf(i21);
                            arrayList.add(K2);
                        }
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.add(0, x31.D(org.telegram.messenger.g0.L(z1Var.H ? 42.0f : 12.0f)));
                    }
                    if (z1Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new k1(z1Var, max, 1));
                    }
                    up0Var.p();
                    up0Var.post(new wg.a0(up0Var, 9));
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
                    x31 q11 = x31.q(-1, 34);
                    q11.u = 1;
                    arrayList3.add(q11);
                    x31 q12 = x31.q(-2, 34);
                    q12.u = 1;
                    arrayList3.add(q12);
                    x31 q13 = x31.q(-3, 34);
                    q13.u = 1;
                    arrayList3.add(q13);
                    if (c3Var.d.isEmpty()) {
                        x31 q14 = x31.q(-4, 34);
                        q14.u = 1;
                        arrayList3.add(q14);
                        x31 q15 = x31.q(-5, 34);
                        q15.u = 1;
                        arrayList3.add(q15);
                        x31 q16 = x31.q(-6, 34);
                        q16.u = 1;
                        arrayList3.add(q16);
                        x31 q17 = x31.q(-7, 34);
                        q17.u = 1;
                        arrayList3.add(q17);
                        x31 q18 = x31.q(-8, 34);
                        q18.u = 1;
                        arrayList3.add(q18);
                        x31 q19 = x31.q(-9, 34);
                        q19.u = 1;
                        arrayList3.add(q19);
                        x31 q20 = x31.q(-10, 34);
                        q20.u = 1;
                        arrayList3.add(q20);
                        x31 q21 = x31.q(-11, 34);
                        q21.u = 1;
                        arrayList3.add(q21);
                        x31 q22 = x31.q(-12, 34);
                        q22.u = 1;
                        arrayList3.add(q22);
                        x31 q23 = x31.q(-13, 34);
                        q23.u = 1;
                        arrayList3.add(q23);
                        x31 q24 = x31.q(-14, 34);
                        q24.u = 1;
                        arrayList3.add(q24);
                        x31 q25 = x31.q(-15, 34);
                        q25.u = 1;
                        arrayList3.add(q25);
                    }
                }
                boolean z10 = arrayList3.isEmpty() && !c3Var.t;
                if (m3Var.x != z10) {
                    m3Var.x = z10;
                    m3Var.w.setVisibility(0);
                    m3Var.w.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.95f).scaleY(z10 ? 1.0f : 0.95f).setInterpolator(wq.h).setDuration(320L).setListener(new c50(i13, m3Var, z10)).start();
                    break;
                }
                break;
            case 3:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                k3 k3Var = l3Var.T1;
                if (k3Var != null) {
                    v9 v9Var6 = k3Var.b;
                    c3 c3Var2 = k3Var.c;
                    if (v9Var6 != null && c3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(l3Var.a).getCurrentTime();
                        arrayList5.add(x31.t(-1, id.M0(2131749770, null)));
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
                            if (l3Var.b2.contains(Long.valueOf(savedStarGift2.gift.id))) {
                                i16 = i26;
                                l3Var = l3Var2;
                            } else {
                                boolean z12 = savedStarGift2.can_craft_at <= currentTime ? i26 : 0;
                                x31 i27 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
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
                                x31 q26 = x31.q((i31 - i29) + 1, 35);
                                q26.u = i28;
                                arrayList5.add(q26);
                                i31++;
                                i28 = 1;
                            }
                        } else if (z11) {
                            arrayList5.add(x31.g(id.M0(2131749769, null)));
                        }
                        if (c3Var2.e > 0 || l3Var3.e2) {
                            l3Var3.e2 = true;
                            String M02 = id.M0(2131749772, null);
                            x31 x31Var = new x31(42);
                            x31Var.d = -2;
                            x31Var.o = M02;
                            arrayList5.add(x31Var);
                            HorizontalScrollView horizontalScrollView = l3Var3.U1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(x31.j(-3, horizontalScrollView));
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
                                x31 q27 = x31.q(10, 35);
                                q27.u = 1;
                                arrayList5.add(q27);
                                x31 q28 = x31.q(11, 35);
                                q28.u = 1;
                                arrayList5.add(q28);
                                x31 q29 = x31.q(12, 35);
                                q29.u = 1;
                                arrayList5.add(q29);
                                x31 q30 = x31.q(13, 35);
                                q30.u = 1;
                                arrayList5.add(q30);
                                x31 q31 = x31.q(14, 35);
                                q31.u = 1;
                                arrayList5.add(q31);
                                x31 q32 = x31.q(15, 35);
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
                v9 v9Var7 = o3Var.T1;
                if (v9Var7 != null) {
                    ArrayList arrayList9 = v9Var7.l;
                    arrayList8.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v9Var7.i && arrayList9.isEmpty()) {
                        x31 q33 = x31.q(1, 34);
                        q33.u = 1;
                        arrayList8.add(q33);
                        x31 q34 = x31.q(2, 34);
                        q34.u = 1;
                        arrayList8.add(q34);
                        x31 q35 = x31.q(3, 34);
                        q35.u = 1;
                        arrayList8.add(q35);
                        x31 q36 = x31.q(4, 34);
                        q36.u = 1;
                        arrayList8.add(q36);
                        x31 q37 = x31.q(5, 34);
                        q37.u = 1;
                        arrayList8.add(q37);
                        x31 q38 = x31.q(6, 34);
                        q38.u = 1;
                        arrayList8.add(q38);
                        x31 q39 = x31.q(7, 34);
                        q39.u = 1;
                        arrayList8.add(q39);
                        x31 q40 = x31.q(8, 34);
                        q40.u = 1;
                        arrayList8.add(q40);
                        x31 q41 = x31.q(9, 34);
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
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(o3Var.S1))) {
                                int i35 = x0.b;
                                x31 K3 = x31.K(x0.class);
                                K3.u = 1;
                                K3.z = 0;
                                K3.G = savedStarGift3;
                                K3.q = true;
                                K3.f = true;
                                K3.r = false;
                                HashSet hashSet = o3Var.U1;
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
                                    x31 q42 = x31.q(i15, 34);
                                    q42.u = 1;
                                    arrayList8.add(q42);
                                }
                            }
                        }
                    }
                    arrayList8.add(x31.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
        }
    }
}
