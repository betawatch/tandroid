package zh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import bi.dd;
import bi.ea;
import bi.f9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ o3(a4 a4Var, int i7) {
        this.a = i7;
        this.b = a4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        char c10;
        String a02;
        int i7;
        String a03;
        CharSequence H2;
        int i10 = this.a;
        a4 a4Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ug.j jVar = a4Var.W1;
                FrameLayout frameLayout = a4Var.h2;
                boolean z9 = a4Var.S1;
                boolean z10 = a4Var.T1;
                TL_stars.StarGift starGift = a4Var.U1;
                String str = a4Var.X1;
                boolean z11 = a4Var.P1;
                int i11 = a4Var.Q1;
                qp s12 = qp.s1(i11);
                long j3 = a4Var.R1;
                long N1 = s12.N1(j3);
                arrayList.add(x31.j(-1, a4Var.Z1));
                if (N1 <= 0) {
                    arrayList.add(x31.j(-2, a4Var.l2));
                    arrayList.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z11) {
                        arrayList.add(x31.B(-5, null));
                    } else {
                        arrayList.add(x31.B(-3, null));
                        int i12 = 2;
                        x31 i13 = x31.i(2, dd.a1(false, id.a0(null, null, z11 ? 2131749855 : 2131749879, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(a4Var.j2);
                        arrayList.add(i13);
                        if (z10) {
                            H2 = id.a0(null, null, j3 < 0 ? 2131750095 : 2131750094, str);
                        } else if (z9) {
                            H2 = id.a0(null, null, j3 < 0 ? 2131749874 : 2131749858, str);
                        } else {
                            if (z11) {
                                a03 = id.M0(2131749854, null);
                            } else {
                                a03 = id.a0(null, null, j3 >= 0 ? 2131749857 : 2131749873, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(a03, new q3(a4Var, i12)), true);
                        }
                        x31 B = x31.B(-5, H2);
                        B.g = (z9 || z10) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    x31 i14 = x31.i(1, id.M0(z11 ? 2131750186 : 2131750191, str2));
                    i14.L(a4Var.i2);
                    arrayList.add(i14);
                    if (z11) {
                        i7 = 2131750185;
                    } else if (j3 < 0) {
                        i7 = 2131750190;
                    } else {
                        c10 = 0;
                        a02 = id.a0(str2, str2, 2131750187, str);
                        arrayList.add(x31.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(id.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new q3(a4Var, 3)), true);
                            arrayList.add(x31.j(-43, frameLayout));
                            arrayList.add(x31.B(-44, H22));
                        }
                    }
                    a02 = id.M0(i7, str2);
                    c10 = 0;
                    arrayList.add(x31.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (N1 <= 0) {
                        arrayList.add(x31.B(-3, id.a0(null, null, 2131750119, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        x31 i16 = x31.i(3, dd.a1(false, id.a0(null, null, 2131750118, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(a4Var.k2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.E(ea.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(x31.B(-7, TextUtils.concat(dd.a1(false, id.V(null, null, 2131750117, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(id.M0(2131750116, null), new q3(a4Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (a4Var.G1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = a4Var.U1;
                v3 v3Var = a4Var.l2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(v3Var);
                            a4Var.dismiss();
                            hc e12 = a4Var.e1();
                            if (e12 != null && starGift2 != null && starGift2.limited_per_user) {
                                e12.R(starGift2.getDocument(), org.telegram.messenger.g0.X2(id.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(v3Var);
                        a4Var.dismiss();
                        ea y10 = ea.y(a4Var.Q1, false);
                        int i17 = y10.a;
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y10.H;
                            int i18 = y10.F;
                            long j10 = y10.G;
                            yr a04 = yr.a0(i17);
                            a04.a.c(new f9(i18, 0, j10, a04, arrayList2));
                            qs.f(i17).k(qs.I3, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = a4Var.Y1;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(v3Var);
                    a4Var.dismiss();
                }
                a4Var.g2.setLoading(false);
                break;
        }
    }
}
