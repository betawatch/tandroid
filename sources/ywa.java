// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ywa extends n39 {
    public int d;
    public int d0;
    public final /* synthetic */ uxa e0;
    public int c = -1;
    public int e = -1;
    public int f = -1;
    public int h = -1;
    public int n = -1;
    public int r = -1;
    public int s = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public int a0 = -1;
    public final rs b0 = new rs(0);
    public final rs c0 = new rs(0);

    public ywa(uxa uxaVar) {
        this.e0 = uxaVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 9 || i == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.J = -1;
        this.K = -1;
        this.f = -1;
        this.I = -1;
        this.s = -1;
        this.n = -1;
        this.E = -1;
        this.H = -1;
        this.G = -1;
        this.F = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.d0 = 0;
        rs rsVar = this.c0;
        rsVar.clear();
        rs rsVar2 = this.b0;
        rsVar2.clear();
        uxa uxaVar = this.e0;
        ArrayList arrayList = uxaVar.z0;
        ArrayList arrayList2 = uxaVar.Q;
        ArrayList arrayList3 = uxaVar.R;
        ArrayList arrayList4 = uxaVar.P;
        if (uxaVar.c0) {
            if (uxaVar.H != null) {
                int i = this.d0;
                this.c = i;
                this.d0 = i + 2;
                this.d = i + 1;
            }
            gxa gxaVar = uxaVar.d;
            if (gxaVar != null && !gxaVar.l) {
                int i2 = this.d0;
                if (i2 > 0) {
                    this.d0 = i2 + 1;
                    rsVar2.add(Integer.valueOf(i2));
                }
                int i3 = this.d0;
                this.d0 = i3 + 1;
                this.e = i3;
            }
            gxa gxaVar2 = uxaVar.I;
            if (gxaVar2 != null && !gxaVar2.l) {
                int i4 = this.d0;
                if (i4 > 0) {
                    this.d0 = i4 + 1;
                    rsVar2.add(Integer.valueOf(i4));
                }
                int i5 = this.d0;
                this.d0 = i5 + 1;
                this.L = i5;
            }
            gxa gxaVar3 = uxaVar.J;
            if (gxaVar3 != null && !gxaVar3.l && !gxaVar3.a) {
                int i6 = this.d0;
                if (i6 > 0) {
                    this.d0 = i6 + 1;
                    rsVar2.add(Integer.valueOf(i6));
                }
                int i7 = this.d0;
                this.d0 = i7 + 1;
                this.M = i7;
            }
            gxa gxaVar4 = uxaVar.K;
            if (gxaVar4 != null && !gxaVar4.l && !gxaVar4.a) {
                int i8 = this.d0;
                if (i8 > 0) {
                    this.d0 = i8 + 1;
                    rsVar2.add(Integer.valueOf(i8));
                }
                int i9 = this.d0;
                this.d0 = i9 + 1;
                this.N = i9;
            }
            gxa gxaVar5 = uxaVar.L;
            if (gxaVar5 != null && !gxaVar5.l && !gxaVar5.a) {
                int i10 = this.d0;
                if (i10 > 0) {
                    this.d0 = i10 + 1;
                    rsVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.d0;
                this.d0 = i11 + 1;
                this.O = i11;
            }
            gxa gxaVar6 = uxaVar.M;
            if (gxaVar6 != null && !gxaVar6.l && !gxaVar6.a) {
                int i12 = this.d0;
                if (i12 > 0) {
                    this.d0 = i12 + 1;
                    rsVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.d0;
                this.d0 = i13 + 1;
                this.P = i13;
            }
            gxa gxaVar7 = uxaVar.e;
            if (gxaVar7 != null && !gxaVar7.l && !gxaVar7.a) {
                int i14 = this.d0;
                if (i14 > 0) {
                    this.d0 = i14 + 1;
                    rsVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.d0;
                this.d0 = i15 + 1;
                this.n = i15;
            }
            gxa gxaVar8 = uxaVar.N;
            if (gxaVar8 != null && !gxaVar8.l && !gxaVar8.a) {
                int i16 = this.d0;
                if (i16 > 0) {
                    this.d0 = i16 + 1;
                    rsVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.d0;
                this.d0 = i17 + 1;
                this.Q = i17;
            }
            if (arrayList4.size() > 0) {
                int i18 = this.d0;
                if (i18 > 0) {
                    this.d0 = i18 + 1;
                    rsVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.d0;
                int i20 = i19 + 1;
                this.R = i19;
                this.d0 = i19 + 2;
                this.S = i20;
                int size = arrayList4.size() + i20;
                this.T = size - 1;
                this.d0 = size;
                int size2 = arrayList4.size();
                int size3 = uxaVar.O.size();
                int i21 = this.d0;
                if (size2 != size3) {
                    this.d0 = i21 + 1;
                    this.a0 = i21;
                } else {
                    this.d0 = i21 + 1;
                    rsVar.add(Integer.valueOf(i21));
                }
            }
            if (arrayList3.size() > 0) {
                int i22 = this.d0;
                if (i22 > 0) {
                    this.d0 = i22 + 1;
                    rsVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.d0;
                int i24 = i23 + 1;
                this.U = i23;
                this.d0 = i23 + 2;
                this.V = i24;
                int size4 = arrayList3.size() + i24;
                this.W = size4 - 1;
                this.d0 = size4 + 1;
                rsVar.add(Integer.valueOf(size4));
            }
            if (arrayList2.size() > 0) {
                int i25 = this.d0;
                if (i25 > 0) {
                    this.d0 = i25 + 1;
                    rsVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.d0;
                int i27 = i26 + 1;
                this.X = i26;
                this.d0 = i26 + 2;
                this.Y = i27;
                int size5 = arrayList2.size() + i27;
                this.Z = size5 - 1;
                this.d0 = size5;
            }
            int i28 = this.d0;
            if (i28 > 0) {
                this.d0 = i28 + 1;
                rsVar.add(Integer.valueOf(i28));
                int i29 = this.d0;
                this.d0 = i29 + 1;
                rsVar2.add(Integer.valueOf(i29));
                return;
            }
            return;
        }
        if (uxaVar.f != null) {
            int i30 = this.d0;
            this.c = i30;
            this.d0 = i30 + 2;
            this.d = i30 + 1;
        }
        gxa gxaVar9 = uxaVar.d;
        if (gxaVar9 != null && !gxaVar9.l) {
            int i31 = this.d0;
            if (i31 > 0) {
                this.d0 = i31 + 1;
                rsVar2.add(Integer.valueOf(i31));
            }
            int i32 = this.d0;
            this.d0 = i32 + 1;
            this.e = i32;
        }
        gxa gxaVar10 = uxaVar.h;
        if (gxaVar10 != null && !gxaVar10.l) {
            int i33 = this.d0;
            if (i33 > 0) {
                this.d0 = i33 + 1;
                rsVar2.add(Integer.valueOf(i33));
            }
            int i34 = this.d0;
            this.d0 = i34 + 1;
            this.h = i34;
        }
        gxa gxaVar11 = uxaVar.y;
        if (gxaVar11 != null && !gxaVar11.l) {
            int i35 = this.d0;
            if (i35 > 0) {
                this.d0 = i35 + 1;
                rsVar2.add(Integer.valueOf(i35));
            }
            int i36 = this.d0;
            this.d0 = i36 + 1;
            this.E = i36;
        }
        gxa gxaVar12 = uxaVar.e;
        if (gxaVar12 != null && !gxaVar12.l) {
            int i37 = this.d0;
            if (i37 > 0) {
                this.d0 = i37 + 1;
                rsVar2.add(Integer.valueOf(i37));
            }
            int i38 = this.d0;
            this.d0 = i38 + 1;
            this.n = i38;
        }
        gxa gxaVar13 = uxaVar.s;
        if (gxaVar13 != null && !gxaVar13.l) {
            int i39 = this.d0;
            if (i39 > 0) {
                this.d0 = i39 + 1;
                rsVar2.add(Integer.valueOf(i39));
            }
            int i40 = this.d0;
            this.d0 = i40 + 1;
            this.w = i40;
        }
        gxa gxaVar14 = uxaVar.w;
        if (gxaVar14 != null && !gxaVar14.l) {
            int i41 = this.d0;
            if (i41 > 0) {
                this.d0 = i41 + 1;
                rsVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.d0;
            this.d0 = i42 + 1;
            this.x = i42;
        }
        gxa gxaVar15 = uxaVar.x;
        if (gxaVar15 != null && !gxaVar15.l) {
            int i43 = this.d0;
            if (i43 > 0) {
                this.d0 = i43 + 1;
                rsVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.d0;
            this.d0 = i44 + 1;
            this.y = i44;
        }
        gxa gxaVar16 = uxaVar.n;
        if (gxaVar16 != null && !gxaVar16.l) {
            int i45 = this.d0;
            if (i45 > 0) {
                this.d0 = i45 + 1;
                rsVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.d0;
            this.d0 = i46 + 1;
            this.r = i46;
        }
        gxa gxaVar17 = uxaVar.r;
        if (gxaVar17 != null && !gxaVar17.k && !gxaVar17.a) {
            int i47 = this.d0;
            if (i47 > 0) {
                this.d0 = i47 + 1;
                rsVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.d0;
            this.d0 = i48 + 1;
            this.s = i48;
        }
        gxa gxaVar18 = uxaVar.E;
        if (gxaVar18 != null && !gxaVar18.l && !gxaVar18.a) {
            int i49 = this.d0;
            if (i49 > 0) {
                this.d0 = i49 + 1;
                rsVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.d0;
            this.d0 = i50 + 1;
            this.F = i50;
        }
        gxa gxaVar19 = uxaVar.F;
        if (gxaVar19 != null && !gxaVar19.l && !gxaVar19.a) {
            int i51 = this.d0;
            if (i51 > 0) {
                this.d0 = i51 + 1;
                rsVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.d0;
            this.d0 = i52 + 1;
            this.G = i52;
        }
        gxa gxaVar20 = uxaVar.G;
        if (gxaVar20 != null && !gxaVar20.l && !gxaVar20.a) {
            int i53 = this.d0;
            if (i53 > 0) {
                this.d0 = i53 + 1;
                rsVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.d0;
            this.d0 = i54 + 1;
            this.H = i54;
        }
        int i55 = this.d0;
        this.d0 = i55 + 1;
        rsVar2.add(Integer.valueOf(i55));
        if (arrayList.size() > 0) {
            int i56 = this.d0;
            int i57 = i56 + 1;
            this.I = i56;
            this.d0 = i56 + 2;
            this.J = i57;
            int size6 = arrayList.size() + i57;
            this.K = size6 - 1;
            this.d0 = size6;
            int size7 = uxaVar.w0.size();
            int size8 = uxaVar.v0.size();
            int i58 = this.d0;
            if (size7 != size8) {
                this.d0 = i58 + 1;
                this.f = i58;
            } else {
                this.d0 = i58 + 1;
                rsVar.add(Integer.valueOf(i58));
            }
            int i59 = this.d0;
            this.d0 = i59 + 1;
            rsVar2.add(Integer.valueOf(i59));
        }
    }

    @Override // w39
    public final int b() {
        return this.d0;
    }

    @Override // w39
    public final long c(int i) {
        if (i >= this.J && i < this.K) {
            return ((rxa) this.e0.z0.get(i - r0)).b();
        }
        if (i == this.e) {
            return 1L;
        }
        if (i == this.h) {
            return 2L;
        }
        if (i == this.n) {
            return 3L;
        }
        if (i == this.r) {
            return 4L;
        }
        if (i == this.E) {
            return 5L;
        }
        if (i == this.s) {
            return 6L;
        }
        if (i == this.w) {
            return 7L;
        }
        if (i == this.x) {
            return 8L;
        }
        if (i == this.y) {
            return 9L;
        }
        if (i == this.L) {
            return 10L;
        }
        if (i == this.M) {
            return 11L;
        }
        if (i == this.N) {
            return 12L;
        }
        if (i == this.O) {
            return 13L;
        }
        if (i == this.P) {
            return 14L;
        }
        if (i == this.Q) {
            return 15L;
        }
        if (i == this.F) {
            return 16L;
        }
        if (i == this.G) {
            return 17L;
        }
        return i == this.H ? 18L : -1L;
    }

    @Override // w39
    public final int d(int i) {
        if (i == this.e || i == this.h || i == this.n || i == this.E || i == this.P || i == this.L) {
            return 0;
        }
        if (i == this.r || i == this.s || i == this.G) {
            return 1;
        }
        if (i == this.w || i == this.x || i == this.M || i == this.O || i == this.F || i == this.H) {
            return 2;
        }
        if (i == this.y || i == this.N || i == this.Q) {
            return 4;
        }
        if (i >= this.J && i <= this.K) {
            return 9;
        }
        if (i == this.f) {
            return 11;
        }
        if (this.c0.contains(Integer.valueOf(i))) {
            return 12;
        }
        if (i == this.I || i == this.c || i == this.U || i == this.R || i == this.X) {
            return 13;
        }
        if (i == this.d) {
            return 14;
        }
        if (i >= this.V && i <= this.W) {
            return 9;
        }
        if (i >= this.S && i <= this.T) {
            return 9;
        }
        if (i < this.Y || i > this.Z) {
            return i == this.a0 ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021b A[LOOP:0: B:100:0x0219->B:101:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0207  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        k27 k27Var;
        float f;
        k27 k27Var2;
        rxa rxaVar;
        CharSequence charSequence;
        rxa rxaVar2;
        View view = s49Var.a;
        uxa uxaVar = this.e0;
        ArrayList arrayList = uxaVar.z0;
        ArrayList arrayList2 = uxaVar.P;
        boolean z = uxaVar.c0;
        int d = d(i);
        if (d >= 0 && d <= 4) {
            ((fxa) view).e(this.e == i ? uxaVar.d : this.h == i ? uxaVar.h : this.r == i ? uxaVar.n : this.w == i ? uxaVar.s : this.x == i ? uxaVar.w : this.s == i ? uxaVar.r : this.n == i ? uxaVar.e : this.E == i ? uxaVar.y : this.F == i ? uxaVar.E : this.G == i ? uxaVar.F : this.H == i ? uxaVar.G : this.L == i ? uxaVar.I : this.M == i ? uxaVar.J : this.N == i ? uxaVar.K : this.O == i ? uxaVar.L : this.P == i ? uxaVar.M : this.Q == i ? uxaVar.N : uxaVar.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                hk1 hk1Var = (hk1) view;
                hk1Var.c(true);
                hk1Var.b(uxaVar.g0, uxaVar.f0);
                hk1Var.setPadding(0, gl.L(16.0f), 0, gl.L(16.0f));
                if (i == this.c) {
                    hk1Var.setTitle(k96.M0(2131744658, "StatisticOverview"));
                    return;
                }
                if (i == this.U) {
                    hk1Var.setTitle(k96.M0(2131743795, "TopAdmins"));
                    return;
                }
                if (i == this.X) {
                    hk1Var.setTitle(k96.M0(2131743792, "TopInviters"));
                    return;
                } else {
                    if (i == this.R) {
                        hk1Var.setTitle(k96.M0(2131743791, "TopMembers"));
                        return;
                    }
                    hk1Var.c(false);
                    hk1Var.setPadding(gl.L(2.0f), gl.L(15.0f), gl.L(2.0f), gl.L(6.0f));
                    hk1Var.setTitle(k96.M0(2131746172, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((dh6) view).b(R.drawable.arrow_more, 5, k96.G(uxaVar.O.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            oxa oxaVar = (oxa) view;
            if (z) {
                oxaVar.setData(uxaVar.H);
                return;
            }
            pxa pxaVar = uxaVar.f;
            TextView[] textViewArr = oxaVar.a;
            TextView[] textViewArr2 = oxaVar.c;
            TextView[] textViewArr3 = oxaVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < textViewArr.length; i3++) {
                switch (i3) {
                    case 0:
                        textViewArr[i2].setText(pxaVar.b);
                        textViewArr3[i2].setText(pxaVar.c);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.d ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.a);
                        i2++;
                        break;
                    case 1:
                        textViewArr[i2].setText(pxaVar.n);
                        textViewArr3[i2].setText("");
                        textViewArr2[i2].setText(pxaVar.m);
                        i2++;
                        break;
                    case 2:
                        textViewArr[i2].setText(pxaVar.f);
                        textViewArr3[i2].setText(pxaVar.g);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.h ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.e);
                        i2++;
                        break;
                    case 3:
                        textViewArr[i2].setText(pxaVar.z);
                        textViewArr3[i2].setText(pxaVar.A);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.B ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.y);
                        if (!pxaVar.C) {
                            break;
                        }
                        i2++;
                        break;
                    case 4:
                        textViewArr[i2].setText(pxaVar.j);
                        textViewArr3[i2].setText(pxaVar.k);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.l ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.i);
                        i2++;
                        break;
                    case 5:
                        textViewArr[i2].setText(pxaVar.E);
                        textViewArr3[i2].setText(pxaVar.F);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.G ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.D);
                        if (!pxaVar.H) {
                            break;
                        }
                        i2++;
                        break;
                    case 6:
                        textViewArr[i2].setText(pxaVar.p);
                        textViewArr3[i2].setText(pxaVar.q);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.r ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.o);
                        if (!pxaVar.s) {
                            break;
                        }
                        i2++;
                        break;
                    case 7:
                        textViewArr[i2].setText(pxaVar.u);
                        textViewArr3[i2].setText(pxaVar.v);
                        textViewArr3[i2].setTag(Integer.valueOf(pxaVar.w ? bkb.w6 : bkb.o7));
                        textViewArr2[i2].setText(pxaVar.t);
                        if (!pxaVar.x) {
                            break;
                        }
                        i2++;
                        break;
                }
            }
            while (i2 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i2].getParent()).setVisibility(8);
                i2++;
            }
            for (int i4 = 0; i4 < oxaVar.getChildCount(); i4++) {
                ViewGroup viewGroup = (ViewGroup) oxaVar.getChildAt(i4);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            oxaVar.updateColors();
            return;
        }
        if (z) {
            int i5 = this.V;
            if (i >= i5 && i <= this.W) {
                ((xxa) view).setData((nxa) uxaVar.R.get(i - i5));
                return;
            }
            int i6 = this.S;
            if (i >= i6 && i <= this.T) {
                ((xxa) view).setData((nxa) arrayList2.get(i - i6));
                return;
            }
            int i7 = this.Y;
            if (i < i7 || i > this.Z) {
                return;
            }
            ((xxa) view).setData((nxa) uxaVar.Q.get(i - i7));
            return;
        }
        int i8 = i - this.J;
        rxa rxaVar3 = (rxa) arrayList.get(i8);
        xxa xxaVar = (xxa) view;
        boolean z2 = i8 == arrayList.size() - 1;
        TextView textView = xxaVar.f;
        TextView textView2 = xxaVar.d;
        pb0 pb0Var = xxaVar.n;
        TLRPC.ChatFull chatFull = xxaVar.x;
        vxa vxaVar = xxaVar.a;
        xxaVar.w = rxaVar3;
        xxaVar.y = !z2;
        k27 k27Var3 = rxaVar3.b;
        ArrayList arrayList3 = k27Var3.p0;
        if (arrayList3 != null) {
            k27Var = k27Var3;
            f = 1.0f;
            vxaVar.h(gl5.f(ba4.w(arrayList3, gl.Y0(false), false, null, false), k27Var3.n0), "50_50", gl5.f(ba4.w(k27Var3.p0, 50, false, null, false), k27Var3.n0), "b1", 0, k27Var);
            vxaVar.setRoundRadius(gl.L(9.0f));
            vxaVar.setScaleX(0.96f);
            vxaVar.setScaleY(0.96f);
        } else {
            k27Var = k27Var3;
            f = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                k27Var2 = k27Var;
                rxaVar = rxaVar3;
                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(chatFull.id));
                pb0Var.p(K0);
                vxaVar.f(K0, pb0Var);
                vxaVar.setRoundRadius(gl.L(46.0f) >> 1);
                vxaVar.setScaleX(1.0f);
                vxaVar.setScaleY(1.0f);
                if (k27Var2.w4()) {
                    vxaVar.setScaleX(f);
                    vxaVar.setScaleY(f);
                    vxaVar.setRoundRadius(gl.L(46.0f) >> 1);
                }
                if (!k27Var2.I3()) {
                    charSequence = tb4.p(k27Var2.y1(true).trim(), ", ", k27Var2.w1(true).trim());
                } else if (k27Var2.w4()) {
                    charSequence = k96.M0(2131744498, null);
                } else {
                    charSequence = k27Var2.z;
                    if (charSequence == null) {
                        charSequence = k27Var2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                xxaVar.b.k(gl.K3(gl.K2(spannableStringBuilder), null));
                xxaVar.c.setText(String.format(k96.J0(rxaVar.d(), "Views"), gl.o0(rxaVar.d(), 0)));
                rxaVar2 = rxaVar;
                Date date = new Date((rxaVar2.b != null ? 0L : r6.k.date) * 1000);
                xxaVar.e.setText(k96.a0(null, null, 2131742520, k96.D0().B0().format(date), k96.D0().o0().format(date)));
                textView2.setText(gl.o0(rxaVar2.a(), 0));
                textView.setText(gl.o0(rxaVar2.c(), 0));
                textView2.setVisibility(rxaVar2.a() == 0 ? 0 : 8);
                textView.setVisibility(rxaVar2.c() == 0 ? 8 : 0);
                xxaVar.invalidate();
                if (rxaVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    xxaVar.setImageViewAction(null);
                    return;
                } else {
                    xxaVar.setImageViewAction(new b99(this, rxaVar2, (byte) 18));
                    return;
                }
            }
            vxaVar.n(gl5.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, xxaVar.x);
            vxaVar.setRoundRadius(gl.L(46.0f) >> 1);
            vxaVar.setScaleX(0.96f);
            vxaVar.setScaleY(0.96f);
        }
        rxaVar = rxaVar3;
        k27Var2 = k27Var;
        if (k27Var2.w4()) {
        }
        if (!k27Var2.I3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        xxaVar.b.k(gl.K3(gl.K2(spannableStringBuilder2), null));
        xxaVar.c.setText(String.format(k96.J0(rxaVar.d(), "Views"), gl.o0(rxaVar.d(), 0)));
        rxaVar2 = rxaVar;
        Date date2 = new Date((rxaVar2.b != null ? 0L : r6.k.date) * 1000);
        xxaVar.e.setText(k96.a0(null, null, 2131742520, k96.D0().B0().format(date2), k96.D0().o0().format(date2)));
        textView2.setText(gl.o0(rxaVar2.a(), 0));
        textView.setText(gl.o0(rxaVar2.c(), 0));
        textView2.setVisibility(rxaVar2.a() == 0 ? 0 : 8);
        textView.setVisibility(rxaVar2.c() == 0 ? 8 : 0);
        xxaVar.invalidate();
        if (rxaVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        uxa uxaVar = this.e0;
        if (i >= 0 && i <= 4) {
            Context context = viewGroup.getContext();
            i2 = ((d) uxaVar).currentAccount;
            View vwaVar = new vwa(uxaVar, context, i2, i, uxaVar.a0);
            vwaVar.setWillNotDraw(false);
            view = vwaVar;
        } else if (i == 9) {
            View wwaVar = new wwa(viewGroup.getContext(), uxaVar.a, uxaVar.getResourceProvider());
            wwaVar.setWillNotDraw(false);
            view = wwaVar;
        } else if (i == 11) {
            view = new q86(viewGroup.getContext());
        } else if (i == 12) {
            view = new y14(viewGroup.getContext(), gl.L(15.0f));
        } else if (i == 13) {
            View xwaVar = new xwa(viewGroup.getContext(), null);
            xwaVar.setWillNotDraw(false);
            xwaVar.setPadding(xwaVar.getPaddingLeft(), gl.L(16.0f), xwaVar.getRight(), gl.L(16.0f));
            view = xwaVar;
        } else if (i == 14) {
            view = new oxa(viewGroup.getContext(), uxaVar.c0 ? 2 : 4);
        } else if (i == 15) {
            dh6 dh6Var = new dh6(viewGroup.getContext());
            dh6Var.a(bkb.u6, bkb.t6);
            view = dh6Var;
        } else {
            view = new b9a(viewGroup.getContext(), 0, 0);
        }
        return ls6.h(view, view, -1, -2);
    }
}
