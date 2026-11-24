// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class st5 extends FrameLayout {
    public final /* synthetic */ xt5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st5(xt5 xt5Var, Context context) {
        super(context);
        this.a = xt5Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xt5 xt5Var = this.a;
        Drawable drawable = xt5Var.l1;
        drawable.setBounds(0, xt5Var.u1 - xt5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xt5 xt5Var = this.a;
            if (xt5Var.u1 != 0 && motionEvent.getY() < xt5Var.u1) {
                xt5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.H0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2) - gl.m;
        xt5 xt5Var = this.a;
        TextView textView = xt5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        tt5 tt5Var = xt5Var.p1;
        ((FrameLayout.LayoutParams) tt5Var.getLayoutParams()).topMargin = gl.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int w = de9.w(55.0f, de9.y(58.0f, xt5Var.s1.size(), gl.L(80.0f)) + xt5Var.t0, measuredHeight);
        int i3 = size / 5;
        int i4 = w < i3 * 3 ? size - w : i3 << 1;
        if (tt5Var.getPaddingTop() != i4) {
            xt5Var.t1 = true;
            tt5Var.setPadding(0, i4, 0, 0);
            xt5Var.t1 = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a.t1) {
            return;
        }
        super.requestLayout();
    }
}
