package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t50 extends org.telegram.ui.Components.mm0 {
    public final LongSparseIntArray V2;
    public final /* synthetic */ n60 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.W2 = n60Var;
        this.V2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        boolean z10;
        float f10;
        n60 n60Var = this.W2;
        float f11 = Float.MAX_VALUE;
        boolean z11 = n60Var.X.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.V2;
        longSparseIntArray.clear();
        for (int i10 = 0; i10 < n60Var.B2.size(); i10++) {
            longSparseIntArray.put(n60Var.B2.keyAt(i10), 1);
        }
        n60Var.B2.clear();
        int childCount = getChildCount();
        float f12 = Float.MAX_VALUE;
        int i11 = 0;
        boolean z12 = false;
        float f13 = 0.0f;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            s4.b1 G = G(childAt);
            if (G != null) {
                f10 = f11;
                int i12 = G.f;
                if (i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) {
                    z10 = z11;
                } else {
                    if (i12 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                            z10 = z11;
                            n60Var.B2.append(e4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(e4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                            } else {
                                longSparseIntArray.delete(e4Var.getPeerId());
                            }
                            if (z10) {
                                f13 = Math.max(f13, childAt.getY() + childAt.getMeasuredHeight());
                                f12 = Math.min(f12, Math.max(0.0f, childAt.getY()));
                                i11++;
                                f11 = f10;
                                z11 = z10;
                            } else if (!n60Var.X.I.contains(G)) {
                                f12 = Math.min(f12, Math.max(0, childAt.getTop()));
                                f13 = Math.max(f13, childAt.getBottom());
                            }
                        }
                    }
                    z10 = z11;
                    if (z10) {
                    }
                }
            } else {
                z10 = z11;
                f10 = f11;
            }
            i11++;
            f11 = f10;
            z11 = z10;
        }
        boolean z13 = z11;
        float f14 = f11;
        if (longSparseIntArray.size() > 0) {
            z12 = true;
        }
        if (z12) {
            n60Var.P1();
        }
        if (z13) {
            b60 b60Var = n60Var.X;
            float f15 = b60Var.K;
            float f16 = b60Var.F;
            f7 = (f12 * f16) + ((1.0f - f16) * f15);
            f13 = (f13 * f16) + ((1.0f - f16) * b60Var.J);
        } else {
            f7 = f12;
        }
        if (f12 != f14) {
            n60Var.v0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f7, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f13));
            canvas.drawRoundRect(n60Var.v0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), n60Var.C0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.W2.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        b60 b60Var = this.W2.X;
        HashSet hashSet = b60Var.I;
        n60 n60Var = b60Var.L;
        HashSet hashSet2 = b60Var.H;
        if (b60Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(b60Var.q);
        hashSet.clear();
        hashSet.addAll(b60Var.p);
        b60Var.J = 0.0f;
        b60Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        t50 t50Var = n60Var.Q;
        int childCount = t50Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = t50Var.getChildAt(i15);
            s4.b1 G = t50Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                b60Var.J = Math.max(b60Var.J, childAt.getY() + childAt.getMeasuredHeight());
                b60Var.K = Math.min(b60Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        b60Var.F = 0.0f;
        t50Var.invalidate();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    n60.O(this.W2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
