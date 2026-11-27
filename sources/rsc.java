// default package

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class rsc implements Runnable {
    public final /* synthetic */ wsc a;

    public rsc(wsc wscVar) {
        this.a = wscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0820 A[EDGE_INSN: B:197:0x0820->B:198:0x0820 BREAK  A[LOOP:3: B:189:0x07da->B:195:0x081d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[LOOP:1: B:21:0x015b->B:22:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0490  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        float f;
        ksc kscVar;
        float f2;
        ksc kscVar2;
        ksc kscVar3;
        boolean z;
        k7b k7bVar;
        boolean z2;
        de0 de0Var;
        vsc vscVar;
        RectF Z;
        ksc j2;
        int size;
        ArrayList arrayList;
        int size2;
        float f3;
        Iterator it;
        boolean z3;
        float f4;
        boolean b;
        boolean b2;
        int i;
        int i2;
        float f5;
        float f6;
        zqc zqcVar;
        int size3;
        int i3;
        Iterator it2;
        String string;
        boolean z4;
        JSONObject jSONObject;
        float f7;
        usc uscVar;
        usc uscVar2;
        boolean optBoolean;
        byte b3;
        nl nlVar;
        float f8;
        float f9;
        float f10;
        float f11;
        ksc kscVar4;
        float f12;
        b29 y;
        float f13;
        float f14;
        usc uscVar3;
        float f15;
        float f16;
        float f17;
        wsc wscVar = this.a;
        if (wscVar.b1 || !wscVar.isAttachedToWindow()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = 0;
        float min = wscVar.N0 == 0 ? 0.016666668f : Math.min(0.032f, (uptimeMillis - r4) / 1000.0f);
        wscVar.N0 = uptimeMillis;
        if (wscVar.A()) {
            Iterator it3 = wscVar.f.values().iterator();
            boolean z5 = false;
            while (true) {
                j = j3;
                if (!it3.hasNext()) {
                    break;
                }
                vsc vscVar2 = (vsc) it3.next();
                boolean z6 = vscVar2.K;
                usc uscVar4 = vscVar2.m;
                usc uscVar5 = vscVar2.i;
                String str = vscVar2.a;
                usc uscVar6 = vscVar2.j;
                nl nlVar2 = vscVar2.c;
                usc uscVar7 = vscVar2.g;
                usc uscVar8 = vscVar2.f;
                usc uscVar9 = vscVar2.e;
                usc uscVar10 = vscVar2.h;
                if (z6) {
                    it2 = it3;
                    f7 = min;
                    z4 = z5;
                } else {
                    vscVar2.K = true;
                    if (wscVar.b) {
                        it2 = it3;
                        string = null;
                    } else {
                        it2 = it3;
                        string = wscVar.e.getString(str, null);
                    }
                    if (wscVar.c1 != null) {
                        TL_wallet.cardSticker R = wscVar.R(str);
                        if (R != null) {
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates = R.coordinates;
                            if (string == null) {
                                z4 = z5;
                            } else {
                                z4 = z5;
                                try {
                                    optBoolean = new JSONObject(string).optBoolean("q");
                                } catch (Exception unused) {
                                }
                                wscVar.K(vscVar2, mediaAreaCoordinates, optBoolean);
                            }
                            optBoolean = false;
                            wscVar.K(vscVar2, mediaAreaCoordinates, optBoolean);
                        } else {
                            z4 = z5;
                        }
                    } else {
                        z4 = z5;
                        if (string != null) {
                            try {
                                jSONObject = new JSONObject(string);
                                f7 = min;
                                try {
                                    uscVar10.a((float) jSONObject.optDouble("s", 1.0d));
                                    uscVar = uscVar4;
                                    uscVar2 = uscVar6;
                                } catch (Exception unused2) {
                                    uscVar = uscVar4;
                                    uscVar2 = uscVar6;
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                uscVar5.a((float) jSONObject.optDouble("r", 0.0d));
                                vscVar2.N = jSONObject.optBoolean("q");
                                float[] fArr = {((float) jSONObject.getDouble("x")) * wscVar.Z0, ((float) jSONObject.getDouble("y")) * wscVar.a1, uscVar10.b};
                                uscVar9.a(fArr[0]);
                                uscVar8.a(fArr[1]);
                                uscVar10.a(fArr[2]);
                                vscVar2.H = (byte) 2;
                                long j4 = wscVar.O0 + 1;
                                wscVar.O0 = j4;
                                vscVar2.I = j4;
                                uscVar.a(1.0f);
                                if (vscVar2.J == j) {
                                    long j5 = wscVar.S0 + 1;
                                    wscVar.S0 = j5;
                                    vscVar2.J = j5;
                                }
                                str = str;
                                try {
                                    if (str.equals(wscVar.Q0)) {
                                        wscVar.U0 = vscVar2;
                                        wscVar.T0 = vscVar2;
                                        wscVar.V0 = 1.0f;
                                        wscVar.e();
                                    }
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                                str = str;
                                if (vscVar2.b()) {
                                }
                                while (r7 < r5) {
                                }
                                float f18 = f7;
                                b3 = vscVar2.H;
                                if (b3 == 1) {
                                }
                                z4 = true;
                                if (!vscVar2.b()) {
                                }
                                y = nlVar.y();
                                if (y == null) {
                                }
                                z5 = z4;
                                j3 = j;
                                it3 = it2;
                                min = f8;
                            }
                            if (vscVar2.b()) {
                                vscVar2.a();
                            }
                            for (usc uscVar11 : vscVar2.s) {
                                z4 |= uscVar11.b(f7);
                            }
                            float f182 = f7;
                            b3 = vscVar2.H;
                            if (b3 == 1) {
                                float t = Utilities.t(uscVar9.a + vscVar2.n.a, uscVar8.a + vscVar2.o.a, uscVar9.b, uscVar8.b);
                                if (vscVar2.M || uscVar2.a >= 0.36f || t >= hl.L(24.0f)) {
                                    f13 = 0.28f;
                                } else {
                                    vscVar2.M = true;
                                    ArrayList arrayList2 = wscVar.n;
                                    float f19 = uscVar9.b;
                                    f13 = 0.28f;
                                    float f20 = uscVar8.b;
                                    ssc sscVar = new ssc();
                                    sscVar.a = f19;
                                    sscVar.b = f20;
                                    arrayList2.add(sscVar);
                                }
                                if (vscVar2.L || uscVar2.a >= 0.22f || t >= hl.L(12.0f)) {
                                    f14 = t;
                                    uscVar3 = uscVar8;
                                    f15 = 1.4f;
                                } else {
                                    vscVar2.L = true;
                                    usc uscVar12 = vscVar2.p;
                                    uscVar12.a(1.0f);
                                    uscVar12.b = 0.0f;
                                    usc uscVar13 = wscVar.Q;
                                    boolean z7 = vscVar2.P;
                                    if (z7) {
                                        f16 = 420.0f;
                                        f17 = 0.38f;
                                    } else {
                                        f16 = 260.0f;
                                        f17 = 0.85f;
                                    }
                                    uscVar13.d = f16;
                                    uscVar13.e = f17;
                                    uscVar13.c -= z7 ? 0.75f : f13;
                                    float f21 = z7 ? 3.4f : 1.4f;
                                    usc uscVar14 = wscVar.R;
                                    float f22 = uscVar14.c;
                                    f15 = 1.4f;
                                    float f23 = uscVar9.b;
                                    uscVar14.c = (((f23 / wscVar.Z0) - 0.5f) * 2.0f * f21) + f22;
                                    usc uscVar15 = wscVar.S;
                                    float f24 = uscVar15.c;
                                    float f25 = uscVar8.b;
                                    f14 = t;
                                    uscVar15.c = (((f25 / wscVar.a1) - 0.5f) * 2.0f * f21) + f24;
                                    if (z7) {
                                        Random random = new Random();
                                        int i4 = 0;
                                        while (i4 < 14) {
                                            tsc tscVar = new tsc();
                                            float e = ik8.e(random, 0.35f, (float) ((i4 / 14.0f) * 3.141592653589793d * 2.0d));
                                            float nextFloat = (random.nextFloat() * hl.L(180.0f)) + hl.L(265.0f);
                                            tscVar.a = f23;
                                            tscVar.b = f25;
                                            double d = e;
                                            tscVar.c = ((float) Math.cos(d)) * nextFloat;
                                            tscVar.d = ((float) Math.sin(d)) * nextFloat;
                                            tscVar.e = (random.nextFloat() * hl.L(1.1f)) + hl.L(0.8f);
                                            tscVar.f = ik8.e(random, 0.35f, 0.7f);
                                            tscVar.g = random.nextFloat() * 360.0f;
                                            wscVar.T.add(tscVar);
                                            i4++;
                                            f23 = f23;
                                            uscVar8 = uscVar8;
                                        }
                                    }
                                    uscVar3 = uscVar8;
                                    if (str.equals(wscVar.R0)) {
                                        wscVar.X(vscVar2, false);
                                        wscVar.R0 = null;
                                    }
                                }
                                if (!vscVar2.Q && vscVar2.k.a < 0.3f) {
                                    vscVar2.Q = true;
                                    uscVar7.c -= f15;
                                    wscVar.performHapticFeedback(3);
                                }
                                if (vscVar2.Q && f14 < 0.5f && Math.abs(uscVar7.a - 1.0f) < 0.004f && Math.abs(uscVar7.c) < 0.02f) {
                                    vscVar2.H = (byte) 2;
                                    uscVar9.a(uscVar9.b);
                                    usc uscVar16 = uscVar3;
                                    uscVar16.a(uscVar16.b);
                                }
                                nlVar = nlVar2;
                                f8 = f182;
                            } else if (b3 == 4) {
                                float z8 = qu6.z(f182, vscVar2.b0, vscVar2.W, 1.0f);
                                vscVar2.W = z8;
                                float f26 = 1.0f - z8;
                                float f27 = 1.0f - (f26 * f26);
                                ksc j6 = wscVar.j(vscVar2);
                                float l = Utilities.l(z8 / 0.5f);
                                if (j6 != null) {
                                    f9 = z8;
                                    f8 = f182;
                                    f10 = 1.0f;
                                    f11 = hl.R1(vscVar2.c0, 1.0f, xnb.B(l, 2.0f, 3.0f, l * l));
                                    j6.setScaleX(f11);
                                    j6.setScaleY(f11);
                                } else {
                                    f9 = z8;
                                    f10 = 1.0f;
                                    f8 = f182;
                                    f11 = 1.0f;
                                }
                                RectF Z2 = wscVar.Z(vscVar2);
                                if (Z2 == null) {
                                    uscVar7.a((f10 - f27) * vscVar2.Z);
                                    nlVar = nlVar2;
                                    kscVar4 = j6;
                                    f12 = 1.0f;
                                } else {
                                    float sin = (float) Math.sin(f27 * 3.141592653589793d);
                                    nlVar = nlVar2;
                                    kscVar4 = j6;
                                    float min2 = Math.min(hl.L(90.0f), Utilities.t(Z2.centerX(), Z2.centerY(), vscVar2.X, vscVar2.Y) * 0.28f);
                                    uscVar9.a(hl.R1(vscVar2.X, Z2.centerX(), f27));
                                    uscVar8.a(hl.R1(vscVar2.Y, Z2.centerY(), f27) - ((((1.0f - f27) * 2.0f) * f27) * min2));
                                    uscVar7.a(hl.R1(1.0f, f11, f27) * xnb.z(sin, 0.05f, 1.0f, hl.R1(vscVar2.Z, (wscVar.f(vscVar2) * (Z2.width() / f11)) / wscVar.U(), f27)));
                                    uscVar2.a(sin * 0.8f);
                                    float f28 = vscVar2.a0;
                                    uscVar5.a((wsc.c(-f28) * f27) + f28);
                                    f12 = 1.0f;
                                    uscVar.a(Utilities.l(1.0f - ((f27 - 0.35f) / 0.4f)));
                                }
                                if (f9 >= f12) {
                                    wscVar.g(vscVar2);
                                    if (kscVar4 != null) {
                                        kscVar4.animate().scaleX(0.955f).scaleY(0.955f).setDuration(70L).setInterpolator(null).withEndAction(new nsc(kscVar4, (byte) 1)).start();
                                    }
                                }
                            } else {
                                nlVar = nlVar2;
                                f8 = f182;
                                if (b3 == 5) {
                                    if (uscVar7.a < 0.03f) {
                                        wscVar.g(vscVar2);
                                    }
                                }
                                if (!vscVar2.b()) {
                                    vscVar2.R = true;
                                } else if (vscVar2.H == 0) {
                                    vscVar2.R = false;
                                }
                                y = nlVar.y();
                                if (y == null && y.l0) {
                                    b29 y2 = nlVar.y();
                                    int i5 = y2 == null ? 0 : y2.b0;
                                    if (i5 >= 2) {
                                        vscVar2.T = true;
                                    }
                                    boolean z9 = vscVar2.S && !vscVar2.T && vscVar2.H == 2;
                                    if (vscVar2.l.b == 0.0f && !z9 && y2 != null && i5 < 2) {
                                        nlVar.x0();
                                        nlVar.v0 = false;
                                        vscVar2.S = false;
                                    }
                                    z5 = true;
                                } else {
                                    z5 = z4;
                                }
                                j3 = j;
                                it3 = it2;
                                min = f8;
                            }
                            z4 = true;
                            if (!vscVar2.b()) {
                            }
                            y = nlVar.y();
                            if (y == null) {
                            }
                            z5 = z4;
                            j3 = j;
                            it3 = it2;
                            min = f8;
                        }
                    }
                    f7 = min;
                }
                uscVar = uscVar4;
                uscVar2 = uscVar6;
                if (vscVar2.b()) {
                }
                while (r7 < r5) {
                }
                float f1822 = f7;
                b3 = vscVar2.H;
                if (b3 == 1) {
                }
                z4 = true;
                if (!vscVar2.b()) {
                }
                y = nlVar.y();
                if (y == null) {
                }
                z5 = z4;
                j3 = j;
                it3 = it2;
                min = f8;
            }
            float f29 = min;
            boolean z10 = z5;
            usc uscVar17 = wscVar.r1;
            usc uscVar18 = wscVar.q1;
            boolean z11 = wscVar.b;
            if (!z11) {
                if (wscVar.i1) {
                    vsc vscVar3 = wscVar.l1;
                    if (vscVar3 != null && vscVar3.H == 0 && (j2 = wscVar.j(vscVar3)) != null && wscVar.z(j2) && wsc.b(wscVar.l1)) {
                        vscVar = wscVar.l1;
                    } else {
                        ArrayList arrayList3 = wscVar.h;
                        int size4 = arrayList3.size();
                        int i6 = 0;
                        float f30 = 0.0f;
                        float f31 = 0.0f;
                        vsc vscVar4 = null;
                        while (i6 < size4) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            ksc kscVar5 = (ksc) obj;
                            vsc vscVar5 = (vsc) wscVar.f.get(kscVar5.x0.address);
                            if (vscVar5 != null && vscVar5.H == 0 && wsc.b(vscVar5) && kscVar5.isAttachedToWindow() && wscVar.z(kscVar5) && (Z = wscVar.Z(vscVar5)) != null) {
                                if (vscVar4 != null) {
                                    float f32 = Z.top;
                                    if (f32 >= f30 - 1.0f) {
                                        if (Math.abs(f32 - f30) <= 1.0f && Z.left < f31) {
                                        }
                                    }
                                }
                                f30 = Z.top;
                                f31 = Z.left;
                                vscVar4 = vscVar5;
                            }
                        }
                        vscVar = vscVar4;
                    }
                    if (vscVar != null && vscVar != wscVar.l1) {
                        wscVar.l1 = vscVar;
                        wscVar.n1 = null;
                        wscVar.o1 = 0.0f;
                    }
                }
                vsc vscVar6 = wscVar.l1;
                ksc j7 = vscVar6 == null ? null : wscVar.j(vscVar6);
                boolean z12 = wscVar.i1 && vscVar6 != null && vscVar6.H == 0 && wsc.b(vscVar6) && j7 != null && wscVar.z(j7) && !wscVar.t0 && !wscVar.q0;
                if (vscVar6 != null && (z12 || wscVar.j1)) {
                    vscVar6.a();
                    if (wscVar.n1 == null && vscVar6.u != null) {
                        wscVar.n1 = wscVar.x(vscVar6, wscVar.Z0 * 0.6f, wscVar.a1 * 0.68f, true);
                        vscVar6.N = false;
                    }
                }
                uscVar18.b = z12 ? 1.0f : 0.0f;
                uscVar17.b = ((!z12 && !wscVar.j1) || wscVar.n1 == null || wsc.H(vscVar6) == null) ? 0.0f : 1.0f;
                f = f29;
                boolean b4 = uscVar18.b(f) | uscVar17.b(f);
                float f33 = uscVar18.a;
                boolean z13 = f33 > 0.002f || uscVar17.a > 0.002f;
                if (z13) {
                    float f34 = wscVar.o1 + f;
                    wscVar.o1 = f34;
                    f2 = f34;
                    kscVar = null;
                } else {
                    wscVar.o1 = 0.0f;
                    if (wscVar.i1 || wscVar.j1) {
                        kscVar = null;
                    } else {
                        kscVar = null;
                        wscVar.n1 = null;
                    }
                    f2 = 0.0f;
                }
                if (vscVar6 != null && vscVar6.H == 0 && vscVar6.v != null && f33 > 0.002f) {
                    float[] D = wscVar.D(f2 % 2.0f);
                    if (Utilities.l(uscVar18.a) * Math.max(D[0], Math.max(D[1], D[2])) >= 0.003f) {
                        kscVar2 = j7;
                        kscVar3 = wscVar.m1;
                        if (kscVar3 != null && kscVar3 != kscVar2) {
                            de0Var = kscVar3.E;
                            if (de0Var.getAlpha() != 1.0f) {
                                de0Var.setAlpha(1.0f);
                            }
                            kscVar3.invalidate();
                        }
                        wscVar.m1 = kscVar2;
                        if (kscVar2 != null) {
                            de0 de0Var2 = kscVar2.E;
                            if (de0Var2.getAlpha() != 0.0f) {
                                de0Var2.setAlpha(0.0f);
                            }
                            kscVar2.invalidate();
                        }
                        ksc kscVar6 = (z12 || uscVar18.a <= 0.5f) ? kscVar : j7;
                        RectF rectF = wscVar.w1;
                        if (wscVar.getParent() instanceof ViewGroup) {
                            RectF Z3 = kscVar6 == null ? kscVar : wscVar.Z(wscVar.l1);
                            if (Z3 != null) {
                                kg5 kg5Var = wscVar.x1;
                                if (kg5Var == null) {
                                    kg5Var = wscVar.B(2131742755, true);
                                    wscVar.x1 = kg5Var;
                                } else if (wscVar.k1 && !(z2 = kg5Var.W)) {
                                    wscVar.k1 = false;
                                    wscVar.j1 = false;
                                    wscVar.i1 = false;
                                    if (z2) {
                                        kg5Var.f(true);
                                    }
                                    if (!z11) {
                                        uc7.e1().edit().putBoolean("walletcardstickerhint", true).apply();
                                    }
                                    wscVar.f0();
                                }
                                wsc.J(kg5Var, Z3.centerX(), Z3.top + hl.L(4.0f));
                                kg5 kg5Var2 = wscVar.x1;
                                if (!kg5Var2.W) {
                                    kg5Var2.v();
                                }
                                wscVar.k1 = true;
                            } else {
                                wscVar.k1 = false;
                                kg5 kg5Var3 = wscVar.x1;
                                if (kg5Var3 != null && kg5Var3.W) {
                                    kg5Var3.f(true);
                                }
                            }
                            if (wscVar.j1 && uscVar17.a > 0.5f && (k7bVar = wscVar.d) != null && k7bVar.o() && wscVar.C()) {
                                if (wscVar.y1 == null) {
                                    wscVar.y1 = wscVar.B(2131742756, false);
                                }
                                wscVar.v1.computeBounds(rectF, true);
                                float[] L = wscVar.L(rectF.centerX(), rectF.top);
                                if ((L[1] - hl.L(2.0f)) - hl.L(56.0f) < a.getCurrentActionBarHeight() + hl.m) {
                                    float[] L2 = wscVar.L(rectF.centerX(), rectF.bottom);
                                    kg5 kg5Var4 = wscVar.y1;
                                    float f35 = L2[0];
                                    float L3 = L2[1] + hl.L(2.0f);
                                    wsc.o(kg5Var4, 1);
                                    kg5Var4.o(0.0f, f35 - kg5Var4.getPaddingLeft());
                                    kg5Var4.setTranslationY(L3);
                                    kg5Var4.invalidate();
                                } else {
                                    wsc.J(wscVar.y1, L[0], L[1] - hl.L(2.0f));
                                }
                                kg5 kg5Var5 = wscVar.y1;
                                if (!kg5Var5.W) {
                                    kg5Var5.v();
                                }
                            } else {
                                kg5 kg5Var6 = wscVar.y1;
                                if (kg5Var6 != null && kg5Var6.W) {
                                    kg5Var6.f(true);
                                }
                            }
                        }
                        if (!b4 || z13) {
                            z = true;
                            boolean z14 = z10 | z;
                            size = wscVar.T.size();
                            while (true) {
                                size--;
                                arrayList = wscVar.T;
                                if (size < 0) {
                                    break;
                                }
                                tsc tscVar2 = (tsc) arrayList.get(size);
                                tscVar2.h += f;
                                float exp = (float) Math.exp((-2.4f) * f);
                                float f36 = tscVar2.c * exp;
                                tscVar2.c = f36;
                                float f37 = tscVar2.d * exp;
                                tscVar2.d = f37;
                                tscVar2.a = (f36 * f) + tscVar2.a;
                                tscVar2.b = (f37 * f) + tscVar2.b;
                                tscVar2.g = (f * 90.0f) + tscVar2.g;
                                if (tscVar2.h >= tscVar2.f) {
                                    wscVar.T.remove(size);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                z14 = true;
                            }
                            for (size2 = wscVar.n.size() - 1; size2 >= 0; size2--) {
                                ssc sscVar2 = (ssc) wscVar.n.get(size2);
                                float f38 = sscVar2.c + f;
                                sscVar2.c = f38;
                                if (f38 > 0.42f) {
                                    wscVar.n.remove(size2);
                                }
                            }
                            f3 = wscVar.V0;
                            if (f3 < 1.0f) {
                                wscVar.V0 = qu6.z(f, wscVar.Y0 ? 0.45f : 1.2f, f3, 1.0f);
                                wscVar.e();
                                z14 = true;
                            }
                            it = wscVar.f.values().iterator();
                            boolean z15 = false;
                            while (it.hasNext()) {
                                if (((vsc) it.next()).H == 5) {
                                    z15 = true;
                                }
                            }
                            usc uscVar19 = wscVar.O;
                            uscVar19.b = ((!wscVar.n0 && wscVar.p0 && uscVar19.b > 0.0f) || z15 || wscVar.g0) ? 1.0f : 0.0f;
                            usc uscVar20 = wscVar.P;
                            boolean z16 = wscVar.u0;
                            uscVar20.b = (!z16 || z15 || wscVar.g0) ? 1.0f : 0.0f;
                            z3 = wscVar.g0;
                            usc uscVar21 = wscVar.d0;
                            if (z3) {
                                uscVar21.a(Math.min(66.0f, (f * 60.0f) + uscVar21.a));
                                usc uscVar22 = wscVar.d0;
                                if (uscVar22.a >= 66.0f) {
                                    wscVar.g0 = false;
                                    f4 = 0.0f;
                                    uscVar22.a(0.0f);
                                } else {
                                    f4 = 0.0f;
                                }
                                b = true;
                            } else {
                                f4 = 0.0f;
                                uscVar21.b = z16 ? 28.0f : 0.0f;
                                b = z14 | uscVar21.b(f);
                            }
                            b2 = b | wscVar.O.b(f) | wscVar.P.b(f) | wscVar.Q.b(f) | wscVar.R.b(f) | wscVar.S.b(f);
                            wscVar.c.setStickerImpact(wscVar.Q.a);
                            frc frcVar = wscVar.c;
                            float max = Math.max(-1.0f, Math.min(1.0f, wscVar.R.a));
                            float max2 = Math.max(-1.0f, Math.min(1.0f, wscVar.S.a));
                            i = frcVar.c0;
                            if (i == 0) {
                                oxb oxbVar = new oxb();
                                float[] fArr2 = new float[8];
                                oxbVar.a(1000, 600, 0.0f, 5.0f, false, fArr2);
                                frcVar.d0 = Math.hypot((double) (fArr2[2] - fArr2[4]), (double) (fArr2[3] - fArr2[5])) < Math.hypot((double) (fArr2[0] - fArr2[6]), (double) (fArr2[1] - fArr2[7])) ? 1 : -1;
                                oxbVar.a(1000, 600, 5.0f, 0.0f, false, fArr2);
                                i2 = 0;
                                int i7 = Math.hypot((double) (fArr2[4] - fArr2[6]), (double) (fArr2[5] - fArr2[7])) < Math.hypot((double) (fArr2[0] - fArr2[2]), (double) (fArr2[1] - fArr2[3])) ? 1 : -1;
                                frcVar.c0 = i7;
                                i = i7;
                            } else {
                                i2 = 0;
                            }
                            f5 = i * max2 * 10.0f;
                            f6 = frcVar.d0 * max * 10.0f;
                            zqcVar = frcVar.E;
                            if (zqcVar.m0 == f5 || zqcVar.n0 != f6) {
                                zqcVar.m0 = f5;
                                zqcVar.n0 = f6;
                                zqcVar.b(zqcVar.d0, zqcVar.g0);
                            }
                            wscVar.b0 = wscVar.c.getCardRotationX();
                            wscVar.c0 = wscVar.c.getCardRotationY();
                            ArrayList arrayList4 = wscVar.h;
                            size3 = arrayList4.size();
                            i3 = i2;
                            while (i3 < size3) {
                                Object obj2 = arrayList4.get(i3);
                                i3++;
                                ksc kscVar7 = (ksc) obj2;
                                vsc vscVar7 = (vsc) wscVar.f.get(kscVar7.x0.address);
                                if (vscVar7 != null) {
                                    kscVar7.k(vscVar7.R, true, vscVar7.H == 0 ? f4 : 1.0f);
                                }
                            }
                            wscVar.invalidate();
                            wscVar.M.invalidate();
                            wscVar.N.invalidate();
                            if (b2 && wscVar.n.isEmpty() && !wscVar.q0) {
                                wscVar.N0 = j;
                                return;
                            }
                            wscVar.postOnAnimation(this);
                        }
                    }
                }
                kscVar2 = kscVar;
                kscVar3 = wscVar.m1;
                if (kscVar3 != null) {
                    de0Var = kscVar3.E;
                    if (de0Var.getAlpha() != 1.0f) {
                    }
                    kscVar3.invalidate();
                }
                wscVar.m1 = kscVar2;
                if (kscVar2 != null) {
                }
                if (z12) {
                }
                RectF rectF2 = wscVar.w1;
                if (wscVar.getParent() instanceof ViewGroup) {
                }
                if (!b4) {
                }
                z = true;
                boolean z142 = z10 | z;
                size = wscVar.T.size();
                while (true) {
                    size--;
                    arrayList = wscVar.T;
                    if (size < 0) {
                    }
                }
                if (!arrayList.isEmpty()) {
                }
                while (size2 >= 0) {
                }
                f3 = wscVar.V0;
                if (f3 < 1.0f) {
                }
                it = wscVar.f.values().iterator();
                boolean z152 = false;
                while (it.hasNext()) {
                }
                usc uscVar192 = wscVar.O;
                uscVar192.b = ((!wscVar.n0 && wscVar.p0 && uscVar192.b > 0.0f) || z152 || wscVar.g0) ? 1.0f : 0.0f;
                usc uscVar202 = wscVar.P;
                boolean z162 = wscVar.u0;
                uscVar202.b = (!z162 || z152 || wscVar.g0) ? 1.0f : 0.0f;
                z3 = wscVar.g0;
                usc uscVar212 = wscVar.d0;
                if (z3) {
                }
                b2 = b | wscVar.O.b(f) | wscVar.P.b(f) | wscVar.Q.b(f) | wscVar.R.b(f) | wscVar.S.b(f);
                wscVar.c.setStickerImpact(wscVar.Q.a);
                frc frcVar2 = wscVar.c;
                float max3 = Math.max(-1.0f, Math.min(1.0f, wscVar.R.a));
                float max22 = Math.max(-1.0f, Math.min(1.0f, wscVar.S.a));
                i = frcVar2.c0;
                if (i == 0) {
                }
                f5 = i * max22 * 10.0f;
                f6 = frcVar2.d0 * max3 * 10.0f;
                zqcVar = frcVar2.E;
                if (zqcVar.m0 == f5) {
                }
                zqcVar.m0 = f5;
                zqcVar.n0 = f6;
                zqcVar.b(zqcVar.d0, zqcVar.g0);
                wscVar.b0 = wscVar.c.getCardRotationX();
                wscVar.c0 = wscVar.c.getCardRotationY();
                ArrayList arrayList42 = wscVar.h;
                size3 = arrayList42.size();
                i3 = i2;
                while (i3 < size3) {
                }
                wscVar.invalidate();
                wscVar.M.invalidate();
                wscVar.N.invalidate();
                if (b2) {
                }
                wscVar.postOnAnimation(this);
            }
            f = f29;
            z = false;
            boolean z1422 = z10 | z;
            size = wscVar.T.size();
            while (true) {
                size--;
                arrayList = wscVar.T;
                if (size < 0) {
                }
            }
            if (!arrayList.isEmpty()) {
            }
            while (size2 >= 0) {
            }
            f3 = wscVar.V0;
            if (f3 < 1.0f) {
            }
            it = wscVar.f.values().iterator();
            boolean z1522 = false;
            while (it.hasNext()) {
            }
            usc uscVar1922 = wscVar.O;
            uscVar1922.b = ((!wscVar.n0 && wscVar.p0 && uscVar1922.b > 0.0f) || z1522 || wscVar.g0) ? 1.0f : 0.0f;
            usc uscVar2022 = wscVar.P;
            boolean z1622 = wscVar.u0;
            uscVar2022.b = (!z1622 || z1522 || wscVar.g0) ? 1.0f : 0.0f;
            z3 = wscVar.g0;
            usc uscVar2122 = wscVar.d0;
            if (z3) {
            }
            b2 = b | wscVar.O.b(f) | wscVar.P.b(f) | wscVar.Q.b(f) | wscVar.R.b(f) | wscVar.S.b(f);
            wscVar.c.setStickerImpact(wscVar.Q.a);
            frc frcVar22 = wscVar.c;
            float max32 = Math.max(-1.0f, Math.min(1.0f, wscVar.R.a));
            float max222 = Math.max(-1.0f, Math.min(1.0f, wscVar.S.a));
            i = frcVar22.c0;
            if (i == 0) {
            }
            f5 = i * max222 * 10.0f;
            f6 = frcVar22.d0 * max32 * 10.0f;
            zqcVar = frcVar22.E;
            if (zqcVar.m0 == f5) {
            }
            zqcVar.m0 = f5;
            zqcVar.n0 = f6;
            zqcVar.b(zqcVar.d0, zqcVar.g0);
            wscVar.b0 = wscVar.c.getCardRotationX();
            wscVar.c0 = wscVar.c.getCardRotationY();
            ArrayList arrayList422 = wscVar.h;
            size3 = arrayList422.size();
            i3 = i2;
            while (i3 < size3) {
            }
            wscVar.invalidate();
            wscVar.M.invalidate();
            wscVar.N.invalidate();
            if (b2) {
            }
            wscVar.postOnAnimation(this);
        }
    }
}
