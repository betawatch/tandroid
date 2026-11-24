// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v07 extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ w07 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v07(w07 w07Var, Context context) {
        super(context);
        this.e = w07Var;
        this.a = new GestureDetector(getContext(), new rm3(this, (byte) 1));
        this.b = new Path();
        this.c = new RectF();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.e.c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height = getHeight();
        w07 w07Var = this.e;
        int i5 = w07Var.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w07Var.f;
        int i6 = w07Var.b;
        int c = (height - w07Var.c()) / 2;
        int width = getWidth();
        tr8 tr8Var = w07Var.h;
        int measuredWidth = (width - tr8Var.getMeasuredWidth()) / 2;
        tr8Var.layout(measuredWidth, c, tr8Var.getMeasuredWidth() + measuredWidth, tr8Var.getMeasuredHeight() + c);
        t07 t07Var = w07Var.n;
        t07Var.layout(tr8Var.getLeft(), tr8Var.getTop(), tr8Var.getRight(), t07Var.getMeasuredHeight() + tr8Var.getTop());
        int v = hg9.v(12.0f, tr8Var.getMeasuredHeight(), c);
        TextView textView = w07Var.d;
        textView.layout(gm.L(16.0f) + tr8Var.getLeft(), v, tr8Var.getRight() - gm.L(16.0f), textView.getMeasuredHeight() + v);
        int measuredHeight = textView.getMeasuredHeight() + v;
        TextView textView2 = w07Var.e;
        if (textView2.getVisibility() != 8) {
            int L = gm.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = gm.L(12.0f) + measuredHeight;
        w07Var.c.setBounds(tr8Var.getLeft() - i6, tr8Var.getTop() - i5, tr8Var.getRight() + i6, i5 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((tr8Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i6, L2, tr8Var.getRight() + i6, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i4 ? 0 : 8);
        int L3 = gm.L(6.0f);
        float left = tr8Var.getLeft();
        float top = tr8Var.getTop();
        float right = tr8Var.getRight();
        float top2 = tr8Var.getTop() + (L3 << 1);
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f, f, direction);
        rectF.set(i, tr8Var.getTop() + L3, i3, i4);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setWillNotDraw(false);
        super.onMeasure(i, i2);
        int min = Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)) - (gm.L(12.0f) << 1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31);
        w07 w07Var = this.e;
        tr8 tr8Var = w07Var.h;
        tr8Var.measure(makeMeasureSpec, makeMeasureSpec);
        w07Var.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min - (gm.L(16.0f) << 1), TLObject.FLAG_30);
        w07Var.d.measure(makeMeasureSpec2, 0);
        w07Var.e.measure(makeMeasureSpec2, 0);
        w07Var.f.measure(View.MeasureSpec.makeMeasureSpec(tr8Var.getMeasuredWidth() + (w07Var.b << 1), TLObject.FLAG_31), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Point point = gm.q;
        int i5 = point.x;
        int i6 = point.y;
        w07 w07Var = this.e;
        if (i5 > i6) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i == i3 || i2 == i4) {
            return;
        }
        if (!this.d) {
            w07Var.f();
        }
        this.d = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e.c || super.verifyDrawable(drawable);
    }
}
