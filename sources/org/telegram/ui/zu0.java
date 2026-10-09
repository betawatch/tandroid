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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zu0 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.q6 b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public float f;
    public final org.telegram.ui.Components.q6 h;
    public String n;
    public boolean r;
    public final org.telegram.ui.Components.g6 s;
    public boolean v;
    public int w;

    public zu0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.r = false;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        this.s = new org.telegram.ui.Components.g6(this, 0L, 350L, hsVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.b = q6Var;
        q6Var.n(0.3f, 320L, hsVar);
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.setCallback(this);
        q6Var.t("0", true, true);
        q6Var.M = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, true, true);
        this.h = q6Var2;
        q6Var2.n(0.3f, 320L, hsVar);
        q6Var2.u(-1);
        q6Var2.w(AndroidUtilities.dp(14.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.setCallback(this);
        q6Var2.t("0", true, true);
        q6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        boolean z11 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        this.b.t(String.format("%d", Integer.valueOf(LocaleController.isRTL ? max2 : max)), (!z10 || this.v || LocaleController.isRTL) ? false : true, true);
        if (!LocaleController.isRTL) {
            max = max2;
        }
        String format = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        }
        this.h.t(format, z11, true);
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
        org.telegram.ui.Components.q6 q6Var = this.b;
        float c10 = q6Var.c() + this.e;
        org.telegram.ui.Components.q6 q6Var2 = this.h;
        float c11 = q6Var2.c() + c10 + AndroidUtilities.dp(18.0f);
        float f7 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - c11) / 2.0f, AndroidUtilities.dpf2(10.0f) + f7, (getWidth() + c11) / 2.0f, AndroidUtilities.dpf2(33.0f) + f7);
        Paint paint = this.a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + AndroidUtilities.dp(9.0f), f7 + AndroidUtilities.dp(9.5f));
        q6Var.setBounds(0, 0, (int) q6Var.c(), AndroidUtilities.dp(23.0f));
        int i10 = (int) (d * 255.0f);
        q6Var.B = i10;
        q6Var.draw(canvas);
        canvas.translate(q6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        q6Var2.setBounds(0, 0, (int) q6Var2.c(), AndroidUtilities.dp(23.0f));
        q6Var2.B = i10;
        q6Var2.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), org.telegram.messenger.bi.C(43.0f, this.w, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
