// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class p4a implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5a b;

    public /* synthetic */ p4a(a5a a5aVar, byte b) {
        this.a = b;
        this.b = a5aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z;
        int i;
        String a0;
        int i2;
        int i3;
        String a02;
        CharSequence D2;
        byte b = this.a;
        a5a a5aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                pw4 pw4Var = a5aVar.Z1;
                FrameLayout frameLayout = a5aVar.k2;
                boolean z2 = a5aVar.V1;
                boolean z3 = a5aVar.W1;
                TL_stars.StarGift starGift = a5aVar.X1;
                String str = a5aVar.a2;
                boolean z4 = a5aVar.S1;
                int i4 = a5aVar.T1;
                uc7 s1 = uc7.s1(i4);
                long j = a5aVar.U1;
                long M1 = s1.M1(j);
                arrayList.add(b8c.j(-1, a5aVar.c2));
                if (M1 <= 0) {
                    z = 0;
                    arrayList.add(b8c.j(-2, a5aVar.o2));
                    arrayList.add(b8c.D(hl.L(12.0f)));
                } else {
                    z = 0;
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z4) {
                        arrayList.add(b8c.B(-5, null));
                    } else {
                        arrayList.add(b8c.B(-3, null));
                        int i5 = z4 ? 2131749800 : 2131749824;
                        Object[] objArr = new Object[1];
                        objArr[z] = Integer.valueOf((int) starGift.upgrade_stars);
                        b8c i6 = b8c.i(2, nza.b1(z, ob6.a0(null, null, i5, objArr), 0.78f, null));
                        i6.L(a5aVar.m2);
                        arrayList.add(i6);
                        if (z3) {
                            D2 = ob6.a0(null, null, j < 0 ? 2131750052 : 2131750051, str);
                        } else if (z2) {
                            D2 = ob6.a0(null, null, j < 0 ? 2131749819 : 2131749803, str);
                        } else {
                            if (z4) {
                                a02 = ob6.M0(2131749799, null);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                a02 = ob6.a0(null, null, j >= 0 ? 2131749802 : 2131749818, str);
                            }
                            D2 = hl.D2(hl.N2(a02, -1, i3, new r4a(a5aVar, (byte) 2), null), true);
                        }
                        b8c B = b8c.B(-5, D2);
                        B.g = (z2 || z3) ? false : true;
                        arrayList.add(B);
                    }
                    b8c i7 = b8c.i(1, ob6.M0(z4 ? 2131750144 : 2131750149, null));
                    i7.L(a5aVar.l2);
                    arrayList.add(i7);
                    if (z4) {
                        i2 = 2131750143;
                    } else if (j < 0) {
                        i2 = 2131750148;
                    } else {
                        i = 0;
                        a0 = ob6.a0(null, null, 2131750145, str);
                        arrayList.add(b8c.B(-6, a0));
                        if (frameLayout != null) {
                            int i8 = starGift.gifts_per_round;
                            Object[] objArr2 = new Object[1];
                            objArr2[i] = Integer.valueOf(i8);
                            SpannableStringBuilder D22 = hl.D2(hl.N2(ob6.G(i8, "Gift2AuctionInfoLearnMore2", objArr2), -1, i, new r4a(a5aVar, (byte) 3), null), true);
                            arrayList.add(b8c.j(-43, frameLayout));
                            arrayList.add(b8c.B(-44, D22));
                        }
                    }
                    a0 = ob6.M0(i2, null);
                    i = 0;
                    arrayList.add(b8c.B(-6, a0));
                    if (frameLayout != null) {
                    }
                } else {
                    if (M1 <= 0) {
                        arrayList.add(b8c.B(-3, ob6.a0(null, null, 2131750077, str)));
                    }
                    if (pw4Var != null && (pw4Var.c != null || pw4Var.d != null)) {
                        b8c i9 = b8c.i(3, nza.b1(false, ob6.a0(null, null, 2131750076, Integer.valueOf((int) pw4Var.g())), 0.78f, null));
                        i9.L(a5aVar.n2);
                        arrayList.add(i9);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.E(jxa.v(i4, false).m().amount, ','));
                        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(b8c.B(-7, TextUtils.concat(nza.b1(false, ob6.V(null, null, 2131750075, spannableStringBuilder), 0.66f, null), " ", hl.E2(hl.N2(ob6.M0(2131750074, null), -1, 0, new r4a(a5aVar, (byte) 4), null), true, hl.L(2.6666667f), hl.L(1.0f)))));
                    }
                }
                if (a5aVar.J1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = a5aVar.X1;
                v4a v4aVar = a5aVar.o2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            hl.t1(v4aVar);
                            a5aVar.dismiss();
                            d31 a1 = a5aVar.a1();
                            if (a1 != null && starGift2 != null && starGift2.limited_per_user) {
                                a1.R(starGift2.getDocument(), hl.S2(ob6.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        hl.t1(v4aVar);
                        a5aVar.dismiss();
                        jxa v = jxa.v(a5aVar.T1, false);
                        int i10 = v.a;
                        if (starGift2 != null && v.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = v.H;
                            int i11 = v.F;
                            long j2 = v.G;
                            jf7 Y = jf7.Y(i10);
                            Y.a.c(new od7(Y, arrayList2, i11, j2));
                            jn7.f(i10).k(235, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = a5aVar.b2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    hl.t1(v4aVar);
                    a5aVar.dismiss();
                }
                a5aVar.j2.setLoading(false);
                break;
        }
    }
}
