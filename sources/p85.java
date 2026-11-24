// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p85 extends r59 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ g95 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = g95Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // r59, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        View view;
        p85 p85Var = this;
        g95 g95Var = p85Var.g3;
        RectF rectF = g95Var.p2;
        LongSparseIntArray longSparseIntArray = g95Var.r4;
        w85 w85Var = g95Var.Q1;
        boolean z = w85Var.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray2 = p85Var.f3;
        longSparseIntArray2.clear();
        for (int i3 = 0; i3 < longSparseIntArray.size(); i3++) {
            longSparseIntArray2.put(longSparseIntArray.keyAt(i3), 1);
        }
        longSparseIntArray.clear();
        int childCount = p85Var.getChildCount();
        float f2 = Float.MAX_VALUE;
        float f3 = 0.0f;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < childCount) {
            View childAt = p85Var.getChildAt(i4);
            u69 G = p85Var.G(childAt);
            if (G == null || (i2 = G.f) == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                i = childCount;
            } else {
                if (i2 == 1) {
                    View view2 = G.a;
                    if (view2 instanceof wb5) {
                        wb5 wb5Var = (wb5) view2;
                        view = childAt;
                        i = childCount;
                        longSparseIntArray.append(wb5Var.getPeerId(), 1);
                        if (longSparseIntArray2.get(wb5Var.getPeerId(), 0) == 0) {
                            z2 = true;
                        } else {
                            longSparseIntArray2.delete(wb5Var.getPeerId());
                        }
                        if (z) {
                            f3 = Math.max(f3, view.getY() + view.getMeasuredHeight());
                            f2 = Math.min(f2, Math.max(0.0f, view.getY()));
                        } else if (!w85Var.I.contains(G)) {
                            f2 = Math.min(f2, Math.max(0, view.getTop()));
                            f3 = Math.max(f3, view.getBottom());
                        }
                    }
                }
                i = childCount;
                view = childAt;
                if (z) {
                }
            }
            i4++;
            p85Var = this;
            childCount = i;
        }
        if (longSparseIntArray2.size() > 0) {
            z2 = true;
        }
        if (z2) {
            g95Var.M1();
        }
        if (z) {
            float f4 = w85Var.K;
            float f5 = w85Var.F;
            float f6 = 1.0f - f5;
            f = (f2 * f5) + (f4 * f6);
            f3 = (f3 * f5) + (f6 * w85Var.J);
        } else {
            f = f2;
        }
        if (f2 != Float.MAX_VALUE) {
            rectF.set((getMeasuredWidth() - (gm.O1() ? Math.min(gm.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f, getMeasuredWidth() - r4, Math.min(getMeasuredHeight() - getTranslationY(), f3));
            canvas.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), g95Var.w2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.g3.M4) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        w85 w85Var = this.g3.Q1;
        HashSet hashSet = w85Var.I;
        g95 g95Var = w85Var.L;
        HashSet hashSet2 = w85Var.H;
        if (w85Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(w85Var.q);
            hashSet.clear();
            hashSet.addAll(w85Var.p);
            w85Var.J = 0.0f;
            w85Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            p85 p85Var = g95Var.J1;
            int childCount = p85Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = p85Var.getChildAt(i6);
                u69 G = p85Var.G(childAt);
                if (G != null && (i5 = G.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(G)) {
                    w85Var.J = Math.max(w85Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    w85Var.K = Math.min(w85Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            w85Var.F = 0.0f;
            p85Var.invalidate();
        }
    }

    @Override // r59, android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof n95) {
                    this.g3.E0((n95) childAt, childAt.isAttachedToWindow() && i == 0);
                }
            }
        }
        super.setVisibility(i);
    }
}
