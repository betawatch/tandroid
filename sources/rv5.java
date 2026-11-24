// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rv5 extends FrameLayout {
    public final /* synthetic */ wv5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv5(wv5 wv5Var, Context context) {
        super(context);
        this.a = wv5Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wv5 wv5Var = this.a;
        Drawable drawable = wv5Var.l1;
        drawable.setBounds(0, wv5Var.u1 - wv5Var.t0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            wv5 wv5Var = this.a;
            if (wv5Var.u1 != 0 && motionEvent.getY() < wv5Var.u1) {
                wv5Var.dismiss();
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
        int size = View.MeasureSpec.getSize(i2) - gm.m;
        wv5 wv5Var = this.a;
        TextView textView = wv5Var.r1;
        measureChildWithMargins(textView, i, 0, i2, 0);
        int measuredHeight = textView.getMeasuredHeight();
        sv5 sv5Var = wv5Var.p1;
        ((FrameLayout.LayoutParams) sv5Var.getLayoutParams()).topMargin = gm.L(65.0f) + measuredHeight;
        getMeasuredWidth();
        int v = hg9.v(55.0f, hg9.y(58.0f, wv5Var.s1.size(), gm.L(80.0f)) + wv5Var.t0, measuredHeight);
        int i3 = size / 5;
        int i4 = v < i3 * 3 ? size - v : i3 << 1;
        if (sv5Var.getPaddingTop() != i4) {
            wv5Var.t1 = true;
            sv5Var.setPadding(0, i4, 0, 0);
            wv5Var.t1 = false;
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
