// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y2a implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j3a b;

    public /* synthetic */ y2a(j3a j3aVar, byte b) {
        this.a = b;
        this.b = j3aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // jac
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
        j3a j3aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                nw4 nw4Var = j3aVar.Z1;
                FrameLayout frameLayout = j3aVar.k2;
                boolean z2 = j3aVar.V1;
                boolean z3 = j3aVar.W1;
                TL_stars.StarGift starGift = j3aVar.X1;
                String str = j3aVar.a2;
                boolean z4 = j3aVar.S1;
                int i4 = j3aVar.T1;
                oc7 r1 = oc7.r1(i4);
                long j = j3aVar.U1;
                long L1 = r1.L1(j);
                arrayList.add(c6c.j(-1, j3aVar.c2));
                if (L1 <= 0) {
                    z = 0;
                    arrayList.add(c6c.j(-2, j3aVar.o2));
                    arrayList.add(c6c.D(gm.L(12.0f)));
                } else {
                    z = 0;
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z4) {
                        arrayList.add(c6c.B(-5, null));
                    } else {
                        arrayList.add(c6c.B(-3, null));
                        int i5 = z4 ? 2131749787 : 2131749811;
                        Object[] objArr = new Object[1];
                        objArr[z] = Integer.valueOf((int) starGift.upgrade_stars);
                        c6c i6 = c6c.i(2, nxa.b1(z, jb6.a0(null, null, i5, objArr), 0.78f, null));
                        i6.L(j3aVar.m2);
                        arrayList.add(i6);
                        if (z3) {
                            D2 = jb6.a0(null, null, j < 0 ? 2131750027 : 2131750026, str);
                        } else if (z2) {
                            D2 = jb6.a0(null, null, j < 0 ? 2131749806 : 2131749790, str);
                        } else {
                            if (z4) {
                                a02 = jb6.M0(2131749786, null);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                a02 = jb6.a0(null, null, j >= 0 ? 2131749789 : 2131749805, str);
                            }
                            D2 = gm.D2(gm.N2(a02, -1, i3, new a3a(j3aVar, (byte) 2), null), true);
                        }
                        c6c B = c6c.B(-5, D2);
                        B.g = (z2 || z3) ? false : true;
                        arrayList.add(B);
                    }
                    c6c i7 = c6c.i(1, jb6.M0(z4 ? 2131750118 : 2131750123, null));
                    i7.L(j3aVar.l2);
                    arrayList.add(i7);
                    if (z4) {
                        i2 = 2131750117;
                    } else if (j < 0) {
                        i2 = 2131750122;
                    } else {
                        i = 0;
                        a0 = jb6.a0(null, null, 2131750119, str);
                        arrayList.add(c6c.B(-6, a0));
                        if (frameLayout != null) {
                            int i8 = starGift.gifts_per_round;
                            Object[] objArr2 = new Object[1];
                            objArr2[i] = Integer.valueOf(i8);
                            SpannableStringBuilder D22 = gm.D2(gm.N2(jb6.G(i8, "Gift2AuctionInfoLearnMore2", objArr2), -1, i, new a3a(j3aVar, (byte) 3), null), true);
                            arrayList.add(c6c.j(-43, frameLayout));
                            arrayList.add(c6c.B(-44, D22));
                        }
                    }
                    a0 = jb6.M0(i2, null);
                    i = 0;
                    arrayList.add(c6c.B(-6, a0));
                    if (frameLayout != null) {
                    }
                } else {
                    if (L1 <= 0) {
                        arrayList.add(c6c.B(-3, jb6.a0(null, null, 2131750051, str)));
                    }
                    if (nw4Var != null && (nw4Var.c != null || nw4Var.d != null)) {
                        c6c i9 = c6c.i(3, nxa.b1(false, jb6.a0(null, null, 2131750050, Integer.valueOf((int) nw4Var.g())), 0.78f, null));
                        i9.L(j3aVar.n2);
                        arrayList.add(i9);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.E(jva.v(i4, false).m().amount, ','));
                        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(c6c.B(-7, TextUtils.concat(nxa.b1(false, jb6.V(null, null, 2131750049, spannableStringBuilder), 0.66f, null), " ", gm.E2(gm.N2(jb6.M0(2131750048, null), -1, 0, new a3a(j3aVar, (byte) 4), null), true, gm.L(2.6666667f), gm.L(1.0f)))));
                    }
                }
                if (j3aVar.J1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = j3aVar.X1;
                e3a e3aVar = j3aVar.o2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            gm.t1(e3aVar);
                            j3aVar.dismiss();
                            c41 Z0 = j3aVar.Z0();
                            if (Z0 != null && starGift2 != null && starGift2.limited_per_user) {
                                Z0.R(starGift2.getDocument(), gm.S2(jb6.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        gm.t1(e3aVar);
                        j3aVar.dismiss();
                        jva v = jva.v(j3aVar.T1, false);
                        int i10 = v.a;
                        if (starGift2 != null && v.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = v.H;
                            int i11 = v.F;
                            long j2 = v.G;
                            cf7 Y = cf7.Y(i10);
                            Y.a.c(new md7(Y, arrayList2, i11, j2));
                            nm7.f(i10).k(235, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = j3aVar.b2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    gm.t1(e3aVar);
                    j3aVar.dismiss();
                }
                j3aVar.j2.setLoading(false);
                break;
        }
    }
}
