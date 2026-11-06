package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rq0 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.i6 b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final org.telegram.ui.Components.i6 h;
    public String n;
    public boolean r;
    public final org.telegram.ui.Components.w5 s;
    public boolean w;
    public int x;

    public rq0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.s = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.b = i6Var;
        i6Var.n(0.3f, 320L, xqVar);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.setCallback(this);
        i6Var.t("0", true, true);
        Point point = org.telegram.messenger.g0.q;
        i6Var.M = point.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        c();
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true);
        this.h = i6Var2;
        i6Var2.n(0.3f, 320L, xqVar);
        i6Var2.u(-1);
        i6Var2.w(org.telegram.messenger.g0.L(14.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var2.setCallback(this);
        i6Var2.t("0", true, true);
        i6Var2.M = point.x;
    }

    public final void a(int i7, int i10) {
        b(i7, i10, true);
    }

    public final void b(int i7, int i10, boolean z9) {
        boolean z10 = false;
        int max = Math.max(0, i7);
        int max2 = Math.max(max, i10);
        if (org.telegram.messenger.hd.E0().B != null && !TextUtils.equals(this.n, org.telegram.messenger.hd.E0().B.c)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(org.telegram.messenger.hd.a0 ? max2 : max)), (!z9 || this.w || org.telegram.messenger.hd.a0) ? false : true, true);
        if (!org.telegram.messenger.hd.a0) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z9 && !this.w && !org.telegram.messenger.hd.a0) {
            z10 = true;
        }
        this.h.t(format, z10, true);
        this.w = !z9;
    }

    public final void c() {
        this.n = org.telegram.messenger.hd.E0().B.c;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.hd.M0(2131747828, null).replace("%1$d", "").replace("%2$d", ""), this.c, org.telegram.messenger.g0.L(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f = this.d.getLineDescent(0);
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
        }
    }

    public final void d(boolean z9, boolean z10) {
        if (this.r != z9) {
            this.r = z9;
            if (!z9) {
                this.w = true;
            }
            if (!z10) {
                this.s.e(true, z9 ? 1.0f : 0.0f);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e10 = this.s.e(false, this.r ? 1.0f : 0.0f);
        if (e10 <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.i6 i6Var = this.b;
        float c10 = i6Var.c() + this.e;
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        float c11 = i6Var2.c() + c10 + org.telegram.messenger.g0.L(18.0f);
        float f10 = ((1.0f - e10) * (-org.telegram.messenger.g0.L(8.0f))) + this.x;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c11) / 2.0f, org.telegram.messenger.g0.N(10.0f) + f10, (getWidth() + c11) / 2.0f, org.telegram.messenger.g0.N(33.0f) + f10);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * e10));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + org.telegram.messenger.g0.L(9.0f), f10 + org.telegram.messenger.g0.L(9.5f));
        i6Var.setBounds(0, 0, (int) i6Var.c(), org.telegram.messenger.g0.L(23.0f));
        int i7 = (int) (e10 * 255.0f);
        i6Var.B = i7;
        i6Var.draw(canvas);
        canvas.translate(i6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (org.telegram.messenger.g0.L(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i7);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        i6Var2.setBounds(0, 0, (int) i6Var2.c(), org.telegram.messenger.g0.L(23.0f));
        i6Var2.B = i7;
        i6Var2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.x = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
        this.b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(43.0f, this.x, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
