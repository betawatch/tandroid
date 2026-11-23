package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r9 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(org.telegram.ui.Components.em0 em0Var, Context context) {
        super(context);
        this.e = em0Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.o6, ((org.telegram.ui.Components.em0) this.e).c));
                Paint paint = this.b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = ch.q0.S;
                ch.q0.h(rectF, org.telegram.messenger.g0.P, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.e80 e80Var = (org.telegram.ui.Components.e80) this.c;
                if (e80Var != null) {
                    canvas.drawPath(e80Var, this.b);
                }
                if (((n2.p0) this.e).h(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.em0 em0Var = (org.telegram.ui.Components.em0) this.e;
                super.onLayout(z10, i7, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < em0Var.getChildCount(); i14++) {
                    width = Math.min(width, em0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, em0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.r41[] r41VarArr = (org.telegram.ui.Components.r41[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.r41.class);
                    if (r41VarArr != null && r41VarArr.length > 0) {
                        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(0);
                        this.c = e80Var;
                        e80Var.n = false;
                        for (int i11 = 0; i11 < r41VarArr.length; i11++) {
                            int spanStart = spanned.getSpanStart(r41VarArr[i11]);
                            int spanEnd = spanned.getSpanEnd(r41VarArr[i11]);
                            ((org.telegram.ui.Components.e80) this.c).d(getLayout(), spanStart, 0.0f);
                            int i12 = getText() != null ? getPaint().baselineShift : 0;
                            org.telegram.ui.Components.e80 e80Var2 = (org.telegram.ui.Components.e80) this.c;
                            e80Var2.o = i12 != 0 ? org.telegram.messenger.g0.L(i12 > 0 ? 5.0f : -2.0f) + i12 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.e80) this.c);
                        }
                        ((org.telegram.ui.Components.e80) this.c).n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                n2.p0 p0Var = (n2.p0) this.e;
                Layout layout = getLayout();
                float f10 = 0;
                int x10 = (int) (motionEvent.getX() - f10);
                int y10 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y10);
                    float f11 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y10 >= 0 && y10 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            p0Var.f(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.d;
                                    if (k80Var != null) {
                                        CharacterStyle characterStyle = k80Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                org.telegram.ui.Components.k80 k80Var2 = new org.telegram.ui.Components.k80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = k80Var2;
                                k80Var2.d(771751935);
                                p0Var.b((org.telegram.ui.Components.k80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.k80) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.k80) this.d).i);
                                org.telegram.ui.Components.e80 b10 = ((org.telegram.ui.Components.k80) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    p0Var.f(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new n2.p0(this);
    }
}
