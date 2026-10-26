package zh;

import bi.t9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vs0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        boolean z10 = false;
        int i14 = 1;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                ((p1) obj3).U((ArrayList) obj, (j71) obj2);
                break;
            case 1:
                m2 m2Var = (m2) obj3;
                ArrayList arrayList = (ArrayList) obj;
                u6 u6Var = m2Var.c;
                vs0 vs0Var = m2Var.a;
                t9 t9Var = m2Var.e;
                if (t9Var != null) {
                    if ((!t9Var.e || t9Var.g != 783) && t9Var.l.size() <= 0) {
                        t9 t9Var2 = m2Var.e;
                        if (t9Var2.j && !t9Var2.i) {
                        }
                    }
                    t9 t9Var3 = m2Var.e;
                    if (t9Var3 == null || (i12 = t9Var3.n) == 0) {
                        i10 = 3;
                        i11 = 3;
                    } else {
                        i10 = 3;
                        i11 = Math.min(3, i12);
                    }
                    int max = Math.max(1, i11);
                    t9 t9Var4 = m2Var.e;
                    if (t9Var4 != null) {
                        ArrayList arrayList2 = t9Var4.l;
                        int size = arrayList2.size();
                        int i15 = i10;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj4 = arrayList2.get(i16);
                            i16++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z11 = m2Var.d;
                            int i17 = f1.a;
                            t61 K = t61.K(f1.class);
                            K.u = 1;
                            K.z = 0;
                            K.G = savedStarGift;
                            K.q = true;
                            K.f = false;
                            K.r = z11;
                            K.h = m2Var.h && (m2Var.e != vs0Var.d || savedStarGift.pinned_to_top);
                            arrayList.add(K);
                            i15--;
                            if (i15 == 0) {
                                i15 = 3;
                            }
                        }
                        t9 t9Var5 = m2Var.e;
                        if (t9Var5.i || !t9Var5.j) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < (i15 <= 0 ? 3 : i15)) {
                                    i18++;
                                    t61 q5 = t61.q(i18, 34);
                                    q5.u = 1;
                                    arrayList.add(q5);
                                }
                            }
                        }
                    }
                    if (vs0Var.d == m2Var.e) {
                        arrayList.add(t61.D(AndroidUtilities.dp(20.0f)));
                        if (vs0Var.c == UserConfig.getInstance(m2Var.b).getClientUserId()) {
                            int i19 = y6.z6;
                            int w02 = y6.w0(i19, u6Var);
                            String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                            int dp = AndroidUtilities.dp(24.0f);
                            int i20 = n2.a;
                            t61 K2 = t61.K(n2.class);
                            K2.l = string;
                            K2.z = 17;
                            K2.B = w02;
                            K2.A = 14.0f;
                            K2.i = dp;
                            K2.k = 0;
                            K2.q = false;
                            K2.G = u6Var;
                            K2.H = Integer.valueOf(i19);
                            arrayList.add(K2);
                        }
                        arrayList.add(t61.D(AndroidUtilities.dp(82.0f)));
                    } else if (!arrayList.isEmpty()) {
                        arrayList.add(t61.D(AndroidUtilities.dp(82.0f)));
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.add(0, t61.D(AndroidUtilities.dp(m2Var.H ? 42.0f : 12.0f)));
                    }
                    if (m2Var.f.getSpanCount() != max) {
                        AndroidUtilities.runOnUIThread(new q1(m2Var, max, i14));
                    }
                    vs0Var.p();
                    vs0Var.post(new ti.g(vs0Var, 23));
                    break;
                }
                break;
            case 2:
                h4 h4Var = (h4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                u3 u3Var = h4Var.d;
                ArrayList arrayList4 = u3Var.d;
                int size2 = arrayList4.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj5 = arrayList4.get(i21);
                    i21++;
                    arrayList3.add(f1.a(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (u3Var.t || !u3Var.u) {
                    t61 q9 = t61.q(-1, 34);
                    q9.u = 1;
                    arrayList3.add(q9);
                    t61 q10 = t61.q(-2, 34);
                    q10.u = 1;
                    arrayList3.add(q10);
                    t61 q11 = t61.q(-3, 34);
                    q11.u = 1;
                    arrayList3.add(q11);
                    if (u3Var.d.isEmpty()) {
                        t61 q12 = t61.q(-4, 34);
                        q12.u = 1;
                        arrayList3.add(q12);
                        t61 q13 = t61.q(-5, 34);
                        q13.u = 1;
                        arrayList3.add(q13);
                        t61 q14 = t61.q(-6, 34);
                        q14.u = 1;
                        arrayList3.add(q14);
                        t61 q15 = t61.q(-7, 34);
                        q15.u = 1;
                        arrayList3.add(q15);
                        t61 q16 = t61.q(-8, 34);
                        q16.u = 1;
                        arrayList3.add(q16);
                        t61 q17 = t61.q(-9, 34);
                        q17.u = 1;
                        arrayList3.add(q17);
                        t61 q18 = t61.q(-10, 34);
                        q18.u = 1;
                        arrayList3.add(q18);
                        t61 q19 = t61.q(-11, 34);
                        q19.u = 1;
                        arrayList3.add(q19);
                        t61 q20 = t61.q(-12, 34);
                        q20.u = 1;
                        arrayList3.add(q20);
                        t61 q21 = t61.q(-13, 34);
                        q21.u = 1;
                        arrayList3.add(q21);
                        t61 q22 = t61.q(-14, 34);
                        q22.u = 1;
                        arrayList3.add(q22);
                        t61 q23 = t61.q(-15, 34);
                        q23.u = 1;
                        arrayList3.add(q23);
                    }
                }
                boolean z12 = arrayList3.isEmpty() && !u3Var.t;
                if (h4Var.x != z12) {
                    h4Var.x = z12;
                    h4Var.w.setVisibility(0);
                    h4Var.w.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.95f).scaleY(z12 ? 1.0f : 0.95f).setInterpolator(ds.h).setDuration(320L).setListener(new b3(h4Var, z12, 1)).start();
                    break;
                }
                break;
            case 3:
                g4.T((g4) obj3, (ArrayList) obj);
                break;
            default:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                t9 t9Var6 = l4Var.Y;
                if (t9Var6 != null) {
                    ArrayList arrayList6 = t9Var6.l;
                    arrayList5.add(t61.D(AndroidUtilities.dp(16.0f)));
                    if (t9Var6.i && arrayList6.isEmpty()) {
                        t61 q24 = t61.q(1, 34);
                        q24.u = 1;
                        arrayList5.add(q24);
                        t61 q25 = t61.q(2, 34);
                        q25.u = 1;
                        arrayList5.add(q25);
                        t61 q26 = t61.q(3, 34);
                        q26.u = 1;
                        arrayList5.add(q26);
                        t61 q27 = t61.q(4, 34);
                        q27.u = 1;
                        arrayList5.add(q27);
                        t61 q28 = t61.q(5, 34);
                        q28.u = 1;
                        arrayList5.add(q28);
                        t61 q29 = t61.q(6, 34);
                        q29.u = 1;
                        arrayList5.add(q29);
                        t61 q30 = t61.q(7, 34);
                        q30.u = 1;
                        arrayList5.add(q30);
                        t61 q31 = t61.q(8, 34);
                        q31.u = 1;
                        arrayList5.add(q31);
                        t61 q32 = t61.q(9, 34);
                        q32.u = 1;
                        arrayList5.add(q32);
                    } else {
                        int size3 = arrayList6.size();
                        int i22 = 3;
                        int i23 = 0;
                        while (i23 < size3) {
                            Object obj6 = arrayList6.get(i23);
                            i23++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!savedStarGift2.collection_id.contains(Integer.valueOf(l4Var.X))) {
                                int i24 = f1.a;
                                t61 K3 = t61.K(f1.class);
                                K3.u = 1;
                                K3.z = z10 ? 1 : 0;
                                K3.G = savedStarGift2;
                                K3.q = true;
                                K3.f = true;
                                K3.r = z10;
                                HashSet hashSet = l4Var.Z;
                                int i25 = savedStarGift2.msg_id;
                                K3.L(hashSet.contains(Long.valueOf(i25 == 0 ? savedStarGift2.saved_id : i25)));
                                K3.u = 1;
                                arrayList5.add(K3);
                                i22--;
                                if (i22 == 0) {
                                    i22 = 3;
                                }
                                z10 = false;
                            }
                        }
                        if (t9Var6.i || !t9Var6.j) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < (i22 <= 0 ? 3 : i22)) {
                                    i26++;
                                    t61 q33 = t61.q(i26, 34);
                                    q33.u = 1;
                                    arrayList5.add(q33);
                                }
                            }
                        }
                    }
                    arrayList5.add(t61.D(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
        }
    }
}
