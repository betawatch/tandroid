package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j0 extends View {
    public final i0 a;

    public j0(Context context) {
        super(context);
        i0 i0Var = new i0();
        this.a = i0Var;
        i0Var.r = this;
        i0Var.d.H0(this);
    }

    public i0 getDrawable() {
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
        i0 i0Var = this.a;
        i0Var.d.R();
        r5.release((View) null, i0Var.q);
        i0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        i0 i0Var = this.a;
        i0Var.setBounds(paddingLeft, paddingTop, width, height);
        i0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        i0 i0Var = this.a;
        i0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i0Var.t, getPaddingBottom() + getPaddingTop() + i0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        i0 i0Var = this.a;
        i0Var.m = charSequence;
        i0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
