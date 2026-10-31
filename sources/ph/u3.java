package ph;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.x41;
import rh.e6;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ u3(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        char c10;
        String a02;
        int i10;
        String a03;
        CharSequence G2;
        int i11 = this.a;
        g4 g4Var = this.b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kg.m mVar = g4Var.W1;
                FrameLayout frameLayout = g4Var.h2;
                boolean z10 = g4Var.S1;
                boolean z11 = g4Var.T1;
                TL_stars.StarGift starGift = g4Var.U1;
                String str = g4Var.X1;
                boolean z12 = g4Var.P1;
                int i12 = g4Var.Q1;
                vp r12 = vp.r1(i12);
                long j10 = g4Var.R1;
                long M1 = r12.M1(j10);
                arrayList.add(a51.j(-1, g4Var.Z1));
                if (M1 <= 0) {
                    arrayList.add(a51.j(-2, g4Var.l2));
                    arrayList.add(a51.D(org.telegram.messenger.i0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(a51.B(-5, null));
                    } else {
                        arrayList.add(a51.B(-3, null));
                        int i13 = 2;
                        a51 i14 = a51.i(2, h8.Z0(false, cd.a0(null, null, z12 ? 2131749863 : 2131749887, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i14.L(g4Var.j2);
                        arrayList.add(i14);
                        if (z11) {
                            G2 = cd.a0(null, null, j10 < 0 ? 2131750103 : 2131750102, str);
                        } else if (z10) {
                            G2 = cd.a0(null, null, j10 < 0 ? 2131749882 : 2131749866, str);
                        } else {
                            if (z12) {
                                a03 = cd.L0(2131749862, null);
                            } else {
                                a03 = cd.a0(null, null, j10 >= 0 ? 2131749865 : 2131749881, str);
                            }
                            G2 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(a03, new w3(g4Var, i13)), true);
                        }
                        a51 B = a51.B(-5, G2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    a51 i15 = a51.i(1, cd.L0(z12 ? 2131750194 : 2131750199, str2));
                    i15.L(g4Var.i2);
                    arrayList.add(i15);
                    if (z12) {
                        i10 = 2131750193;
                    } else if (j10 < 0) {
                        i10 = 2131750198;
                    } else {
                        c10 = 0;
                        a02 = cd.a0(str2, str2, 2131750195, str);
                        arrayList.add(a51.B(-6, a02));
                        if (frameLayout != null) {
                            int i16 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i16);
                            SpannableStringBuilder G22 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(cd.G(i16, "Gift2AuctionInfoLearnMore2", objArr), new w3(g4Var, 3)), true);
                            arrayList.add(a51.j(-43, frameLayout));
                            arrayList.add(a51.B(-44, G22));
                        }
                    }
                    a02 = cd.L0(i10, str2);
                    c10 = 0;
                    arrayList.add(a51.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (M1 <= 0) {
                        arrayList.add(a51.B(-3, cd.a0(null, null, 2131750127, str)));
                    }
                    if (mVar != null && (mVar.c != null || mVar.d != null)) {
                        a51 i17 = a51.i(3, h8.Z0(false, cd.a0(null, null, 2131750126, Integer.valueOf((int) mVar.g())), 0.78f, null));
                        i17.L(g4Var.k2);
                        arrayList.add(i17);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.E(e6.y(i12, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(a51.B(-7, TextUtils.concat(h8.Z0(false, cd.V(null, null, 2131750125, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750124, null), new w3(g4Var, 4)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)))));
                    }
                }
                if (g4Var.G1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = g4Var.U1;
                b4 b4Var = g4Var.l2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.i0.v1(b4Var);
                            g4Var.dismiss();
                            cc e12 = g4Var.e1();
                            if (e12 != null && starGift2 != null && starGift2.limited_per_user) {
                                e12.R(starGift2.getDocument(), org.telegram.messenger.i0.W2(cd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.i0.v1(b4Var);
                        g4Var.dismiss();
                        e6 y3 = e6.y(g4Var.Q1, false);
                        int i18 = y3.a;
                        if (starGift2 != null && y3.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y3.H;
                            int i19 = y3.F;
                            long j11 = y3.G;
                            hs a04 = hs.a0(i18);
                            a04.a.c(new org.telegram.ui.z(i19, 6, j11, a04, arrayList2));
                            zs.f(i18).k(zs.I3, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = g4Var.Y1;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.i0.v1(b4Var);
                    g4Var.dismiss();
                }
                g4Var.g2.setLoading(false);
                break;
        }
    }
}
