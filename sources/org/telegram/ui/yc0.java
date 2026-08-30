package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yc0 extends org.telegram.ui.Components.qv0 implements r0.n {
    public final c5.e t0;
    public boolean u0;
    public final /* synthetic */ ad0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(ad0 ad0Var, Context context) {
        super(context, null);
        this.v0 = ad0Var;
        this.u0 = true;
        this.t0 = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        qc0 qc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.sl0 currentListView;
        ad0 ad0Var = this.v0;
        if (viewGroup == ad0Var.R && (qc0Var = ad0Var.H0) != null && qc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.p2) ad0Var).actionBar;
            boolean z4 = kVar.k0;
            int top = ad0Var.H0.getTop();
            boolean z10 = false;
            if (i11 >= 0) {
                if (z4) {
                    org.telegram.ui.Components.sl0 currentListView2 = ad0Var.H0.getCurrentListView();
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
            if (top <= 0 && (currentListView = ad0Var.H0.getCurrentListView()) != null) {
                int L0 = ((f2.i0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.l1 K = currentListView.K(L0);
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

    @Override // org.telegram.ui.Components.qv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        ad0 ad0Var = this.v0;
        if (ad0Var.H0 != null) {
            canvas.save();
            canvas.translate(0.0f, ad0Var.R.getY());
            ad0Var.H0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ad0 ad0Var = this.v0;
        kVar = ((org.telegram.ui.ActionBar.p2) ad0Var).actionBar;
        if (view == kVar) {
            e5Var = ((org.telegram.ui.ActionBar.p2) ad0Var).parentLayout;
            if (e5Var != null) {
                e5Var2 = ((org.telegram.ui.ActionBar.p2) ad0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.p2) ad0Var).actionBar;
                ((ActionBarLayout) e5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        qc0 qc0Var;
        ad0 ad0Var = this.v0;
        try {
            if (viewGroup == ad0Var.R && (qc0Var = ad0Var.H0) != null && qc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.sl0 currentListView = ad0Var.H0.getCurrentListView();
                int top = ad0Var.H0.getTop();
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
    public final void n(int i10, View view) {
        this.t0.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.v0.H0 != null && i10 == 2;
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ad0 ad0Var = this.v0;
        if (!z4) {
            ad0Var.A0(true);
        } else {
            ad0Var.k0(this.u0);
            this.u0 = false;
        }
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
