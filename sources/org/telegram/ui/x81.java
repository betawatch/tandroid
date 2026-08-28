package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.Components.vk0 {
    public int Y;
    public final /* synthetic */ s91 Z;
    public int d;
    public int c = -1;
    public int e = -1;
    public int f = -1;
    public int h = -1;
    public int n = -1;
    public int r = -1;
    public int s = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
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
    public final a0.g W = new a0.g(0);
    public final a0.g X = new a0.g(0);

    public x81(s91 s91Var) {
        this.Z = s91Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 9 || i9 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.E = -1;
        this.F = -1;
        this.f = -1;
        this.D = -1;
        this.s = -1;
        this.n = -1;
        this.y = -1;
        this.C = -1;
        this.B = -1;
        this.A = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
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
        this.Y = 0;
        a0.g gVar = this.X;
        gVar.clear();
        a0.g gVar2 = this.W;
        gVar2.clear();
        s91 s91Var = this.Z;
        ArrayList arrayList = s91Var.r0;
        ArrayList arrayList2 = s91Var.L;
        ArrayList arrayList3 = s91Var.M;
        ArrayList arrayList4 = s91Var.K;
        if (s91Var.Y) {
            if (s91Var.C != null) {
                int i9 = this.Y;
                this.c = i9;
                this.Y = i9 + 2;
                this.d = i9 + 1;
            }
            e91 e91Var = s91Var.d;
            if (e91Var != null && !e91Var.l) {
                int i10 = this.Y;
                if (i10 > 0) {
                    this.Y = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.Y;
                this.Y = i11 + 1;
                this.e = i11;
            }
            e91 e91Var2 = s91Var.D;
            if (e91Var2 != null && !e91Var2.l) {
                int i12 = this.Y;
                if (i12 > 0) {
                    this.Y = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.Y;
                this.Y = i13 + 1;
                this.G = i13;
            }
            e91 e91Var3 = s91Var.E;
            if (e91Var3 != null && !e91Var3.l && !e91Var3.a) {
                int i14 = this.Y;
                if (i14 > 0) {
                    this.Y = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.H = i15;
            }
            e91 e91Var4 = s91Var.F;
            if (e91Var4 != null && !e91Var4.l && !e91Var4.a) {
                int i16 = this.Y;
                if (i16 > 0) {
                    this.Y = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.Y;
                this.Y = i17 + 1;
                this.I = i17;
            }
            e91 e91Var5 = s91Var.G;
            if (e91Var5 != null && !e91Var5.l && !e91Var5.a) {
                int i18 = this.Y;
                if (i18 > 0) {
                    this.Y = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.Y;
                this.Y = i19 + 1;
                this.J = i19;
            }
            e91 e91Var6 = s91Var.H;
            if (e91Var6 != null && !e91Var6.l && !e91Var6.a) {
                int i20 = this.Y;
                if (i20 > 0) {
                    this.Y = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.Y;
                this.Y = i21 + 1;
                this.K = i21;
            }
            e91 e91Var7 = s91Var.e;
            if (e91Var7 != null && !e91Var7.l && !e91Var7.a) {
                int i22 = this.Y;
                if (i22 > 0) {
                    this.Y = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.Y;
                this.Y = i23 + 1;
                this.n = i23;
            }
            e91 e91Var8 = s91Var.I;
            if (e91Var8 != null && !e91Var8.l && !e91Var8.a) {
                int i24 = this.Y;
                if (i24 > 0) {
                    this.Y = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.Y;
                this.Y = i25 + 1;
                this.L = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.Y;
                if (i26 > 0) {
                    this.Y = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.Y;
                int i28 = i27 + 1;
                this.M = i27;
                this.Y = i27 + 2;
                this.N = i28;
                int size = arrayList4.size() + i28;
                this.O = size - 1;
                this.Y = size;
                if (arrayList4.size() != s91Var.J.size()) {
                    int i29 = this.Y;
                    this.Y = i29 + 1;
                    this.V = i29;
                } else {
                    int i30 = this.Y;
                    this.Y = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.Y;
                if (i31 > 0) {
                    this.Y = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.Y;
                int i33 = i32 + 1;
                this.P = i32;
                this.Y = i32 + 2;
                this.Q = i33;
                int size2 = arrayList3.size() + i33;
                this.R = size2 - 1;
                this.Y = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.Y;
                if (i34 > 0) {
                    this.Y = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.Y;
                int i36 = i35 + 1;
                this.S = i35;
                this.Y = i35 + 2;
                this.T = i36;
                int size3 = arrayList2.size() + i36;
                this.U = size3 - 1;
                this.Y = size3;
            }
            int i37 = this.Y;
            if (i37 > 0) {
                this.Y = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.Y;
                this.Y = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (s91Var.f != null) {
            int i39 = this.Y;
            this.c = i39;
            this.Y = i39 + 2;
            this.d = i39 + 1;
        }
        e91 e91Var9 = s91Var.d;
        if (e91Var9 != null && !e91Var9.l) {
            int i40 = this.Y;
            if (i40 > 0) {
                this.Y = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.Y;
            this.Y = i41 + 1;
            this.e = i41;
        }
        e91 e91Var10 = s91Var.h;
        if (e91Var10 != null && !e91Var10.l) {
            int i42 = this.Y;
            if (i42 > 0) {
                this.Y = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.Y;
            this.Y = i43 + 1;
            this.h = i43;
        }
        e91 e91Var11 = s91Var.x;
        if (e91Var11 != null && !e91Var11.l) {
            int i44 = this.Y;
            if (i44 > 0) {
                this.Y = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.Y;
            this.Y = i45 + 1;
            this.y = i45;
        }
        e91 e91Var12 = s91Var.e;
        if (e91Var12 != null && !e91Var12.l) {
            int i46 = this.Y;
            if (i46 > 0) {
                this.Y = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.Y;
            this.Y = i47 + 1;
            this.n = i47;
        }
        e91 e91Var13 = s91Var.s;
        if (e91Var13 != null && !e91Var13.l) {
            int i48 = this.Y;
            if (i48 > 0) {
                this.Y = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.Y;
            this.Y = i49 + 1;
            this.v = i49;
        }
        e91 e91Var14 = s91Var.v;
        if (e91Var14 != null && !e91Var14.l) {
            int i50 = this.Y;
            if (i50 > 0) {
                this.Y = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.Y;
            this.Y = i51 + 1;
            this.w = i51;
        }
        e91 e91Var15 = s91Var.w;
        if (e91Var15 != null && !e91Var15.l) {
            int i52 = this.Y;
            if (i52 > 0) {
                this.Y = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.Y;
            this.Y = i53 + 1;
            this.x = i53;
        }
        e91 e91Var16 = s91Var.n;
        if (e91Var16 != null && !e91Var16.l) {
            int i54 = this.Y;
            if (i54 > 0) {
                this.Y = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.Y;
            this.Y = i55 + 1;
            this.r = i55;
        }
        e91 e91Var17 = s91Var.r;
        if (e91Var17 != null && !e91Var17.k && !e91Var17.a) {
            int i56 = this.Y;
            if (i56 > 0) {
                this.Y = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.Y;
            this.Y = i57 + 1;
            this.s = i57;
        }
        e91 e91Var18 = s91Var.y;
        if (e91Var18 != null && !e91Var18.l && !e91Var18.a) {
            int i58 = this.Y;
            if (i58 > 0) {
                this.Y = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.Y;
            this.Y = i59 + 1;
            this.A = i59;
        }
        e91 e91Var19 = s91Var.A;
        if (e91Var19 != null && !e91Var19.l && !e91Var19.a) {
            int i60 = this.Y;
            if (i60 > 0) {
                this.Y = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.Y;
            this.Y = i61 + 1;
            this.B = i61;
        }
        e91 e91Var20 = s91Var.B;
        if (e91Var20 != null && !e91Var20.l && !e91Var20.a) {
            int i62 = this.Y;
            if (i62 > 0) {
                this.Y = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.Y;
            this.Y = i63 + 1;
            this.C = i63;
        }
        int i64 = this.Y;
        this.Y = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.Y;
            int i66 = i65 + 1;
            this.D = i65;
            this.Y = i65 + 2;
            this.E = i66;
            int size4 = arrayList.size() + i66;
            this.F = size4 - 1;
            this.Y = size4;
            if (s91Var.o0.size() != s91Var.n0.size()) {
                int i67 = this.Y;
                this.Y = i67 + 1;
                this.f = i67;
            } else {
                int i68 = this.Y;
                this.Y = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.Y;
            this.Y = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.Y;
    }

    @Override // f2.r0
    public final long i(int i9) {
        if (i9 >= this.E && i9 < this.F) {
            return ((p91) this.Z.r0.get(i9 - r0)).b();
        }
        if (i9 == this.e) {
            return 1L;
        }
        if (i9 == this.h) {
            return 2L;
        }
        if (i9 == this.n) {
            return 3L;
        }
        if (i9 == this.r) {
            return 4L;
        }
        if (i9 == this.y) {
            return 5L;
        }
        if (i9 == this.s) {
            return 6L;
        }
        if (i9 == this.v) {
            return 7L;
        }
        if (i9 == this.w) {
            return 8L;
        }
        if (i9 == this.x) {
            return 9L;
        }
        if (i9 == this.G) {
            return 10L;
        }
        if (i9 == this.H) {
            return 11L;
        }
        if (i9 == this.I) {
            return 12L;
        }
        if (i9 == this.J) {
            return 13L;
        }
        if (i9 == this.K) {
            return 14L;
        }
        if (i9 == this.L) {
            return 15L;
        }
        if (i9 == this.A) {
            return 16L;
        }
        if (i9 == this.B) {
            return 17L;
        }
        return i9 == this.C ? 18L : -1L;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == this.e || i9 == this.h || i9 == this.n || i9 == this.y || i9 == this.K || i9 == this.G) {
            return 0;
        }
        if (i9 == this.r || i9 == this.s || i9 == this.B) {
            return 1;
        }
        if (i9 == this.v || i9 == this.w || i9 == this.H || i9 == this.J || i9 == this.A || i9 == this.C) {
            return 2;
        }
        if (i9 == this.x || i9 == this.I || i9 == this.L) {
            return 4;
        }
        if (i9 >= this.E && i9 <= this.F) {
            return 9;
        }
        if (i9 == this.f) {
            return 11;
        }
        if (this.X.contains(Integer.valueOf(i9))) {
            return 12;
        }
        if (i9 == this.D || i9 == this.c || i9 == this.P || i9 == this.M || i9 == this.S) {
            return 13;
        }
        if (i9 == this.d) {
            return 14;
        }
        if ((i9 < this.Q || i9 > this.R) && ((i9 < this.N || i9 > this.O) && (i9 < this.T || i9 > this.U))) {
            return i9 == this.V ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[LOOP:0: B:100:0x021d->B:101:0x021f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        MessageObject messageObject;
        float f10;
        MessageObject messageObject2;
        int i10;
        CharSequence charSequence;
        View view = q1Var.a;
        s91 s91Var = this.Z;
        ArrayList arrayList = s91Var.r0;
        ArrayList arrayList2 = s91Var.K;
        boolean z10 = s91Var.Y;
        int j10 = j(i9);
        if (j10 >= 0 && j10 <= 4) {
            ((d91) view).e(this.e == i9 ? s91Var.d : this.h == i9 ? s91Var.h : this.r == i9 ? s91Var.n : this.v == i9 ? s91Var.s : this.w == i9 ? s91Var.v : this.s == i9 ? s91Var.r : this.n == i9 ? s91Var.e : this.y == i9 ? s91Var.x : this.A == i9 ? s91Var.y : this.B == i9 ? s91Var.A : this.C == i9 ? s91Var.B : this.G == i9 ? s91Var.D : this.H == i9 ? s91Var.E : this.I == i9 ? s91Var.F : this.J == i9 ? s91Var.G : this.K == i9 ? s91Var.H : this.L == i9 ? s91Var.I : s91Var.w, false);
            return;
        }
        if (j10 != 9) {
            if (j10 == 13) {
                sf.c cVar = (sf.c) view;
                cVar.c(true);
                cVar.b(s91Var.c0, s91Var.b0);
                cVar.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                if (i9 == this.c) {
                    cVar.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                    return;
                }
                if (i9 == this.P) {
                    cVar.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                    return;
                }
                if (i9 == this.S) {
                    cVar.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                    return;
                } else {
                    if (i9 == this.M) {
                        cVar.setTitle(LocaleController.getString("TopMembers", R.string.TopMembers));
                        return;
                    }
                    cVar.c(false);
                    cVar.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f));
                    cVar.setTitle(LocaleController.getString("RecentPostsCapitalize", R.string.RecentPostsCapitalize));
                    return;
                }
            }
            if (j10 != 14) {
                if (j10 == 15) {
                    ((org.telegram.ui.Cells.y4) view).b(LocaleController.formatPluralString("ShowVotes", s91Var.J.size() - arrayList2.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            m91 m91Var = (m91) view;
            if (z10) {
                m91Var.setData(s91Var.C);
                return;
            }
            n91 n91Var = s91Var.f;
            TextView[] textViewArr = m91Var.a;
            TextView[] textViewArr2 = m91Var.c;
            TextView[] textViewArr3 = m91Var.b;
            int i11 = 0;
            for (int i12 = 0; i12 < textViewArr.length; i12++) {
                switch (i12) {
                    case 0:
                        textViewArr[i11].setText(n91Var.b);
                        textViewArr3[i11].setText(n91Var.c);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.d ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.a);
                        i11++;
                        break;
                    case 1:
                        textViewArr[i11].setText(n91Var.n);
                        textViewArr3[i11].setText("");
                        textViewArr2[i11].setText(n91Var.m);
                        i11++;
                        break;
                    case 2:
                        textViewArr[i11].setText(n91Var.f);
                        textViewArr3[i11].setText(n91Var.g);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.h ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.e);
                        i11++;
                        break;
                    case 3:
                        textViewArr[i11].setText(n91Var.z);
                        textViewArr3[i11].setText(n91Var.A);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.B ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.y);
                        if (!n91Var.C) {
                            break;
                        }
                        i11++;
                        break;
                    case 4:
                        textViewArr[i11].setText(n91Var.j);
                        textViewArr3[i11].setText(n91Var.k);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.l ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.i);
                        i11++;
                        break;
                    case 5:
                        textViewArr[i11].setText(n91Var.E);
                        textViewArr3[i11].setText(n91Var.F);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.G ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.D);
                        if (!n91Var.H) {
                            break;
                        }
                        i11++;
                        break;
                    case 6:
                        textViewArr[i11].setText(n91Var.p);
                        textViewArr3[i11].setText(n91Var.q);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.r ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.o);
                        if (!n91Var.s) {
                            break;
                        }
                        i11++;
                        break;
                    case 7:
                        textViewArr[i11].setText(n91Var.u);
                        textViewArr3[i11].setText(n91Var.v);
                        textViewArr3[i11].setTag(Integer.valueOf(n91Var.w ? org.telegram.ui.ActionBar.f6.x6 : org.telegram.ui.ActionBar.f6.p7));
                        textViewArr2[i11].setText(n91Var.t);
                        if (!n91Var.x) {
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
            for (int i13 = 0; i13 < m91Var.getChildCount(); i13++) {
                ViewGroup viewGroup = (ViewGroup) m91Var.getChildAt(i13);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            m91Var.b();
            return;
        }
        if (z10) {
            int i14 = this.Q;
            if (i9 >= i14 && i9 <= this.R) {
                ((org.telegram.ui.Cells.a8) view).setData((l91) s91Var.M.get(i9 - i14));
                return;
            }
            int i15 = this.N;
            if (i9 >= i15 && i9 <= this.O) {
                ((org.telegram.ui.Cells.a8) view).setData((l91) arrayList2.get(i9 - i15));
                return;
            }
            int i16 = this.T;
            if (i9 < i16 || i9 > this.U) {
                return;
            }
            ((org.telegram.ui.Cells.a8) view).setData((l91) s91Var.L.get(i9 - i16));
            return;
        }
        int i17 = i9 - this.E;
        p91 p91Var = (p91) arrayList.get(i17);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        boolean z11 = i17 == arrayList.size() - 1;
        TextView textView = a8Var.f;
        TextView textView2 = a8Var.d;
        org.telegram.ui.Components.z8 z8Var = a8Var.n;
        TLRPC.ChatFull chatFull = a8Var.w;
        org.telegram.ui.Cells.y7 y7Var = a8Var.a;
        a8Var.v = p91Var;
        a8Var.x = !z11;
        MessageObject messageObject3 = p91Var.b;
        ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject3.photoThumbs;
        if (arrayList3 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 50);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject3.photoThumbsObject);
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject);
            messageObject = messageObject3;
            f10 = 1.0f;
            y7Var.j(forObject, "50_50", forObject2, "b1", 0, messageObject);
            y7Var.setRoundRadius(AndroidUtilities.dp(9.0f));
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        } else {
            messageObject = messageObject3;
            f10 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                messageObject2 = messageObject;
                i10 = 1;
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                z8Var.q(chat);
                y7Var.e(chat, z8Var);
                y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                y7Var.setScaleX(1.0f);
                y7Var.setScaleY(1.0f);
                if (messageObject2.isStory()) {
                    y7Var.setScaleX(f10);
                    y7Var.setScaleY(f10);
                    y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> i10);
                }
                if (!messageObject2.isMusic()) {
                    charSequence = aa.d.z(messageObject2.getMusicTitle().trim(), ", ", messageObject2.getMusicAuthor().trim());
                } else if (messageObject2.isStory()) {
                    charSequence = LocaleController.getString(R.string.Story);
                } else {
                    charSequence = messageObject2.caption;
                    if (charSequence == null) {
                        charSequence = messageObject2.messageText;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                a8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView3 = a8Var.c;
                String pluralString = LocaleController.getPluralString("Views", p91Var.d());
                Object[] objArr = new Object[i10];
                objArr[0] = AndroidUtilities.formatWholeNumber(p91Var.d(), 0);
                textView3.setText(String.format(pluralString, objArr));
                Date date = new Date((p91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
                a8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                textView2.setText(AndroidUtilities.formatWholeNumber(p91Var.a(), 0));
                textView.setText(AndroidUtilities.formatWholeNumber(p91Var.c(), 0));
                textView2.setVisibility(p91Var.a() == 0 ? 0 : 8);
                textView.setVisibility(p91Var.c() == 0 ? 8 : 0);
                a8Var.invalidate();
                if (p91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    a8Var.setImageViewAction(null);
                    return;
                } else {
                    a8Var.setImageViewAction(new v80(23, this, p91Var));
                    return;
                }
            }
            y7Var.i(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, a8Var.w);
            y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        }
        messageObject2 = messageObject;
        i10 = 1;
        if (messageObject2.isStory()) {
        }
        if (!messageObject2.isMusic()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r9 < r7) {
        }
        a8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder2), null));
        TextView textView32 = a8Var.c;
        String pluralString2 = LocaleController.getPluralString("Views", p91Var.d());
        Object[] objArr2 = new Object[i10];
        objArr2[0] = AndroidUtilities.formatWholeNumber(p91Var.d(), 0);
        textView32.setText(String.format(pluralString2, objArr2));
        Date date2 = new Date((p91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
        a8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        textView2.setText(AndroidUtilities.formatWholeNumber(p91Var.a(), 0));
        textView.setText(AndroidUtilities.formatWholeNumber(p91Var.c(), 0));
        textView2.setVisibility(p91Var.a() == 0 ? 0 : 8);
        textView.setVisibility(p91Var.c() == 0 ? 8 : 0);
        a8Var.invalidate();
        if (p91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10;
        s91 s91Var = this.Z;
        if (i9 >= 0 && i9 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.o2) s91Var).currentAccount;
            View u81Var = new u81(s91Var, context, i10, i9, s91Var.W);
            u81Var.setWillNotDraw(false);
            view = u81Var;
        } else if (i9 == 9) {
            View v81Var = new v81(viewGroup.getContext(), s91Var.a, s91Var.getResourceProvider());
            v81Var.setWillNotDraw(false);
            view = v81Var;
        } else if (i9 == 11) {
            view = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i9 == 12) {
            view = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i9 == 13) {
            View w81Var = new w81(viewGroup.getContext(), null);
            w81Var.setWillNotDraw(false);
            w81Var.setPadding(w81Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), w81Var.getRight(), AndroidUtilities.dp(16.0f));
            view = w81Var;
        } else if (i9 == 14) {
            view = new m91(viewGroup.getContext(), s91Var.Y ? 2 : 4);
        } else if (i9 == 15) {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
            view = y4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
