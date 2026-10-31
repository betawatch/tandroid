package vh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.x41;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class p2 extends View {
    public boolean A0;
    public Path B0;
    public float C0;
    public float D;
    public Paint D0;
    public float E;
    public Paint E0;
    public final Paint F;
    public LinearGradient F0;
    public CharSequence G;
    public Matrix G0;
    public final org.telegram.ui.Components.e6 H;
    public LinearGradient H0;
    public boolean I;
    public long I0;
    public final TextPaint J;
    public final RectF J0;
    public Layout.Alignment K;
    public q80 K0;
    public StaticLayout L;
    public org.telegram.ui.Components.k5 M;
    public float N;
    public float O;
    public float P;
    public final ji.a Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final org.telegram.ui.Components.t5 W;
    public int a;
    public org.telegram.ui.Cells.y a0;
    public float b;
    public Paint b0;
    public float c;
    public bi0 c0;
    public long d;
    public float d0;
    public boolean e;
    public int e0;
    public final boolean f;
    public int f0;
    public int g0;
    public int h;
    public boolean h0;
    public float i0;
    public float j0;
    public int k0;
    public Runnable l0;
    public final wv0 m0;
    public Drawable n;
    public ValueAnimator n0;
    public float o0;
    public final dc p0;
    public final Rect q0;
    public boolean r;
    public final RectF r0;
    public boolean s;
    public final RectF s0;
    public final Path t0;
    public float u0;
    public float v0;
    public float w;
    public float w0;
    public final RectF x;
    public float x0;
    public float y;
    public boolean y0;
    public boolean z0;

    public p2(Context context, int i10) {
        super(context);
        this.b = 0.5f;
        this.c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f = true;
        this.h = -1;
        this.s = true;
        this.w = org.telegram.messenger.i0.L(8.0f);
        this.x = new RectF(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f));
        this.y = org.telegram.messenger.i0.L(2.0f);
        this.D = org.telegram.messenger.i0.L(7.0f);
        this.E = org.telegram.messenger.i0.L(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new ji.a();
        this.T = true;
        this.U = true;
        gr grVar = gr.h;
        this.W = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.e0 = org.telegram.messenger.i0.L(2.0f);
        this.m0 = new wv0(this, 0);
        this.o0 = 1.0f;
        this.p0 = new dc(this, 2.0f, 5.0f);
        this.q0 = new Rect();
        this.r0 = new RectF();
        this.s0 = new RectF();
        this.t0 = new Path();
        this.z0 = true;
        this.J0 = new RectF();
        this.a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.w));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, false);
        this.H = e6Var;
        e6Var.n(0.4f, 320L, grVar);
        e6Var.setCallback(this);
        t(14.0f);
        e6Var.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int length = charSequence.length() / 2;
        float f7 = 0.0f;
        int i10 = 0;
        int i11 = -1;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        float f12 = 0.0f;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f12 = g(charSequence.subSequence(0, length), textPaint);
            f10 = g(org.telegram.messenger.i0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f12 != f7 || f10 != f11) {
                if (f12 < f10) {
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
                f7 = f12;
                f11 = f10;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f12, f10));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i10;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        float f7 = Float.MAX_VALUE;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        while (i11 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i12;
            }
            float g10 = g(charSequence.subSequence(0, length), textPaint);
            float g11 = g(org.telegram.messenger.i0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (length > 0 && length < charSequence.length() && Math.max(g10, g11) < f7) {
                f7 = Math.max(g10, g11);
                i13 = length;
            }
            if (g10 != f10 || g11 != f11) {
                if (g10 < g11) {
                    length++;
                    i10 = 1;
                } else {
                    length--;
                    i10 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i11++;
                f10 = g10;
                i12 = i10;
                f11 = g11;
            } else {
                break;
            }
        }
        return i13 < 0 ? charSequence : TextUtils.concat(org.telegram.messenger.i0.n1(charSequence.subSequence(0, i13)), "\n", org.telegram.messenger.i0.n1(charSequence.subSequence(i13, charSequence.length())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f7 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        x41[] x41VarArr = (x41[]) spanned.getSpans(0, charSequence.length(), x41.class);
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
        if (x41VarArr == null || x41VarArr.length == 0) {
            return textPaint3.measureText(charSequence2.toString()) + i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < x41VarArr.length; i13++) {
            int spanStart = spanned.getSpanStart(x41VarArr[i13]);
            int spanEnd = spanned.getSpanEnd(x41VarArr[i13]);
            int max = Math.max(i12, spanStart);
            if (max - i12 > 0) {
                f7 += textPaint3.measureText(spanned, i12, max);
            }
            i12 = Math.max(max, spanEnd);
            if (i12 - max > 0) {
                Typeface typeface = textPaint3.getTypeface();
                textPaint3.setTypeface(x41VarArr[i13].a);
                float measureText = textPaint3.measureText(spanned, max, i12) + f7;
                textPaint3.setTypeface(typeface);
                f7 = measureText;
            }
        }
        int max2 = Math.max(i12, charSequence2.length());
        if (max2 - i12 > 0) {
            f7 += textPaint3.measureText(spanned, i12, max2);
        }
        return f7 + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.x;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f7) {
        int i10 = this.k0;
        Paint paint = this.F;
        if (i10 != 0) {
            paint.setShadowLayer(this.i0, 0.0f, this.j0, org.telegram.ui.ActionBar.t6.r1(f7, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        Path path = this.t0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.A0) {
            int L = org.telegram.messenger.i0.L(64.0f);
            float b10 = z20.b(this.w0 * 4.0f, L * 2, ((System.currentTimeMillis() - this.I0) % 4000) / 4000.0f, -L);
            this.G0.reset();
            this.G0.postTranslate(this.r0.left + b10, 0.0f);
            this.F0.setLocalMatrix(this.G0);
            this.H0.setLocalMatrix(this.G0);
            canvas.drawPath(path, this.D0);
            canvas.drawPath(this.B0, this.E0);
            invalidate();
        }
    }

    public final void d(Path path, float f7, float f10, float f11, RectF rectF, Rect rect) {
        float f12;
        float f13 = f7 / 2.0f;
        float f14 = f10 / 2.0f;
        float min = Math.min(this.w, Math.min(f13, f14));
        int i10 = this.a;
        if (i10 == 1 || i10 == 3) {
            float i11 = Utilities.i(org.telegram.messenger.i0.W1(this.b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min2 = Math.min(Math.max(getPaddingLeft(), i11 - f13) + f7, getMeasuredWidth() - getPaddingRight());
            float f15 = min2 - f7;
            float f16 = this.D;
            float i12 = Utilities.i(i11, (min2 - min) - f16, f15 + min + f16);
            if (this.a == 1) {
                rectF.set(f15, getPaddingTop() + this.E, min2, getPaddingTop() + this.E + f10);
            } else {
                rectF.set(f15, ((getMeasuredHeight() - this.E) - getPaddingBottom()) - f10, min2, (getMeasuredHeight() - this.E) - getPaddingBottom());
            }
            f12 = i12;
        } else {
            float i13 = Utilities.i(org.telegram.messenger.i0.W1(this.b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min3 = Math.min(Math.max(getPaddingTop(), i13 - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f17 = min3 - f10;
            float f18 = this.D;
            f12 = Utilities.i(i13, (min3 - min) - f18, f17 + min + f18);
            if (this.a == 0) {
                rectF.set(getPaddingLeft() + this.E, f17, getPaddingLeft() + this.E + f7, min3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f7, f17, (getMeasuredWidth() - getPaddingRight()) - this.E, min3);
            }
        }
        float f19 = -f11;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.s;
        RectF rectF2 = this.J0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = min * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.a == 0) {
            path.lineTo(rectF.left, this.D + f12 + org.telegram.messenger.i0.L(2.0f));
            path.lineTo(rectF.left, this.D + f12);
            path.lineTo(rectF.left - this.E, org.telegram.messenger.i0.L(1.0f) + f12);
            float f23 = rectF.left - this.E;
            this.u0 = f23;
            this.v0 = f12;
            path.lineTo(f23, f12 - org.telegram.messenger.i0.L(1.0f));
            path.lineTo(rectF.left, f12 - this.D);
            path.lineTo(rectF.left, (f12 - this.D) - org.telegram.messenger.i0.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.a == 1) {
            path.lineTo((f12 - this.D) - org.telegram.messenger.i0.L(2.0f), rectF.top);
            path.lineTo(f12 - this.D, rectF.top);
            path.lineTo(f12 - org.telegram.messenger.i0.L(1.0f), rectF.top - this.E);
            this.u0 = f12;
            this.v0 = rectF.top - this.E;
            path.lineTo(org.telegram.messenger.i0.L(1.0f) + f12, rectF.top - this.E);
            path.lineTo(this.D + f12, rectF.top);
            path.lineTo(this.D + f12 + org.telegram.messenger.i0.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.a == 2) {
            path.lineTo(rectF.right, (f12 - this.D) - org.telegram.messenger.i0.L(2.0f));
            path.lineTo(rectF.right, f12 - this.D);
            path.lineTo(rectF.right + this.E, f12 - org.telegram.messenger.i0.L(1.0f));
            float f30 = rectF.right + this.E;
            this.u0 = f30;
            this.v0 = f12;
            path.lineTo(f30, org.telegram.messenger.i0.L(1.0f) + f12);
            path.lineTo(rectF.right, this.D + f12);
            path.lineTo(rectF.right, this.D + f12 + org.telegram.messenger.i0.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.a == 3) {
            path.lineTo(this.D + f12 + org.telegram.messenger.i0.L(2.0f), rectF.bottom);
            path.lineTo(this.D + f12, rectF.bottom);
            path.lineTo(org.telegram.messenger.i0.L(1.0f) + f12, rectF.bottom + this.E);
            this.u0 = f12;
            this.v0 = rectF.bottom + this.E;
            path.lineTo(f12 - org.telegram.messenger.i0.L(1.0f), rectF.bottom + this.E);
            path.lineTo(f12 - this.D, rectF.bottom);
            path.lineTo((f12 - this.D) - org.telegram.messenger.i0.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.y0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float a2;
        org.telegram.ui.Cells.y yVar;
        bi0 bi0Var;
        float f7;
        p2 p2Var;
        float f10;
        Canvas canvas2;
        if (this.I && this.L == null) {
            return;
        }
        float d = this.W.d(this.V && !this.z0);
        if (this.z0) {
            this.z0 = false;
            invalidate();
        }
        float f11 = 0.0f;
        if (d <= 0.0f) {
            return;
        }
        boolean z10 = this.I;
        org.telegram.ui.Components.e6 e6Var = this.H;
        float c10 = z10 ? this.O : e6Var.c();
        float f12 = this.I ? this.P : e6Var.e;
        if (this.r) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            c10 += this.y + this.n.getIntrinsicWidth();
            f12 = Math.max(this.n.getIntrinsicHeight(), f12);
        }
        if (this.c0 != null) {
            c10 += this.f0 + this.e0;
            f12 = Math.max(this.g0, f12);
        }
        float f13 = c10;
        RectF rectF2 = this.x;
        float f14 = rectF2.left + f13 + rectF2.right;
        float f15 = rectF2.top + f12 + rectF2.bottom;
        boolean z11 = this.y0;
        RectF rectF3 = this.r0;
        if (!z11 || Math.abs(f14 - this.w0) > 0.1f || Math.abs(f15 - this.x0) > 0.1f) {
            this.w0 = f14;
            this.x0 = f15;
            d(this.t0, f14, f15, 0.0f, rectF3, this.q0);
            if (this.A0) {
                rectF = rectF3;
                d(this.B0, f14, f15, this.C0, this.s0, null);
                float f16 = !this.f ? d : 1.0f;
                canvas.save();
                if (d < 1.0f && this.e) {
                    float T1 = org.telegram.messenger.i0.T1(0.75f, 1.0f, d);
                    canvas.scale(T1, T1, this.u0, this.v0);
                }
                a2 = this.p0.a(0.025f);
                if (a2 != 1.0f) {
                    canvas.scale(a2, a2, this.u0, this.v0);
                }
                if (this.o0 != 1.0f) {
                    int i10 = this.a;
                    if (i10 == 3 || i10 == 1) {
                        canvas.translate(0.0f, (this.o0 - 1.0f) * Math.max(i10 == 3 ? getPaddingBottom() : getPaddingTop(), org.telegram.messenger.i0.L(24.0f)) * (this.a != 1 ? 1 : -1));
                    } else {
                        canvas.translate((this.o0 - 1.0f) * Math.max(i10 == 0 ? getPaddingLeft() : getPaddingRight(), org.telegram.messenger.i0.L(24.0f)) * (this.a != 0 ? 1 : -1), 0.0f);
                    }
                }
                RectF rectF4 = org.telegram.messenger.i0.P;
                rectF4.set(rectF);
                float f17 = -this.E;
                rectF4.inset(f17, f17);
                c(canvas, f16);
                yVar = this.a0;
                if (yVar != null) {
                    yVar.setAlpha((int) (f16 * 255.0f));
                    this.a0.setBounds(this.q0);
                    this.a0.draw(canvas);
                }
                float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
                bi0Var = this.c0;
                if (bi0Var == null) {
                    if (this.h0) {
                        float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                        float f20 = this.d0 + f18;
                        f7 = 255.0f;
                        float f21 = this.g0 / 2.0f;
                        bi0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.f0), (int) (f21 + f20));
                        f11 = this.f0 + this.e0 + 0.0f;
                    } else {
                        f7 = 255.0f;
                        float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                        float f23 = this.d0 + f18;
                        float f24 = this.g0 / 2.0f;
                        bi0Var.setBounds((int) (f22 - this.f0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                        f11 = 0.0f;
                    }
                    this.c0.setAlpha((int) (f16 * f7));
                    this.c0.draw(canvas);
                } else {
                    f7 = 255.0f;
                }
                if (this.I) {
                    p2Var = this;
                    f10 = f16;
                    canvas2 = canvas;
                    CharSequence charSequence = p2Var.G;
                    if (charSequence != null) {
                        e6Var.t(charSequence, p2Var.V, true);
                        p2Var.G = null;
                    }
                    float f25 = rectF.left;
                    float f26 = rectF2.left;
                    float f27 = p2Var.P / 2.0f;
                    e6Var.setBounds((int) (f11 + f25 + f26), (int) (f18 - f27), (int) (f25 + f26 + f13), (int) (f27 + f18));
                    e6Var.B = (int) (f10 * f7);
                    e6Var.draw(canvas2);
                } else {
                    f10 = f16;
                    p2Var = this;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f15), (int) (f16 * f7), 31);
                    float f28 = ((f11 + rectF.left) + rectF2.left) - p2Var.N;
                    p2Var.R = f28;
                    float f29 = f18 - (p2Var.P / 2.0f);
                    p2Var.S = f29;
                    canvas2.translate(f28, f29);
                    if (p2Var.Q.h(canvas2)) {
                        p2Var.invalidate();
                    }
                    p2Var.L.draw(canvas2);
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, p2Var.L, p2Var.M, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                    canvas2.restore();
                }
                if (p2Var.r) {
                    if (p2Var.n == null) {
                        Drawable mutate2 = p2Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                        p2Var.n = mutate2;
                        mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                    }
                    p2Var.n.setAlpha((int) (f10 * f7));
                    p2Var.n.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - r1.getIntrinsicWidth()), (int) (rectF.centerY() - (p2Var.n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((p2Var.n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                    p2Var.n.draw(canvas2);
                }
                canvas2.restore();
            }
        }
        rectF = rectF3;
        if (!this.f) {
        }
        canvas.save();
        if (d < 1.0f) {
            float T12 = org.telegram.messenger.i0.T1(0.75f, 1.0f, d);
            canvas.scale(T12, T12, this.u0, this.v0);
        }
        a2 = this.p0.a(0.025f);
        if (a2 != 1.0f) {
        }
        if (this.o0 != 1.0f) {
        }
        RectF rectF42 = org.telegram.messenger.i0.P;
        rectF42.set(rectF);
        float f172 = -this.E;
        rectF42.inset(f172, f172);
        c(canvas, f16);
        yVar = this.a0;
        if (yVar != null) {
        }
        float f182 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
        bi0Var = this.c0;
        if (bi0Var == null) {
        }
        if (this.I) {
        }
        if (p2Var.r) {
        }
        canvas2.restore();
    }

    public final void e(boolean z10) {
        org.telegram.messenger.i0.r(this.m0);
        Runnable runnable = this.l0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.t5 t5Var = this.W;
        if (!z10) {
            t5Var.getClass();
            t5Var.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.l0;
        if (runnable2 != null) {
            org.telegram.messenger.i0.h3(runnable2, (long) (t5Var.c * t5Var.g));
        }
        this.Q.f(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.L = new StaticLayout(charSequence, this.J, i10, this.K, 1.0f, 0.0f, false);
        float f7 = i10;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < this.L.getLineCount(); i11++) {
            f7 = Math.min(f7, this.L.getLineLeft(i11));
            f10 = Math.max(f10, this.L.getLineRight(i11));
        }
        this.O = Math.max(0.0f, f10 - f7);
        this.P = this.L.getHeight();
        this.N = f7;
        this.M = org.telegram.ui.Components.o5.update(0, this, this.M, this.L);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.i;
        }
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.I ? this.J : this.H.a;
    }

    public final void h(int i10) {
        Paint paint = this.F;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i(boolean z10) {
        this.r = z10;
        if (this.I) {
            return;
        }
        this.x.set(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(this.r ? 15.0f : 11.0f), org.telegram.messenger.i0.L(7.0f));
    }

    public final void j(bi0 bi0Var) {
        bi0 bi0Var2 = this.c0;
        if (bi0Var2 != null) {
            bi0Var2.setCallback(null);
        }
        this.c0 = bi0Var;
        bi0Var.setCallback(this);
        bi0 bi0Var3 = this.c0;
        if (c3.i0.t(bi0Var3)) {
            this.d = Math.max(this.d, bi0Var3.r());
        }
        bi0 bi0Var4 = this.c0;
        this.f0 = bi0Var4.b;
        this.g0 = bi0Var4.c;
        this.h0 = true;
    }

    public final void k(float f7, float f10, float f11, float f12) {
        this.x.set(org.telegram.messenger.i0.N(f7), org.telegram.messenger.i0.N(f10), org.telegram.messenger.i0.N(f11), org.telegram.messenger.i0.N(f12));
    }

    public final void l(float f7, float f10) {
        if (Math.abs(this.b - f7) >= 1.0f || Math.abs(this.c - org.telegram.messenger.i0.L(f10)) >= 1.0f) {
            this.y0 = false;
            invalidate();
        }
        this.b = f7;
        this.c = org.telegram.messenger.i0.L(f10);
    }

    public final void m(float f7, float f10) {
        if (Math.abs(this.b - f7) >= 1.0f || Math.abs(this.c - f10) >= 1.0f) {
            this.y0 = false;
            invalidate();
        }
        this.b = f7;
        this.c = f10;
    }

    public final void n() {
        this.h = org.telegram.messenger.i0.L(165.0f);
    }

    public final void o(int i10) {
        this.h = i10;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5.release(this, this.M);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.y0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.M = textMaxWidth;
        if (this.I) {
            CharSequence charSequence = this.G;
            if (charSequence == null) {
                StaticLayout staticLayout = this.L;
                if (staticLayout == null) {
                    return;
                } else {
                    charSequence = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.L;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.G;
            if (charSequence2 != null) {
                e6Var.t(charSequence2, false, true);
            }
        }
        this.G = null;
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
        if ((this.T || hasOnClickListeners()) && this.V) {
            if (this.L != null) {
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                StaticLayout staticLayout = this.L;
                if (staticLayout != null) {
                    int i10 = (int) (x10 - this.R);
                    int i11 = (int) (y3 - this.S);
                    int lineForVertical = staticLayout.getLineForVertical(i11);
                    float f7 = i10;
                    int offsetForHorizontal = this.L.getOffsetForHorizontal(lineForVertical, f7);
                    float lineLeft = this.L.getLineLeft(lineForVertical);
                    if (lineLeft <= f7 && this.L.getLineWidth(lineForVertical) + lineLeft >= f7 && i11 >= 0 && i11 <= this.L.getHeight()) {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.L.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0 && !org.telegram.messenger.i0.C1()) {
                            clickableSpan = clickableSpanArr[0];
                            wv0 wv0Var = this.m0;
                            ji.a aVar = this.Q;
                            if (clickableSpan == null && motionEvent.getAction() == 0) {
                                q80 q80Var = new q80(clickableSpan, null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.K0 = q80Var;
                                aVar.b(q80Var, null);
                                SpannableString spannableString = new SpannableString(this.L.getText());
                                int spanStart = spannableString.getSpanStart(this.K0.i);
                                int spanEnd = spannableString.getSpanEnd(this.K0.i);
                                k80 b10 = this.K0.b();
                                b10.d(this.L, spanStart, 0.0f);
                                this.L.getSelectionPath(spanStart, spanEnd, b10);
                                invalidate();
                                org.telegram.messenger.i0.h3(new ph.p(this, q80Var, clickableSpan), ViewConfiguration.getLongPressTimeout());
                                org.telegram.messenger.i0.r(wv0Var);
                                return true;
                            }
                            if (motionEvent.getAction() == 1) {
                                aVar.f(true);
                                invalidate();
                                org.telegram.messenger.i0.r(wv0Var);
                                long j10 = this.d;
                                if (j10 > 0) {
                                    org.telegram.messenger.i0.h3(wv0Var, j10);
                                }
                                q80 q80Var2 = this.K0;
                                if (q80Var2 != null && (characterStyle = q80Var2.i) == clickableSpan) {
                                    if (characterStyle != null) {
                                        ((ClickableSpan) characterStyle).onClick(this);
                                    }
                                    this.K0 = null;
                                    return true;
                                }
                                this.K0 = null;
                            }
                            if (motionEvent.getAction() == 3) {
                                aVar.f(true);
                                invalidate();
                                org.telegram.messenger.i0.r(wv0Var);
                                long j11 = this.d;
                                if (j11 > 0) {
                                    org.telegram.messenger.i0.h3(wv0Var, j11);
                                }
                                this.K0 = null;
                            }
                        }
                    }
                }
                clickableSpan = null;
                wv0 wv0Var2 = this.m0;
                ji.a aVar2 = this.Q;
                if (clickableSpan == null) {
                }
                if (motionEvent.getAction() == 1) {
                }
                if (motionEvent.getAction() == 3) {
                }
            }
            if (this.K0 == null) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int action = motionEvent.getAction();
                dc dcVar = this.p0;
                if (action == 0) {
                    if (this.r0.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                        dcVar.c(true);
                        org.telegram.ui.Cells.y yVar = this.a0;
                        if (yVar != null) {
                            yVar.setHotspot(x11, y10);
                            this.a0.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.T) {
                        e(true);
                    }
                    dcVar.c(false);
                    org.telegram.ui.Cells.y yVar2 = this.a0;
                    if (yVar2 != null) {
                        yVar2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    dcVar.c(false);
                    org.telegram.ui.Cells.y yVar3 = this.a0;
                    if (yVar3 != null) {
                        yVar3.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p(boolean z10) {
        this.I = z10;
        RectF rectF = this.x;
        if (z10) {
            rectF.set(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f));
            this.y = org.telegram.messenger.i0.L(6.0f);
        } else {
            rectF.set(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(this.r ? 15.0f : 11.0f), org.telegram.messenger.i0.L(7.0f));
            this.y = org.telegram.messenger.i0.L(2.0f);
        }
    }

    public final void q(float f7) {
        this.w = org.telegram.messenger.i0.L(f7);
        this.F.setPathEffect(this.s ? new CornerPathEffect(this.w) : null);
        Paint paint = this.b0;
        if (paint != null) {
            paint.setPathEffect(this.s ? new CornerPathEffect(this.w) : null);
        }
    }

    public final void r() {
        this.s = false;
        this.F.setPathEffect(null);
    }

    public final void s(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.G = charSequence;
        } else if (this.I) {
            f(getTextMaxWidth(), charSequence);
        } else {
            this.H.t(charSequence, false, true);
        }
    }

    public final void t(float f7) {
        this.H.w(org.telegram.messenger.i0.N(f7));
        this.J.setTextSize(org.telegram.messenger.i0.N(f7));
    }

    public final void u() {
        if (this.V && this.U) {
            ValueAnimator valueAnimator = this.n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.n0 = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 28));
            this.n0.addListener(new sg.r(this, 16));
            this.n0.setInterpolator(gr.k);
            this.n0.setDuration(300L);
            this.n0.start();
        }
        org.telegram.messenger.i0.i2(getText());
        this.V = true;
        invalidate();
        wv0 wv0Var = this.m0;
        org.telegram.messenger.i0.r(wv0Var);
        long j10 = this.d;
        if (j10 > 0) {
            org.telegram.messenger.i0.h3(wv0Var, j10);
        }
        Runnable runnable = this.l0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || drawable == this.a0 || drawable == this.c0 || super.verifyDrawable(drawable);
    }
}
