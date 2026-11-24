// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r65 extends o39 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ h75 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r65(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = h75Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // o39, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        View view;
        r65 r65Var = this;
        h75 h75Var = r65Var.g3;
        RectF rectF = h75Var.p2;
        LongSparseIntArray longSparseIntArray = h75Var.r4;
        x65 x65Var = h75Var.Q1;
        boolean z = x65Var.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray2 = r65Var.f3;
        longSparseIntArray2.clear();
        for (int i3 = 0; i3 < longSparseIntArray.size(); i3++) {
            longSparseIntArray2.put(longSparseIntArray.keyAt(i3), 1);
        }
        longSparseIntArray.clear();
        int childCount = r65Var.getChildCount();
        float f2 = Float.MAX_VALUE;
        float f3 = 0.0f;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < childCount) {
            View childAt = r65Var.getChildAt(i4);
            s49 G = r65Var.G(childAt);
            if (G == null || (i2 = G.f) == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
                i = childCount;
            } else {
                if (i2 == 1) {
                    View view2 = G.a;
                    if (view2 instanceof y95) {
                        y95 y95Var = (y95) view2;
                        view = childAt;
                        i = childCount;
                        longSparseIntArray.append(y95Var.getPeerId(), 1);
                        if (longSparseIntArray2.get(y95Var.getPeerId(), 0) == 0) {
                            z2 = true;
                        } else {
                            longSparseIntArray2.delete(y95Var.getPeerId());
                        }
                        if (z) {
                            f3 = Math.max(f3, view.getY() + view.getMeasuredHeight());
                            f2 = Math.min(f2, Math.max(0.0f, view.getY()));
                        } else if (!x65Var.I.contains(G)) {
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
            r65Var = this;
            childCount = i;
        }
        if (longSparseIntArray2.size() > 0) {
            z2 = true;
        }
        if (z2) {
            h75Var.M1();
        }
        if (z) {
            float f4 = x65Var.K;
            float f5 = x65Var.F;
            float f6 = 1.0f - f5;
            f = (f2 * f5) + (f4 * f6);
            f3 = (f3 * f5) + (f6 * x65Var.J);
        } else {
            f = f2;
        }
        if (f2 != Float.MAX_VALUE) {
            rectF.set((getMeasuredWidth() - (gl.O1() ? Math.min(gl.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f, getMeasuredWidth() - r4, Math.min(getMeasuredHeight() - getTranslationY(), f3));
            canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), h75Var.w2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.g3.M4) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        x65 x65Var = this.g3.Q1;
        HashSet hashSet = x65Var.I;
        h75 h75Var = x65Var.L;
        HashSet hashSet2 = x65Var.H;
        if (x65Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(x65Var.q);
            hashSet.clear();
            hashSet.addAll(x65Var.p);
            x65Var.J = 0.0f;
            x65Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            r65 r65Var = h75Var.J1;
            int childCount = r65Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = r65Var.getChildAt(i6);
                s49 G = r65Var.G(childAt);
                if (G != null && (i5 = G.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(G)) {
                    x65Var.J = Math.max(x65Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    x65Var.K = Math.min(x65Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            x65Var.F = 0.0f;
            r65Var.invalidate();
        }
    }

    @Override // o39, android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof o75) {
                    this.g3.E0((o75) childAt, childAt.isAttachedToWindow() && i == 0);
                }
            }
        }
        super.setVisibility(i);
    }
}
