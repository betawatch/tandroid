// default package

import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yc2 {
    public boolean A;
    public boolean A1;
    public float A2;
    public boolean B;
    public int[] B0;
    public int B1;
    public float B2;
    public boolean C;
    public boolean C0;
    public boolean C1;
    public int C2;
    public float D;
    public boolean D0;
    public boolean D1;
    public int D2;
    public float E;
    public boolean E1;
    public boolean E2;
    public int F;
    public boolean F0;
    public boolean F1;
    public StaticLayout F2;
    public boolean G;
    public boolean G0;
    public boolean G1;
    public boolean G2;
    public StaticLayout H;
    public boolean H0;
    public int H1;
    public int H2;
    public StaticLayout I;
    public ArrayList I0;
    public int I1;
    public int I2;
    public float J;
    public ArrayList J0;
    public boolean J1;
    public int J2;
    public float K;
    public int K0;
    public boolean K1;
    public float K2;
    public float L;
    public boolean L0;
    public boolean L2;
    public float M;
    public uj9 M0;
    public boolean M2;
    public int N;
    public uj9 N0;
    public boolean N2;
    public int O;
    public float O0;
    public boolean O1;
    public boolean O2;
    public int P;
    public cn P0;
    public int P1;
    public boolean P2;
    public int Q;
    public float Q0;
    public int Q1;
    public boolean Q2;
    public boolean R;
    public float R0;
    public boolean R2;
    public float S;
    public StaticLayout S0;
    public boolean S2;
    public boolean T;
    public cn T0;
    public float T1;
    public int T2;
    public StaticLayout U;
    public boolean U0;
    public float U1;
    public int U2;
    public boolean V;
    public StaticLayout V0;
    public float V1;
    public boolean V2;
    public StaticLayout W;
    public StaticLayout W0;
    public float W1;
    public int W2;
    public float X;
    public int X0;
    public boolean X1;
    public int X2;
    public int Y;
    public int Y0;
    public int Y1;
    public boolean Y2;
    public int Z;
    public int Z0;
    public int Z1;
    public boolean Z2;
    public final rc2 a;
    public int a0;
    public boolean a1;
    public boolean a2;
    public boolean a3;
    public float b;
    public boolean b0;
    public boolean b1;
    public boolean b3;
    public float c;
    public boolean c0;
    public i47 c1;
    public int c2;
    public boolean c3;
    public float d;
    public boolean d0;
    public i47 d1;
    public StaticLayout d2;
    public HashSet d3;
    public float e;
    public float e0;
    public boolean e1;
    public StaticLayout e2;
    public HashSet e3;
    public float f;
    public String f0;
    public boolean f1;
    public boolean f2;
    public boolean f3;
    public float g;
    public boolean g0;
    public int g1;
    public boolean g2;
    public boolean g3;
    public boolean h;
    public float h0;
    public int h1;
    public boolean h2;
    public boolean h3;
    public boolean i;
    public float i0;
    public boolean i1;
    public boolean i2;
    public boolean i3;
    public boolean j;
    public float j0;
    public int j1;
    public StaticLayout j2;
    public boolean j3;
    public boolean k;
    public float k0;
    public int k1;
    public boolean k2;
    public StaticLayout k3;
    public String l;
    public float l0;
    public boolean l1;
    public boolean l2;
    public StaticLayout l3;
    public float m;
    public float m0;
    public boolean m1;
    public boolean m2;
    public cn m3;
    public StaticLayout n;
    public float n0;
    public boolean n1;
    public float n2;
    public StaticLayout o;
    public float o0;
    public boolean o1;
    public float o2;
    public boolean p;
    public float p0;
    public float p1;
    public float p2;
    public boolean q;
    public float q0;
    public float q1;
    public int q2;
    public float r;
    public float r0;
    public float r1;
    public int r2;
    public float s;
    public float s0;
    public float s1;
    public boolean s2;
    public float t;
    public boolean t0;
    public boolean t1;
    public int t2;
    public float u;
    public int u1;
    public boolean u2;
    public boolean v;
    public boolean v1;
    public int v2;
    public int w;
    public boolean w0;
    public boolean w1;
    public int w2;
    public int x;
    public boolean x0;
    public boolean x1;
    public boolean x2;
    public int y;
    public boolean y0;
    public int y1;
    public boolean z;
    public boolean z0;
    public boolean z1;
    public final int[] u0 = new int[4];
    public float v0 = 1.0f;
    public float A0 = 1.0f;
    public final Rect E0 = new Rect();
    public float L1 = 1.0f;
    public final ArrayList M1 = new ArrayList();
    public final ArrayList N1 = new ArrayList();
    public float R1 = 0.0f;
    public float S1 = 1.0f;
    public int b2 = -1;
    public final StaticLayout[] y2 = new StaticLayout[2];
    public final StaticLayout[] z2 = new StaticLayout[2];

    public yc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:432:0x03aa, code lost:
    
        if (r6 == (r11 == null ? 0 : r11.c)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        if (android.text.TextUtils.equals(((al9) r1).X.url, ((al9) r3).X.url) != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        boolean z2;
        float f;
        int i;
        int i2;
        int i3;
        tc2 tc2Var;
        HashSet hashSet;
        HashSet hashSet2;
        int size;
        boolean z3;
        k47 k47Var;
        int i4;
        k47 k47Var2;
        StaticLayout staticLayout;
        lk1 lk1Var;
        uj9 uj9Var;
        en enVar;
        rc2 rc2Var = this.a;
        l39 l39Var = rc2Var.O;
        ArrayList arrayList = rc2Var.I5;
        if (!this.w0) {
            return false;
        }
        this.w1 = false;
        this.G0 = false;
        boolean z4 = this.F0;
        boolean z5 = rc2Var.Y6;
        byte b = 1;
        if (z4 != z5) {
            this.G0 = true;
            z = true;
        } else {
            z = false;
        }
        this.H0 = false;
        k47 k47Var3 = rc2Var.Q5;
        ArrayList arrayList2 = k47Var3.B2;
        ArrayList arrayList3 = this.J0;
        if (arrayList2 != arrayList3) {
            boolean z6 = k47Var3.v2 == this.K0 || z4 == z5;
            if (arrayList2 != null && arrayList3 != null && arrayList2.size() == this.J0.size()) {
                for (int i5 = 0; i5 < this.J0.size(); i5++) {
                    String charSequence = ((h47) rc2Var.Q5.B2.get(i5)).e == null ? null : ((h47) rc2Var.Q5.B2.get(i5)).e.getText().toString();
                    String charSequence2 = ((h47) this.J0.get(i5)).e == null ? null : ((h47) this.J0.get(i5)).e.getText().toString();
                    if (charSequence == null) {
                        if (charSequence2 != null) {
                        }
                        if (!charSequence.equals(charSequence2)) {
                            cn cnVar = rc2Var.Ma;
                            if (cnVar != null) {
                                StaticLayout staticLayout2 = ((h47) rc2Var.Q5.B2.get(i5)).e;
                                StaticLayout staticLayout3 = ((h47) this.J0.get(i5)).e;
                                HashMap hashMap = cnVar.b;
                                if (staticLayout3 != null && (enVar = (en) hashMap.remove(staticLayout3)) != null) {
                                    ArrayList arrayList4 = enVar.b;
                                    enVar.a = staticLayout2;
                                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                                        ((bn) arrayList4.get(i6)).c = staticLayout2;
                                    }
                                    hashMap.put(staticLayout2, enVar);
                                }
                            }
                        }
                    } else {
                        if (charSequence2 == null) {
                        }
                        if (!charSequence.equals(charSequence2)) {
                        }
                    }
                }
                if (z6) {
                    this.H0 = true;
                    ArrayList arrayList5 = this.J0;
                    this.I0 = arrayList5;
                    this.O0 = this.p2;
                    this.P0 = gn.update(0, (View) rc2Var, this.P0, (ArrayList<h47>) arrayList5, true);
                    rc2Var.Ma = gn.update(0, rc2Var, rc2Var.Ma, (ArrayList<h47>) rc2Var.Q5.B2);
                    z = true;
                } else {
                    rc2Var.Ma = gn.update(0, rc2Var, rc2Var.Ma, (ArrayList<h47>) rc2Var.Q5.B2);
                }
            }
            z6 = false;
            if (z6) {
            }
        }
        uj9 uj9Var2 = rc2Var.Q5.y2;
        if (uj9Var2 != null && (uj9Var2.s || uj9Var2.u)) {
            this.w1 = true;
            z = true;
        }
        this.L0 = false;
        if (uj9Var2 != this.N0) {
            oi7 oi7Var = rc2Var.Mc;
            boolean z7 = oi7Var != null && oi7Var.h;
            uj9 uj9Var3 = this.M0;
            if (uj9Var3 != null) {
                uj9Var3.f(rc2Var);
                this.M0 = null;
            }
            k47 k47Var4 = rc2Var.Q5;
            if (z7) {
                uj9 uj9Var4 = k47Var4.y2;
                if (uj9Var4 != null && (uj9Var = this.N0) != null) {
                    uj9Var4.I(uj9Var);
                }
            } else {
                uj9 uj9Var5 = k47Var4.y2;
                if (uj9Var5 != null) {
                    uj9 uj9Var6 = this.N0;
                    ArrayList arrayList6 = uj9Var5.g;
                    if (uj9Var6 != null) {
                        ArrayList arrayList7 = uj9Var6.g;
                        if (arrayList6.size() == 1 && arrayList7.size() == 1) {
                            qi9 qi9Var = (qi9) arrayList6.get(0);
                            qi9 qi9Var2 = (qi9) arrayList7.get(0);
                            if (qi9Var instanceof al9) {
                                if (qi9Var2 instanceof al9) {
                                }
                            }
                        }
                    }
                }
                this.L0 = true;
                uj9 uj9Var7 = this.N0;
                this.M0 = uj9Var7;
                if (uj9Var7 != null) {
                    uj9Var7.b(rc2Var);
                }
            }
        }
        this.P2 = false;
        if (rc2Var.w9 != this.N2) {
            this.P2 = true;
            z = true;
        }
        this.Q2 = false;
        if (rc2Var.x9 != this.O2) {
            this.Q2 = true;
            z = true;
        }
        StaticLayout staticLayout4 = rc2Var.R7;
        if (staticLayout4 != this.F2) {
            CharSequence text = staticLayout4 != null ? staticLayout4.getText() : null;
            StaticLayout staticLayout5 = this.F2;
            if (!TextUtils.equals(text, staticLayout5 != null ? staticLayout5.getText() : null)) {
                this.R0 = this.Q0;
                StaticLayout staticLayout6 = this.F2;
                this.S0 = staticLayout6;
                this.K2 = this.J2;
                this.T0 = gn.update(0, (View) rc2Var, false, this.T0, true, staticLayout6);
                z = true;
            }
        }
        boolean z8 = rc2Var.vb;
        if (z8 && !this.a1 && rc2Var.L9 != null) {
            String M0 = jb6.M0(2131751147, "EditedMessage");
            CharSequence text2 = rc2Var.L9.getText();
            int indexOf = text2.toString().indexOf(M0);
            if (indexOf >= 0) {
                if (indexOf == 0) {
                    TextPaint textPaint = cmb.S2;
                    int L = gm.L(100.0f) + rc2Var.N9;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.V0 = new StaticLayout(M0, textPaint, L, alignment, 1.0f, 0.0f, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) M0);
                    spannableStringBuilder.append(text2.subSequence(M0.length(), text2.length()));
                    spannableStringBuilder.setSpan(new vy2(b), 0, M0.length(), 0);
                    this.W0 = new StaticLayout(spannableStringBuilder, cmb.S2, gm.L(100.0f) + rc2Var.N9, alignment, 1.0f, 0.0f, false);
                    this.Z0 = rc2Var.M9 - this.Y0;
                } else {
                    this.Z0 = 0;
                    this.V0 = null;
                    this.W0 = this.j2;
                }
                this.U0 = true;
                this.X0 = this.Y0;
                this.h1 = this.g1;
                this.i1 = true;
                z = true;
            }
            rc2Var.P2 = null;
        } else if (!z8 && this.a1 && rc2Var.L9 != null) {
            this.W0 = this.j2;
            int i7 = rc2Var.M9;
            int i8 = this.Y0;
            this.Z0 = i7 - i8;
            this.U0 = true;
            this.X0 = i8;
            this.h1 = this.g1;
            this.i1 = true;
            z = true;
        }
        this.m1 = false;
        if (rc2Var.I6 != this.l1) {
            this.m1 = true;
            z = true;
        }
        this.t1 = false;
        if (rc2Var.x1 != this.v) {
            this.t1 = true;
            float f2 = this.d;
            this.p1 = f2;
            float f3 = this.e;
            this.q1 = f3;
            this.r1 = (f2 / 2.0f) + this.b;
            this.s1 = (f3 / 2.0f) + this.c;
            z = true;
        }
        this.v1 = false;
        int i9 = rc2Var.g0;
        int i10 = this.w;
        if (i9 != i10) {
            this.w1 = true;
            this.u1 = i10;
            this.v1 = true;
            z = true;
        }
        this.z1 = false;
        int i11 = rc2Var.W;
        int i12 = this.x;
        if (i11 != i12) {
            this.y1 = i12;
            this.z1 = true;
            z = true;
        }
        this.x1 = false;
        if ((rc2Var.T != null) != this.z) {
            this.x1 = true;
            z = true;
        }
        this.C1 = false;
        int i13 = rc2Var.e0;
        int i14 = this.y;
        if (i13 != i14) {
            this.B1 = i14;
            this.C1 = true;
            z = true;
        }
        this.A1 = false;
        if ((rc2Var.b0 != null) != this.A) {
            this.A1 = true;
            z = true;
        }
        this.M2 = false;
        if ((rc2Var.Q5.D == 27 && (lk1Var = rc2Var.w) != null && lk1Var.d()) != this.L2) {
            this.M2 = true;
            z = true;
        }
        this.E1 = false;
        if (rc2Var.v1 != this.D1) {
            this.E1 = true;
            z = true;
        }
        this.G1 = false;
        if (rc2Var.w1 != this.F1) {
            this.G1 = true;
            z = true;
        }
        this.J1 = false;
        if (rc2Var.R1) {
            int i15 = rc2Var.W1;
            int i16 = this.H1;
            if (i15 != i16) {
                this.J1 = true;
                this.I1 = i16;
                z = true;
            }
        }
        this.o1 = false;
        if (rc2Var.I4 != this.n1) {
            this.o1 = true;
            z = true;
        }
        k47 k47Var5 = rc2Var.Q5;
        boolean z9 = k47Var5 != null ? k47Var5.M2 : false;
        i47 i47Var = rc2Var.m3;
        i47 i47Var2 = this.d1;
        if (i47Var != i47Var2) {
            String charSequence3 = i47Var2 == null ? null : i47Var2.a.toString();
            i47 i47Var3 = rc2Var.m3;
            String charSequence4 = i47Var3 == null ? null : i47Var3.a.toString();
            if (this.F0 != rc2Var.Y6 || this.e1 != z9) {
                i47 i47Var4 = rc2Var.m3;
                int i17 = i47Var4 == null ? 0 : i47Var4.c;
                i47 i47Var5 = this.d1;
            }
            if ((charSequence4 == null) == (charSequence3 == null) && (charSequence3 == null || charSequence3.equals(charSequence4))) {
                rc2Var.S3();
                float f4 = this.f;
                if (f4 != rc2Var.s3 || this.g != rc2Var.t3) {
                    this.t0 = true;
                    this.r0 = f4;
                    this.s0 = this.g;
                    z = true;
                }
            }
            this.b1 = true;
            i47 i47Var6 = this.d1;
            this.c1 = i47Var6;
            this.P0 = gn.update(0, rc2Var, (cn) null, (ArrayList<h47>) (i47Var6 == null ? null : i47Var6.e));
            cn cnVar2 = rc2Var.Ma;
            i47 i47Var7 = rc2Var.m3;
            rc2Var.Ma = gn.update(0, rc2Var, cnVar2, (ArrayList<h47>) (i47Var7 == null ? null : i47Var7.e));
            if (this.F0 != rc2Var.Y6 || this.e1 != z9) {
                this.t0 = true;
                this.r0 = this.f;
                this.s0 = this.g;
            }
            z = true;
        } else if (i47Var != null && i47Var2 != null) {
            rc2Var.S3();
            float f5 = this.f;
            if (f5 != rc2Var.s3 || this.g != rc2Var.t3) {
                this.t0 = true;
                this.r0 = f5;
                this.s0 = this.g;
                z = true;
            }
        }
        ArrayList arrayList8 = this.M1;
        if (!arrayList8.isEmpty() || !arrayList.isEmpty()) {
            if (arrayList8.size() != arrayList.size()) {
                this.E2 = true;
            }
            if (!this.E2) {
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    wp0 wp0Var = (wp0) arrayList.get(i18);
                    wp0 wp0Var2 = (wp0) arrayList8.get(i18);
                    if (!wp0Var.b && !wp0Var2.b && (Math.abs(wp0Var.c - wp0Var2.c) > 0.01f || Math.abs(wp0Var.e - wp0Var2.e) > 0.01f || !TextUtils.equals(wp0Var.h.i(), wp0Var2.h.i()))) {
                        this.E2 = true;
                        break;
                    }
                }
            }
            if (this.E2) {
                this.N1.addAll(arrayList8);
            }
        }
        int i19 = this.Q1;
        if (i19 != rc2Var.K5) {
            this.P1 = i19;
            this.O1 = true;
        }
        byte b2 = rc2Var.M1;
        if (b2 == 5 || b2 == 3 || b2 == 1) {
            float f6 = rc2Var.K3;
            float f7 = this.T1;
            if (f6 != f7 || rc2Var.L3 != this.U1) {
                this.V1 = f7;
                this.W1 = this.U1;
                this.X1 = true;
                z = true;
            }
        }
        int i20 = rc2Var.X1;
        int i21 = this.Y1;
        if (i20 != i21) {
            this.Z1 = i21;
            this.a2 = true;
            z = true;
        }
        if (this.B != rc2Var.q6) {
            this.C = true;
            rc2Var.P2 = null;
            z2 = true;
            z = true;
        } else {
            z2 = false;
        }
        if ((this.H != null || rc2Var.sa != null) && this.F != rc2Var.getRepliesCount()) {
            this.I = this.H;
            this.G = true;
            rc2Var.P2 = null;
            z2 = true;
            z = true;
        }
        if (this.d2 != null && this.c2 != rc2Var.getMessageObject().k.views) {
            this.e2 = this.d2;
            rc2Var.P2 = null;
            z2 = true;
            z = true;
        }
        if (rc2Var.n7 != null && this.N != rc2Var.getRepliesCount()) {
            StaticLayout staticLayout7 = this.U;
            if (staticLayout7 == null || TextUtils.equals(staticLayout7.getText(), rc2Var.n7.getText())) {
                this.W = null;
            } else {
                this.W = this.U;
            }
            this.Y = this.O;
            this.X = this.S;
            this.Z = this.P;
            this.a0 = this.Q;
            this.b0 = this.R;
            this.c0 = this.T;
            this.V = true;
            z = true;
        }
        if (!TextUtils.equals(this.f0, rc2Var.z5)) {
            this.d0 = true;
            this.e0 = rc2Var.t9;
            z = true;
        }
        if (this.f1 == rc2Var.S9) {
            this.K1 = true;
            this.e2 = null;
        } else {
            if (this.f2 == rc2Var.I3()) {
                if (z2 || (Math.abs(rc2Var.O9 - this.g1) > 1 && this.F0 == rc2Var.Y6)) {
                    this.i1 = true;
                    this.X0 = this.Y0;
                    this.h1 = this.g1;
                    this.L = this.M;
                    this.J = this.K;
                    this.E = this.D;
                }
                if (this.h2 != rc2Var.H3()) {
                    this.i2 = true;
                }
                if (this.k != rc2Var.h3) {
                    this.j = true;
                }
                if (this.k2 != rc2Var.Lb) {
                    this.l2 = true;
                    z = true;
                }
                f = this.n2;
                if (f != rc2Var.u0) {
                    this.m2 = true;
                    this.o2 = f;
                    z = true;
                }
                i = this.q2;
                if (i != rc2Var.q0) {
                    this.s2 = true;
                    this.r2 = i;
                    z = true;
                }
                i2 = this.W2;
                if (i2 != rc2Var.Q1) {
                    this.V2 = true;
                    this.X2 = i2;
                    z = true;
                }
                i3 = this.T2;
                tc2Var = rc2Var.s0;
                if (i3 != (tc2Var == null ? tc2Var.r : 0)) {
                    this.Y2 = true;
                    this.U2 = i3;
                    z = true;
                }
                if (this.Z2 != (rc2Var.getPrimaryMessageObject() == null && rc2Var.getPrimaryMessageObject().c3)) {
                    this.a3 = true;
                    z = true;
                }
                if (this.R2 != rc2Var.h2()) {
                    this.S2 = true;
                    z = true;
                }
                if (this.b3 != rc2Var.s8) {
                    this.c3 = true;
                    z = true;
                }
                hashSet = this.d3;
                k47 k47Var6 = rc2Var.Q5;
                hashSet2 = k47Var6 != null ? k47Var6.K0 : null;
                if (hashSet != null) {
                    if (hashSet2 != null) {
                        size = 0;
                    }
                    z3 = this.g3;
                    k47Var = rc2Var.Q5;
                    if (z3 != (k47Var == null && k47Var.L0)) {
                        this.i3 = true;
                        this.h3 = z3;
                        z = true;
                    }
                    if (k47Var != null || this.x2 == k47Var.m5()) {
                        i4 = this.I2;
                        if (i4 != rc2Var.gb) {
                            this.G2 = true;
                            this.H2 = i4;
                        }
                        rc2Var.Y3();
                        if (l39Var.a()) {
                            z = true;
                        }
                        if (rc2Var.Q5.g4()) {
                            float L2 = rc2Var.e7 - gm.L(28 - (rc2Var.K ? 2 : 0));
                            if (!l39Var.p) {
                                L2 -= l39Var.n;
                            }
                            float f8 = this.r;
                            if (L2 != f8) {
                                this.q = true;
                                this.s = f8;
                                z = true;
                            }
                        }
                        if (rc2Var.Q7 != null) {
                            float f9 = rc2Var.U7;
                            float f10 = this.t;
                            if (f9 != f10 && f10 != 0.0f) {
                                this.u = f10;
                                z = true;
                            }
                        }
                        k47Var2 = rc2Var.Q5;
                        if ((k47Var2 == null && k47Var2.L2) != this.j3 || rc2Var.o2 == null || (staticLayout = this.k3) == null) {
                            return z;
                        }
                        this.l3 = staticLayout;
                        this.m3 = gn.update(0, (View) rc2Var, false, this.m3, staticLayout);
                        return true;
                    }
                    this.u2 = true;
                    StaticLayout[] staticLayoutArr = this.y2;
                    StaticLayout staticLayout8 = staticLayoutArr[0];
                    StaticLayout[] staticLayoutArr2 = this.z2;
                    staticLayoutArr2[0] = staticLayout8;
                    staticLayoutArr2[1] = staticLayoutArr[1];
                    this.A2 = this.B2;
                    this.v2 = this.w2;
                    this.C2 = this.D2;
                    z = true;
                    rc2Var.Y3();
                    if (l39Var.a()) {
                    }
                    if (rc2Var.Q5.g4()) {
                    }
                    if (rc2Var.Q7 != null) {
                    }
                    k47Var2 = rc2Var.Q5;
                    if ((k47Var2 == null && k47Var2.L2) != this.j3) {
                    }
                    return z;
                }
                size = hashSet.size();
                if (size == (hashSet2 != null ? 0 : hashSet2.size()) || hashSet == null || !hashSet.equals(hashSet2)) {
                    this.f3 = true;
                    this.e3 = this.d3;
                    z = true;
                }
                z3 = this.g3;
                k47Var = rc2Var.Q5;
                if (z3 != (k47Var == null && k47Var.L0)) {
                }
                if (k47Var != null) {
                }
                i4 = this.I2;
                if (i4 != rc2Var.gb) {
                }
                rc2Var.Y3();
                if (l39Var.a()) {
                }
                if (rc2Var.Q5.g4()) {
                }
                if (rc2Var.Q7 != null) {
                }
                k47Var2 = rc2Var.Q5;
                if ((k47Var2 == null && k47Var2.L2) != this.j3) {
                }
                return z;
            }
            this.U0 = false;
            this.g2 = true;
            this.h1 = this.g1;
            this.W0 = this.j2;
            this.X0 = this.Y0;
        }
        z = true;
        if (this.h2 != rc2Var.H3()) {
        }
        if (this.k != rc2Var.h3) {
        }
        if (this.k2 != rc2Var.Lb) {
        }
        f = this.n2;
        if (f != rc2Var.u0) {
        }
        i = this.q2;
        if (i != rc2Var.q0) {
        }
        i2 = this.W2;
        if (i2 != rc2Var.Q1) {
        }
        i3 = this.T2;
        tc2Var = rc2Var.s0;
        if (i3 != (tc2Var == null ? tc2Var.r : 0)) {
        }
        if (this.Z2 != (rc2Var.getPrimaryMessageObject() == null && rc2Var.getPrimaryMessageObject().c3)) {
        }
        if (this.R2 != rc2Var.h2()) {
        }
        if (this.b3 != rc2Var.s8) {
        }
        hashSet = this.d3;
        k47 k47Var62 = rc2Var.Q5;
        if (k47Var62 != null) {
        }
        if (hashSet != null) {
        }
        if (size == (hashSet2 != null ? 0 : hashSet2.size())) {
        }
        this.f3 = true;
        this.e3 = this.d3;
        z = true;
        z3 = this.g3;
        k47Var = rc2Var.Q5;
        if (z3 != (k47Var == null && k47Var.L0)) {
        }
        if (k47Var != null) {
        }
        i4 = this.I2;
        if (i4 != rc2Var.gb) {
        }
        rc2Var.Y3();
        if (l39Var.a()) {
        }
        if (rc2Var.Q5.g4()) {
        }
        if (rc2Var.Q7 != null) {
        }
        k47Var2 = rc2Var.Q5;
        if ((k47Var2 == null && k47Var2.L2) != this.j3) {
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        boolean z;
        int i;
        boolean z2;
        k47 k47Var;
        rc2 rc2Var = this.a;
        boolean O3 = rc2Var.Q5.O3();
        k47 k47Var2 = rc2Var.Q5;
        boolean z3 = true;
        if (!O3) {
            if (!k47Var2.n4() && !rc2Var.Q5.Y2()) {
                z3 = false;
            }
            return (z3 ? 4 : 0) | (rc2Var.Q5.m4() ? 8 : 0);
        }
        if (!k47Var2.n4() && !rc2Var.Q5.Y2()) {
            if (rc2Var.Q5.m4()) {
                z2 = true;
                i = 0;
                z = false;
                z3 = false;
            } else if (rc2Var.Q5.p4()) {
                k47 k47Var3 = rc2Var.Q5;
                i = (k47Var3.r1 || k47Var3.E4()) ? 0 : 1;
                z = false;
                z2 = false;
            } else {
                i = 0;
                z = false;
                z3 = false;
            }
            k47Var = rc2Var.Q5;
            if (!k47Var.w1 || k47.a4(k47Var.k)) {
                i = 0;
                z = false;
                z3 = false;
            }
            return i | (!z3 ? 2 : 0) | (z ? 4 : 0) | (z2 ? 8 : 0);
        }
        z = true;
        i = 0;
        z3 = false;
        z2 = z3;
        k47Var = rc2Var.Q5;
        if (!k47Var.w1) {
        }
        i = 0;
        z = false;
        z3 = false;
        return i | (!z3 ? 2 : 0) | (z ? 4 : 0) | (z2 ? 8 : 0);
    }

    public final void c() {
        lk1 lk1Var;
        this.w0 = true;
        rc2 rc2Var = this.a;
        ArrayList arrayList = rc2Var.I5;
        mm mmVar = rc2Var.U0;
        this.b = mmVar.L0;
        this.c = mmVar.M0;
        this.d = mmVar.N0;
        this.e = mmVar.O0;
        System.arraycopy(mmVar.X0, 0, this.u0, 0, 4);
        m37 m37Var = rc2Var.L6;
        if (m37Var != null) {
            this.E0.set(m37Var.getBounds());
        }
        this.F0 = rc2Var.Y6;
        k47 k47Var = rc2Var.Q5;
        this.J0 = k47Var != null ? k47Var.B2 : null;
        this.K0 = k47Var != null ? k47Var.v2 : 0;
        this.a1 = rc2Var.vb;
        this.N0 = k47Var != null ? k47Var.y2 : null;
        this.f = rc2Var.s3;
        this.g = rc2Var.t3;
        this.d1 = rc2Var.m3;
        this.e1 = k47Var != null ? k47Var.M2 : false;
        ArrayList arrayList2 = this.M1;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        this.v = rc2Var.x1;
        this.w = rc2Var.g0;
        this.x = rc2Var.W;
        this.y = rc2Var.e0;
        this.z = rc2Var.T != null;
        this.A = rc2Var.b0 != null;
        this.H1 = rc2Var.W1;
        this.D1 = rc2Var.v1;
        this.F1 = rc2Var.w1;
        k47 k47Var2 = rc2Var.Q5;
        this.L2 = k47Var2 != null && k47Var2.D == 27 && (lk1Var = rc2Var.w) != null && lk1Var.d();
        if (rc2Var.n7 != null) {
            this.N = rc2Var.getRepliesCount();
            this.O = rc2Var.v7;
            this.U = rc2Var.n7;
            this.P = rc2Var.q7;
            this.Q = rc2Var.r7;
            this.R = rc2Var.s7;
            this.S = rc2Var.u7;
            this.T = rc2Var.p7;
        }
        this.F = rc2Var.getRepliesCount();
        this.c2 = rc2Var.getMessageObject().k.views;
        this.H = rc2Var.sa;
        this.d2 = rc2Var.pa;
        this.B = rc2Var.q6;
        this.f0 = rc2Var.z5;
        this.l1 = rc2Var.I6;
        this.n1 = rc2Var.I4;
        this.T1 = rc2Var.K3;
        this.U1 = rc2Var.L3;
        this.Y1 = rc2Var.X1;
        this.f1 = !rc2Var.S9;
        this.g1 = rc2Var.O9;
        this.j2 = rc2Var.L9;
        this.Y0 = rc2Var.M9;
        this.f2 = rc2Var.I3();
        this.t2 = rc2Var.getTopMediaOffset();
        this.h2 = rc2Var.H3();
        this.k = rc2Var.h3;
        this.k2 = rc2Var.Lb;
        this.n2 = rc2Var.u0;
        this.q2 = rc2Var.q0;
        this.Q1 = rc2Var.K5;
        StaticLayout[] staticLayoutArr = rc2Var.C9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        k47 k47Var3 = rc2Var.Q5;
        this.x2 = k47Var3 != null && k47Var3.m5();
        this.B2 = rc2Var.F9;
        int i = rc2Var.gb;
        this.w2 = i;
        this.I2 = i;
        this.D2 = rc2Var.D9;
        this.j1 = rc2Var.getCurrentBackgroundLeft();
        m37 m37Var2 = rc2Var.L6;
        if (m37Var2 != null) {
            this.k1 = m37Var2.getBounds().right;
        }
        k47 k47Var4 = rc2Var.Q5;
        this.p2 = k47Var4 != null ? k47Var4.x2 : 0.0f;
        this.Q0 = rc2Var.a8;
        this.F2 = rc2Var.R7;
        this.J2 = rc2Var.b8;
        rc2Var.O.q();
        if (rc2Var.Q7 != null) {
            this.t = rc2Var.V7;
        } else {
            this.t = 0.0f;
        }
        this.N2 = rc2Var.w9;
        this.O2 = rc2Var.x9;
        tc2 tc2Var = rc2Var.s0;
        this.T2 = tc2Var != null ? tc2Var.r : 0;
        this.Z2 = rc2Var.getPrimaryMessageObject() != null && rc2Var.getPrimaryMessageObject().c3;
        this.R2 = rc2Var.h2();
        this.W2 = rc2Var.Q1;
        this.b3 = rc2Var.s8;
        this.d3 = rc2Var.getPrimaryMessageObject() != null ? rc2Var.getPrimaryMessageObject().K0 : null;
        k47 k47Var5 = rc2Var.Q5;
        this.g3 = k47Var5 != null && k47Var5.L0;
        this.j3 = k47Var5 != null && k47Var5.L2;
        this.k3 = rc2Var.o2;
    }

    public final void d() {
        rc2 rc2Var = this.a;
        StaticLayout[] staticLayoutArr = rc2Var.C9;
        StaticLayout staticLayout = staticLayoutArr[0];
        StaticLayout[] staticLayoutArr2 = this.y2;
        staticLayoutArr2[0] = staticLayout;
        staticLayoutArr2[1] = staticLayoutArr[1];
        this.x2 = rc2Var.Q5.m5();
        this.B2 = rc2Var.F9;
        int i = rc2Var.gb;
        this.w2 = i;
        this.I2 = i;
        this.D2 = rc2Var.D9;
    }

    public final void e() {
        rc2 rc2Var = this.a;
        mm mmVar = rc2Var.U0;
        this.h = false;
        this.C = false;
        this.x0 = false;
        this.h0 = 0.0f;
        this.i0 = 0.0f;
        this.j0 = 0.0f;
        this.k0 = 0.0f;
        this.l0 = 0.0f;
        this.m0 = 0.0f;
        if (this.g0) {
            float f = this.p0;
            if (f != 0.0f) {
                float f2 = this.q0;
                if (f2 != 0.0f) {
                    mmVar.i0(this.n0, this.o0, f, f2);
                }
            }
        }
        if (this.C0) {
            mmVar.s0(this.B0);
        }
        this.n0 = 0.0f;
        this.o0 = 0.0f;
        this.p0 = 0.0f;
        this.q0 = 0.0f;
        this.g0 = false;
        this.A0 = 1.0f;
        this.v0 = 1.0f;
        this.C0 = false;
        this.L1 = 1.0f;
        this.R1 = 0.0f;
        this.S1 = 1.0f;
        this.H0 = false;
        this.L0 = false;
        this.G0 = false;
        this.P2 = false;
        this.Q2 = false;
        this.I0 = null;
        uj9 uj9Var = this.M0;
        if (uj9Var != null) {
            uj9Var.f(rc2Var);
        }
        this.M0 = null;
        this.V0 = null;
        this.W0 = null;
        this.U0 = false;
        this.b1 = false;
        this.D0 = false;
        this.c1 = null;
        gn.release(rc2Var, this.P0);
        this.P0 = null;
        this.t0 = false;
        this.K1 = false;
        this.N1.clear();
        this.X1 = false;
        this.E2 = false;
        this.O1 = false;
        this.a2 = false;
        this.S0 = null;
        this.G = false;
        this.I = null;
        this.V = false;
        this.W = null;
        this.e2 = null;
        this.g2 = false;
        this.i2 = false;
        this.i1 = false;
        this.m1 = false;
        this.d0 = false;
        this.t1 = false;
        this.v1 = false;
        this.z1 = false;
        this.x1 = false;
        this.A1 = false;
        this.C1 = false;
        this.w1 = false;
        this.E1 = false;
        this.G1 = false;
        this.M2 = false;
        this.K1 = false;
        this.j = false;
        this.l2 = false;
        this.m2 = false;
        this.s2 = false;
        this.Y2 = false;
        this.a3 = false;
        this.f3 = false;
        this.i3 = false;
        this.S2 = false;
        this.c3 = false;
        this.u2 = false;
        this.G2 = false;
        StaticLayout[] staticLayoutArr = this.z2;
        staticLayoutArr[0] = null;
        staticLayoutArr[1] = null;
        this.q = false;
        l39 l39Var = rc2Var.O;
        ArrayList arrayList = l39Var.s;
        ArrayList arrayList2 = l39Var.t;
        for (int i = 0; i < arrayList2.size(); i++) {
            ((i39) arrayList2.get(i)).b();
        }
        arrayList2.clear();
        l39Var.i = false;
        l39Var.j = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((i39) arrayList.get(i2)).b = (byte) 0;
        }
        this.l3 = null;
        gn.release(rc2Var, this.m3);
    }

    public final void f() {
        float max = Math.max(0.0f, Math.min(1.0f, this.L1));
        this.R1 = (float) Math.pow(1.0f - max, 0.5d);
        this.S1 = (float) Math.pow(max, 0.5d);
    }
}
