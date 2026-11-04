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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w31 extends org.telegram.ui.Components.sj0 {
    public int d;
    public int d0;
    public final /* synthetic */ r41 e0;
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
    public final a0.g b0 = new a0.g(0);
    public final a0.g c0 = new a0.g(0);

    public w31(r41 r41Var) {
        this.e0 = r41Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 9 || i3 == 15;
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
        a0.g gVar = this.c0;
        gVar.clear();
        a0.g gVar2 = this.b0;
        gVar2.clear();
        r41 r41Var = this.e0;
        ArrayList arrayList = r41Var.z0;
        ArrayList arrayList2 = r41Var.Q;
        ArrayList arrayList3 = r41Var.R;
        ArrayList arrayList4 = r41Var.P;
        if (r41Var.c0) {
            if (r41Var.H != null) {
                int i3 = this.d0;
                this.c = i3;
                this.d0 = i3 + 2;
                this.d = i3 + 1;
            }
            d41 d41Var = r41Var.d;
            if (d41Var != null && !d41Var.l) {
                int i10 = this.d0;
                if (i10 > 0) {
                    this.d0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.d0;
                this.d0 = i11 + 1;
                this.e = i11;
            }
            d41 d41Var2 = r41Var.I;
            if (d41Var2 != null && !d41Var2.l) {
                int i12 = this.d0;
                if (i12 > 0) {
                    this.d0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.d0;
                this.d0 = i13 + 1;
                this.L = i13;
            }
            d41 d41Var3 = r41Var.J;
            if (d41Var3 != null && !d41Var3.l && !d41Var3.a) {
                int i14 = this.d0;
                if (i14 > 0) {
                    this.d0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.d0;
                this.d0 = i15 + 1;
                this.M = i15;
            }
            d41 d41Var4 = r41Var.K;
            if (d41Var4 != null && !d41Var4.l && !d41Var4.a) {
                int i16 = this.d0;
                if (i16 > 0) {
                    this.d0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.d0;
                this.d0 = i17 + 1;
                this.N = i17;
            }
            d41 d41Var5 = r41Var.L;
            if (d41Var5 != null && !d41Var5.l && !d41Var5.a) {
                int i18 = this.d0;
                if (i18 > 0) {
                    this.d0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.d0;
                this.d0 = i19 + 1;
                this.O = i19;
            }
            d41 d41Var6 = r41Var.M;
            if (d41Var6 != null && !d41Var6.l && !d41Var6.a) {
                int i20 = this.d0;
                if (i20 > 0) {
                    this.d0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.d0;
                this.d0 = i21 + 1;
                this.P = i21;
            }
            d41 d41Var7 = r41Var.e;
            if (d41Var7 != null && !d41Var7.l && !d41Var7.a) {
                int i22 = this.d0;
                if (i22 > 0) {
                    this.d0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.d0;
                this.d0 = i23 + 1;
                this.n = i23;
            }
            d41 d41Var8 = r41Var.N;
            if (d41Var8 != null && !d41Var8.l && !d41Var8.a) {
                int i24 = this.d0;
                if (i24 > 0) {
                    this.d0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.d0;
                this.d0 = i25 + 1;
                this.Q = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.d0;
                if (i26 > 0) {
                    this.d0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.d0;
                int i28 = i27 + 1;
                this.R = i27;
                this.d0 = i27 + 2;
                this.S = i28;
                int size = arrayList4.size() + i28;
                this.T = size - 1;
                this.d0 = size;
                if (arrayList4.size() != r41Var.O.size()) {
                    int i29 = this.d0;
                    this.d0 = i29 + 1;
                    this.a0 = i29;
                } else {
                    int i30 = this.d0;
                    this.d0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.d0;
                if (i31 > 0) {
                    this.d0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.d0;
                int i33 = i32 + 1;
                this.U = i32;
                this.d0 = i32 + 2;
                this.V = i33;
                int size2 = arrayList3.size() + i33;
                this.W = size2 - 1;
                this.d0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.d0;
                if (i34 > 0) {
                    this.d0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.d0;
                int i36 = i35 + 1;
                this.X = i35;
                this.d0 = i35 + 2;
                this.Y = i36;
                int size3 = arrayList2.size() + i36;
                this.Z = size3 - 1;
                this.d0 = size3;
            }
            int i37 = this.d0;
            if (i37 > 0) {
                this.d0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.d0;
                this.d0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (r41Var.f != null) {
            int i39 = this.d0;
            this.c = i39;
            this.d0 = i39 + 2;
            this.d = i39 + 1;
        }
        d41 d41Var9 = r41Var.d;
        if (d41Var9 != null && !d41Var9.l) {
            int i40 = this.d0;
            if (i40 > 0) {
                this.d0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.d0;
            this.d0 = i41 + 1;
            this.e = i41;
        }
        d41 d41Var10 = r41Var.h;
        if (d41Var10 != null && !d41Var10.l) {
            int i42 = this.d0;
            if (i42 > 0) {
                this.d0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.d0;
            this.d0 = i43 + 1;
            this.h = i43;
        }
        d41 d41Var11 = r41Var.y;
        if (d41Var11 != null && !d41Var11.l) {
            int i44 = this.d0;
            if (i44 > 0) {
                this.d0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.d0;
            this.d0 = i45 + 1;
            this.E = i45;
        }
        d41 d41Var12 = r41Var.e;
        if (d41Var12 != null && !d41Var12.l) {
            int i46 = this.d0;
            if (i46 > 0) {
                this.d0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.d0;
            this.d0 = i47 + 1;
            this.n = i47;
        }
        d41 d41Var13 = r41Var.s;
        if (d41Var13 != null && !d41Var13.l) {
            int i48 = this.d0;
            if (i48 > 0) {
                this.d0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.d0;
            this.d0 = i49 + 1;
            this.w = i49;
        }
        d41 d41Var14 = r41Var.w;
        if (d41Var14 != null && !d41Var14.l) {
            int i50 = this.d0;
            if (i50 > 0) {
                this.d0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.d0;
            this.d0 = i51 + 1;
            this.x = i51;
        }
        d41 d41Var15 = r41Var.x;
        if (d41Var15 != null && !d41Var15.l) {
            int i52 = this.d0;
            if (i52 > 0) {
                this.d0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.d0;
            this.d0 = i53 + 1;
            this.y = i53;
        }
        d41 d41Var16 = r41Var.n;
        if (d41Var16 != null && !d41Var16.l) {
            int i54 = this.d0;
            if (i54 > 0) {
                this.d0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.d0;
            this.d0 = i55 + 1;
            this.r = i55;
        }
        d41 d41Var17 = r41Var.r;
        if (d41Var17 != null && !d41Var17.k && !d41Var17.a) {
            int i56 = this.d0;
            if (i56 > 0) {
                this.d0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.d0;
            this.d0 = i57 + 1;
            this.s = i57;
        }
        d41 d41Var18 = r41Var.E;
        if (d41Var18 != null && !d41Var18.l && !d41Var18.a) {
            int i58 = this.d0;
            if (i58 > 0) {
                this.d0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.d0;
            this.d0 = i59 + 1;
            this.F = i59;
        }
        d41 d41Var19 = r41Var.F;
        if (d41Var19 != null && !d41Var19.l && !d41Var19.a) {
            int i60 = this.d0;
            if (i60 > 0) {
                this.d0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.d0;
            this.d0 = i61 + 1;
            this.G = i61;
        }
        d41 d41Var20 = r41Var.G;
        if (d41Var20 != null && !d41Var20.l && !d41Var20.a) {
            int i62 = this.d0;
            if (i62 > 0) {
                this.d0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.d0;
            this.d0 = i63 + 1;
            this.H = i63;
        }
        int i64 = this.d0;
        this.d0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.d0;
            int i66 = i65 + 1;
            this.I = i65;
            this.d0 = i65 + 2;
            this.J = i66;
            int size4 = arrayList.size() + i66;
            this.K = size4 - 1;
            this.d0 = size4;
            if (r41Var.w0.size() != r41Var.v0.size()) {
                int i67 = this.d0;
                this.d0 = i67 + 1;
                this.f = i67;
            } else {
                int i68 = this.d0;
                this.d0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.d0;
            this.d0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.d0;
    }

    @Override // u4.h0
    public final long c(int i3) {
        if (i3 >= this.J && i3 < this.K) {
            return ((o41) this.e0.z0.get(i3 - r0)).b();
        }
        if (i3 == this.e) {
            return 1L;
        }
        if (i3 == this.h) {
            return 2L;
        }
        if (i3 == this.n) {
            return 3L;
        }
        if (i3 == this.r) {
            return 4L;
        }
        if (i3 == this.E) {
            return 5L;
        }
        if (i3 == this.s) {
            return 6L;
        }
        if (i3 == this.w) {
            return 7L;
        }
        if (i3 == this.x) {
            return 8L;
        }
        if (i3 == this.y) {
            return 9L;
        }
        if (i3 == this.L) {
            return 10L;
        }
        if (i3 == this.M) {
            return 11L;
        }
        if (i3 == this.N) {
            return 12L;
        }
        if (i3 == this.O) {
            return 13L;
        }
        if (i3 == this.P) {
            return 14L;
        }
        if (i3 == this.Q) {
            return 15L;
        }
        if (i3 == this.F) {
            return 16L;
        }
        if (i3 == this.G) {
            return 17L;
        }
        return i3 == this.H ? 18L : -1L;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == this.e || i3 == this.h || i3 == this.n || i3 == this.E || i3 == this.P || i3 == this.L) {
            return 0;
        }
        if (i3 == this.r || i3 == this.s || i3 == this.G) {
            return 1;
        }
        if (i3 == this.w || i3 == this.x || i3 == this.M || i3 == this.O || i3 == this.F || i3 == this.H) {
            return 2;
        }
        if (i3 == this.y || i3 == this.N || i3 == this.Q) {
            return 4;
        }
        if (i3 >= this.J && i3 <= this.K) {
            return 9;
        }
        if (i3 == this.f) {
            return 11;
        }
        if (this.c0.contains(Integer.valueOf(i3))) {
            return 12;
        }
        if (i3 == this.I || i3 == this.c || i3 == this.U || i3 == this.R || i3 == this.X) {
            return 13;
        }
        if (i3 == this.d) {
            return 14;
        }
        if ((i3 < this.V || i3 > this.W) && ((i3 < this.S || i3 > this.T) && (i3 < this.Y || i3 > this.Z))) {
            return i3 == this.a0 ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c A[LOOP:0: B:100:0x021a->B:101:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.messenger.zi ziVar;
        float f10;
        org.telegram.messenger.zi ziVar2;
        o41 o41Var;
        CharSequence charSequence;
        o41 o41Var2;
        View view = d1Var.a;
        r41 r41Var = this.e0;
        ArrayList arrayList = r41Var.z0;
        ArrayList arrayList2 = r41Var.P;
        boolean z10 = r41Var.c0;
        int d = d(i3);
        if (d >= 0 && d <= 4) {
            ((c41) view).e(this.e == i3 ? r41Var.d : this.h == i3 ? r41Var.h : this.r == i3 ? r41Var.n : this.w == i3 ? r41Var.s : this.x == i3 ? r41Var.w : this.s == i3 ? r41Var.r : this.n == i3 ? r41Var.e : this.E == i3 ? r41Var.y : this.F == i3 ? r41Var.E : this.G == i3 ? r41Var.F : this.H == i3 ? r41Var.G : this.L == i3 ? r41Var.I : this.M == i3 ? r41Var.J : this.N == i3 ? r41Var.K : this.O == i3 ? r41Var.L : this.P == i3 ? r41Var.M : this.Q == i3 ? r41Var.N : r41Var.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                og.c cVar = (og.c) view;
                cVar.c(true);
                cVar.b(r41Var.g0, r41Var.f0);
                cVar.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                if (i3 == this.c) {
                    cVar.setTitle(org.telegram.messenger.bd.M0(2131744905, "StatisticOverview"));
                    return;
                }
                if (i3 == this.U) {
                    cVar.setTitle(org.telegram.messenger.bd.M0(2131744045, "TopAdmins"));
                    return;
                }
                if (i3 == this.X) {
                    cVar.setTitle(org.telegram.messenger.bd.M0(2131744042, "TopInviters"));
                    return;
                } else {
                    if (i3 == this.R) {
                        cVar.setTitle(org.telegram.messenger.bd.M0(2131744041, "TopMembers"));
                        return;
                    }
                    cVar.c(false);
                    cVar.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f));
                    cVar.setTitle(org.telegram.messenger.bd.M0(2131746373, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((org.telegram.ui.Cells.x4) view).b(R.drawable.arrow_more, 5, org.telegram.messenger.bd.G(r41Var.O.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            l41 l41Var = (l41) view;
            if (z10) {
                l41Var.setData(r41Var.H);
                return;
            }
            m41 m41Var = r41Var.f;
            TextView[] textViewArr = l41Var.a;
            TextView[] textViewArr2 = l41Var.c;
            TextView[] textViewArr3 = l41Var.b;
            int i10 = 0;
            for (int i11 = 0; i11 < textViewArr.length; i11++) {
                switch (i11) {
                    case 0:
                        textViewArr[i10].setText(m41Var.b);
                        textViewArr3[i10].setText(m41Var.c);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.d ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.a);
                        i10++;
                        break;
                    case 1:
                        textViewArr[i10].setText(m41Var.n);
                        textViewArr3[i10].setText("");
                        textViewArr2[i10].setText(m41Var.m);
                        i10++;
                        break;
                    case 2:
                        textViewArr[i10].setText(m41Var.f);
                        textViewArr3[i10].setText(m41Var.g);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.h ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.e);
                        i10++;
                        break;
                    case 3:
                        textViewArr[i10].setText(m41Var.z);
                        textViewArr3[i10].setText(m41Var.A);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.B ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.y);
                        if (!m41Var.C) {
                            break;
                        }
                        i10++;
                        break;
                    case 4:
                        textViewArr[i10].setText(m41Var.j);
                        textViewArr3[i10].setText(m41Var.k);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.l ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.i);
                        i10++;
                        break;
                    case 5:
                        textViewArr[i10].setText(m41Var.E);
                        textViewArr3[i10].setText(m41Var.F);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.G ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.D);
                        if (!m41Var.H) {
                            break;
                        }
                        i10++;
                        break;
                    case 6:
                        textViewArr[i10].setText(m41Var.p);
                        textViewArr3[i10].setText(m41Var.q);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.r ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.o);
                        if (!m41Var.s) {
                            break;
                        }
                        i10++;
                        break;
                    case 7:
                        textViewArr[i10].setText(m41Var.u);
                        textViewArr3[i10].setText(m41Var.v);
                        textViewArr3[i10].setTag(Integer.valueOf(m41Var.w ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(m41Var.t);
                        if (!m41Var.x) {
                            break;
                        }
                        i10++;
                        break;
                }
            }
            while (i10 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i10].getParent()).setVisibility(8);
                i10++;
            }
            for (int i12 = 0; i12 < l41Var.getChildCount(); i12++) {
                ViewGroup viewGroup = (ViewGroup) l41Var.getChildAt(i12);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            l41Var.updateColors();
            return;
        }
        if (z10) {
            int i13 = this.V;
            if (i3 >= i13 && i3 <= this.W) {
                ((org.telegram.ui.Cells.v7) view).setData((k41) r41Var.R.get(i3 - i13));
                return;
            }
            int i14 = this.S;
            if (i3 >= i14 && i3 <= this.T) {
                ((org.telegram.ui.Cells.v7) view).setData((k41) arrayList2.get(i3 - i14));
                return;
            }
            int i15 = this.Y;
            if (i3 < i15 || i3 > this.Z) {
                return;
            }
            ((org.telegram.ui.Cells.v7) view).setData((k41) r41Var.Q.get(i3 - i15));
            return;
        }
        int i16 = i3 - this.J;
        o41 o41Var3 = (o41) arrayList.get(i16);
        org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
        boolean z11 = i16 == arrayList.size() - 1;
        TextView textView = v7Var.f;
        TextView textView2 = v7Var.d;
        org.telegram.ui.Components.u8 u8Var = v7Var.n;
        TLRPC.ChatFull chatFull = v7Var.x;
        org.telegram.ui.Cells.t7 t7Var = v7Var.a;
        v7Var.w = o41Var3;
        v7Var.y = !z11;
        org.telegram.messenger.zi ziVar3 = o41Var3.b;
        ArrayList arrayList3 = ziVar3.n0;
        if (arrayList3 != null) {
            ziVar = ziVar3;
            f10 = 1.0f;
            t7Var.l(org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(arrayList3, org.telegram.messenger.g0.Z0(false), false, null, false), ziVar3.l0), "50_50", org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(ziVar3.n0, 50, false, null, false), ziVar3.l0), "b1", 0, ziVar);
            t7Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
            t7Var.setScaleX(0.96f);
            t7Var.setScaleY(0.96f);
        } else {
            ziVar = ziVar3;
            f10 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                ziVar2 = ziVar;
                o41Var = o41Var3;
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(chatFull.id));
                u8Var.q(M0);
                t7Var.e(M0, u8Var);
                t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                t7Var.setScaleX(1.0f);
                t7Var.setScaleY(1.0f);
                if (ziVar2.y4()) {
                    t7Var.setScaleX(f10);
                    t7Var.setScaleY(f10);
                    t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                }
                if (!ziVar2.J3()) {
                    charSequence = a1.g.C(ziVar2.z1(true).trim(), ", ", ziVar2.x1(true).trim());
                } else if (ziVar2.y4()) {
                    charSequence = org.telegram.messenger.bd.M0(2131744745, null);
                } else {
                    charSequence = ziVar2.z;
                    if (charSequence == null) {
                        charSequence = ziVar2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                v7Var.b.k(org.telegram.messenger.g0.P3(org.telegram.messenger.g0.N2(spannableStringBuilder), null));
                v7Var.c.setText(String.format(org.telegram.messenger.bd.K0(o41Var.d(), "Views"), org.telegram.messenger.g0.o0(o41Var.d(), 0)));
                o41Var2 = o41Var;
                Date date = new Date((o41Var2.b != null ? 0L : r6.k.date) * 1000);
                v7Var.e.setText(org.telegram.messenger.bd.a0(null, null, 2131742793, org.telegram.messenger.bd.E0().C0().format(date), org.telegram.messenger.bd.E0().p0().format(date)));
                textView2.setText(org.telegram.messenger.g0.o0(o41Var2.a(), 0));
                textView.setText(org.telegram.messenger.g0.o0(o41Var2.c(), 0));
                textView2.setVisibility(o41Var2.a() == 0 ? 0 : 8);
                textView.setVisibility(o41Var2.c() == 0 ? 8 : 0);
                v7Var.invalidate();
                if (o41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    v7Var.setImageViewAction(null);
                    return;
                } else {
                    v7Var.setImageViewAction(new hb0(18, this, o41Var2));
                    return;
                }
            }
            t7Var.k(org.telegram.messenger.ac.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, v7Var.x);
            t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
            t7Var.setScaleX(0.96f);
            t7Var.setScaleY(0.96f);
        }
        o41Var = o41Var3;
        ziVar2 = ziVar;
        if (ziVar2.y4()) {
        }
        if (!ziVar2.J3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        v7Var.b.k(org.telegram.messenger.g0.P3(org.telegram.messenger.g0.N2(spannableStringBuilder2), null));
        v7Var.c.setText(String.format(org.telegram.messenger.bd.K0(o41Var.d(), "Views"), org.telegram.messenger.g0.o0(o41Var.d(), 0)));
        o41Var2 = o41Var;
        Date date2 = new Date((o41Var2.b != null ? 0L : r6.k.date) * 1000);
        v7Var.e.setText(org.telegram.messenger.bd.a0(null, null, 2131742793, org.telegram.messenger.bd.E0().C0().format(date2), org.telegram.messenger.bd.E0().p0().format(date2)));
        textView2.setText(org.telegram.messenger.g0.o0(o41Var2.a(), 0));
        textView.setText(org.telegram.messenger.g0.o0(o41Var2.c(), 0));
        textView2.setVisibility(o41Var2.a() == 0 ? 0 : 8);
        textView.setVisibility(o41Var2.c() == 0 ? 8 : 0);
        v7Var.invalidate();
        if (o41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        int i10;
        r41 r41Var = this.e0;
        if (i3 >= 0 && i3 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.d2) r41Var).currentAccount;
            View t31Var = new t31(r41Var, context, i10, i3, r41Var.a0);
            t31Var.setWillNotDraw(false);
            view = t31Var;
        } else if (i3 == 9) {
            View u31Var = new u31(viewGroup.getContext(), r41Var.a, r41Var.getResourceProvider());
            u31Var.setWillNotDraw(false);
            view = u31Var;
        } else if (i3 == 11) {
            view = new org.telegram.ui.Cells.t4(viewGroup.getContext());
        } else if (i3 == 12) {
            view = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i3 == 13) {
            View v31Var = new v31(viewGroup.getContext(), null);
            v31Var.setWillNotDraw(false);
            v31Var.setPadding(v31Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), v31Var.getRight(), org.telegram.messenger.g0.L(16.0f));
            view = v31Var;
        } else if (i3 == 14) {
            view = new l41(viewGroup.getContext(), r41Var.c0 ? 2 : 4);
        } else if (i3 == 15) {
            org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            view = x4Var;
        } else {
            view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
