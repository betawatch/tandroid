// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t85 extends d79 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ j95 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t85(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = j95Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // d79, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        View view;
        t85 t85Var = this;
        j95 j95Var = t85Var.g3;
        RectF rectF = j95Var.p2;
        LongSparseIntArray longSparseIntArray = j95Var.r4;
        z85 z85Var = j95Var.Q1;
        boolean z = z85Var.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray2 = t85Var.f3;
        longSparseIntArray2.clear();
        for (int i3 = 0; i3 < longSparseIntArray.size(); i3++) {
            longSparseIntArray2.put(longSparseIntArray.keyAt(i3), 1);
        }
        longSparseIntArray.clear();
        int childCount = t85Var.getChildCount();
        float f2 = Float.MAX_VALUE;
        float f3 = 0.0f;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < childCount) {
            View childAt = t85Var.getChildAt(i4);
            f89 H = t85Var.H(childAt);
            if (H == null || (i2 = H.f) == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                i = childCount;
            } else {
                if (i2 == 1) {
                    View view2 = H.a;
                    if (view2 instanceof zb5) {
                        zb5 zb5Var = (zb5) view2;
                        view = childAt;
                        i = childCount;
                        longSparseIntArray.append(zb5Var.getPeerId(), 1);
                        if (longSparseIntArray2.get(zb5Var.getPeerId(), 0) == 0) {
                            z2 = true;
                        } else {
                            longSparseIntArray2.delete(zb5Var.getPeerId());
                        }
                        if (z) {
                            f3 = Math.max(f3, view.getY() + view.getMeasuredHeight());
                            f2 = Math.min(f2, Math.max(0.0f, view.getY()));
                        } else if (!z85Var.I.contains(H)) {
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
            t85Var = this;
            childCount = i;
        }
        if (longSparseIntArray2.size() > 0) {
            z2 = true;
        }
        if (z2) {
            j95Var.N1();
        }
        if (z) {
            float f4 = z85Var.K;
            float f5 = z85Var.F;
            float f6 = 1.0f - f5;
            f = (f2 * f5) + (f4 * f6);
            f3 = (f3 * f5) + (f6 * z85Var.J);
        } else {
            f = f2;
        }
        if (f2 != Float.MAX_VALUE) {
            rectF.set((getMeasuredWidth() - (hl.O1() ? Math.min(hl.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f, getMeasuredWidth() - r4, Math.min(getMeasuredHeight() - getTranslationY(), f3));
            canvas.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), j95Var.w2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.g3.M4) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        z85 z85Var = this.g3.Q1;
        HashSet hashSet = z85Var.I;
        j95 j95Var = z85Var.L;
        HashSet hashSet2 = z85Var.H;
        if (z85Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(z85Var.q);
            hashSet.clear();
            hashSet.addAll(z85Var.p);
            z85Var.J = 0.0f;
            z85Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            t85 t85Var = j95Var.J1;
            int childCount = t85Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t85Var.getChildAt(i6);
                f89 H = t85Var.H(childAt);
                if (H != null && (i5 = H.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(H)) {
                    z85Var.J = Math.max(z85Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    z85Var.K = Math.min(z85Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            z85Var.F = 0.0f;
            t85Var.invalidate();
        }
    }

    @Override // d79, android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof q95) {
                    this.g3.F0((q95) childAt, childAt.isAttachedToWindow() && i == 0);
                }
            }
        }
        super.setVisibility(i);
    }
}
