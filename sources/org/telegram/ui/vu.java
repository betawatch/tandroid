package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.bb {
    public final uu X;
    public final v6 Y;
    public final n2.e Z;
    public o6 a0;
    public final org.telegram.ui.Components.wy0[] b0;
    public final org.telegram.ui.Cells.a2[] c0;
    public final LinearLayout d0;
    public final z6 e0;
    public final long f0;
    public final bi.c g0;

    public vu(c7 c7Var, v6 v6Var, bi.c cVar, n2.e eVar) {
        super((org.telegram.ui.ActionBar.n2) c7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.b0 = new org.telegram.ui.Components.wy0[8];
        this.c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = eVar;
        this.Y = v6Var;
        this.g0 = cVar;
        this.f0 = v6Var.a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = c7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        uu uuVar = new uu(getContext(), v6Var.a, eVar);
        this.X = uuVar;
        linearLayout.addView(uuVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.h6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.h6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.h6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.h6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.h6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.h6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.h6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.h6.pj;
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
                org.telegram.ui.Components.wy0[] wy0VarArr = this.b0;
                org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0();
                Paint paint = new Paint(1);
                wy0Var.e = paint;
                wy0Var.c = true;
                wy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                wy0VarArr[i11] = wy0Var;
                org.telegram.ui.Components.wy0 wy0Var2 = this.b0[i11];
                wy0Var2.a = j11;
                wy0Var2.b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                this.d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
                int i14 = org.telegram.ui.ActionBar.h6.k7;
                org.telegram.ui.Components.xp xpVar = a2Var2.r;
                if (xpVar != null) {
                    xpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.i51(9, this, cVar));
                this.c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.b0[i11] = null;
                this.c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        uu uuVar2 = this.X;
        org.telegram.ui.Components.wy0[] wy0VarArr2 = this.b0;
        uuVar2.b = wy0VarArr2;
        uuVar2.F = cVar;
        uuVar2.invalidate();
        uuVar2.c = new float[wy0VarArr2.length];
        uuVar2.d = new float[wy0VarArr2.length];
        uuVar2.e = new float[wy0VarArr2.length];
        uuVar2.c(false);
        if (uuVar2.y > 1) {
            uuVar2.f = 0.0f;
        } else {
            uuVar2.f = 1.0f;
        }
        z6 z6Var = new z6(this, getContext(), c7Var, 1);
        this.e0 = z6Var;
        z6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        z6Var.setCacheModel(cVar);
        z6Var.setDelegate(new mi.q(this, cVar, false, 11));
        org.telegram.ui.Components.va vaVar = this.s;
        if (vaVar != null) {
            vaVar.setChildLayout(z6Var);
        } else {
            S();
            this.d0.addView(this.a0, w7.z5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return this.n.getMessagesController().getFullName(this.f0);
    }

    @Override // org.telegram.ui.Components.bb
    public final void G(org.telegram.ui.Components.lw0 lw0Var) {
        this.d.j(new k3(this, 9));
        if (this.s != null) {
            S();
            lw0Var.addView(this.a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void S() {
        o6 o6Var = new o6(getContext());
        this.a0 = o6Var;
        o6Var.a.setOnClickListener(new a(this, 19));
        uu uuVar = this.X;
        if (uuVar != null) {
            this.a0.a(uuVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.im0 x(org.telegram.ui.Components.jm0 jm0Var) {
        return new tu(this);
    }
}
