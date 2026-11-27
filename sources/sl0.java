// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class sl0 extends d79 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public int A1() {
        return hl.L(203.0f);
    }

    public final void B1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!xea.f()) {
            this.f3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.f3 = A1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 == 0 || a1()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() >= this.f3 || this.j3 || a1()) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override // d79, yi5
    public final void g(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.g(canvas, rectF);
        this.j3 = false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        this.h3 = true;
        B1();
        super.setPadding(getPaddingLeft(), this.g3 + this.f3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i, i2);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.h3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.g3 = i2;
        super.setPadding(i, i2 + this.f3, i3, i4);
    }
}
