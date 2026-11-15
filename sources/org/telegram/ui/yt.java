package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Components.ja {
    public final xt T1;
    public final s6 U1;
    public final k8.a V1;
    public m6 W1;
    public final org.telegram.ui.Components.hw0[] X1;
    public final org.telegram.ui.Cells.c2[] Y1;
    public final LinearLayout Z1;
    public final j6 a2;
    public final long b2;
    public final ei.c c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public yt(y6 y6Var, s6 s6Var, ei.c cVar, k8.a aVar) {
        super((org.telegram.ui.ActionBar.e2) y6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String M0;
        int i7;
        Activity activity;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.X1 = new org.telegram.ui.Components.hw0[8];
        this.Y1 = new org.telegram.ui.Cells.c2[8];
        this.V1 = aVar;
        this.U1 = s6Var;
        this.c2 = cVar;
        this.b2 = s6Var.a;
        this.r0 = false;
        b1();
        this.r0 = true;
        this.v1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        O();
        this.w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z1 = linearLayout;
        linearLayout.setOrientation(1);
        xt xtVar = new xt(getContext(), s6Var.a, aVar);
        this.T1 = xtVar;
        linearLayout.addView(xtVar, c8.ja.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131748763, str2);
                i7 = org.telegram.ui.ActionBar.j6.ck;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.hd.M0(2131748759, str2);
                i7 = org.telegram.ui.ActionBar.j6.Yj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.hd.M0(2131748768, str2);
                i7 = org.telegram.ui.ActionBar.j6.Zj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.hd.M0(2131748765, str2);
                i7 = org.telegram.ui.ActionBar.j6.ak;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.hd.M0(2131748775, str2);
                i7 = org.telegram.ui.ActionBar.j6.dk;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.hd.M0(2131748761, str2);
                i7 = org.telegram.ui.ActionBar.j6.ek;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.hd.M0(2131748760, str2);
                i7 = org.telegram.ui.ActionBar.j6.fk;
            } else {
                M0 = org.telegram.messenger.hd.M0(2131748766, str2);
                i7 = org.telegram.ui.ActionBar.j6.gk;
            }
            String str3 = M0;
            int i12 = i7;
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                activity = parentActivity;
                j3 = t6Var.a;
            } else {
                activity = parentActivity;
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.hw0[] hw0VarArr = this.X1;
                org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0();
                Paint paint = new Paint((int) r62);
                hw0Var.e = paint;
                hw0Var.c = r62;
                hw0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                hw0VarArr[i11] = hw0Var;
                org.telegram.ui.Components.hw0 hw0Var2 = this.X1[i11];
                hw0Var2.a = j3;
                hw0Var2.b = i12;
                parentActivity = activity;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                this.Z1.addView(c2Var2, c8.ja.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.q6.U(c2Var2.getTextView(), org.telegram.ui.ActionBar.j6.j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.j6.k7;
                org.telegram.ui.Components.fp fpVar = c2Var2.r;
                if (fpVar != null) {
                    fpVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.vv0(15, this, cVar));
                this.Y1[i11] = c2Var2;
                c2Var = c2Var2;
                str = null;
            } else {
                parentActivity = activity;
                str = null;
                this.X1[i11] = null;
                this.Y1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        xt xtVar2 = this.T1;
        org.telegram.ui.Components.hw0[] hw0VarArr2 = this.X1;
        xtVar2.b = hw0VarArr2;
        xtVar2.G = cVar;
        xtVar2.invalidate();
        xtVar2.c = new float[hw0VarArr2.length];
        xtVar2.d = new float[hw0VarArr2.length];
        xtVar2.e = new float[hw0VarArr2.length];
        xtVar2.c(false);
        if (xtVar2.E > 1) {
            xtVar2.f = 0.0f;
        } else {
            xtVar2.f = 1.0f;
        }
        j6 j6Var = new j6(this, getContext(), y6Var);
        this.a2 = j6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (j6Var.x == null) {
            j6Var.w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.w61 w61Var = j6Var.n;
                if (i14 >= w61Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.uj0 c10 = j6Var.c(w61Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.a2.setCacheModel(cVar);
        this.a2.setDelegate(new ji.j(this, cVar, false, 16));
        org.telegram.ui.Components.da daVar = this.u1;
        if (daVar != null) {
            daVar.setChildLayout(this.a2);
        } else {
            d1();
            this.Z1.addView(this.W1, c8.ja.r(-1, 72, 80));
        }
        if (this.W1 != null) {
            this.W1.a(this.T1.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        return new di.i4(this, 6);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return this.s1.getMessagesController().c1(this.b2);
    }

    @Override // org.telegram.ui.Components.ja
    public final void U0(org.telegram.ui.Components.st0 st0Var) {
        this.o1.j(new g3(this, 10));
        if (this.u1 != null) {
            d1();
            st0Var.addView(this.W1, c8.ja.e(-1, 72, 80));
        }
    }

    public final void d1() {
        m6 m6Var = new m6(getContext());
        this.W1 = m6Var;
        m6Var.a.setOnClickListener(new a(this, 19));
        xt xtVar = this.T1;
        if (xtVar != null) {
            this.W1.a(xtVar.a(), true);
        }
    }
}
