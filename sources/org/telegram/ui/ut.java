package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ut extends org.telegram.ui.Components.ma {
    public final tt Q1;
    public final t6 R1;
    public final m2.t S1;
    public n6 T1;
    public final org.telegram.ui.Components.dw0[] U1;
    public final org.telegram.ui.Cells.c2[] V1;
    public final LinearLayout W1;
    public final k6 X1;
    public final long Y1;
    public final di.c Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public ut(z6 z6Var, t6 t6Var, di.c cVar, m2.t tVar) {
        super((org.telegram.ui.ActionBar.d2) z6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String M0;
        int i3;
        Activity activity;
        long j10;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.U1 = new org.telegram.ui.Components.dw0[8];
        this.V1 = new org.telegram.ui.Cells.c2[8];
        this.S1 = tVar;
        this.R1 = t6Var;
        this.Z1 = cVar;
        this.Y1 = t6Var.a;
        this.r0 = false;
        b1();
        this.r0 = true;
        this.s1 = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        N();
        this.w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        tt ttVar = new tt(getContext(), t6Var.a, tVar);
        this.Q1 = ttVar;
        linearLayout.addView(ttVar, b8.mf.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.bd.M0(2131748771, str2);
                i3 = org.telegram.ui.ActionBar.k6.Zj;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.bd.M0(2131748767, str2);
                i3 = org.telegram.ui.ActionBar.k6.Vj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.bd.M0(2131748776, str2);
                i3 = org.telegram.ui.ActionBar.k6.Wj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.bd.M0(2131748773, str2);
                i3 = org.telegram.ui.ActionBar.k6.Xj;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.bd.M0(2131748783, str2);
                i3 = org.telegram.ui.ActionBar.k6.ak;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.bd.M0(2131748769, str2);
                i3 = org.telegram.ui.ActionBar.k6.bk;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.bd.M0(2131748768, str2);
                i3 = org.telegram.ui.ActionBar.k6.ck;
            } else {
                M0 = org.telegram.messenger.bd.M0(2131748774, str2);
                i3 = org.telegram.ui.ActionBar.k6.dk;
            }
            String str3 = M0;
            int i12 = i3;
            u6 u6Var = (u6) t6Var.d.get(i11);
            if (u6Var != null) {
                activity = parentActivity;
                j10 = u6Var.a;
            } else {
                activity = parentActivity;
                j10 = 0;
            }
            if (j10 > 0) {
                org.telegram.ui.Components.dw0[] dw0VarArr = this.U1;
                org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0();
                Paint paint = new Paint((int) r62);
                dw0Var.e = paint;
                dw0Var.c = r62;
                dw0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                dw0VarArr[i11] = dw0Var;
                org.telegram.ui.Components.dw0 dw0Var2 = this.U1[i11];
                dw0Var2.a = j10;
                dw0Var2.b = i12;
                parentActivity = activity;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                this.W1.addView(c2Var2, b8.mf.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j10, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.r6.V(c2Var2.getTextView(), org.telegram.ui.ActionBar.k6.j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.k6.k7;
                org.telegram.ui.Components.wo woVar = c2Var2.r;
                if (woVar != null) {
                    woVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.ux0(13, (Object) this, (Object) cVar));
                this.V1[i11] = c2Var2;
                c2Var = c2Var2;
                str = null;
            } else {
                parentActivity = activity;
                str = null;
                this.U1[i11] = null;
                this.V1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        tt ttVar2 = this.Q1;
        org.telegram.ui.Components.dw0[] dw0VarArr2 = this.U1;
        ttVar2.b = dw0VarArr2;
        ttVar2.G = cVar;
        ttVar2.invalidate();
        ttVar2.c = new float[dw0VarArr2.length];
        ttVar2.d = new float[dw0VarArr2.length];
        ttVar2.e = new float[dw0VarArr2.length];
        ttVar2.c(false);
        if (ttVar2.E > 1) {
            ttVar2.f = 0.0f;
        } else {
            ttVar2.f = 1.0f;
        }
        k6 k6Var = new k6(this, getContext(), z6Var);
        this.X1 = k6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (k6Var.x == null) {
            k6Var.w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.n61 n61Var = k6Var.n;
                if (i14 >= n61Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.tj0 c2 = k6Var.c(n61Var.getViewPages()[i14]);
                if (c2 != null) {
                    c2.setPadding(c2.getPaddingLeft(), 0, c2.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.X1.setCacheModel(cVar);
        this.X1.setDelegate(new mi.h0(12, this, cVar));
        org.telegram.ui.Components.ga gaVar = this.r1;
        if (gaVar != null) {
            gaVar.setChildLayout(this.X1);
        } else {
            d1();
            this.W1.addView(this.T1, b8.mf.r(-1, 72, 80));
        }
        if (this.T1 != null) {
            this.T1.a(this.Q1.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        return new ci.r4(this, 5);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.p1.getMessagesController().c1(this.Y1);
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(org.telegram.ui.Components.qt0 qt0Var) {
        this.l1.j(new h3(this, 10));
        if (this.r1 != null) {
            d1();
            qt0Var.addView(this.T1, b8.mf.e(-1, 72, 80));
        }
    }

    public final void d1() {
        n6 n6Var = new n6(getContext());
        this.T1 = n6Var;
        n6Var.a.setOnClickListener(new a(this, 19));
        tt ttVar = this.Q1;
        if (ttVar != null) {
            this.T1.a(ttVar.a(), true);
        }
    }
}
