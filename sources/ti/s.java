package ti;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class s extends ViewGroup {
    public final LaunchActivity a;
    public final Rect b;
    public View c;
    public int d;
    public int e;
    public boolean f;

    public s(LaunchActivity launchActivity) {
        super(launchActivity);
        this.b = new Rect();
        this.a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.c = view;
        Rect rect2 = this.b;
        if (rect != null) {
            rect2.set(rect);
        } else {
            rect2.setEmpty();
        }
        if (view != null && view.getParent() != this) {
            g0.E2(view);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null || !this.f) {
            return;
        }
        canvas.drawColor(-16777216);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.c == null) {
            return;
        }
        if (!this.f) {
            Rect rect = this.b;
            if (!rect.isEmpty()) {
                this.c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.c.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean H1 = g0.H1(this.a);
        if (!H1) {
            this.d = size;
            this.e = size2;
        }
        this.f = H1 && (size < this.d || size2 < this.e);
        setMeasuredDimension(size, size2);
        if (this.c != null) {
            boolean z9 = this.f;
            Rect rect = this.b;
            boolean z10 = z9 || rect.isEmpty();
            View view = this.c;
            if (!z10) {
                size = rect.width();
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
            if (!z10) {
                size2 = rect.height();
            }
            view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
    }
}
