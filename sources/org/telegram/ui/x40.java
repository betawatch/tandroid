package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.Components.jl0 {
    public final LongSparseIntArray T2;
    public final /* synthetic */ r50 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = r50Var;
        this.T2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        int i10;
        boolean z10;
        boolean z11;
        r50 r50Var = this.U2;
        boolean z12 = r50Var.T.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.T2;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < r50Var.x2.size(); i11++) {
            longSparseIntArray.put(r50Var.x2.keyAt(i11), 1);
        }
        r50Var.x2.clear();
        int childCount = getChildCount();
        int i12 = 0;
        boolean z13 = false;
        float f10 = Float.MAX_VALUE;
        float f11 = 0.0f;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            f2.n1 G = G(childAt);
            if (G != null) {
                int i13 = G.f;
                if (i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
                    i10 = i12;
                    z10 = z13;
                } else {
                    if (i13 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.c4) {
                            org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
                            i10 = i12;
                            z11 = z13;
                            r50Var.x2.append(c4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(c4Var.getPeerId(), 0) == 0) {
                                z13 = true;
                                if (!z12) {
                                    f11 = Math.max(f11, childAt.getY() + childAt.getMeasuredHeight());
                                    f10 = Math.min(f10, Math.max(0.0f, childAt.getY()));
                                } else if (!r50Var.T.I.contains(G)) {
                                    f10 = Math.min(f10, Math.max(0, childAt.getTop()));
                                    f11 = Math.max(f11, childAt.getBottom());
                                }
                                i12 = i10 + 1;
                            } else {
                                longSparseIntArray.delete(c4Var.getPeerId());
                                z13 = z11;
                                if (!z12) {
                                }
                                i12 = i10 + 1;
                            }
                        }
                    }
                    i10 = i12;
                    z11 = z13;
                    z13 = z11;
                    if (!z12) {
                    }
                    i12 = i10 + 1;
                }
            } else {
                i10 = i12;
                z10 = z13;
            }
            z13 = z10;
            i12 = i10 + 1;
        }
        if (longSparseIntArray.size() > 0 ? true : z13) {
            r50Var.O1();
        }
        if (z12) {
            f50 f50Var = r50Var.T;
            float f12 = f50Var.K;
            float f13 = f50Var.F;
            f9 = (f10 * f13) + ((1.0f - f13) * f12);
            f11 = (f11 * f13) + ((1.0f - f13) * f50Var.J);
        } else {
            f9 = f10;
        }
        if (f10 != Float.MAX_VALUE) {
            r50Var.r0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f9, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f11));
            canvas.drawRoundRect(r50Var.r0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), r50Var.y0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U2.T2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        f50 f50Var = this.U2.T;
        HashSet hashSet = f50Var.I;
        r50 r50Var = f50Var.L;
        HashSet hashSet2 = f50Var.H;
        if (f50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(f50Var.q);
        hashSet.clear();
        hashSet.addAll(f50Var.p);
        f50Var.J = 0.0f;
        f50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        x40 x40Var = r50Var.M;
        int childCount = x40Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = x40Var.getChildAt(i15);
            f2.n1 G = x40Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                f50Var.J = Math.max(f50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                f50Var.K = Math.min(f50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        f50Var.F = 0.0f;
        x40Var.invalidate();
    }

    @Override // org.telegram.ui.Components.jl0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    r50.M(this.U2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
