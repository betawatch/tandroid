package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u40 extends org.telegram.ui.Components.wk0 {
    public final LongSparseIntArray T2;
    public final /* synthetic */ o50 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u40(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = o50Var;
        this.T2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        boolean z10;
        boolean z11;
        o50 o50Var = this.U2;
        boolean z12 = o50Var.T.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.T2;
        longSparseIntArray.clear();
        for (int i10 = 0; i10 < o50Var.x2.size(); i10++) {
            longSparseIntArray.put(o50Var.x2.keyAt(i10), 1);
        }
        o50Var.x2.clear();
        int childCount = getChildCount();
        int i11 = 0;
        boolean z13 = false;
        float f11 = Float.MAX_VALUE;
        float f12 = 0.0f;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            f2.q1 G = G(childAt);
            if (G != null) {
                int i12 = G.f;
                if (i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) {
                    i9 = i11;
                    z10 = z13;
                } else {
                    if (i12 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                            i9 = i11;
                            z11 = z13;
                            o50Var.x2.append(e4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(e4Var.getPeerId(), 0) == 0) {
                                z13 = true;
                                if (!z12) {
                                    f12 = Math.max(f12, childAt.getY() + childAt.getMeasuredHeight());
                                    f11 = Math.min(f11, Math.max(0.0f, childAt.getY()));
                                } else if (!o50Var.T.I.contains(G)) {
                                    f11 = Math.min(f11, Math.max(0, childAt.getTop()));
                                    f12 = Math.max(f12, childAt.getBottom());
                                }
                                i11 = i9 + 1;
                            } else {
                                longSparseIntArray.delete(e4Var.getPeerId());
                                z13 = z11;
                                if (!z12) {
                                }
                                i11 = i9 + 1;
                            }
                        }
                    }
                    i9 = i11;
                    z11 = z13;
                    z13 = z11;
                    if (!z12) {
                    }
                    i11 = i9 + 1;
                }
            } else {
                i9 = i11;
                z10 = z13;
            }
            z13 = z10;
            i11 = i9 + 1;
        }
        if (longSparseIntArray.size() > 0 ? true : z13) {
            o50Var.O1();
        }
        if (z12) {
            c50 c50Var = o50Var.T;
            float f13 = c50Var.K;
            float f14 = c50Var.F;
            f10 = (f11 * f14) + ((1.0f - f14) * f13);
            f12 = (f12 * f14) + ((1.0f - f14) * c50Var.J);
        } else {
            f10 = f11;
        }
        if (f11 != Float.MAX_VALUE) {
            o50Var.r0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f12));
            canvas.drawRoundRect(o50Var.r0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), o50Var.y0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U2.T2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        c50 c50Var = this.U2.T;
        HashSet hashSet = c50Var.I;
        o50 o50Var = c50Var.L;
        HashSet hashSet2 = c50Var.H;
        if (c50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(c50Var.q);
        hashSet.clear();
        hashSet.addAll(c50Var.p);
        c50Var.J = 0.0f;
        c50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        u40 u40Var = o50Var.M;
        int childCount = u40Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = u40Var.getChildAt(i14);
            f2.q1 G = u40Var.G(childAt);
            if (G != null && (i13 = G.f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                c50Var.J = Math.max(c50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                c50Var.K = Math.min(c50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        c50Var.F = 0.0f;
        u40Var.invalidate();
    }

    @Override // org.telegram.ui.Components.wk0, android.view.View
    public final void setVisibility(int i9) {
        if (getVisibility() != i9) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    o50.M(this.U2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i9 == 0);
                }
            }
        }
        super.setVisibility(i9);
    }
}
