// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zh2 extends NestedScrollView {
    public boolean W;
    public final /* synthetic */ di2 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh2(di2 di2Var, Activity activity) {
        super(activity);
        this.a0 = di2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        di2 di2Var = this.a0;
        int scrollY = (int) ((getScrollY() + (di2Var.q1 - di2Var.t0)) - getTranslationY());
        Drawable drawable = di2Var.l1;
        drawable.setBounds(0, scrollY, getMeasuredWidth(), gl.L(19.0f) + di2Var.n1.getMeasuredHeight() + scrollY + di2Var.t0);
        drawable.draw(canvas);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            di2 di2Var = this.a0;
            if (di2Var.q1 != 0 && motionEvent.getY() < di2Var.q1) {
                di2Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        di2 di2Var = this.a0;
        measureChildWithMargins(di2Var.n1, i, 0, i2, 0);
        int measuredHeight = di2Var.n1.getMeasuredHeight();
        int i3 = (size / 5) * 3;
        int i4 = size - i3;
        if (!di2Var.p1 && measuredHeight - i4 >= gl.L(90.0f)) {
            if (measuredHeight >= gl.L(90.0f) + (size / 2)) {
                int L = gl.L(108.0f) + (measuredHeight / 2);
                if (i4 < L) {
                    i3 = size - L;
                }
                if (getPaddingTop() != i3) {
                    this.W = true;
                    setPadding(0, i3, 0, 0);
                    this.W = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
            }
        }
        i3 = size - measuredHeight;
        if (getPaddingTop() != i3) {
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.a0.D0();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a0.J && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.a0.D0();
    }
}
