package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zc0 extends org.telegram.ui.Components.pv0 implements r0.n {
    public final c5.e t0;
    public boolean u0;
    public final /* synthetic */ bd0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(bd0 bd0Var, Context context) {
        super(context, null);
        this.v0 = bd0Var;
        this.u0 = true;
        this.t0 = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        rc0 rc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.sl0 currentListView;
        bd0 bd0Var = this.v0;
        if (viewGroup == bd0Var.R && (rc0Var = bd0Var.H0) != null && rc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
            boolean z4 = kVar.k0;
            int top = bd0Var.H0.getTop();
            boolean z10 = false;
            if (i11 >= 0) {
                if (z4) {
                    org.telegram.ui.Components.sl0 currentListView2 = bd0Var.H0.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = bd0Var.H0.getCurrentListView()) != null) {
                int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.m1 K = currentListView.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView.scrollBy(0, i11);
                        z10 = true;
                    }
                }
            }
            if (z4) {
                if (z10 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.pv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        bd0 bd0Var = this.v0;
        if (bd0Var.H0 != null) {
            canvas.save();
            canvas.translate(0.0f, bd0Var.R.getY());
            bd0Var.H0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        bd0 bd0Var = this.v0;
        kVar = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
        if (view == kVar) {
            f5Var = ((org.telegram.ui.ActionBar.p2) bd0Var).parentLayout;
            if (f5Var != null) {
                f5Var2 = ((org.telegram.ui.ActionBar.p2) bd0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.p2) bd0Var).actionBar;
                ((ActionBarLayout) f5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.n
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        rc0 rc0Var;
        bd0 bd0Var = this.v0;
        try {
            if (viewGroup == bd0Var.R && (rc0Var = bd0Var.H0) != null && rc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.sl0 currentListView = bd0Var.H0.getCurrentListView();
                int top = bd0Var.H0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i13;
                currentListView.scrollBy(0, i13);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new c10(this, 17));
        }
    }

    @Override // r0.m
    public final void o(int i10, View view) {
        this.t0.a = 0;
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        bd0 bd0Var = this.v0;
        if (!z4) {
            bd0Var.A0(true);
        } else {
            bd0Var.k0(this.u0);
            this.u0 = false;
        }
    }

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.v0.H0 != null && i10 == 2;
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.t0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
