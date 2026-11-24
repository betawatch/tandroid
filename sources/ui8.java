// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ui8 extends View {
    public final Paint a;
    public final Paint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final int f;
    public final int h;
    public final boolean n;
    public final lm r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ vi8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui8(vi8 vi8Var, Context context, String str, boolean z) {
        super(context);
        CharSequence upperCase;
        this.y = vi8Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.r = new lm(this, 0L, 220L, s33.h);
        this.s = true;
        this.n = z;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(gl.o());
        if (z) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, gl.L(12.0f), gl.L(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            upperCase = k96.a0 ? new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase()) : new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, gl.L(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = lineWidth;
        int L = gl.L(48.0f) + ((int) lineWidth);
        this.f = L;
        if (!z) {
            this.f = Math.max(gl.L(80.0f), L);
        }
        this.h = gl.L(40.0f);
        setOnClickListener(new fr7(this, (byte) 27));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f = this.w;
            if (f != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / gl.r) / 80.0f) + f;
                this.w = min;
                this.w = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float e = this.r.e(false, this.s ? 1.0f : 0.5f);
        int saveCount = canvas.getSaveCount();
        if (e < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
        }
        float f2 = ((1.0f - this.w) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(gl.L(25.0f), gl.L(4.0f), getWidth() - gl.L(25.0f), getHeight() - gl.L(4.0f), this.b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        RectF rectF = gl.P;
        rectF.set(gl.L(10.0f), gl.L(4.0f), getWidth() - gl.L(10.0f), getHeight() - gl.L(4.0f));
        canvas.drawRoundRect(rectF, gl.L(20.0f), gl.L(20.0f), this.a);
        canvas.save();
        float L = (((this.f - this.e) / 2.0f) + gl.L(this.n ? 3.0f : 0.0f)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.c;
        canvas.translate(L, (height - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.h, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (z) {
                return;
            }
            float f = this.w;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new u28(this, (byte) 11));
                this.x.addListener(new l48(this, (byte) 18));
                b00.n(1.5f, this.x);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
