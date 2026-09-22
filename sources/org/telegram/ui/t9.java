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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t9 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(org.telegram.ui.Components.wn0 wn0Var, Context context) {
        super(context);
        this.e = wn0Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.o6, ((org.telegram.ui.Components.wn0) this.e).c));
                Paint paint = this.b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = zg.q0.V;
                zg.q0.h(rectF, AndroidUtilities.rectTmp, path);
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
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) this.c;
                if (h90Var != null) {
                    canvas.drawPath(h90Var, this.b);
                }
                if (((org.telegram.ui.Components.k90) this.e).f(canvas)) {
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Components.wn0 wn0Var = (org.telegram.ui.Components.wn0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < wn0Var.getChildCount(); i15++) {
                    width = Math.min(width, wn0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, wn0Var.getChildAt(i15).getRight());
                }
                setPivotX((width + i14) / 2.0f);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.c61[] c61VarArr = (org.telegram.ui.Components.c61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.c61.class);
                    if (c61VarArr != null && c61VarArr.length > 0) {
                        org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(0);
                        this.c = h90Var;
                        h90Var.n = false;
                        for (int i12 = 0; i12 < c61VarArr.length; i12++) {
                            int spanStart = spanned.getSpanStart(c61VarArr[i12]);
                            int spanEnd = spanned.getSpanEnd(c61VarArr[i12]);
                            ((org.telegram.ui.Components.h90) this.c).d(getLayout(), spanStart, 0.0f);
                            int i13 = getText() != null ? getPaint().baselineShift : 0;
                            org.telegram.ui.Components.h90 h90Var2 = (org.telegram.ui.Components.h90) this.c;
                            h90Var2.o = i13 != 0 ? AndroidUtilities.dp(i13 > 0 ? 5.0f : -2.0f) + i13 : 0;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.h90) this.c);
                        }
                        ((org.telegram.ui.Components.h90) this.c).n = true;
                        break;
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.k90 k90Var = (org.telegram.ui.Components.k90) this.e;
                Layout layout = getLayout();
                float f7 = 0;
                int x10 = (int) (motionEvent.getX() - f7);
                int y3 = (int) (motionEvent.getY() - f7);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y3);
                    float f10 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y3 >= 0 && y3 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            k90Var.d(true);
                            if (motionEvent.getAction() != 0) {
                                if (motionEvent.getAction() == 1) {
                                    org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) this.d;
                                    if (o90Var != null) {
                                        CharacterStyle characterStyle = o90Var.i;
                                        ClickableSpan clickableSpan = clickableSpanArr[0];
                                        if (characterStyle == clickableSpan) {
                                            clickableSpan.onClick(this);
                                        }
                                    }
                                    this.d = null;
                                    break;
                                }
                            } else {
                                org.telegram.ui.Components.o90 o90Var2 = new org.telegram.ui.Components.o90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = o90Var2;
                                o90Var2.d(771751935);
                                k90Var.a((org.telegram.ui.Components.o90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.o90) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.o90) this.d).i);
                                org.telegram.ui.Components.h90 b10 = ((org.telegram.ui.Components.o90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                break;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    k90Var.d(true);
                    this.d = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new org.telegram.ui.Components.k90(this);
    }
}
