// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wv5 extends FrameLayout {
    public final /* synthetic */ bw5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv5(bw5 bw5Var, Context context) {
        super(context);
        this.a = bw5Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bw5 bw5Var = this.a;
        Drawable drawable = bw5Var.l1;
        drawable.setBounds(0, bw5Var.u1 - bw5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bw5 bw5Var = this.a;
            if (bw5Var.u1 != 0 && motionEvent.getY() < bw5Var.u1) {
                bw5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.I0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2) - hl.m;
        bw5 bw5Var = this.a;
        TextView textView = bw5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        xv5 xv5Var = bw5Var.p1;
        ((FrameLayout.LayoutParams) xv5Var.getLayoutParams()).topMargin = hl.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int w = uh9.w(55.0f, uh9.y(58.0f, bw5Var.s1.size(), hl.L(80.0f)) + bw5Var.t0, measuredHeight);
        int i3 = size / 5;
        int i4 = w < i3 * 3 ? size - w : i3 << 1;
        if (xv5Var.getPaddingTop() != i4) {
            bw5Var.t1 = true;
            xv5Var.setPadding(0, i4, 0, 0);
            bw5Var.t1 = false;
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
