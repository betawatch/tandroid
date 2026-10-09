package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n0 extends View {
    public final m0 a;

    public n0(Context context) {
        super(context);
        m0 m0Var = new m0();
        this.a = m0Var;
        m0Var.r = this;
        m0Var.d.setParentView(this);
    }

    public m0 getDrawable() {
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
        m0 m0Var = this.a;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.q);
        m0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        m0 m0Var = this.a;
        m0Var.setBounds(paddingLeft, paddingTop, width, height);
        m0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        m0 m0Var = this.a;
        m0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + m0Var.t, getPaddingBottom() + getPaddingTop() + m0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        m0 m0Var = this.a;
        m0Var.m = charSequence;
        m0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
