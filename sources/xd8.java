// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xd8 extends z11 {
    public final LinearLayout a;
    public final TextView b;
    public final e29 c;
    public final RectF d;
    public final Path e;
    public final al0 f;
    public ValueAnimator h;
    public float n;
    public float r;
    public float s;
    public float w;

    public xd8(Context context, vnb vnbVar, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        super(context, vnbVar);
        this.d = new RectF();
        this.e = new Path();
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.w = 1.0f;
        setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        setBackground(TLObject.FLAG_31, 24);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        e29 e29Var = new e29(context);
        this.c = e29Var;
        e29Var.setImageDrawable(drawable);
        e29Var.setColorFilter(-1);
        linearLayout.addView(e29Var, tre.o(24, 24));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(spannableStringBuilder);
        linearLayout.addView(textView, tre.m(1.0f, 0, -1, 12, 0, 0));
        addView(linearLayout, tre.e(-1, 48, 17));
        this.f = new al0(new jz7((Object) this, (byte) 7));
    }

    public static float h(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    @Override // z11
    public final y11 createTransition() {
        return new v34(this, (byte) 25);
    }

    @Override // z11, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - hl.L(8.0f)) * this.n;
        float L = hl.L(48.0f) * this.r;
        RectF rectF = this.d;
        rectF.set((getWidth() - width) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + width) / 2.0f, (getHeight() + L) / 2.0f);
        this.background.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        this.background.setAlpha(Math.round(this.w * 255.0f));
        this.background.draw(canvas);
        this.background.setAlpha(jn7.d4);
        if (this.s > 0.0f) {
            canvas.save();
            Path path = this.e;
            path.rewind();
            float f = L / 2.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
            float f2 = this.s;
            al0 al0Var = this.f;
            if (f2 < 1.0f && al0Var.c == null) {
                al0Var.b(getWidth(), getHeight(), 2.0f, hl.L(3.0f));
            }
            al0Var.setBounds(0, 0, getWidth(), getHeight());
            al0Var.i = Math.round(this.s * 255.0f);
            al0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void g(boolean z, Runnable runnable, Runnable runnable2, pt2 pt2Var) {
        ValueAnimator valueAnimator = this.h;
        byte b = 0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.transitionRunningEnter = false;
        }
        this.f.a();
        z11.IN_OUT_OFFSET_Y.b(this, 0.0f);
        runnable.run();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, z ? 320.0f : 180.0f);
        this.h = ofFloat;
        ofFloat.setDuration(z ? 320L : 180L);
        this.h.setInterpolator(null);
        this.h.addUpdateListener(new hm7(this, z, pt2Var));
        this.h.addListener(new wd8(this, runnable2, b));
        if (z) {
            this.w = 0.0f;
            this.s = 0.0f;
            this.r = 0.0f;
            this.n = 0.0f;
        }
        this.h.start();
    }

    @Override // z11
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public final /* synthetic */ void i(boolean z, pt2 pt2Var, ValueAnimator valueAnimator) {
        RenderEffect renderEffect;
        Shader.TileMode tileMode;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            if (floatValue <= 200.0f) {
                float h = 1.0f - h(floatValue / 200.0f);
                this.n = (1.0f - (h * h)) * 1.027027f;
            } else {
                float h2 = 1.0f - h((floatValue - 200.0f) / 120.0f);
                this.n = c00.x(h2, 0.027027028f, h2, 1.0f);
            }
            this.r = floatValue < 160.0f ? 1.0f - ((float) Math.pow(1.0f - (floatValue / 160.0f), 3.0d)) : (((float) Math.sin(h((floatValue - 160.0f) / 160.0f) * 3.141592653589793d)) / 48.0f) + 1.0f;
            this.s = h((floatValue - 130.0f) / 70.0f);
            this.w = h(floatValue / 160.0f);
        } else {
            this.s = 1.0f - h(floatValue / 60.0f);
            float h3 = h(floatValue / 150.0f);
            this.n = 1.0f - (((float) Math.pow(h3, 0.7d)) * 0.8783784f);
            this.r = bp1.v(h3, 0.625f, h3, 1.0f);
            this.w = (1.0f - h((floatValue - 150.0f) / 30.0f)) * (1.0f - (h3 * 0.15f));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            float h4 = z ? (1.0f - h(floatValue / 160.0f)) * hl.L(6.0f) : (h(floatValue / 180.0f) + 1.0f) * hl.L(3.0f);
            if (h4 > 0.01f) {
                tileMode = Shader.TileMode.DECAL;
                renderEffect = RenderEffect.createBlurEffect(h4, h4, tileMode);
            } else {
                renderEffect = null;
            }
            setRenderEffect(renderEffect);
        }
        pt2Var.accept(Float.valueOf(0.0f));
        invalidate();
    }

    public final /* synthetic */ void j(Canvas canvas, int i) {
        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i);
        drawChild(canvas, this.a, getDrawingTime());
        canvas.restoreToCount(saveLayerAlpha);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        this.f.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(304.0f), Math.max(0, View.MeasureSpec.getSize(i) - hl.L(24.0f))), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
    }

    @Override // z11
    public final void onShow() {
        super.onShow();
        this.c.d();
    }
}
