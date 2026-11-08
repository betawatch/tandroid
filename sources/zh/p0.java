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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        int i13 = 3;
        boolean z9 = false;
        Object obj3 = this.b;
        int i14 = 1;
        switch (i12) {
            case 0:
                ((g1) obj3).d1((ArrayList) obj, (l41) obj2);
                break;
            case 1:
                z1 z1Var = (z1) obj3;
                ArrayList arrayList = (ArrayList) obj;
                f6 f6Var = z1Var.c;
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
                        int i15 = i7;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj4 = arrayList2.get(i16);
                            i16++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z10 = z1Var.d;
                            int i17 = x0.b;
                            x31 K = x31.K(x0.class);
                            K.u = 1;
                            K.z = 0;
                            K.G = savedStarGift;
                            K.q = true;
                            K.f = false;
                            K.r = z10;
                            K.h = z1Var.h && (z1Var.e != up0Var.d || savedStarGift.pinned_to_top);
                            arrayList.add(K);
                            i15--;
                            if (i15 == 0) {
                                i15 = 3;
                            }
                        }
                        v9 v9Var5 = z1Var.e;
                        if (v9Var5.i || !v9Var5.j) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < (i15 <= 0 ? 3 : i15)) {
                                    i18++;
                                    x31 q10 = x31.q(i18, 34);
                                    q10.u = 1;
                                    arrayList.add(q10);
                                }
                            }
                        }
                    }
                    if (up0Var.d == z1Var.e) {
                        arrayList.add(x31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (up0Var.c == p10.i(z1Var.b).e()) {
                            int i19 = k6.z6;
                            int w02 = k6.w0(i19, f6Var);
                            String M0 = id.M0(2131746672, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i20 = a2.b;
                            x31 K2 = x31.K(a2.class);
                            K2.l = M0;
                            K2.z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.i = L;
                            K2.k = 0;
                            K2.q = false;
                            K2.G = f6Var;
                            K2.H = Integer.valueOf(i19);
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
                    up0Var.post(new wg.p(up0Var, 11));
                    break;
                }
                break;
            case 2:
                l3 l3Var = (l3) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                b3 b3Var = l3Var.d;
                ArrayList arrayList4 = b3Var.d;
                int size2 = arrayList4.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj5 = arrayList4.get(i21);
                    i21++;
                    arrayList3.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (b3Var.t || !b3Var.u) {
                    x31 q11 = x31.q(-1, 34);
                    q11.u = 1;
                    arrayList3.add(q11);
                    x31 q12 = x31.q(-2, 34);
                    q12.u = 1;
                    arrayList3.add(q12);
                    x31 q13 = x31.q(-3, 34);
                    q13.u = 1;
                    arrayList3.add(q13);
                    if (b3Var.d.isEmpty()) {
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
                boolean z11 = arrayList3.isEmpty() && !b3Var.t;
                if (l3Var.y != z11) {
                    l3Var.y = z11;
                    l3Var.x.setVisibility(0);
                    l3Var.x.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.95f).scaleY(z11 ? 1.0f : 0.95f).setInterpolator(xq.h).setDuration(320L).setListener(new n2(l3Var, z11, 1)).start();
                    break;
                }
                break;
            case 3:
                k3 k3Var = (k3) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                j3 j3Var = k3Var.Q1;
                if (j3Var != null) {
                    v9 v9Var6 = j3Var.b;
                    b3 b3Var2 = j3Var.c;
                    if (v9Var6 != null && b3Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(k3Var.a).getCurrentTime();
                        arrayList5.add(x31.t(-1, id.M0(2131749771, null)));
                        ArrayList arrayList6 = v9Var6.l;
                        int size3 = arrayList6.size();
                        boolean z12 = true;
                        int i22 = 0;
                        int i23 = 0;
                        while (i23 < size3) {
                            Object obj6 = arrayList6.get(i23);
                            i23++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            int i24 = i14;
                            boolean z13 = z12;
                            if (k3Var.Y1.contains(Long.valueOf(savedStarGift2.gift.id))) {
                                z12 = z13;
                                i14 = i24;
                            } else {
                                boolean z14 = savedStarGift2.can_craft_at <= currentTime ? i24 : 0;
                                x31 i25 = x0.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i25.g = z14;
                                arrayList5.add(i25);
                                i22++;
                                i14 = i24;
                                z12 = false;
                            }
                        }
                        int i26 = i14;
                        boolean z15 = z12;
                        if (v9Var6.i || !v9Var6.j) {
                            int i27 = i22 % 3;
                            int i28 = 6 - i27;
                            int i29 = 0;
                            while (i29 < i28) {
                                x31 q26 = x31.q((i29 - i27) + 1, 35);
                                q26.u = i26;
                                arrayList5.add(q26);
                                i29++;
                                i26 = 1;
                            }
                        } else if (z15) {
                            arrayList5.add(x31.g(id.M0(2131749770, null)));
                        }
                        if (b3Var2.e > 0 || k3Var.b2) {
                            k3Var.b2 = true;
                            String M02 = id.M0(2131749773, null);
                            x31 x31Var = new x31(42);
                            x31Var.d = -2;
                            x31Var.o = M02;
                            arrayList5.add(x31Var);
                            HorizontalScrollView horizontalScrollView = k3Var.R1;
                            if (horizontalScrollView != null) {
                                arrayList5.add(x31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList7 = b3Var2.d;
                            int size4 = arrayList7.size();
                            int i30 = 0;
                            while (i30 < size4) {
                                Object obj7 = arrayList7.get(i30);
                                i30++;
                                arrayList5.add(x0.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (b3Var2.t || !b3Var2.u) {
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
                n3 n3Var = (n3) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                v9 v9Var7 = n3Var.Q1;
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
                        int i31 = 3;
                        int i32 = 0;
                        while (i32 < size5) {
                            Object obj8 = arrayList9.get(i32);
                            i32++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(n3Var.P1))) {
                                int i33 = x0.b;
                                x31 K3 = x31.K(x0.class);
                                K3.u = 1;
                                K3.z = z9 ? 1 : 0;
                                K3.G = savedStarGift3;
                                K3.q = true;
                                K3.f = true;
                                K3.r = z9;
                                HashSet hashSet = n3Var.R1;
                                int i34 = i13;
                                int i35 = savedStarGift3.msg_id;
                                n3 n3Var2 = n3Var;
                                K3.L(hashSet.contains(Long.valueOf(i35 == 0 ? savedStarGift3.saved_id : i35)));
                                K3.u = 1;
                                arrayList8.add(K3);
                                i31--;
                                if (i31 == 0) {
                                    i31 = i34;
                                }
                                i13 = i34;
                                n3Var = n3Var2;
                                z9 = false;
                            }
                        }
                        int i36 = i13;
                        if (v9Var7.i || !v9Var7.j) {
                            int i37 = 0;
                            while (true) {
                                if (i37 < (i31 <= 0 ? i36 : i31)) {
                                    i37++;
                                    x31 q42 = x31.q(i37, 34);
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
