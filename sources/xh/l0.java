package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l0 extends View {
    public final k0 a;

    public l0(Context context) {
        super(context);
        k0 k0Var = new k0();
        this.a = k0Var;
        k0Var.r = this;
        k0Var.d.setParentView(this);
    }

    public k0 getDrawable() {
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
        k0 k0Var = this.a;
        k0Var.d.onDetachedFromWindow();
        y5.release((View) null, k0Var.q);
        k0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        k0 k0Var = this.a;
        k0Var.setBounds(paddingLeft, paddingTop, width, height);
        k0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        k0 k0Var = this.a;
        k0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + k0Var.t, getPaddingBottom() + getPaddingTop() + k0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        k0 k0Var = this.a;
        k0Var.m = charSequence;
        k0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
