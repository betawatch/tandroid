package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k0 extends View {
    public final j0 a;

    public k0(Context context) {
        super(context);
        j0 j0Var = new j0();
        this.a = j0Var;
        j0Var.r = this;
        j0Var.d.setParentView(this);
    }

    public j0 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.a;
        j0Var.d.onDetachedFromWindow();
        a6.release((View) null, j0Var.q);
        j0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j0 j0Var = this.a;
        j0Var.setBounds(paddingLeft, paddingTop, width, height);
        j0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        j0 j0Var = this.a;
        j0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j0Var.t, getPaddingBottom() + getPaddingTop() + j0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        j0 j0Var = this.a;
        j0Var.m = charSequence;
        j0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
