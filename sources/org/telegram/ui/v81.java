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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.yk0 {
    public int Y;
    public final /* synthetic */ q91 Z;
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

    public v81(q91 q91Var) {
        this.Z = q91Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 9 || i10 == 15;
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
        q91 q91Var = this.Z;
        ArrayList arrayList = q91Var.r0;
        ArrayList arrayList2 = q91Var.L;
        ArrayList arrayList3 = q91Var.M;
        ArrayList arrayList4 = q91Var.K;
        if (q91Var.Y) {
            if (q91Var.C != null) {
                int i10 = this.Y;
                this.c = i10;
                this.Y = i10 + 2;
                this.d = i10 + 1;
            }
            c91 c91Var = q91Var.d;
            if (c91Var != null && !c91Var.l) {
                int i11 = this.Y;
                if (i11 > 0) {
                    this.Y = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.Y;
                this.Y = i12 + 1;
                this.e = i12;
            }
            c91 c91Var2 = q91Var.D;
            if (c91Var2 != null && !c91Var2.l) {
                int i13 = this.Y;
                if (i13 > 0) {
                    this.Y = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.Y;
                this.Y = i14 + 1;
                this.G = i14;
            }
            c91 c91Var3 = q91Var.E;
            if (c91Var3 != null && !c91Var3.l && !c91Var3.a) {
                int i15 = this.Y;
                if (i15 > 0) {
                    this.Y = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.Y;
                this.Y = i16 + 1;
                this.H = i16;
            }
            c91 c91Var4 = q91Var.F;
            if (c91Var4 != null && !c91Var4.l && !c91Var4.a) {
                int i17 = this.Y;
                if (i17 > 0) {
                    this.Y = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.Y;
                this.Y = i18 + 1;
                this.I = i18;
            }
            c91 c91Var5 = q91Var.G;
            if (c91Var5 != null && !c91Var5.l && !c91Var5.a) {
                int i19 = this.Y;
                if (i19 > 0) {
                    this.Y = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.Y;
                this.Y = i20 + 1;
                this.J = i20;
            }
            c91 c91Var6 = q91Var.H;
            if (c91Var6 != null && !c91Var6.l && !c91Var6.a) {
                int i21 = this.Y;
                if (i21 > 0) {
                    this.Y = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.Y;
                this.Y = i22 + 1;
                this.K = i22;
            }
            c91 c91Var7 = q91Var.e;
            if (c91Var7 != null && !c91Var7.l && !c91Var7.a) {
                int i23 = this.Y;
                if (i23 > 0) {
                    this.Y = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.Y;
                this.Y = i24 + 1;
                this.n = i24;
            }
            c91 c91Var8 = q91Var.I;
            if (c91Var8 != null && !c91Var8.l && !c91Var8.a) {
                int i25 = this.Y;
                if (i25 > 0) {
                    this.Y = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.Y;
                this.Y = i26 + 1;
                this.L = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.Y;
                if (i27 > 0) {
                    this.Y = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.Y;
                int i29 = i28 + 1;
                this.M = i28;
                this.Y = i28 + 2;
                this.N = i29;
                int size = arrayList4.size() + i29;
                this.O = size - 1;
                this.Y = size;
                if (arrayList4.size() != q91Var.J.size()) {
                    int i30 = this.Y;
                    this.Y = i30 + 1;
                    this.V = i30;
                } else {
                    int i31 = this.Y;
                    this.Y = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.Y;
                if (i32 > 0) {
                    this.Y = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.Y;
                int i34 = i33 + 1;
                this.P = i33;
                this.Y = i33 + 2;
                this.Q = i34;
                int size2 = arrayList3.size() + i34;
                this.R = size2 - 1;
                this.Y = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.Y;
                if (i35 > 0) {
                    this.Y = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.Y;
                int i37 = i36 + 1;
                this.S = i36;
                this.Y = i36 + 2;
                this.T = i37;
                int size3 = arrayList2.size() + i37;
                this.U = size3 - 1;
                this.Y = size3;
            }
            int i38 = this.Y;
            if (i38 > 0) {
                this.Y = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.Y;
                this.Y = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (q91Var.f != null) {
            int i40 = this.Y;
            this.c = i40;
            this.Y = i40 + 2;
            this.d = i40 + 1;
        }
        c91 c91Var9 = q91Var.d;
        if (c91Var9 != null && !c91Var9.l) {
            int i41 = this.Y;
            if (i41 > 0) {
                this.Y = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.Y;
            this.Y = i42 + 1;
            this.e = i42;
        }
        c91 c91Var10 = q91Var.h;
        if (c91Var10 != null && !c91Var10.l) {
            int i43 = this.Y;
            if (i43 > 0) {
                this.Y = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.Y;
            this.Y = i44 + 1;
            this.h = i44;
        }
        c91 c91Var11 = q91Var.x;
        if (c91Var11 != null && !c91Var11.l) {
            int i45 = this.Y;
            if (i45 > 0) {
                this.Y = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.Y;
            this.Y = i46 + 1;
            this.y = i46;
        }
        c91 c91Var12 = q91Var.e;
        if (c91Var12 != null && !c91Var12.l) {
            int i47 = this.Y;
            if (i47 > 0) {
                this.Y = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.Y;
            this.Y = i48 + 1;
            this.n = i48;
        }
        c91 c91Var13 = q91Var.s;
        if (c91Var13 != null && !c91Var13.l) {
            int i49 = this.Y;
            if (i49 > 0) {
                this.Y = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.Y;
            this.Y = i50 + 1;
            this.v = i50;
        }
        c91 c91Var14 = q91Var.v;
        if (c91Var14 != null && !c91Var14.l) {
            int i51 = this.Y;
            if (i51 > 0) {
                this.Y = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.Y;
            this.Y = i52 + 1;
            this.w = i52;
        }
        c91 c91Var15 = q91Var.w;
        if (c91Var15 != null && !c91Var15.l) {
            int i53 = this.Y;
            if (i53 > 0) {
                this.Y = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.Y;
            this.Y = i54 + 1;
            this.x = i54;
        }
        c91 c91Var16 = q91Var.n;
        if (c91Var16 != null && !c91Var16.l) {
            int i55 = this.Y;
            if (i55 > 0) {
                this.Y = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.Y;
            this.Y = i56 + 1;
            this.r = i56;
        }
        c91 c91Var17 = q91Var.r;
        if (c91Var17 != null && !c91Var17.k && !c91Var17.a) {
            int i57 = this.Y;
            if (i57 > 0) {
                this.Y = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.Y;
            this.Y = i58 + 1;
            this.s = i58;
        }
        c91 c91Var18 = q91Var.y;
        if (c91Var18 != null && !c91Var18.l && !c91Var18.a) {
            int i59 = this.Y;
            if (i59 > 0) {
                this.Y = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.Y;
            this.Y = i60 + 1;
            this.A = i60;
        }
        c91 c91Var19 = q91Var.A;
        if (c91Var19 != null && !c91Var19.l && !c91Var19.a) {
            int i61 = this.Y;
            if (i61 > 0) {
                this.Y = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.Y;
            this.Y = i62 + 1;
            this.B = i62;
        }
        c91 c91Var20 = q91Var.B;
        if (c91Var20 != null && !c91Var20.l && !c91Var20.a) {
            int i63 = this.Y;
            if (i63 > 0) {
                this.Y = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.Y;
            this.Y = i64 + 1;
            this.C = i64;
        }
        int i65 = this.Y;
        this.Y = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.Y;
            int i67 = i66 + 1;
            this.D = i66;
            this.Y = i66 + 2;
            this.E = i67;
            int size4 = arrayList.size() + i67;
            this.F = size4 - 1;
            this.Y = size4;
            if (q91Var.o0.size() != q91Var.n0.size()) {
                int i68 = this.Y;
                this.Y = i68 + 1;
                this.f = i68;
            } else {
                int i69 = this.Y;
                this.Y = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.Y;
            this.Y = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override // f2.q0
    public final int h() {
        return this.Y;
    }

    @Override // f2.q0
    public final long i(int i10) {
        if (i10 >= this.E && i10 < this.F) {
            return ((n91) this.Z.r0.get(i10 - r0)).b();
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
        if (i10 == this.y) {
            return 5L;
        }
        if (i10 == this.s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.w) {
            return 8L;
        }
        if (i10 == this.x) {
            return 9L;
        }
        if (i10 == this.G) {
            return 10L;
        }
        if (i10 == this.H) {
            return 11L;
        }
        if (i10 == this.I) {
            return 12L;
        }
        if (i10 == this.J) {
            return 13L;
        }
        if (i10 == this.K) {
            return 14L;
        }
        if (i10 == this.L) {
            return 15L;
        }
        if (i10 == this.A) {
            return 16L;
        }
        if (i10 == this.B) {
            return 17L;
        }
        return i10 == this.C ? 18L : -1L;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == this.e || i10 == this.h || i10 == this.n || i10 == this.y || i10 == this.K || i10 == this.G) {
            return 0;
        }
        if (i10 == this.r || i10 == this.s || i10 == this.B) {
            return 1;
        }
        if (i10 == this.v || i10 == this.w || i10 == this.H || i10 == this.J || i10 == this.A || i10 == this.C) {
            return 2;
        }
        if (i10 == this.x || i10 == this.I || i10 == this.L) {
            return 4;
        }
        if (i10 >= this.E && i10 <= this.F) {
            return 9;
        }
        if (i10 == this.f) {
            return 11;
        }
        if (this.X.contains(Integer.valueOf(i10))) {
            return 12;
        }
        if (i10 == this.D || i10 == this.c || i10 == this.P || i10 == this.M || i10 == this.S) {
            return 13;
        }
        if (i10 == this.d) {
            return 14;
        }
        if ((i10 < this.Q || i10 > this.R) && ((i10 < this.N || i10 > this.O) && (i10 < this.T || i10 > this.U))) {
            return i10 == this.V ? 15 : 10;
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
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        MessageObject messageObject;
        float f10;
        MessageObject messageObject2;
        int i11;
        CharSequence charSequence;
        View view = o1Var.a;
        q91 q91Var = this.Z;
        ArrayList arrayList = q91Var.r0;
        ArrayList arrayList2 = q91Var.K;
        boolean z10 = q91Var.Y;
        int j10 = j(i10);
        if (j10 >= 0 && j10 <= 4) {
            ((b91) view).e(this.e == i10 ? q91Var.d : this.h == i10 ? q91Var.h : this.r == i10 ? q91Var.n : this.v == i10 ? q91Var.s : this.w == i10 ? q91Var.v : this.s == i10 ? q91Var.r : this.n == i10 ? q91Var.e : this.y == i10 ? q91Var.x : this.A == i10 ? q91Var.y : this.B == i10 ? q91Var.A : this.C == i10 ? q91Var.B : this.G == i10 ? q91Var.D : this.H == i10 ? q91Var.E : this.I == i10 ? q91Var.F : this.J == i10 ? q91Var.G : this.K == i10 ? q91Var.H : this.L == i10 ? q91Var.I : q91Var.w, false);
            return;
        }
        if (j10 != 9) {
            if (j10 == 13) {
                tf.c cVar = (tf.c) view;
                cVar.c(true);
                cVar.b(q91Var.c0, q91Var.b0);
                cVar.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                if (i10 == this.c) {
                    cVar.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                    return;
                }
                if (i10 == this.P) {
                    cVar.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                    return;
                }
                if (i10 == this.S) {
                    cVar.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                    return;
                } else {
                    if (i10 == this.M) {
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
                    ((org.telegram.ui.Cells.v4) view).b(LocaleController.formatPluralString("ShowVotes", q91Var.J.size() - arrayList2.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            k91 k91Var = (k91) view;
            if (z10) {
                k91Var.setData(q91Var.C);
                return;
            }
            l91 l91Var = q91Var.f;
            TextView[] textViewArr = k91Var.a;
            TextView[] textViewArr2 = k91Var.c;
            TextView[] textViewArr3 = k91Var.b;
            int i12 = 0;
            for (int i13 = 0; i13 < textViewArr.length; i13++) {
                switch (i13) {
                    case 0:
                        textViewArr[i12].setText(l91Var.b);
                        textViewArr3[i12].setText(l91Var.c);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.d ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.a);
                        i12++;
                        break;
                    case 1:
                        textViewArr[i12].setText(l91Var.n);
                        textViewArr3[i12].setText("");
                        textViewArr2[i12].setText(l91Var.m);
                        i12++;
                        break;
                    case 2:
                        textViewArr[i12].setText(l91Var.f);
                        textViewArr3[i12].setText(l91Var.g);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.h ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.e);
                        i12++;
                        break;
                    case 3:
                        textViewArr[i12].setText(l91Var.z);
                        textViewArr3[i12].setText(l91Var.A);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.B ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.y);
                        if (!l91Var.C) {
                            break;
                        }
                        i12++;
                        break;
                    case 4:
                        textViewArr[i12].setText(l91Var.j);
                        textViewArr3[i12].setText(l91Var.k);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.l ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.i);
                        i12++;
                        break;
                    case 5:
                        textViewArr[i12].setText(l91Var.E);
                        textViewArr3[i12].setText(l91Var.F);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.G ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.D);
                        if (!l91Var.H) {
                            break;
                        }
                        i12++;
                        break;
                    case 6:
                        textViewArr[i12].setText(l91Var.p);
                        textViewArr3[i12].setText(l91Var.q);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.r ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.o);
                        if (!l91Var.s) {
                            break;
                        }
                        i12++;
                        break;
                    case 7:
                        textViewArr[i12].setText(l91Var.u);
                        textViewArr3[i12].setText(l91Var.v);
                        textViewArr3[i12].setTag(Integer.valueOf(l91Var.w ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(l91Var.t);
                        if (!l91Var.x) {
                            break;
                        }
                        i12++;
                        break;
                }
            }
            while (i12 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i12].getParent()).setVisibility(8);
                i12++;
            }
            for (int i14 = 0; i14 < k91Var.getChildCount(); i14++) {
                ViewGroup viewGroup = (ViewGroup) k91Var.getChildAt(i14);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            k91Var.b();
            return;
        }
        if (z10) {
            int i15 = this.Q;
            if (i10 >= i15 && i10 <= this.R) {
                ((org.telegram.ui.Cells.x7) view).setData((j91) q91Var.M.get(i10 - i15));
                return;
            }
            int i16 = this.N;
            if (i10 >= i16 && i10 <= this.O) {
                ((org.telegram.ui.Cells.x7) view).setData((j91) arrayList2.get(i10 - i16));
                return;
            }
            int i17 = this.T;
            if (i10 < i17 || i10 > this.U) {
                return;
            }
            ((org.telegram.ui.Cells.x7) view).setData((j91) q91Var.L.get(i10 - i17));
            return;
        }
        int i18 = i10 - this.E;
        n91 n91Var = (n91) arrayList.get(i18);
        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
        boolean z11 = i18 == arrayList.size() - 1;
        TextView textView = x7Var.f;
        TextView textView2 = x7Var.d;
        org.telegram.ui.Components.y8 y8Var = x7Var.n;
        TLRPC.ChatFull chatFull = x7Var.w;
        org.telegram.ui.Cells.v7 v7Var = x7Var.a;
        x7Var.v = n91Var;
        x7Var.x = !z11;
        MessageObject messageObject3 = n91Var.b;
        ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject3.photoThumbs;
        if (arrayList3 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 50);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject3.photoThumbsObject);
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject);
            messageObject = messageObject3;
            f10 = 1.0f;
            v7Var.j(forObject, "50_50", forObject2, "b1", 0, messageObject);
            v7Var.setRoundRadius(AndroidUtilities.dp(9.0f));
            v7Var.setScaleX(0.96f);
            v7Var.setScaleY(0.96f);
        } else {
            messageObject = messageObject3;
            f10 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                messageObject2 = messageObject;
                i11 = 1;
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                y8Var.q(chat);
                v7Var.e(chat, y8Var);
                v7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                v7Var.setScaleX(1.0f);
                v7Var.setScaleY(1.0f);
                if (messageObject2.isStory()) {
                    v7Var.setScaleX(f10);
                    v7Var.setScaleY(f10);
                    v7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> i11);
                }
                if (!messageObject2.isMusic()) {
                    charSequence = a9.p.w(messageObject2.getMusicTitle().trim(), ", ", messageObject2.getMusicAuthor().trim());
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
                x7Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView3 = x7Var.c;
                String pluralString = LocaleController.getPluralString("Views", n91Var.d());
                Object[] objArr = new Object[i11];
                objArr[0] = AndroidUtilities.formatWholeNumber(n91Var.d(), 0);
                textView3.setText(String.format(pluralString, objArr));
                Date date = new Date((n91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
                x7Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                textView2.setText(AndroidUtilities.formatWholeNumber(n91Var.a(), 0));
                textView.setText(AndroidUtilities.formatWholeNumber(n91Var.c(), 0));
                textView2.setVisibility(n91Var.a() == 0 ? 0 : 8);
                textView.setVisibility(n91Var.c() == 0 ? 8 : 0);
                x7Var.invalidate();
                if (n91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    x7Var.setImageViewAction(null);
                    return;
                } else {
                    x7Var.setImageViewAction(new u70(24, this, n91Var));
                    return;
                }
            }
            v7Var.i(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, x7Var.w);
            v7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            v7Var.setScaleX(0.96f);
            v7Var.setScaleY(0.96f);
        }
        messageObject2 = messageObject;
        i11 = 1;
        if (messageObject2.isStory()) {
        }
        if (!messageObject2.isMusic()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r9 < r7) {
        }
        x7Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder2), null));
        TextView textView32 = x7Var.c;
        String pluralString2 = LocaleController.getPluralString("Views", n91Var.d());
        Object[] objArr2 = new Object[i11];
        objArr2[0] = AndroidUtilities.formatWholeNumber(n91Var.d(), 0);
        textView32.setText(String.format(pluralString2, objArr2));
        Date date2 = new Date((n91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
        x7Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        textView2.setText(AndroidUtilities.formatWholeNumber(n91Var.a(), 0));
        textView.setText(AndroidUtilities.formatWholeNumber(n91Var.c(), 0));
        textView2.setVisibility(n91Var.a() == 0 ? 0 : 8);
        textView.setVisibility(n91Var.c() == 0 ? 8 : 0);
        x7Var.invalidate();
        if (n91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        q91 q91Var = this.Z;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.n2) q91Var).currentAccount;
            View s81Var = new s81(q91Var, context, i11, i10, q91Var.W);
            s81Var.setWillNotDraw(false);
            view = s81Var;
        } else if (i10 == 9) {
            View t81Var = new t81(viewGroup.getContext(), q91Var.a, q91Var.getResourceProvider());
            t81Var.setWillNotDraw(false);
            view = t81Var;
        } else if (i10 == 11) {
            view = new org.telegram.ui.Cells.p4(viewGroup.getContext());
        } else if (i10 == 12) {
            view = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View u81Var = new u81(viewGroup.getContext(), null);
            u81Var.setWillNotDraw(false);
            u81Var.setPadding(u81Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), u81Var.getRight(), AndroidUtilities.dp(16.0f));
            view = u81Var;
        } else if (i10 == 14) {
            view = new k91(viewGroup.getContext(), q91Var.Y ? 2 : 4);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(viewGroup.getContext());
            v4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            view = v4Var;
        } else {
            view = new org.telegram.ui.Cells.w6(viewGroup.getContext(), 0, 0);
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
