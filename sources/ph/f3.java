package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.el0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class f3 extends View {
    public Paint A0;
    public float B;
    public Paint B0;
    public final Paint C;
    public LinearGradient C0;
    public CharSequence D;
    public Matrix D0;
    public final org.telegram.ui.Components.j6 E;
    public LinearGradient E0;
    public boolean F;
    public long F0;
    public final TextPaint G;
    public final RectF G0;
    public Layout.Alignment H;
    public f90 H0;
    public StaticLayout I;
    public org.telegram.ui.Components.q5 J;
    public float K;
    public float L;
    public float M;
    public final b90 N;
    public float O;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.z5 T;
    public org.telegram.ui.Cells.z U;
    public Paint V;
    public gj0 W;
    public int a;
    public float a0;
    public float b;
    public int b0;
    public float c;
    public int c0;
    public long d;
    public int d0;
    public boolean e;
    public boolean e0;
    public final boolean f;
    public float f0;
    public float g0;
    public int h;
    public int h0;
    public Runnable i0;
    public final el0 j0;
    public ValueAnimator k0;
    public float l0;
    public final rc m0;
    public Drawable n;
    public final Rect n0;
    public final RectF o0;
    public final RectF p0;
    public final Path q0;
    public boolean r;
    public float r0;
    public boolean s;
    public float s0;
    public float t0;
    public float u0;
    public float v;
    public boolean v0;
    public final RectF w;
    public boolean w0;
    public float x;
    public boolean x0;
    public float y;
    public Path y0;
    public float z0;

    public f3(Context context, int i10) {
        super(context);
        this.b = 0.5f;
        this.c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f = true;
        this.h = -1;
        this.s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.x = AndroidUtilities.dp(2.0f);
        this.y = AndroidUtilities.dp(7.0f);
        this.B = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.C = paint;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.H = Layout.Alignment.ALIGN_NORMAL;
        this.N = new b90();
        this.Q = true;
        this.R = true;
        nr nrVar = nr.h;
        this.T = new org.telegram.ui.Components.z5(this, 350L, nrVar);
        this.b0 = AndroidUtilities.dp(2.0f);
        this.j0 = new el0(this, 27);
        this.l0 = 1.0f;
        this.m0 = new rc(this, 2.0f, 5.0f);
        this.n0 = new Rect();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new Path();
        this.w0 = true;
        this.G0 = new RectF();
        this.a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.E = j6Var;
        j6Var.k(0.4f, 320L, nrVar);
        j6Var.setCallback(this);
        u(14.0f);
        j6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f11 = g(charSequence.subSequence(0, length), textPaint);
            f12 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f11 != f10 || f12 != f13) {
                if (f11 < f12) {
                    length++;
                    i11 = 1;
                } else {
                    length--;
                    i11 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f10 = f11;
                f13 = f12;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f11, f12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i10;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        int i11 = length;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = 1;
            if (i12 >= 10) {
                break;
            }
            length = i11;
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i13;
            }
            float g10 = g(charSequence.subSequence(0, length), textPaint);
            float g11 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (g10 == f10 && g11 == f11) {
                break;
            }
            if (g10 < g11) {
                i10 = length + 1;
            } else {
                i10 = length - 1;
                i14 = -1;
            }
            if (i10 <= 0 || i10 >= charSequence.length()) {
                break;
            }
            i12++;
            int i15 = i10;
            f10 = g10;
            i11 = i15;
            f11 = g11;
            i13 = i14;
        }
        return TextUtils.concat(AndroidUtilities.getTrimmedString(charSequence.subSequence(0, length)), "\n", AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f10 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        f51[] f51VarArr = (f51[]) spanned.getSpans(0, charSequence.length(), f51.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int i11 = 0;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            TextPaint textPaint2 = textPaint;
            i11 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, r10, r11, r12, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i11);
            i10++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (f51VarArr == null || f51VarArr.length == 0) {
            return textPaint3.measureText(charSequence2.toString()) + i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < f51VarArr.length; i13++) {
            int spanStart = spanned.getSpanStart(f51VarArr[i13]);
            int spanEnd = spanned.getSpanEnd(f51VarArr[i13]);
            int max = Math.max(i12, spanStart);
            if (max - i12 > 0) {
                f10 += textPaint3.measureText(spanned, i12, max);
            }
            i12 = Math.max(max, spanEnd);
            if (i12 - max > 0) {
                Typeface typeface = textPaint3.getTypeface();
                textPaint3.setTypeface(f51VarArr[i13].a);
                float measureText = textPaint3.measureText(spanned, max, i12) + f10;
                textPaint3.setTypeface(typeface);
                f10 = measureText;
            }
        }
        int max2 = Math.max(i12, charSequence2.length());
        if (max2 - i12 > 0) {
            f10 += textPaint3.measureText(spanned, i12, max2);
        }
        return f10 + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f10) {
        int i10 = this.h0;
        Paint paint = this.C;
        if (i10 != 0) {
            paint.setShadowLayer(this.f0, 0.0f, this.g0, org.telegram.ui.ActionBar.j6.l1(f10, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        Path path = this.q0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.x0) {
            int dp = AndroidUtilities.dp(64.0f);
            float currentTimeMillis = (((this.t0 * 4.0f) + (dp * 2)) * (((System.currentTimeMillis() - this.F0) % 4000) / 4000.0f)) + (-dp);
            this.D0.reset();
            this.D0.postTranslate(this.o0.left + currentTimeMillis, 0.0f);
            this.C0.setLocalMatrix(this.D0);
            this.E0.setLocalMatrix(this.D0);
            canvas.drawPath(path, this.A0);
            canvas.drawPath(this.y0, this.B0);
            invalidate();
        }
    }

    public final void d(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.v, Math.min(f14, f15));
        int i10 = this.a;
        if (i10 == 1 || i10 == 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.b) + this.c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min2 = Math.min(Math.max(getPaddingLeft(), clamp - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f16 = min2 - f10;
            float f17 = this.y;
            float clamp2 = Utilities.clamp(clamp, (min2 - min) - f17, f16 + min + f17);
            if (this.a == 1) {
                rectF.set(f16, getPaddingTop() + this.B, min2, getPaddingTop() + this.B + f11);
            } else {
                rectF.set(f16, ((getMeasuredHeight() - this.B) - getPaddingBottom()) - f11, min2, (getMeasuredHeight() - this.B) - getPaddingBottom());
            }
            f13 = clamp2;
        } else {
            float clamp3 = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.b) + this.c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min3 = Math.min(Math.max(getPaddingTop(), clamp3 - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f18 = min3 - f11;
            float f19 = this.y;
            f13 = Utilities.clamp(clamp3, (min3 - min) - f19, f18 + min + f19);
            if (this.a == 0) {
                rectF.set(getPaddingLeft() + this.B, f18, getPaddingLeft() + this.B + f10, min3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.B) - f10, f18, (getMeasuredWidth() - getPaddingRight()) - this.B, min3);
            }
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z4 = this.s;
        RectF rectF2 = this.G0;
        if (z4) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.a == 0) {
            path.lineTo(rectF.left, this.y + f13 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.y + f13);
            path.lineTo(rectF.left - this.B, AndroidUtilities.dp(1.0f) + f13);
            float f24 = rectF.left - this.B;
            this.r0 = f24;
            this.s0 = f13;
            path.lineTo(f24, f13 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f13 - this.y);
            path.lineTo(rectF.left, (f13 - this.y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.B);
            }
        }
        if (this.s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.a == 1) {
            path.lineTo((f13 - this.y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f13 - this.y, rectF.top);
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.top - this.B);
            this.r0 = f13;
            this.s0 = rectF.top - this.B;
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.top - this.B);
            path.lineTo(this.y + f13, rectF.top);
            path.lineTo(this.y + f13 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.B);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.a == 2) {
            path.lineTo(rectF.right, (f13 - this.y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f13 - this.y);
            path.lineTo(rectF.right + this.B, f13 - AndroidUtilities.dp(1.0f));
            float f31 = rectF.right + this.B;
            this.r0 = f31;
            this.s0 = f13;
            path.lineTo(f31, AndroidUtilities.dp(1.0f) + f13);
            path.lineTo(rectF.right, this.y + f13);
            path.lineTo(rectF.right, this.y + f13 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.B);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.a == 3) {
            path.lineTo(this.y + f13 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.y + f13, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.bottom + this.B);
            this.r0 = f13;
            this.s0 = rectF.bottom + this.B;
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.bottom + this.B);
            path.lineTo(f13 - this.y, rectF.bottom);
            path.lineTo((f13 - this.y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.B);
            }
        }
        path.close();
        this.v0 = true;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f10;
        float f11;
        f3 f3Var;
        float f12;
        Canvas canvas2;
        if (this.F && this.I == null) {
            return;
        }
        float e = this.T.e(this.S && !this.w0);
        if (this.w0) {
            this.w0 = false;
            invalidate();
        }
        if (e <= 0.0f) {
            return;
        }
        boolean z4 = this.F;
        org.telegram.ui.Components.j6 j6Var = this.E;
        float d = z4 ? this.L : j6Var.d();
        float f13 = this.F ? this.M : j6Var.e;
        if (this.r) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            d += this.x + this.n.getIntrinsicWidth();
            f13 = Math.max(this.n.getIntrinsicHeight(), f13);
        }
        if (this.W != null) {
            d += this.c0 + this.b0;
            f13 = Math.max(this.d0, f13);
        }
        float f14 = d;
        RectF rectF2 = this.w;
        float f15 = rectF2.left + f14 + rectF2.right;
        float f16 = rectF2.top + f13 + rectF2.bottom;
        boolean z10 = this.v0;
        RectF rectF3 = this.o0;
        if (!z10 || Math.abs(f15 - this.t0) > 0.1f || Math.abs(f16 - this.u0) > 0.1f) {
            this.t0 = f15;
            this.u0 = f16;
            d(this.q0, f15, f16, 0.0f, rectF3, this.n0);
            rectF = rectF3;
            if (this.x0) {
                d(this.y0, f15, f16, this.z0, this.p0, null);
            }
        } else {
            rectF = rectF3;
        }
        float f17 = this.f ? e : 1.0f;
        canvas.save();
        if (e < 1.0f && this.e) {
            float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e);
            canvas.scale(lerp, lerp, this.r0, this.s0);
        }
        float a2 = this.m0.a(0.025f);
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, this.r0, this.s0);
        }
        if (this.l0 != 1.0f) {
            int i10 = this.a;
            if (i10 == 3 || i10 == 1) {
                canvas.translate(0.0f, (this.l0 - 1.0f) * Math.max(i10 == 3 ? getPaddingBottom() : getPaddingTop(), AndroidUtilities.dp(24.0f)) * (this.a != 1 ? 1 : -1));
            } else {
                canvas.translate((this.l0 - 1.0f) * Math.max(i10 == 0 ? getPaddingLeft() : getPaddingRight(), AndroidUtilities.dp(24.0f)) * (this.a != 0 ? 1 : -1), 0.0f);
            }
        }
        RectF rectF4 = AndroidUtilities.rectTmp;
        rectF4.set(rectF);
        float f18 = -this.B;
        rectF4.inset(f18, f18);
        c(canvas, f17);
        org.telegram.ui.Cells.z zVar = this.U;
        if (zVar != null) {
            zVar.setAlpha((int) (f17 * 255.0f));
            this.U.setBounds(this.n0);
            this.U.draw(canvas);
        }
        float f19 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
        gj0 gj0Var = this.W;
        if (gj0Var != null) {
            if (this.e0) {
                float f20 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                float f21 = this.a0 + f19;
                f10 = 255.0f;
                float f22 = this.d0 / 2.0f;
                gj0Var.setBounds((int) f20, (int) (f21 - f22), (int) (f20 + this.c0), (int) (f22 + f21));
                f11 = this.c0 + this.b0 + 0.0f;
            } else {
                f10 = 255.0f;
                float f23 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                float f24 = this.a0 + f19;
                float f25 = this.d0 / 2.0f;
                gj0Var.setBounds((int) (f23 - this.c0), (int) (f24 - f25), (int) f23, (int) (f25 + f24));
                f11 = 0.0f;
            }
            this.W.setAlpha((int) (f17 * f10));
            this.W.draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (this.F) {
            f12 = f17;
            f3Var = this;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f16), (int) (f17 * f10), 31);
            float f26 = ((f11 + rectF.left) + rectF2.left) - f3Var.K;
            f3Var.O = f26;
            float f27 = f19 - (f3Var.M / 2.0f);
            f3Var.P = f27;
            canvas2.translate(f26, f27);
            if (f3Var.N.f(canvas2)) {
                f3Var.invalidate();
            }
            f3Var.I.draw(canvas2);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, f3Var.I, f3Var.J, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2.restore();
        } else {
            f3Var = this;
            f12 = f17;
            canvas2 = canvas;
            CharSequence charSequence = f3Var.D;
            if (charSequence != null) {
                j6Var.q(charSequence, f3Var.S, true);
                f3Var.D = null;
            }
            float f28 = rectF.left;
            float f29 = rectF2.left;
            float f30 = f3Var.M / 2.0f;
            j6Var.setBounds((int) (f11 + f28 + f29), (int) (f19 - f30), (int) (f28 + f29 + f14), (int) (f30 + f19));
            j6Var.w = (int) (f12 * f10);
            j6Var.draw(canvas2);
        }
        if (f3Var.r) {
            if (f3Var.n == null) {
                Drawable mutate2 = f3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                f3Var.n = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            f3Var.n.setAlpha((int) (f12 * f10));
            f3Var.n.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - r1.getIntrinsicWidth()), (int) (rectF.centerY() - (f3Var.n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((f3Var.n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
            f3Var.n.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void e(boolean z4) {
        AndroidUtilities.cancelRunOnUIThread(this.j0);
        Runnable runnable = this.i0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.S = false;
        org.telegram.ui.Components.z5 z5Var = this.T;
        if (!z4) {
            z5Var.getClass();
            z5Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.i0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, (long) (z5Var.c * z5Var.g));
        }
        this.N.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.I = new StaticLayout(charSequence, this.G, i10, this.H, 1.0f, 0.0f, false);
        float f10 = i10;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < this.I.getLineCount(); i11++) {
            f10 = Math.min(f10, this.I.getLineLeft(i11));
            f11 = Math.max(f11, this.I.getLineRight(i11));
        }
        this.L = Math.max(0.0f, f11 - f10);
        this.M = this.I.getHeight();
        this.K = f10;
        this.J = org.telegram.ui.Components.u5.update(0, this, this.J, this.I);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.F) {
            return this.E.g;
        }
        StaticLayout staticLayout = this.I;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.F ? this.G : this.E.a;
    }

    public final void h(int i10) {
        Paint paint = this.C;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.r = true;
        if (this.F) {
            return;
        }
        this.w.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
    }

    public final void j(int i10) {
        gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(34.0f), kh.a2.j(i10, ""), AndroidUtilities.dp(34.0f));
        gj0Var.start();
        k(gj0Var);
    }

    public final void k(gj0 gj0Var) {
        gj0 gj0Var2 = this.W;
        if (gj0Var2 != null) {
            gj0Var2.setCallback(null);
        }
        this.W = gj0Var;
        gj0Var.setCallback(this);
        gj0 gj0Var3 = this.W;
        if (e2.c.s(gj0Var3)) {
            this.d = Math.max(this.d, gj0Var3.p());
        }
        gj0 gj0Var4 = this.W;
        this.c0 = gj0Var4.b;
        this.d0 = gj0Var4.c;
        this.e0 = true;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        this.w.set(AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f13));
    }

    public final void m(float f10, float f11) {
        if (Math.abs(this.b - f10) >= 1.0f || Math.abs(this.c - AndroidUtilities.dp(f11)) >= 1.0f) {
            this.v0 = false;
            invalidate();
        }
        this.b = f10;
        this.c = AndroidUtilities.dp(f11);
    }

    public final void n(float f10, float f11) {
        if (Math.abs(this.b - f10) >= 1.0f || Math.abs(this.c - f11) >= 1.0f) {
            this.v0 = false;
            invalidate();
        }
        this.b = f10;
        this.c = f11;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release(this, this.J);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.v0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.G = textMaxWidth;
        if (this.F) {
            CharSequence charSequence = this.D;
            if (charSequence == null) {
                StaticLayout staticLayout = this.I;
                if (staticLayout == null) {
                    return;
                } else {
                    charSequence = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.I;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.D;
            if (charSequence2 != null) {
                j6Var.q(charSequence2, false, true);
            }
        }
        this.D = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        if ((this.Q || hasOnClickListeners()) && this.S) {
            if (this.I != null) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                StaticLayout staticLayout = this.I;
                if (staticLayout != null) {
                    int i10 = (int) (x10 - this.O);
                    int i11 = (int) (y10 - this.P);
                    int lineForVertical = staticLayout.getLineForVertical(i11);
                    float f10 = i10;
                    int offsetForHorizontal = this.I.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = this.I.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && this.I.getLineWidth(lineForVertical) + lineLeft >= f10 && i11 >= 0 && i11 <= this.I.getHeight()) {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.I.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            clickableSpan = clickableSpanArr[0];
                            el0 el0Var = this.j0;
                            b90 b90Var = this.N;
                            if (clickableSpan == null && motionEvent.getAction() == 0) {
                                f90 f90Var = new f90(clickableSpan, null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.H0 = f90Var;
                                b90Var.a(f90Var, null);
                                SpannableString spannableString = new SpannableString(this.I.getText());
                                int spanStart = spannableString.getSpanStart(this.H0.i);
                                int spanEnd = spannableString.getSpanEnd(this.H0.i);
                                y80 b10 = this.H0.b();
                                b10.d(this.I, spanStart, 0.0f);
                                this.I.getSelectionPath(spanStart, spanEnd, b10);
                                invalidate();
                                AndroidUtilities.runOnUIThread(new kh.w(this, f90Var, clickableSpan), ViewConfiguration.getLongPressTimeout());
                                AndroidUtilities.cancelRunOnUIThread(el0Var);
                                return true;
                            }
                            if (motionEvent.getAction() == 1) {
                                b90Var.d(true);
                                invalidate();
                                AndroidUtilities.cancelRunOnUIThread(el0Var);
                                long j10 = this.d;
                                if (j10 > 0) {
                                    AndroidUtilities.runOnUIThread(el0Var, j10);
                                }
                                f90 f90Var2 = this.H0;
                                if (f90Var2 != null && (characterStyle = f90Var2.i) == clickableSpan) {
                                    if (characterStyle != null) {
                                        ((ClickableSpan) characterStyle).onClick(this);
                                    }
                                    this.H0 = null;
                                    return true;
                                }
                                this.H0 = null;
                            }
                            if (motionEvent.getAction() == 3) {
                                b90Var.d(true);
                                invalidate();
                                AndroidUtilities.cancelRunOnUIThread(el0Var);
                                long j11 = this.d;
                                if (j11 > 0) {
                                    AndroidUtilities.runOnUIThread(el0Var, j11);
                                }
                                this.H0 = null;
                            }
                        }
                    }
                }
                clickableSpan = null;
                el0 el0Var2 = this.j0;
                b90 b90Var2 = this.N;
                if (clickableSpan == null) {
                }
                if (motionEvent.getAction() == 1) {
                }
                if (motionEvent.getAction() == 3) {
                }
            }
            if (this.H0 == null) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int action = motionEvent.getAction();
                rc rcVar = this.m0;
                if (action == 0) {
                    if (this.o0.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                        rcVar.c(true);
                        org.telegram.ui.Cells.z zVar = this.U;
                        if (zVar != null) {
                            zVar.setHotspot(x11, y11);
                            this.U.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.Q) {
                        e(true);
                    }
                    rcVar.c(false);
                    org.telegram.ui.Cells.z zVar2 = this.U;
                    if (zVar2 != null) {
                        zVar2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    rcVar.c(false);
                    org.telegram.ui.Cells.z zVar3 = this.U;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p(int i10) {
        this.h = i10;
    }

    public final void q(boolean z4) {
        this.F = z4;
        RectF rectF = this.w;
        if (z4) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.x = AndroidUtilities.dp(6.0f);
        } else {
            rectF.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
            this.x = AndroidUtilities.dp(2.0f);
        }
    }

    public final void r(float f10) {
        this.v = AndroidUtilities.dp(f10);
        this.C.setPathEffect(this.s ? new CornerPathEffect(this.v) : null);
        Paint paint = this.V;
        if (paint != null) {
            paint.setPathEffect(this.s ? new CornerPathEffect(this.v) : null);
        }
    }

    public final void s() {
        this.s = false;
        this.C.setPathEffect(null);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.D = charSequence;
        } else if (this.F) {
            f(getTextMaxWidth(), charSequence);
        } else {
            this.E.q(charSequence, false, true);
        }
    }

    public final void u(float f10) {
        this.E.t(AndroidUtilities.dpf2(f10));
        this.G.setTextSize(AndroidUtilities.dpf2(f10));
    }

    public final void v() {
        int i10 = 1;
        if (this.S && this.R) {
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 16));
            this.k0.addListener(new j2(this, i10));
            this.k0.setInterpolator(nr.k);
            this.k0.setDuration(300L);
            this.k0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.S = true;
        invalidate();
        el0 el0Var = this.j0;
        AndroidUtilities.cancelRunOnUIThread(el0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(el0Var, j10);
        }
        Runnable runnable = this.i0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || drawable == this.U || drawable == this.W || super.verifyDrawable(drawable);
    }
}
