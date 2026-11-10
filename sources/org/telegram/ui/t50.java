package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t50 extends ReplacementSpan {
    public final Paint a;
    public final ImageReceiver b;
    public final float c;
    public float d;
    public final View e;
    public boolean f;
    public float h;
    public int n;

    public t50(float f10, int i7, View view) {
        e5 e5Var = new e5(this, 3);
        this.f = true;
        this.n = org.telegram.messenger.qs.e4;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.b = imageReceiver;
        imageReceiver.d = i7;
        this.c = f10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.e;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(e5Var);
            if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.R();
            }
        }
        View view3 = this.e;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        this.e = view;
        imageReceiver.H0(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(e5Var);
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.b.J0((int) L);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9 = this.f;
        Paint paint2 = this.a;
        if (z9 && this.n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.c) / 2.0f);
        if (this.f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.c) + f11, org.telegram.messenger.g0.L(this.c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        float L2 = org.telegram.messenger.g0.L(this.c);
        float L3 = org.telegram.messenger.g0.L(this.c);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(f11, L, L2, L3);
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.c);
    }
}
