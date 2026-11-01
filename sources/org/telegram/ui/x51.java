package org.telegram.ui;

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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x51 extends org.telegram.ui.Components.tk0 {
    public int c0;
    public int d;
    public final /* synthetic */ s61 d0;
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
    public int D = -1;
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
    public final a0.g a0 = new a0.g(0);
    public final a0.g b0 = new a0.g(0);

    public x51(s61 s61Var) {
        this.d0 = s61Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 9 || i10 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.f = -1;
        this.H = -1;
        this.s = -1;
        this.n = -1;
        this.D = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
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
        this.c0 = 0;
        a0.g gVar = this.b0;
        gVar.clear();
        a0.g gVar2 = this.a0;
        gVar2.clear();
        s61 s61Var = this.d0;
        ArrayList arrayList = s61Var.y0;
        ArrayList arrayList2 = s61Var.P;
        ArrayList arrayList3 = s61Var.Q;
        ArrayList arrayList4 = s61Var.O;
        if (s61Var.b0) {
            if (s61Var.G != null) {
                int i10 = this.c0;
                this.c = i10;
                this.c0 = i10 + 2;
                this.d = i10 + 1;
            }
            e61 e61Var = s61Var.d;
            if (e61Var != null && !e61Var.l) {
                int i11 = this.c0;
                if (i11 > 0) {
                    this.c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.c0;
                this.c0 = i12 + 1;
                this.e = i12;
            }
            e61 e61Var2 = s61Var.H;
            if (e61Var2 != null && !e61Var2.l) {
                int i13 = this.c0;
                if (i13 > 0) {
                    this.c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.c0;
                this.c0 = i14 + 1;
                this.K = i14;
            }
            e61 e61Var3 = s61Var.I;
            if (e61Var3 != null && !e61Var3.l && !e61Var3.a) {
                int i15 = this.c0;
                if (i15 > 0) {
                    this.c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.c0;
                this.c0 = i16 + 1;
                this.L = i16;
            }
            e61 e61Var4 = s61Var.J;
            if (e61Var4 != null && !e61Var4.l && !e61Var4.a) {
                int i17 = this.c0;
                if (i17 > 0) {
                    this.c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.c0;
                this.c0 = i18 + 1;
                this.M = i18;
            }
            e61 e61Var5 = s61Var.K;
            if (e61Var5 != null && !e61Var5.l && !e61Var5.a) {
                int i19 = this.c0;
                if (i19 > 0) {
                    this.c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.c0;
                this.c0 = i20 + 1;
                this.N = i20;
            }
            e61 e61Var6 = s61Var.L;
            if (e61Var6 != null && !e61Var6.l && !e61Var6.a) {
                int i21 = this.c0;
                if (i21 > 0) {
                    this.c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.c0;
                this.c0 = i22 + 1;
                this.O = i22;
            }
            e61 e61Var7 = s61Var.e;
            if (e61Var7 != null && !e61Var7.l && !e61Var7.a) {
                int i23 = this.c0;
                if (i23 > 0) {
                    this.c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.c0;
                this.c0 = i24 + 1;
                this.n = i24;
            }
            e61 e61Var8 = s61Var.M;
            if (e61Var8 != null && !e61Var8.l && !e61Var8.a) {
                int i25 = this.c0;
                if (i25 > 0) {
                    this.c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.c0;
                this.c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.c0;
                if (i27 > 0) {
                    this.c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.c0 = size;
                if (arrayList4.size() != s61Var.N.size()) {
                    int i30 = this.c0;
                    this.c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.c0;
                    this.c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.c0;
                if (i32 > 0) {
                    this.c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.c0;
                if (i35 > 0) {
                    this.c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.c0 = size3;
            }
            int i38 = this.c0;
            if (i38 > 0) {
                this.c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.c0;
                this.c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (s61Var.f != null) {
            int i40 = this.c0;
            this.c = i40;
            this.c0 = i40 + 2;
            this.d = i40 + 1;
        }
        e61 e61Var9 = s61Var.d;
        if (e61Var9 != null && !e61Var9.l) {
            int i41 = this.c0;
            if (i41 > 0) {
                this.c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.c0;
            this.c0 = i42 + 1;
            this.e = i42;
        }
        e61 e61Var10 = s61Var.h;
        if (e61Var10 != null && !e61Var10.l) {
            int i43 = this.c0;
            if (i43 > 0) {
                this.c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.c0;
            this.c0 = i44 + 1;
            this.h = i44;
        }
        e61 e61Var11 = s61Var.y;
        if (e61Var11 != null && !e61Var11.l) {
            int i45 = this.c0;
            if (i45 > 0) {
                this.c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.c0;
            this.c0 = i46 + 1;
            this.D = i46;
        }
        e61 e61Var12 = s61Var.e;
        if (e61Var12 != null && !e61Var12.l) {
            int i47 = this.c0;
            if (i47 > 0) {
                this.c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.c0;
            this.c0 = i48 + 1;
            this.n = i48;
        }
        e61 e61Var13 = s61Var.s;
        if (e61Var13 != null && !e61Var13.l) {
            int i49 = this.c0;
            if (i49 > 0) {
                this.c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.c0;
            this.c0 = i50 + 1;
            this.w = i50;
        }
        e61 e61Var14 = s61Var.w;
        if (e61Var14 != null && !e61Var14.l) {
            int i51 = this.c0;
            if (i51 > 0) {
                this.c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.c0;
            this.c0 = i52 + 1;
            this.x = i52;
        }
        e61 e61Var15 = s61Var.x;
        if (e61Var15 != null && !e61Var15.l) {
            int i53 = this.c0;
            if (i53 > 0) {
                this.c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.c0;
            this.c0 = i54 + 1;
            this.y = i54;
        }
        e61 e61Var16 = s61Var.n;
        if (e61Var16 != null && !e61Var16.l) {
            int i55 = this.c0;
            if (i55 > 0) {
                this.c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.c0;
            this.c0 = i56 + 1;
            this.r = i56;
        }
        e61 e61Var17 = s61Var.r;
        if (e61Var17 != null && !e61Var17.k && !e61Var17.a) {
            int i57 = this.c0;
            if (i57 > 0) {
                this.c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.c0;
            this.c0 = i58 + 1;
            this.s = i58;
        }
        e61 e61Var18 = s61Var.D;
        if (e61Var18 != null && !e61Var18.l && !e61Var18.a) {
            int i59 = this.c0;
            if (i59 > 0) {
                this.c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.c0;
            this.c0 = i60 + 1;
            this.E = i60;
        }
        e61 e61Var19 = s61Var.E;
        if (e61Var19 != null && !e61Var19.l && !e61Var19.a) {
            int i61 = this.c0;
            if (i61 > 0) {
                this.c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.c0;
            this.c0 = i62 + 1;
            this.F = i62;
        }
        e61 e61Var20 = s61Var.F;
        if (e61Var20 != null && !e61Var20.l && !e61Var20.a) {
            int i63 = this.c0;
            if (i63 > 0) {
                this.c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.c0;
            this.c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.c0;
        this.c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.c0 = size4;
            if (s61Var.v0.size() != s61Var.u0.size()) {
                int i68 = this.c0;
                this.c0 = i68 + 1;
                this.f = i68;
            } else {
                int i69 = this.c0;
                this.c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.c0;
            this.c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.c0;
    }

    @Override // s4.g0
    public final long c(int i10) {
        if (i10 >= this.I && i10 < this.J) {
            return ((p61) this.d0.y0.get(i10 - r0)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.n) {
            return 3L;
        }
        if (i10 == this.r) {
            return 4L;
        }
        if (i10 == this.D) {
            return 5L;
        }
        if (i10 == this.s) {
            return 6L;
        }
        if (i10 == this.w) {
            return 7L;
        }
        if (i10 == this.x) {
            return 8L;
        }
        if (i10 == this.y) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        return i10 == this.G ? 18L : -1L;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == this.e || i10 == this.h || i10 == this.n || i10 == this.D || i10 == this.O || i10 == this.K) {
            return 0;
        }
        if (i10 == this.r || i10 == this.s || i10 == this.F) {
            return 1;
        }
        if (i10 == this.w || i10 == this.x || i10 == this.L || i10 == this.N || i10 == this.E || i10 == this.G) {
            return 2;
        }
        if (i10 == this.y || i10 == this.M || i10 == this.P) {
            return 4;
        }
        if (i10 >= this.I && i10 <= this.J) {
            return 9;
        }
        if (i10 == this.f) {
            return 11;
        }
        if (this.b0.contains(Integer.valueOf(i10))) {
            return 12;
        }
        if (i10 == this.H || i10 == this.c || i10 == this.T || i10 == this.Q || i10 == this.W) {
            return 13;
        }
        if (i10 == this.d) {
            return 14;
        }
        if ((i10 < this.U || i10 > this.V) && ((i10 < this.R || i10 > this.S) && (i10 < this.X || i10 > this.Y))) {
            return i10 == this.Z ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c A[LOOP:0: B:100:0x021a->B:101:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.kj kjVar;
        float f7;
        org.telegram.messenger.kj kjVar2;
        p61 p61Var;
        CharSequence charSequence;
        p61 p61Var2;
        View view = c1Var.a;
        s61 s61Var = this.d0;
        ArrayList arrayList = s61Var.y0;
        ArrayList arrayList2 = s61Var.O;
        boolean z10 = s61Var.b0;
        int d = d(i10);
        if (d >= 0 && d <= 4) {
            ((d61) view).e(this.e == i10 ? s61Var.d : this.h == i10 ? s61Var.h : this.r == i10 ? s61Var.n : this.w == i10 ? s61Var.s : this.x == i10 ? s61Var.w : this.s == i10 ? s61Var.r : this.n == i10 ? s61Var.e : this.D == i10 ? s61Var.y : this.E == i10 ? s61Var.D : this.F == i10 ? s61Var.E : this.G == i10 ? s61Var.F : this.K == i10 ? s61Var.H : this.L == i10 ? s61Var.I : this.M == i10 ? s61Var.J : this.N == i10 ? s61Var.K : this.O == i10 ? s61Var.L : this.P == i10 ? s61Var.M : s61Var.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                dg.d dVar = (dg.d) view;
                dVar.c(true);
                dVar.b(s61Var.f0, s61Var.e0);
                dVar.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f));
                if (i10 == this.c) {
                    dVar.setTitle(org.telegram.messenger.dd.L0(2131744913, "StatisticOverview"));
                    return;
                }
                if (i10 == this.T) {
                    dVar.setTitle(org.telegram.messenger.dd.L0(2131744060, "TopAdmins"));
                    return;
                }
                if (i10 == this.W) {
                    dVar.setTitle(org.telegram.messenger.dd.L0(2131744057, "TopInviters"));
                    return;
                } else {
                    if (i10 == this.Q) {
                        dVar.setTitle(org.telegram.messenger.dd.L0(2131744056, "TopMembers"));
                        return;
                    }
                    dVar.c(false);
                    dVar.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(6.0f));
                    dVar.setTitle(org.telegram.messenger.dd.L0(2131746380, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((org.telegram.ui.Cells.b5) view).b(R.drawable.arrow_more, 5, org.telegram.messenger.dd.G(s61Var.N.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            m61 m61Var = (m61) view;
            if (z10) {
                m61Var.setData(s61Var.G);
                return;
            }
            n61 n61Var = s61Var.f;
            TextView[] textViewArr = m61Var.a;
            TextView[] textViewArr2 = m61Var.c;
            TextView[] textViewArr3 = m61Var.b;
            int i11 = 0;
            for (int i12 = 0; i12 < textViewArr.length; i12++) {
                switch (i12) {
                    case 0:
                        textViewArr[i11].setText(n61Var.b);
                        textViewArr3[i11].setText(n61Var.c);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.d ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.a);
                        i11++;
                        break;
                    case 1:
                        textViewArr[i11].setText(n61Var.n);
                        textViewArr3[i11].setText("");
                        textViewArr2[i11].setText(n61Var.m);
                        i11++;
                        break;
                    case 2:
                        textViewArr[i11].setText(n61Var.f);
                        textViewArr3[i11].setText(n61Var.g);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.h ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.e);
                        i11++;
                        break;
                    case 3:
                        textViewArr[i11].setText(n61Var.z);
                        textViewArr3[i11].setText(n61Var.A);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.B ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.y);
                        if (!n61Var.C) {
                            break;
                        }
                        i11++;
                        break;
                    case 4:
                        textViewArr[i11].setText(n61Var.j);
                        textViewArr3[i11].setText(n61Var.k);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.l ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.i);
                        i11++;
                        break;
                    case 5:
                        textViewArr[i11].setText(n61Var.E);
                        textViewArr3[i11].setText(n61Var.F);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.G ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.D);
                        if (!n61Var.H) {
                            break;
                        }
                        i11++;
                        break;
                    case 6:
                        textViewArr[i11].setText(n61Var.p);
                        textViewArr3[i11].setText(n61Var.q);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.r ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.o);
                        if (!n61Var.s) {
                            break;
                        }
                        i11++;
                        break;
                    case 7:
                        textViewArr[i11].setText(n61Var.u);
                        textViewArr3[i11].setText(n61Var.v);
                        textViewArr3[i11].setTag(Integer.valueOf(n61Var.w ? org.telegram.ui.ActionBar.t6.x6 : org.telegram.ui.ActionBar.t6.p7));
                        textViewArr2[i11].setText(n61Var.t);
                        if (!n61Var.x) {
                            break;
                        }
                        i11++;
                        break;
                }
            }
            while (i11 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i11].getParent()).setVisibility(8);
                i11++;
            }
            for (int i13 = 0; i13 < m61Var.getChildCount(); i13++) {
                ViewGroup viewGroup = (ViewGroup) m61Var.getChildAt(i13);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            m61Var.updateColors();
            return;
        }
        if (z10) {
            int i14 = this.U;
            if (i10 >= i14 && i10 <= this.V) {
                ((org.telegram.ui.Cells.a8) view).setData((l61) s61Var.Q.get(i10 - i14));
                return;
            }
            int i15 = this.R;
            if (i10 >= i15 && i10 <= this.S) {
                ((org.telegram.ui.Cells.a8) view).setData((l61) arrayList2.get(i10 - i15));
                return;
            }
            int i16 = this.X;
            if (i10 < i16 || i10 > this.Y) {
                return;
            }
            ((org.telegram.ui.Cells.a8) view).setData((l61) s61Var.P.get(i10 - i16));
            return;
        }
        int i17 = i10 - this.I;
        p61 p61Var3 = (p61) arrayList.get(i17);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        boolean z11 = i17 == arrayList.size() - 1;
        TextView textView = a8Var.f;
        TextView textView2 = a8Var.d;
        org.telegram.ui.Components.r8 r8Var = a8Var.n;
        TLRPC.ChatFull chatFull = a8Var.x;
        org.telegram.ui.Cells.y7 y7Var = a8Var.a;
        a8Var.w = p61Var3;
        a8Var.y = !z11;
        org.telegram.messenger.kj kjVar3 = p61Var3.b;
        ArrayList arrayList3 = kjVar3.n0;
        if (arrayList3 != null) {
            kjVar = kjVar3;
            f7 = 1.0f;
            y7Var.l(org.telegram.messenger.jc.f(org.telegram.messenger.b8.w(arrayList3, org.telegram.messenger.i0.Z0(false), false, null, false), kjVar3.l0), "50_50", org.telegram.messenger.jc.f(org.telegram.messenger.b8.w(kjVar3.n0, 50, false, null, false), kjVar3.l0), "b1", 0, kjVar);
            y7Var.setRoundRadius(org.telegram.messenger.i0.L(9.0f));
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        } else {
            kjVar = kjVar3;
            f7 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                kjVar2 = kjVar;
                p61Var = p61Var3;
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(chatFull.id));
                r8Var.q(L0);
                y7Var.e(L0, r8Var);
                y7Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f) >> 1);
                y7Var.setScaleX(1.0f);
                y7Var.setScaleY(1.0f);
                if (kjVar2.x4()) {
                    y7Var.setScaleX(f7);
                    y7Var.setScaleY(f7);
                    y7Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f) >> 1);
                }
                if (!kjVar2.I3()) {
                    charSequence = a1.g.C(kjVar2.z1(true).trim(), ", ", kjVar2.x1(true).trim());
                } else if (kjVar2.x4()) {
                    charSequence = org.telegram.messenger.dd.L0(2131744753, null);
                } else {
                    charSequence = kjVar2.z;
                    if (charSequence == null) {
                        charSequence = kjVar2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                a8Var.b.k(org.telegram.messenger.i0.O3(org.telegram.messenger.i0.M2(spannableStringBuilder), null));
                a8Var.c.setText(String.format(org.telegram.messenger.dd.J0(p61Var.d(), "Views"), org.telegram.messenger.i0.o0(p61Var.d(), 0)));
                p61Var2 = p61Var;
                Date date = new Date((p61Var2.b != null ? 0L : r6.k.date) * 1000);
                a8Var.e.setText(org.telegram.messenger.dd.a0(null, null, 2131742808, org.telegram.messenger.dd.D0().B0().format(date), org.telegram.messenger.dd.D0().o0().format(date)));
                textView2.setText(org.telegram.messenger.i0.o0(p61Var2.a(), 0));
                textView.setText(org.telegram.messenger.i0.o0(p61Var2.c(), 0));
                textView2.setVisibility(p61Var2.a() == 0 ? 0 : 8);
                textView.setVisibility(p61Var2.c() == 0 ? 8 : 0);
                a8Var.invalidate();
                if (p61Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    a8Var.setImageViewAction(null);
                    return;
                } else {
                    a8Var.setImageViewAction(new qv0(6, this, p61Var2));
                    return;
                }
            }
            y7Var.k(org.telegram.messenger.jc.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, a8Var.x);
            y7Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f) >> 1);
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        }
        p61Var = p61Var3;
        kjVar2 = kjVar;
        if (kjVar2.x4()) {
        }
        if (!kjVar2.I3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        a8Var.b.k(org.telegram.messenger.i0.O3(org.telegram.messenger.i0.M2(spannableStringBuilder2), null));
        a8Var.c.setText(String.format(org.telegram.messenger.dd.J0(p61Var.d(), "Views"), org.telegram.messenger.i0.o0(p61Var.d(), 0)));
        p61Var2 = p61Var;
        Date date2 = new Date((p61Var2.b != null ? 0L : r6.k.date) * 1000);
        a8Var.e.setText(org.telegram.messenger.dd.a0(null, null, 2131742808, org.telegram.messenger.dd.D0().B0().format(date2), org.telegram.messenger.dd.D0().o0().format(date2)));
        textView2.setText(org.telegram.messenger.i0.o0(p61Var2.a(), 0));
        textView.setText(org.telegram.messenger.i0.o0(p61Var2.c(), 0));
        textView2.setVisibility(p61Var2.a() == 0 ? 0 : 8);
        textView.setVisibility(p61Var2.c() == 0 ? 8 : 0);
        a8Var.invalidate();
        if (p61Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        s61 s61Var = this.d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.k2) s61Var).currentAccount;
            View u51Var = new u51(s61Var, context, i11, i10, s61Var.Z);
            u51Var.setWillNotDraw(false);
            view = u51Var;
        } else if (i10 == 9) {
            View v51Var = new v51(viewGroup.getContext(), s61Var.a, s61Var.getResourceProvider());
            v51Var.setWillNotDraw(false);
            view = v51Var;
        } else if (i10 == 11) {
            view = new org.telegram.ui.Cells.v4(viewGroup.getContext());
        } else if (i10 == 12) {
            view = new org.telegram.ui.Cells.o3(viewGroup.getContext(), org.telegram.messenger.i0.L(15.0f));
        } else if (i10 == 13) {
            View w51Var = new w51(viewGroup.getContext(), null);
            w51Var.setWillNotDraw(false);
            w51Var.setPadding(w51Var.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), w51Var.getRight(), org.telegram.messenger.i0.L(16.0f));
            view = w51Var;
        } else if (i10 == 14) {
            view = new m61(viewGroup.getContext(), s61Var.b0 ? 2 : 4);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(viewGroup.getContext());
            b5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
            view = b5Var;
        } else {
            view = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
        }
        return sc.e.o(view, view, -1, -2);
    }
}
