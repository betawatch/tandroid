package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rc0 extends org.telegram.ui.Components.zu0 implements r0.n {
    public final d5.p s0;
    public boolean t0;
    public final /* synthetic */ tc0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc0(tc0 tc0Var, Context context) {
        super(context, null);
        this.u0 = tc0Var;
        this.t0 = true;
        this.s0 = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        jc0 jc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.zk0 currentListView;
        tc0 tc0Var = this.u0;
        if (viewGroup == tc0Var.Q && (jc0Var = tc0Var.G0) != null && jc0Var.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar;
            boolean z10 = kVar.j0;
            int top = tc0Var.G0.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.zk0 currentListView2 = tc0Var.G0.getCurrentListView();
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
            if (top <= 0 && (currentListView = tc0Var.G0.getCurrentListView()) != null) {
                int L0 = ((f2.k0) currentListView.getLayoutManager()).L0();
                if (L0 != -1) {
                    f2.o1 K = currentListView.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView.scrollBy(0, i11);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        tc0 tc0Var = this.u0;
        if (tc0Var.G0 != null) {
            canvas.save();
            canvas.translate(0.0f, tc0Var.Q.getY());
            tc0Var.G0.Q(canvas, arrayList);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        boolean drawChild = super.drawChild(canvas, view, j10);
        tc0 tc0Var = this.u0;
        kVar = ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar;
        if (view == kVar) {
            b5Var = ((org.telegram.ui.ActionBar.n2) tc0Var).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.n2) tc0Var).parentLayout;
                kVar2 = ((org.telegram.ui.ActionBar.n2) tc0Var).actionBar;
                ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
            }
        }
        return drawChild;
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        jc0 jc0Var;
        tc0 tc0Var = this.u0;
        try {
            if (viewGroup == tc0Var.Q && (jc0Var = tc0Var.G0) != null && jc0Var.isAttachedToWindow()) {
                org.telegram.ui.Components.zk0 currentListView = tc0Var.G0.getCurrentListView();
                int top = tc0Var.G0.getTop();
                if (currentListView == null || top != 0) {
                    return;
                }
                iArr[1] = i13;
                currentListView.scrollBy(0, i13);
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new r00(this, 17));
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tc0 tc0Var = this.u0;
        if (!z10) {
            tc0Var.A0(true);
        } else {
            tc0Var.k0(this.t0);
            this.t0 = false;
        }
    }

    @Override // r0.m
    public final void p(int i10, View view) {
        this.s0.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i10, int i11) {
        return this.u0.G0 != null && i10 == 2;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.m
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
