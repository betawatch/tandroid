package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y40 extends org.telegram.ui.Components.zk0 {
    public final LongSparseIntArray T2;
    public final /* synthetic */ s50 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = s50Var;
        this.T2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        boolean z10;
        boolean z11;
        s50 s50Var = this.U2;
        boolean z12 = s50Var.T.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.T2;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < s50Var.x2.size(); i11++) {
            longSparseIntArray.put(s50Var.x2.keyAt(i11), 1);
        }
        s50Var.x2.clear();
        int childCount = getChildCount();
        int i12 = 0;
        boolean z13 = false;
        float f11 = Float.MAX_VALUE;
        float f12 = 0.0f;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            f2.o1 G = G(childAt);
            if (G != null) {
                int i13 = G.f;
                if (i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
                    i10 = i12;
                    z10 = z13;
                } else {
                    if (i13 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.b4) {
                            org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
                            i10 = i12;
                            z11 = z13;
                            s50Var.x2.append(b4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(b4Var.getPeerId(), 0) == 0) {
                                z13 = true;
                                if (!z12) {
                                    f12 = Math.max(f12, childAt.getY() + childAt.getMeasuredHeight());
                                    f11 = Math.min(f11, Math.max(0.0f, childAt.getY()));
                                } else if (!s50Var.T.I.contains(G)) {
                                    f11 = Math.min(f11, Math.max(0, childAt.getTop()));
                                    f12 = Math.max(f12, childAt.getBottom());
                                }
                                i12 = i10 + 1;
                            } else {
                                longSparseIntArray.delete(b4Var.getPeerId());
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
            s50Var.O1();
        }
        if (z12) {
            g50 g50Var = s50Var.T;
            float f13 = g50Var.K;
            float f14 = g50Var.F;
            f10 = (f11 * f14) + ((1.0f - f14) * f13);
            f12 = (f12 * f14) + ((1.0f - f14) * g50Var.J);
        } else {
            f10 = f11;
        }
        if (f11 != Float.MAX_VALUE) {
            s50Var.r0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f12));
            canvas.drawRoundRect(s50Var.r0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), s50Var.y0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U2.T2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        g50 g50Var = this.U2.T;
        HashSet hashSet = g50Var.I;
        s50 s50Var = g50Var.L;
        HashSet hashSet2 = g50Var.H;
        if (g50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(g50Var.q);
        hashSet.clear();
        hashSet.addAll(g50Var.p);
        g50Var.J = 0.0f;
        g50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        y40 y40Var = s50Var.M;
        int childCount = y40Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = y40Var.getChildAt(i15);
            f2.o1 G = y40Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                g50Var.J = Math.max(g50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                g50Var.K = Math.min(g50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        g50Var.F = 0.0f;
        y40Var.invalidate();
    }

    @Override // org.telegram.ui.Components.zk0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    s50.N(this.U2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
