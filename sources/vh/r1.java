package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends q1 {
    public Drawable i;
    public Drawable j;
    public StaticLayout k;
    public float l;
    public float m;
    public Paint n;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(org.telegram.ui.ActionBar.f5 f5Var, int i10, int i11, String str) {
        super(f5Var);
        this.o = f5Var;
        this.a = i10;
        Drawable mutate = f5Var.getContext().getResources().getDrawable(i11).mutate();
        this.i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) f5Var.c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.i0.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = org.telegram.messenger.i0.N(45.6f) + this.l;
        this.c = org.telegram.messenger.i0.N(36.0f);
    }

    @Override // vh.q1
    public final void a(Canvas canvas, float f7, float f10) {
        float f11 = this.b + f7;
        float f12 = this.c + f10;
        RectF rectF = this.f;
        rectF.set(f7, f10, f11, f12);
        float a2 = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), (Paint) this.o.b);
        if (this.j != null) {
            canvas.saveLayerAlpha(rectF, zs.e4, 31);
        }
        if (this.i == null) {
            org.telegram.messenger.g6 f13 = org.telegram.messenger.k6.f(null);
            this.i = f13;
            if (c3.i0.t(f13)) {
                f13.a = false;
            }
        }
        if (this.i != null) {
            float L = org.telegram.messenger.i0.L(24.0f) / 2;
            this.i.setBounds((int) ((rectF.left + org.telegram.messenger.i0.L(18.0f)) - L), (int) (((this.c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.i0.L(18.0f) + L), (int) ((this.c / 2.0f) + rectF.top + L));
            this.i.draw(canvas);
        }
        if (this.j != null) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rectF.left + org.telegram.messenger.i0.L(18.55f), ((rectF.top + this.c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.55f), rectF.left + org.telegram.messenger.i0.L(29.45f), rectF.left + org.telegram.messenger.i0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.n);
            this.j.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(18.0f)), (int) (((rectF.top + this.c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(30.0f)), (int) ((rectF.top + this.c) - org.telegram.messenger.i0.L(5.0f)));
            this.j.draw(canvas);
            canvas.restore();
        }
        canvas.translate((rectF.left + org.telegram.messenger.i0.L((this.i != null ? 28 : 0) + 6)) - this.m, ((this.c / 2.0f) + rectF.top) - (this.k.getHeight() / 2.0f));
        this.k.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(org.telegram.ui.ActionBar.f5 f5Var, CharSequence charSequence) {
        super(f5Var);
        this.o = f5Var;
        this.a = 5;
        TextPaint textPaint = (TextPaint) f5Var.c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.i0.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.k = staticLayout;
        this.l = staticLayout.getLineCount() > 0 ? this.k.getLineWidth(0) : 0.0f;
        this.m = this.k.getLineCount() > 0 ? this.k.getLineLeft(0) : 0.0f;
        this.b = org.telegram.messenger.i0.N(12.0f) + this.l;
        this.c = org.telegram.messenger.i0.N(36.0f);
    }
}
