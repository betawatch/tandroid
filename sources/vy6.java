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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vy6 extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ wy6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy6(wy6 wy6Var, Context context) {
        super(context);
        this.e = wy6Var;
        this.a = new GestureDetector(getContext(), new gl3(this, (byte) 1));
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
        wy6 wy6Var = this.e;
        int i5 = wy6Var.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wy6Var.f;
        int i6 = wy6Var.b;
        int c = (height - wy6Var.c()) / 2;
        int width = getWidth();
        sp8 sp8Var = wy6Var.h;
        int measuredWidth = (width - sp8Var.getMeasuredWidth()) / 2;
        sp8Var.layout(measuredWidth, c, sp8Var.getMeasuredWidth() + measuredWidth, sp8Var.getMeasuredHeight() + c);
        ty6 ty6Var = wy6Var.n;
        ty6Var.layout(sp8Var.getLeft(), sp8Var.getTop(), sp8Var.getRight(), ty6Var.getMeasuredHeight() + sp8Var.getTop());
        int w = de9.w(12.0f, sp8Var.getMeasuredHeight(), c);
        TextView textView = wy6Var.d;
        textView.layout(gl.L(16.0f) + sp8Var.getLeft(), w, sp8Var.getRight() - gl.L(16.0f), textView.getMeasuredHeight() + w);
        int measuredHeight = textView.getMeasuredHeight() + w;
        TextView textView2 = wy6Var.e;
        if (textView2.getVisibility() != 8) {
            int L = gl.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = gl.L(12.0f) + measuredHeight;
        wy6Var.c.setBounds(sp8Var.getLeft() - i6, sp8Var.getTop() - i5, sp8Var.getRight() + i6, i5 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((sp8Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i6, L2, sp8Var.getRight() + i6, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i4 ? 0 : 8);
        int L3 = gl.L(6.0f);
        float left = sp8Var.getLeft();
        float top = sp8Var.getTop();
        float right = sp8Var.getRight();
        float top2 = sp8Var.getTop() + (L3 << 1);
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f, f, direction);
        rectF.set(i, sp8Var.getTop() + L3, i3, i4);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setWillNotDraw(false);
        super.onMeasure(i, i2);
        int min = Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)) - (gl.L(12.0f) << 1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31);
        wy6 wy6Var = this.e;
        sp8 sp8Var = wy6Var.h;
        sp8Var.measure(makeMeasureSpec, makeMeasureSpec);
        wy6Var.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min - (gl.L(16.0f) << 1), TLObject.FLAG_30);
        wy6Var.d.measure(makeMeasureSpec2, 0);
        wy6Var.e.measure(makeMeasureSpec2, 0);
        wy6Var.f.measure(View.MeasureSpec.makeMeasureSpec(sp8Var.getMeasuredWidth() + (wy6Var.b << 1), TLObject.FLAG_31), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Point point = gl.q;
        int i5 = point.x;
        int i6 = point.y;
        wy6 wy6Var = this.e;
        if (i5 > i6) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i == i3 || i2 == i4) {
            return;
        }
        if (!this.d) {
            wy6Var.f();
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
