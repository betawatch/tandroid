// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0a implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h1a b;

    public /* synthetic */ w0a(h1a h1aVar, byte b) {
        this.a = b;
        this.b = h1aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // i8c
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
        CharSequence E2;
        byte b = this.a;
        h1a h1aVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                mu4 mu4Var = h1aVar.Z1;
                FrameLayout frameLayout = h1aVar.k2;
                boolean z2 = h1aVar.V1;
                boolean z3 = h1aVar.W1;
                TL_stars.StarGift starGift = h1aVar.X1;
                String str = h1aVar.a2;
                boolean z4 = h1aVar.S1;
                int i4 = h1aVar.T1;
                na7 q1 = na7.q1(i4);
                long j = h1aVar.U1;
                long K1 = q1.K1(j);
                arrayList.add(c4c.j(-1, h1aVar.c2));
                if (K1 <= 0) {
                    z = 0;
                    arrayList.add(c4c.j(-2, h1aVar.o2));
                    arrayList.add(c4c.D(gl.L(12.0f)));
                } else {
                    z = 0;
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z4) {
                        arrayList.add(c4c.B(-5, null));
                    } else {
                        arrayList.add(c4c.B(-3, null));
                        int i5 = z4 ? 2131749838 : 2131749862;
                        Object[] objArr = new Object[1];
                        objArr[z] = Integer.valueOf((int) starGift.upgrade_stars);
                        c4c i6 = c4c.i(2, jva.a1(z, k96.a0(null, null, i5, objArr), 0.78f, null));
                        i6.L(h1aVar.m2);
                        arrayList.add(i6);
                        if (z3) {
                            E2 = k96.a0(null, null, j < 0 ? 2131750078 : 2131750077, str);
                        } else if (z2) {
                            E2 = k96.a0(null, null, j < 0 ? 2131749857 : 2131749841, str);
                        } else {
                            if (z4) {
                                a02 = k96.M0(2131749837, null);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                a02 = k96.a0(null, null, j >= 0 ? 2131749840 : 2131749856, str);
                            }
                            E2 = gl.E2(gl.O2(a02, -1, i3, new y0a(h1aVar, (byte) 2), null), true);
                        }
                        c4c B = c4c.B(-5, E2);
                        B.g = (z2 || z3) ? false : true;
                        arrayList.add(B);
                    }
                    c4c i7 = c4c.i(1, k96.M0(z4 ? 2131750169 : 2131750174, null));
                    i7.L(h1aVar.l2);
                    arrayList.add(i7);
                    if (z4) {
                        i2 = 2131750168;
                    } else if (j < 0) {
                        i2 = 2131750173;
                    } else {
                        i = 0;
                        a0 = k96.a0(null, null, 2131750170, str);
                        arrayList.add(c4c.B(-6, a0));
                        if (frameLayout != null) {
                            int i8 = starGift.gifts_per_round;
                            Object[] objArr2 = new Object[1];
                            objArr2[i] = Integer.valueOf(i8);
                            SpannableStringBuilder E22 = gl.E2(gl.O2(k96.G(i8, "Gift2AuctionInfoLearnMore2", objArr2), -1, i, new y0a(h1aVar, (byte) 3), null), true);
                            arrayList.add(c4c.j(-43, frameLayout));
                            arrayList.add(c4c.B(-44, E22));
                        }
                    }
                    a0 = k96.M0(i2, null);
                    i = 0;
                    arrayList.add(c4c.B(-6, a0));
                    if (frameLayout != null) {
                    }
                } else {
                    if (K1 <= 0) {
                        arrayList.add(c4c.B(-3, k96.a0(null, null, 2131750102, str)));
                    }
                    if (mu4Var != null && (mu4Var.c != null || mu4Var.d != null)) {
                        c4c i9 = c4c.i(3, jva.a1(false, k96.a0(null, null, 2131750101, Integer.valueOf((int) mu4Var.g())), 0.78f, null));
                        i9.L(h1aVar.n2);
                        arrayList.add(i9);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.E(gta.v(i4, false).m().amount, ','));
                        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(c4c.B(-7, TextUtils.concat(jva.a1(false, k96.V(null, null, 2131750100, spannableStringBuilder), 0.66f, null), " ", gl.F2(gl.O2(k96.M0(2131750099, null), -1, 0, new y0a(h1aVar, (byte) 4), null), true, gl.L(2.6666667f), gl.L(1.0f)))));
                    }
                }
                if (h1aVar.J1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = h1aVar.X1;
                c1a c1aVar = h1aVar.o2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                            gl.t1(c1aVar);
                            h1aVar.dismiss();
                            u21 Z0 = h1aVar.Z0();
                            if (Z0 != null && starGift2 != null && starGift2.limited_per_user) {
                                Z0.R(starGift2.getDocument(), gl.T2(k96.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        gl.t1(c1aVar);
                        h1aVar.dismiss();
                        gta v = gta.v(h1aVar.T1, false);
                        int i10 = v.a;
                        if (starGift2 != null && v.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = v.H;
                            int i11 = v.F;
                            long j2 = v.G;
                            ad7 Y = ad7.Y(i10);
                            Y.a.c(new lb7(Y, arrayList2, i11, j2));
                            kk7.f(i10).k(234, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = h1aVar.b2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    gl.t1(c1aVar);
                    h1aVar.dismiss();
                }
                h1aVar.j2.setLoading(false);
                break;
        }
    }
}
