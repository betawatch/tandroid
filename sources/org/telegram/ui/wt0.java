package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wt0 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.i6 b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final org.telegram.ui.Components.i6 h;
    public String n;
    public boolean r;
    public final org.telegram.ui.Components.y5 s;
    public boolean v;
    public int w;

    public wt0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.s = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.b = i6Var;
        i6Var.k(0.3f, 320L, grVar);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.q("0", true, true);
        i6Var.G = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.h = i6Var2;
        i6Var2.k(0.3f, 320L, grVar);
        i6Var2.r(-1);
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.setCallback(this);
        i6Var2.q("0", true, true);
        i6Var2.G = AndroidUtilities.displaySize.x;
    }

    public final void a(int i9, int i10) {
        b(i9, i10, true);
    }

    public final void b(int i9, int i10, boolean z10) {
        boolean z11 = false;
        int max = Math.max(0, i9);
        int max2 = Math.max(max, i10);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        this.b.q(String.format("%d", Integer.valueOf(LocaleController.isRTL ? max2 : max)), (!z10 || this.v || LocaleController.isRTL) ? false : true, true);
        if (!LocaleController.isRTL) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        }
        this.h.q(format, z11, true);
        this.v = !z10;
    }

    public final void c() {
        this.n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f = this.d.getLineDescent(0);
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.r != z10) {
            this.r = z10;
            if (!z10) {
                this.v = true;
            }
            if (!z11) {
                this.s.d(z10 ? 1.0f : 0.0f, true);
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
        float d = this.s.d(this.r ? 1.0f : 0.0f, false);
        if (d <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.i6 i6Var = this.b;
        float d9 = i6Var.d() + this.e;
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        float d10 = i6Var2.d() + d9 + AndroidUtilities.dp(18.0f);
        float f10 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - d10) / 2.0f, AndroidUtilities.dpf2(10.0f) + f10, (getWidth() + d10) / 2.0f, AndroidUtilities.dpf2(33.0f) + f10);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - d10) / 2.0f) + AndroidUtilities.dp(9.0f), f10 + AndroidUtilities.dp(9.5f));
        i6Var.setBounds(0, 0, (int) i6Var.d(), AndroidUtilities.dp(23.0f));
        int i9 = (int) (d * 255.0f);
        i6Var.w = i9;
        i6Var.draw(canvas);
        canvas.translate(i6Var.d(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i9);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        i6Var2.setBounds(0, 0, (int) i6Var2.d(), AndroidUtilities.dp(23.0f));
        i6Var2.w = i9;
        i6Var2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.b.G = size;
        this.h.G = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), org.telegram.messenger.ll.C(43.0f, this.w, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
