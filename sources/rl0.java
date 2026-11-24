// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class rl0 extends o39 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!gba.f()) {
            this.f3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
        }
    }

    @Override // o39, wg5
    public final void d(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.d(canvas, rectF);
        this.j3 = false;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 == 0 || Z0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view.getY() + view.getMeasuredHeight() >= this.f3 || this.j3 || Z0()) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        this.h3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.g3 + this.f3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i, i2);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
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

    public int z1() {
        return gl.L(203.0f);
    }
}
