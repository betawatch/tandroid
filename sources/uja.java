// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uja extends View implements g94 {
    public int E;
    public int F;
    public int G;
    public final rja a;
    public final boolean b;
    public final tja c;
    public final sja d;
    public final Drawable e;
    public final wi2 f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final fn0 x;
    public final fn0 y;

    public uja(Context context, rja rjaVar, String str) {
        super(context);
        byte b = 1;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        d53 d53Var = d53.h;
        this.x = new fn0(0, this, d53Var, 380L, true);
        this.y = new fn0(1, this, d53Var, 250L, false);
        this.a = rjaVar;
        this.b = true;
        this.c = (tja) yed.j.a();
        this.d = (sja) yed.k.a();
        this.s = str;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        wi2 wi2Var = new wi2(gm.L(18.0f), gm.L(2.0f), -1);
        this.f = wi2Var;
        wi2Var.setCallback(this);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(15.0f));
        c();
        CharSequence charSequence = this.s;
        this.w = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        setContentDescription(str);
        setOnClickListener(new oha(this, b));
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            this.a.l();
        }
        invalidate();
    }

    public final void a(boolean z, boolean z2) {
        h94 h94Var;
        fn0 fn0Var = this.x;
        if (fn0Var.f == z && (z2 || (h94Var = fn0Var.h) == null || !h94Var.h)) {
            return;
        }
        rja rjaVar = this.a;
        fn0Var.a(z, z2 && rjaVar.y());
        D(0, fn0Var.e, 0.0f, null);
        rjaVar.requestLayout();
    }

    public final void b(boolean z) {
        this.y.a(z, this.a.y());
        invalidate();
    }

    public final void c() {
        rja rjaVar = this.a;
        ylb ylbVar = rjaVar.a;
        this.E = cmb.v0(cmb.Ei, ylbVar);
        this.F = on2.f(0.5f, cmb.v0(cmb.Z6, ylbVar), this.E);
        int v0 = cmb.v0(cmb.Ii, ylbVar);
        this.G = v0;
        int i = rjaVar.g0;
        tja tjaVar = this.c;
        tja tjaVar2 = tja.b;
        if (tjaVar != tjaVar2) {
            v0 = i;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        this.f.b(v0);
        this.h.setColor(v0);
        setBackground(cmb.Y(tjaVar == tjaVar2 ? cmb.p1(0.2f, this.G) : rjaVar.i0, gm.L(23.0f), gm.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b ? 1 : 0;
    }

    public int getButtonWidth() {
        if (this.d == sja.a || TextUtils.isEmpty(this.s)) {
            return gm.L(46.0f);
        }
        return kt6.e(32.0f, (int) Math.ceil(this.w), gm.L(46.0f));
    }

    public sja getShape() {
        return this.d;
    }

    public tja getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == tja.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == tja.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float width = getWidth();
        float height = getHeight();
        if (this.c == tja.b) {
            int f2 = on2.f(this.x.e, this.F, this.E);
            Paint paint = this.n;
            paint.setColor(f2);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f3 = height / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        float f4 = this.y.e;
        if (f4 < 1.0f) {
            float R1 = gm.R1(1.0f, 0.6f, f4);
            canvas.save();
            canvas.scale(R1, R1, width / 2.0f, height / 2.0f);
            float f5 = 1.0f - f4;
            int i = (int) (f5 * 255.0f);
            if (this.d == sja.a || TextUtils.isEmpty(this.s)) {
                f = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f5));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.s;
                f = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f = 0.0f;
        }
        if (f4 > f) {
            float R12 = gm.R1(0.6f, 1.0f, f4);
            canvas.save();
            canvas.scale(R12, R12, width / 2.0f, height / 2.0f);
            wi2 wi2Var = this.f;
            wi2Var.setBounds(0, 0, (int) width, (int) height);
            wi2Var.setAlpha((int) (f4 * 255.0f));
            wi2Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getButtonWidth(), gm.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f;
        if (TextUtils.equals(this.s, charSequence)) {
            return;
        }
        this.s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            f = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = 0.0f;
        }
        this.w = f;
        requestLayout();
        this.a.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        this.a.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
