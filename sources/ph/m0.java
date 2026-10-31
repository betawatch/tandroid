package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m0 extends View {
    public final l0 a;

    public m0(Context context) {
        super(context);
        l0 l0Var = new l0();
        this.a = l0Var;
        l0Var.r = this;
        l0Var.d.H0(this);
    }

    public l0 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.a;
        l0Var.d.R();
        o5.release((View) null, l0Var.q);
        l0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l0 l0Var = this.a;
        l0Var.setBounds(paddingLeft, paddingTop, width, height);
        l0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        l0 l0Var = this.a;
        l0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l0Var.t, getPaddingBottom() + getPaddingTop() + l0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        l0 l0Var = this.a;
        l0Var.m = charSequence;
        l0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
