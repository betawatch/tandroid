// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class s1 extends FrameLayout implements tjb {
    public static final int d0 = gl.L(76.0f);
    public static final int e0 = -2146483649;
    public StaticLayout E;
    public final i46 F;
    public p1 G;
    public r86 H;
    public final d I;
    public final wjb J;
    public final FrameLayout K;
    public final ff0 L;
    public StaticLayout M;
    public StaticLayout[] N;
    public int O;
    public Point[] P;
    public boolean Q;
    public boolean R;
    public int S;
    public final Paint T;
    public final float U;
    public final o1 V;
    public float W;
    public StaticLayout a;
    public ValueAnimator a0;
    public String b;
    public int b0;
    public int c;
    public boolean c0;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f;
    public final TextView h;
    public final l1 n;
    public final FrameLayout r;
    public final FrameLayout s;
    public final Drawable w;
    public m46 x;
    public float y;

    public s1(Context context, d dVar, wjb wjbVar) {
        super(context);
        byte b = 0;
        new b46(0);
        this.N = null;
        this.O = -1;
        this.Q = false;
        Paint paint = new Paint();
        this.T = paint;
        this.U = gl.L(3.0f);
        this.V = new o1(this, b);
        this.W = 0.0f;
        this.b0 = 0;
        this.c0 = false;
        this.J = wjbVar;
        this.I = dVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.F = new i46(frameLayout);
        this.L = bkb.Y(bkb.v0(bkb.h6, wjbVar), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        zkb.X(textView, bkb.y6, wjbVar);
        ug8.w(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity(k96.a0 ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        Drawable d = b00.d(context, R.drawable.gradient_bottom);
        int i = bkb.c6;
        zkb.x(this, d, i, wjbVar, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(d);
        addView(frameLayout2, nme.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, nme.e(-1, -1, 55));
        l1 l1Var = new l1(context);
        l1Var.a = false;
        this.n = l1Var;
        zkb.X(l1Var, bkb.m6, wjbVar);
        l1Var.setTextSize(1, 16.0f);
        l1Var.setLines(1);
        l1Var.setMaxLines(1);
        l1Var.setSingleLine(true);
        l1Var.setText(k96.M0(2131751449, null));
        l1Var.setOnClickListener(new j1(this, b));
        l1Var.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r = frameLayout3;
        Drawable d2 = b00.d(context, R.drawable.gradient_left);
        this.w = d2;
        zkb.x(this, d2, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(d2);
        frameLayout3.setPadding(gl.L(4.0f) + frameLayout3.getPaddingLeft(), gl.L(1.0f), 0, gl.L(3.0f));
        frameLayout3.addView(l1Var, nme.c(-2.0f, -2));
        addView(frameLayout3, nme.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / gl.p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / gl.p), 6.0f));
        paint.setColor(bkb.v0(i, wjbVar));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, bkb.O1, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bkb.O1, Math.max(1, i)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (k96.a0) {
            alignment = lwa.a();
        } else {
            Layout.Alignment[] alignmentArr = lwa.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    private void setHeight(int i) {
        e49 e49Var = (e49) getLayoutParams();
        if (e49Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            e49Var = new e49(-1, i);
        } else {
            r1 = ((ViewGroup.MarginLayoutParams) e49Var).height != i;
            ((ViewGroup.MarginLayoutParams) e49Var).height = i;
        }
        if (r1) {
            setLayoutParams(e49Var);
        }
    }

    private void setShowMoreMarginBottom(int i) {
        FrameLayout frameLayout = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i) {
            layoutParams.bottomMargin = i;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i, boolean z) {
        if (this.R) {
            this.c0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.K;
        l1 l1Var = this.n;
        if (spannableStringBuilder != null && (i != this.b0 || z)) {
            StaticLayout c = c(i, spannableStringBuilder);
            this.a = c;
            this.c0 = c.getLineCount() >= 4;
            int lineCount = this.a.getLineCount();
            FrameLayout frameLayout2 = this.r;
            if (lineCount >= 3 && this.c0) {
                int max = Math.max(this.a.getLineStart(2), this.a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i2 = max - 1;
                this.Q = (this.e.charAt(i2) == ' ' || this.e.charAt(i2) == '\n') ? false : true;
                this.M = c(i, this.e.subSequence(0, max));
                this.N = new StaticLayout[this.a.getLineCount() - 3];
                this.P = new Point[this.a.getLineCount() - 3];
                float lineRight = this.M.getLineRight(this.M.getLineCount() - 1);
                boolean z2 = this.Q;
                float f = this.U;
                float f2 = lineRight + (z2 ? f : 0.0f);
                this.O = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i3 = e0;
                    frameLayout2.measure(i3, i3);
                }
                for (int i4 = 3; i4 < this.a.getLineCount(); i4++) {
                    int lineStart = this.a.getLineStart(i4);
                    int lineEnd = this.a.getLineEnd(i4);
                    StaticLayout c2 = c(i, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i5 = i4 - 3;
                    this.N[i5] = c2;
                    this.P[i5] = new Point();
                    if (this.O == -1) {
                        if (f2 > frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                            this.O = i5;
                        }
                    }
                    f2 += c2.getLineRight(0) + f;
                }
                if (f2 < frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                    this.c0 = false;
                }
            }
            if (!this.c0) {
                this.M = null;
                this.N = null;
            }
            this.b0 = i;
            frameLayout.setMinimumHeight(g());
            if (this.c0 && this.M != null) {
                int min = Math.min(d0 + (this.h.getVisibility() == 0 ? gl.L(20.0f) : 0), g()) - gl.L(8.0f);
                StaticLayout staticLayout = this.M;
                setShowMoreMarginBottom((((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - l1Var.getPaddingBottom()) - (l1Var.getLayout() == null ? 0 : l1Var.getLayout().getHeight() - l1Var.getLayout().getLineBottom(l1Var.getLineCount() - 1)));
            }
        }
        l1Var.setVisibility(this.c0 ? 0 : 8);
        if (!this.c0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.L);
        }
        if (!this.c0 || this.W >= 1.0f || frameLayout.getBackground() == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    public final m46 b(StaticLayout staticLayout, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i6);
            float f = i5;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f || lineLeft + staticLayout.getLineWidth(lineForVertical) < f || i6 < 0 || i6 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || gl.A1()) {
                return null;
            }
            m46 m46Var = new m46(clickableSpanArr[0], this.J, i3, i4, 0);
            int v0 = bkb.v0(bkb.Be, this.J);
            RectF rectF = ProfileActivity.Z6;
            m46Var.d(v0);
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            b46 b = m46Var.b();
            float f2 = i2;
            this.y = f2;
            b.d(staticLayout, spanStart, f2);
            staticLayout.getSelectionPath(spanStart, spanEnd, b);
            return m46Var;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f) {
        p1 p1Var = this.G;
        p1 p1Var2 = null;
        if (p1Var != null) {
            p1Var.a(false);
            this.G = null;
        }
        if (layout != null && clickableSpan != null) {
            p1Var2 = new p1(this, layout, clickableSpan, f);
        }
        this.G = p1Var2;
        if (!(clickableSpan instanceof g4c)) {
            if (!(clickableSpan instanceof URLSpan)) {
                clickableSpan.onClick(this);
                return;
            }
            String url = ((URLSpan) clickableSpan).getURL();
            if (!gl.D3(url)) {
                d01.r(getContext(), Uri.parse(url), true, true, this.G);
                return;
            } else {
                ij.o0(this.I, url, true, true, true, false, this.G, null, null);
                return;
            }
        }
        String url2 = ((g4c) clickableSpan).getURL();
        if (url2.startsWith("@") || url2.startsWith("#") || url2.startsWith("$") || url2.startsWith("/")) {
            p1 p1Var3 = this.G;
            ProfileActivity profileActivity = ((eo8) this).f0.e;
            RectF rectF = ProfileActivity.Z6;
            profileActivity.e3(url2, p1Var3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float alpha;
        float alpha2;
        StaticLayout staticLayout;
        float f4;
        float pow;
        int i;
        float f5;
        float f6;
        StaticLayout staticLayout2;
        int i2;
        super.draw(canvas);
        float pow2 = ((View) getParent()) == null ? 1.0f : (float) Math.pow(r0.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(gl.L(10.0f), gl.L(8.0f), getWidth() - gl.L(18.0f), getHeight());
        int L = gl.L(18.0f);
        this.c = L;
        float f7 = 0.0f;
        canvas.translate(L, 0.0f);
        i46 i46Var = this.F;
        if (i46Var != null && i46Var.g(canvas)) {
            invalidate();
        }
        int L2 = gl.L(8.0f);
        this.d = L2;
        canvas.translate(0.0f, L2);
        float f8 = 255.0f;
        try {
            TextPaint textPaint = bkb.O1;
            int v0 = bkb.v0(bkb.Wc, this.J);
            RectF rectF = ProfileActivity.Z6;
            textPaint.linkColor = v0;
            staticLayout = this.M;
        } catch (Exception e) {
            e = e;
            f = pow2;
        }
        try {
            if (staticLayout == null || !this.c0) {
                f = pow2;
                f3 = 0.0f;
                f2 = 255.0f;
                StaticLayout staticLayout3 = this.a;
                if (staticLayout3 != null) {
                    staticLayout3.draw(canvas);
                }
            } else {
                staticLayout.draw(canvas);
                int lineCount = this.M.getLineCount() - 1;
                float lineTop = this.M.getLineTop(lineCount) + this.M.getTopPadding();
                float lineRight = this.M.getLineRight(lineCount);
                boolean z = this.Q;
                float f9 = this.U;
                float f10 = lineRight + (z ? f9 : 0.0f);
                float lineBottom = (this.M.getLineBottom(lineCount) - this.M.getLineTop(lineCount)) - this.M.getBottomPadding();
                float pow3 = 1.0f - ((float) Math.pow(this.W, 0.25d));
                if (pow3 < 0.5d) {
                    pow = yjb.C(pow3, 4.0f, pow3, pow3);
                    f4 = 1.0f;
                    f = pow2;
                } else {
                    f4 = 1.0f;
                    f = pow2;
                    try {
                        pow = 1.0f - (((float) Math.pow((pow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                    } catch (Exception e2) {
                        e = e2;
                        f3 = f7;
                        f2 = f8;
                        fa4.g(e, true);
                        canvas.restore();
                        FrameLayout frameLayout = this.r;
                        alpha = frameLayout.getAlpha();
                        if (alpha > f3) {
                        }
                        FrameLayout frameLayout2 = this.s;
                        alpha2 = frameLayout2.getAlpha();
                        if (alpha2 > f3) {
                        }
                        this.K.draw(canvas);
                    }
                }
                float f11 = pow;
                if (this.N != null) {
                    float f12 = f10;
                    int i3 = 0;
                    while (true) {
                        StaticLayout[] staticLayoutArr = this.N;
                        if (i3 >= staticLayoutArr.length) {
                            break;
                        }
                        StaticLayout staticLayout4 = staticLayoutArr[i3];
                        if (staticLayout4 != null) {
                            int save = canvas.save();
                            Point point = this.P[i3];
                            if (point != null) {
                                point.set((int) ((f12 * f11) + this.c), (int) (((f4 - f11) * lineBottom) + this.d + lineTop));
                            }
                            int i4 = this.O;
                            if (i4 == -1 || i4 > i3) {
                                i = i3;
                                f5 = f7;
                                f6 = f8;
                                staticLayout2 = staticLayout4;
                                i2 = save;
                                canvas.translate(f12 * f11, ((f4 - f11) * lineBottom) + lineTop);
                            } else {
                                canvas.translate(f7, lineTop + lineBottom);
                                float width = staticLayout4.getWidth();
                                float height = staticLayout4.getHeight();
                                int i5 = (int) (this.W * f8);
                                i = i3;
                                f5 = f7;
                                staticLayout2 = staticLayout4;
                                f6 = f8;
                                i2 = save;
                                canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i5, 31);
                            }
                            staticLayout2.draw(canvas);
                            canvas.restoreToCount(i2);
                            lineBottom += (staticLayout2.getLineBottom(0) + staticLayout2.getTopPadding()) - 1;
                            f12 = staticLayout2.getLineRight(0) + f9 + f12;
                        } else {
                            i = i3;
                            f5 = f7;
                            f6 = f8;
                        }
                        i3 = i + 1;
                        f7 = f5;
                        f8 = f6;
                    }
                }
                f3 = f7;
                f2 = f8;
            }
        } catch (Exception e3) {
            e = e3;
            fa4.g(e, true);
            canvas.restore();
            FrameLayout frameLayout3 = this.r;
            alpha = frameLayout3.getAlpha();
            if (alpha > f3) {
            }
            FrameLayout frameLayout22 = this.s;
            alpha2 = frameLayout22.getAlpha();
            if (alpha2 > f3) {
            }
            this.K.draw(canvas);
        }
        canvas.restore();
        FrameLayout frameLayout32 = this.r;
        alpha = frameLayout32.getAlpha();
        if (alpha > f3) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f2), 31);
            this.w.setAlpha((int) (f * f2));
            canvas.translate(frameLayout32.getLeft(), frameLayout32.getTop());
            frameLayout32.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout222 = this.s;
        alpha2 = frameLayout222.getAlpha();
        if (alpha2 > f3) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f2), 31);
            canvas.translate(frameLayout222.getLeft(), frameLayout222.getTop());
            frameLayout222.draw(canvas);
            canvas.restore();
        }
        this.K.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.F.e(true);
        this.x = null;
        gl.r(this.V);
        invalidate();
    }

    public final void f(String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.b)) {
            return;
        }
        try {
            str3 = gl.U.matcher(str).replaceAll("\u200c");
        } catch (Throwable unused) {
            str3 = str;
        }
        try {
            this.b = str3;
        } catch (Throwable unused2) {
            this.b = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        this.e = spannableStringBuilder;
        this.f = null;
        k27.e(false, spannableStringBuilder, false, false, !z);
        vu3.l(this.e, bkb.O1.getFontMetricsInt(), false);
        int i = this.b0;
        if (i <= 0) {
            i = gl.q.x - gl.L(36.0f);
            this.b0 = i;
        }
        a(i, true);
        i();
        TextView textView = this.h;
        int visibility = textView.getVisibility();
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (visibility != textView.getVisibility()) {
            a(this.b0, true);
        }
        requestLayout();
    }

    public final int g() {
        StaticLayout staticLayout = this.a;
        int L = gl.L(16.0f) + (staticLayout != null ? staticLayout.getHeight() : gl.L(20.0f));
        return this.h.getVisibility() == 0 ? gl.L(23.0f) + L : L;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a0 = null;
        }
        float f = this.W;
        g();
        Typeface typeface = gl.a;
        this.a0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        float abs = Math.abs(f - 1.0f) * 1250.0f * 2.0f;
        r1 r1Var = new r1();
        r1Var.a = 0.0f;
        r1Var.b = 0.0f;
        this.a0.addUpdateListener(new k1(this, new AtomicReference(Float.valueOf(f)), f, 1.0f, r1Var));
        this.a0.addListener(new g0(this, (byte) 1));
        this.a0.setDuration((long) abs);
        this.a0.start();
    }

    public final int i() {
        int g = g();
        float min = Math.min(d0 + (this.h.getVisibility() == 0 ? gl.L(20.0f) : 0), g());
        if (this.c0) {
            g = (int) gl.R1(min, g, this.W);
        }
        setHeight(g);
        return g;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            byte b = 0;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                        spannableStringBuilder = this.e;
                        this.f = spannableStringBuilder;
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new q1(this, clickableSpan, b), spanStart, spanEnd, 33);
                            }
                        }
                        this.f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    }
                }
            }
            CharSequence text = this.h.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a(View.MeasureSpec.getSize(i) - gl.L(36.0f), false);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i(), TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r6 <= r1.getBottom()) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r10 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var;
        m46 b;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        l1 l1Var = this.n;
        if (l1Var.getVisibility() == 0) {
            FrameLayout frameLayout = this.r;
            if (x >= frameLayout.getLeft()) {
                if (x <= frameLayout.getRight()) {
                    if (y >= frameLayout.getTop()) {
                    }
                }
            }
        }
        if (this.a != null || this.N != null) {
            if (motionEvent.getAction() == 0 || (this.x != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    e();
                    if ((x < l1Var.getLeft() || x > l1Var.getRight() || y < l1Var.getTop() || y > l1Var.getBottom()) && (getMeasuredWidth() <= 0 || x <= getMeasuredWidth() - gl.L(18.0f))) {
                        StaticLayout staticLayout = this.M;
                        if (staticLayout == null || this.W >= 1.0f || !this.c0) {
                            s1Var = this;
                        } else {
                            s1Var = this;
                            b = s1Var.b(staticLayout, this.c, this.d, x, y);
                            if (b == null) {
                                if (s1Var.N != null) {
                                    int i = 0;
                                    while (true) {
                                        StaticLayout[] staticLayoutArr = s1Var.N;
                                        if (i >= staticLayoutArr.length) {
                                            break;
                                        }
                                        StaticLayout staticLayout2 = staticLayoutArr[i];
                                        Point point = s1Var.P[i];
                                        m46 b2 = s1Var.b(staticLayout2, point.x, point.y, x, y);
                                        if (b2 != null) {
                                            b = b2;
                                            break;
                                        }
                                        i++;
                                    }
                                }
                            }
                            if (b != null) {
                                s1Var.E = s1Var.a;
                                s1Var.x = b;
                                s1Var.F.a(b, null);
                                gl.d3(s1Var.V, ViewConfiguration.getLongPressTimeout());
                                return true;
                            }
                            if (!super.onTouchEvent(motionEvent)) {
                                return true;
                            }
                        }
                        b = s1Var.b(s1Var.a, s1Var.c, s1Var.d, x, y);
                    } else {
                        s1Var = this;
                    }
                    b = null;
                    if (b != null) {
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    s1Var = this;
                    m46 m46Var = s1Var.x;
                    if (m46Var != null) {
                        try {
                            s1Var.d((ClickableSpan) m46Var.i, s1Var.a, s1Var.y);
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        s1Var.e();
                        return true;
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                }
                return false;
            }
            if (motionEvent.getAction() == 3) {
                e();
            }
        }
        s1Var = this;
        if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
    }

    public void setMoreButtonDisabled(boolean z) {
        this.R = z;
    }

    @Override // tjb
    public final void updateColors() {
        TextPaint textPaint = bkb.O1;
        int i = bkb.Wc;
        wjb wjbVar = this.J;
        int v0 = bkb.v0(i, wjbVar);
        RectF rectF = ProfileActivity.Z6;
        textPaint.linkColor = v0;
        try {
            int v02 = bkb.v0(bkb.h6, wjbVar);
            ff0 ff0Var = this.L;
            if (ff0Var != null && v02 != this.S) {
                this.S = v02;
                bkb.F1(ff0Var, v02, true);
            }
            this.T.setColor(bkb.v0(bkb.c6, wjbVar));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
