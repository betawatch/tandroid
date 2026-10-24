package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class yu extends org.telegram.ui.Components.bb {
    public final xu X;
    public final v6 Y;
    public final mi.q Z;
    public o6 a0;
    public final org.telegram.ui.Components.zy0[] b0;
    public final org.telegram.ui.Cells.z1[] c0;
    public final LinearLayout d0;
    public final z6 e0;
    public final long f0;
    public final bi.c g0;

    public yu(c7 c7Var, v6 v6Var, bi.c cVar, mi.q qVar) {
        super((org.telegram.ui.ActionBar.o2) c7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.g6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.b0 = new org.telegram.ui.Components.zy0[8];
        this.c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = qVar;
        this.Y = v6Var;
        this.g0 = cVar;
        this.f0 = v6Var.a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        xu xuVar = new xu(getContext(), v6Var.a, qVar);
        this.X = xuVar;
        linearLayout.addView(xuVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.z1 z1Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.k6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.k6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.k6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.k6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.k6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.k6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.k6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.k6.pj;
            }
            String str = string;
            int i13 = i10;
            w6 w6Var = (w6) v6Var.d.get(i11);
            if (w6Var != null) {
                j10 = 0;
                j11 = w6Var.a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.zy0[] zy0VarArr = this.b0;
                org.telegram.ui.Components.zy0 zy0Var = new org.telegram.ui.Components.zy0();
                Paint paint = new Paint(1);
                zy0Var.e = paint;
                zy0Var.c = true;
                zy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                zy0VarArr[i11] = zy0Var;
                org.telegram.ui.Components.zy0 zy0Var2 = this.b0[i11];
                zy0Var2.a = j11;
                zy0Var2.b = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                this.d0.addView(z1Var2, w7.z5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                if (z1Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.r6.W(z1Var2.getTextView(), org.telegram.ui.ActionBar.k6.j5, null);
                } else {
                    z1Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
                }
                int i14 = org.telegram.ui.ActionBar.k6.k7;
                org.telegram.ui.Components.xp xpVar = z1Var2.r;
                if (xpVar != null) {
                    xpVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.d51(10, this, cVar));
                this.c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.b0[i11] = null;
                this.c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        xu xuVar2 = this.X;
        org.telegram.ui.Components.zy0[] zy0VarArr2 = this.b0;
        xuVar2.b = zy0VarArr2;
        xuVar2.F = cVar;
        xuVar2.invalidate();
        xuVar2.c = new float[zy0VarArr2.length];
        xuVar2.d = new float[zy0VarArr2.length];
        xuVar2.e = new float[zy0VarArr2.length];
        xuVar2.c(false);
        if (xuVar2.y > 1) {
            xuVar2.f = 0.0f;
        } else {
            xuVar2.f = 1.0f;
        }
        z6 z6Var = new z6(this, getContext(), c7Var, 1);
        this.e0 = z6Var;
        z6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        z6Var.setCacheModel(cVar);
        z6Var.setDelegate(new n2.e(this, cVar, false, 8));
        org.telegram.ui.Components.va vaVar = this.s;
        if (vaVar != null) {
            vaVar.setChildLayout(z6Var);
        } else {
            R();
            this.d0.addView(this.a0, w7.z5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final void F(org.telegram.ui.Components.ow0 ow0Var) {
        this.d.j(new j3(this, 9));
        if (this.s != null) {
            R();
            ow0Var.addView(this.a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void R() {
        o6 o6Var = new o6(getContext());
        this.a0 = o6Var;
        o6Var.a.setOnClickListener(new a(this, 19));
        xu xuVar = this.X;
        if (xuVar != null) {
            this.a0.a(xuVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.lm0 w(org.telegram.ui.Components.mm0 mm0Var) {
        return new wu(this);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return this.n.getMessagesController().getFullName(this.f0);
    }
}
