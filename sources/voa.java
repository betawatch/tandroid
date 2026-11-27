// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class voa extends FrameLayout {
    public final uj4 E;
    public final String F;
    public final String G;
    public String H;
    public final RectF I;
    public final RectF J;
    public final Path K;
    public final mm L;
    public final mm M;
    public final mm N;
    public final mm O;
    public final Path P;
    public final PathMeasure Q;
    public final Path R;
    public final Paint S;
    public long T;
    public final v41 U;
    public float V;
    public long W;
    public final String a;
    public boolean a0;
    public String b;
    public boolean b0;
    public Drawable c;
    public boolean c0;
    public final boolean d;
    public boolean d0;
    public String e;
    public boolean e0;
    public boolean f;
    public float f0;
    public final String[] g0;
    public final nm3 h;
    public final View h0;
    public kba i0;
    public final og2 n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public voa(Context context, String str, String str2, boolean z, boolean z2) {
        super(context);
        Paint paint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        this.y = new TextPaint(1);
        uj4 uj4Var = new uj4(this);
        this.E = uj4Var;
        k43 k43Var = k43.h;
        mm mmVar = new mm(this, 0L, 320L, k43Var);
        String M0 = ob6.M0(2131744983, null);
        this.F = M0;
        this.G = ob6.M0(2131744929, null);
        this.H = M0;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new Path();
        mm mmVar2 = new mm(this, 0L, 300L, k43Var);
        this.L = mmVar2;
        mm mmVar3 = new mm(this, 0L, 420L, k43Var);
        this.M = mmVar3;
        mm mmVar4 = new mm(this, 0L, 420L, k43Var);
        this.N = mmVar4;
        this.O = new mm(this, 0L, 380L, k43Var);
        this.P = new Path();
        this.Q = new PathMeasure();
        this.R = new Path();
        this.S = new Paint(1);
        this.U = new v41(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = z;
        this.f = z2;
        nm3 N = str != null ? DictationAsr.N(str) : null;
        this.h = N;
        String[] d = N != null ? N.d(str) : new String[0];
        this.g0 = d;
        if (d.length > 1) {
            View view = new View(context);
            this.h0 = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = bn3.R(DictationAsr.i0(N, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(hl.L(16.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(hl.N(2.0f));
        textPaint2.setTextSize(hl.L(14.0f));
        uj4Var.w(hl.L(14.0f));
        uj4Var.m(0.3f, 400L, 6.0f, k43Var);
        uj4Var.B = 0.2f;
        uj4Var.K = true;
        uj4Var.b = ob6.a0 ? 5 : 3;
        textPaint2.setTypeface(hl.o());
        og2 og2Var = new og2(26, null, context);
        this.n = og2Var;
        og2Var.setDrawUnchecked(false);
        og2Var.b(-1, -1, aob.Fi);
        og2Var.setDrawBackgroundAsArc(-1);
        addView(og2Var, tre.d(26, 26.0f, (ob6.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        og2Var.setImportantForAccessibility(2);
        View view2 = this.h0;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        e();
        mmVar2.e(true, this.f0);
        float f = 1.0f;
        mmVar.e(true, this.a0 ? 0.0f : 1.0f);
        mmVar3.e(true, c() ? 0.0f : 1.0f);
        if (!this.b0 && !d() && c()) {
            f = 0.0f;
        }
        mmVar4.e(true, f);
    }

    public final float a() {
        float L = hl.L(16.0f);
        TextPaint textPaint = this.r;
        textPaint.setTextSize(L);
        this.y.setTextSize(hl.L(14.0f));
        float measureText = textPaint.measureText(this.b);
        if (getWidth() > 0) {
            String str = this.F;
            TextPaint textPaint2 = this.x;
            float width = ((((getWidth() - hl.L(21.0f)) - (this.h0 != null ? hl.L(18.0f) : 0)) - hl.L(21.0f)) - (Math.max(textPaint2.measureText(str), textPaint2.measureText(this.G)) + hl.L(28.0f))) - hl.L(17.0f);
            if (measureText > width && width > 0.0f) {
                textPaint.setTextSize(Math.max(0.6f, width / measureText) * hl.L(16.0f));
                return textPaint.measureText(this.b);
            }
        }
        return measureText;
    }

    public final void b() {
        if (this.b0) {
            return;
        }
        if (!this.a0) {
            DictationAsr.t(this.h);
        } else if (this.c0) {
            this.d0 = true;
            nm3 g0 = DictationAsr.g0(this.a);
            if (g0 != null && DictationAsr.z(g0)) {
                DictationAsr.u(g0, true);
            }
        }
        e();
    }

    public final boolean c() {
        return !this.a0 || this.c0 || this.b0 || d();
    }

    public final boolean d() {
        return this.T != 0 && SystemClock.uptimeMillis() - this.T < 1800;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        nm3 nm3Var;
        String str;
        boolean z4;
        nm3 nm3Var2;
        if (this.h0 != null) {
            String R = bn3.R(DictationAsr.i0(this.h, this.a));
            if (!R.equals(this.b)) {
                this.b = R;
                requestLayout();
            }
        }
        boolean z5 = this.b0;
        boolean z6 = this.a0;
        byte b = 0;
        if (this.h == null) {
            this.a0 = true;
            this.e0 = DictationAsr.y();
        } else {
            String str2 = this.a;
            nm3[] O = DictationAsr.O();
            int length = O.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                nm3 nm3Var3 = O[i];
                if (nm3Var3.c(str2) && DictationAsr.z(nm3Var3)) {
                    z = true;
                    break;
                }
                i++;
            }
            this.a0 = z;
            this.e0 = z && !DictationAsr.y() && DictationAsr.A(this.a);
        }
        if (this.h != null) {
            String str3 = this.a;
            for (nm3 nm3Var4 : DictationAsr.O()) {
                if (nm3Var4.c(str3) && nm3Var4.j) {
                    if (!this.a0 || this.d0) {
                        z2 = true;
                        this.b0 = z2;
                        this.c0 = (this.a0 || z2 || DictationAsr.g0(this.a) == null) ? false : true;
                        if (c() && !this.b0) {
                            this.H = !this.a0 ? this.G : this.F;
                        }
                        this.e = (this.d || (nm3Var2 = this.h) == null || nm3Var2.e <= 0) ? null : hl.i0(this.h.e, false, false);
                        if (this.h != null) {
                            String str4 = this.a;
                            f = 0.0f;
                            for (nm3 nm3Var5 : DictationAsr.O()) {
                                if (nm3Var5.c(str4) && nm3Var5.j) {
                                    f = Math.max(f, nm3Var5.k);
                                }
                            }
                        } else {
                            f = 0.0f;
                        }
                        this.f0 = f;
                        if (z5 && !this.b0 && this.a0 && isAttachedToWindow()) {
                            this.T = SystemClock.uptimeMillis();
                            postDelayed(new uoa(this, b), 1820L);
                        }
                        z3 = this.b0;
                        if (z3) {
                            this.T = 0L;
                        }
                        if (z6 && !this.a0 && !z3) {
                            this.T = 0L;
                            this.O.e(true, 0.0f);
                            this.N.e(true, 0.0f);
                        }
                        this.n.a(this.e0, (isAttachedToWindow() || d()) ? false : true);
                        nm3Var = this.h;
                        if (nm3Var != null) {
                            if (this.b0) {
                                str = ob6.a0(null, null, 2131744972, Integer.valueOf(Math.round(this.f0 * 100.0f)));
                            } else if (this.a0) {
                                str = ob6.M0(2131744973, null);
                            } else if (nm3Var.e > 0) {
                                str = hl.i0(this.h.e, false, false);
                            }
                            uj4 uj4Var = this.E;
                            if (str == null) {
                                str = "";
                            }
                            uj4Var.t(str, (isAttachedToWindow() || ob6.a0) ? false : true, true);
                            if (z5 && !this.b0 && this.a0 && isAttachedToWindow() && hl.A1()) {
                                announceForAccessibility(ob6.a0(null, null, 2131744997, this.b));
                            }
                            z4 = this.a0;
                            if (z4 != (getBackground() != null)) {
                                setBackground(z4 ? aob.L0(false) : null);
                            }
                            invalidate();
                        }
                        str = null;
                        uj4 uj4Var2 = this.E;
                        if (str == null) {
                        }
                        uj4Var2.t(str, (isAttachedToWindow() || ob6.a0) ? false : true, true);
                        if (z5) {
                            announceForAccessibility(ob6.a0(null, null, 2131744997, this.b));
                        }
                        z4 = this.a0;
                        if (z4 != (getBackground() != null)) {
                        }
                        invalidate();
                    }
                    z2 = false;
                    this.b0 = z2;
                    this.c0 = (this.a0 || z2 || DictationAsr.g0(this.a) == null) ? false : true;
                    if (c()) {
                        this.H = !this.a0 ? this.G : this.F;
                    }
                    this.e = (this.d || (nm3Var2 = this.h) == null || nm3Var2.e <= 0) ? null : hl.i0(this.h.e, false, false);
                    if (this.h != null) {
                    }
                    this.f0 = f;
                    if (z5) {
                        this.T = SystemClock.uptimeMillis();
                        postDelayed(new uoa(this, b), 1820L);
                    }
                    z3 = this.b0;
                    if (z3) {
                    }
                    if (z6) {
                        this.T = 0L;
                        this.O.e(true, 0.0f);
                        this.N.e(true, 0.0f);
                    }
                    this.n.a(this.e0, (isAttachedToWindow() || d()) ? false : true);
                    nm3Var = this.h;
                    if (nm3Var != null) {
                    }
                    str = null;
                    uj4 uj4Var22 = this.E;
                    if (str == null) {
                    }
                    uj4Var22.t(str, (isAttachedToWindow() || ob6.a0) ? false : true, true);
                    if (z5) {
                    }
                    z4 = this.a0;
                    if (z4 != (getBackground() != null)) {
                    }
                    invalidate();
                }
            }
        }
        this.d0 = false;
        z2 = false;
        this.b0 = z2;
        this.c0 = (this.a0 || z2 || DictationAsr.g0(this.a) == null) ? false : true;
        if (c()) {
        }
        this.e = (this.d || (nm3Var2 = this.h) == null || nm3Var2.e <= 0) ? null : hl.i0(this.h.e, false, false);
        if (this.h != null) {
        }
        this.f0 = f;
        if (z5) {
        }
        z3 = this.b0;
        if (z3) {
        }
        if (z6) {
        }
        this.n.a(this.e0, (isAttachedToWindow() || d()) ? false : true);
        nm3Var = this.h;
        if (nm3Var != null) {
        }
        str = null;
        uj4 uj4Var222 = this.E;
        if (str == null) {
        }
        uj4Var222.t(str, (isAttachedToWindow() || ob6.a0) ? false : true, true);
        if (z5) {
        }
        z4 = this.a0;
        if (z4 != (getBackground() != null)) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        float f;
        float f2;
        float L2;
        boolean z;
        float f3;
        int i;
        boolean z2 = ob6.a0;
        int w0 = aob.w0(null, aob.Fi, false);
        if (this.h == null) {
            f = 25.0f;
            L = hl.L(25.0f);
        } else {
            L = hl.L(32.0f);
            f = 21.5f;
        }
        float L3 = hl.L(f);
        int i2 = aob.G6;
        int w02 = aob.w0(null, i2, false);
        TextPaint textPaint = this.r;
        textPaint.setColor(w02);
        int w03 = aob.w0(null, aob.z6, false);
        TextPaint textPaint2 = this.y;
        textPaint2.setColor(w03);
        float a = a();
        float textSize = ((textPaint.getTextSize() * hl.L(5.5f)) / hl.L(16.0f)) + L3;
        String str = this.b;
        if (z2) {
            f2 = 5.5f;
            L2 = (getWidth() - hl.L(21.0f)) - a;
        } else {
            f2 = 5.5f;
            L2 = hl.L(21.0f);
        }
        canvas.drawText(str, L2, textSize, textPaint);
        if (this.h0 != null) {
            Drawable drawable = this.c;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                this.c = drawable;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(aob.w0(null, i2, false), PorterDuff.Mode.MULTIPLY));
            float width = z2 ? ((getWidth() - hl.L(21.0f)) - a) - hl.L(11.0f) : hl.L(21.0f) + a + hl.L(11.0f);
            int L4 = hl.L(16.0f);
            float f4 = L4 / 2.0f;
            float f5 = width - f4;
            float f6 = L3 - f4;
            this.c.setBounds(Math.round(f5), Math.round(f6), Math.round(f5) + L4, Math.round(f6) + L4);
            this.c.draw(canvas);
        }
        float L5 = hl.L(c() ? 130.0f : 64.0f);
        int color = textPaint2.getColor();
        uj4 uj4Var = this.E;
        uj4Var.u(color);
        uj4Var.o(z2 ? L5 : hl.L(21.0f), hl.L(43.0f) - hl.L(12.0f), z2 ? getWidth() - hl.L(21.0f) : getWidth() - L5, hl.L(12.0f) + hl.L(43.0f));
        uj4Var.draw(canvas);
        float d = this.M.d(!c());
        float d2 = this.N.d(this.b0 || d() || !c());
        float e = this.L.e(false, this.f0);
        float d3 = this.O.d(this.T != 0);
        this.n.setAlpha(d);
        if (d < 1.0f) {
            String str2 = this.H;
            TextPaint textPaint3 = this.x;
            float measureText = textPaint3.measureText(str2);
            float L6 = hl.L(30.0f);
            float R1 = hl.R1(hl.L(28.0f) + measureText, L6, d2);
            float L7 = z2 ? hl.L(17.0f) + R1 : getWidth() - hl.L(17.0f);
            float f7 = L6 / 2.0f;
            RectF rectF = this.J;
            rectF.set(L7 - R1, L - f7, L7, L + f7);
            float f8 = 1.0f - (d * d);
            float a2 = this.U.a(0.08f) * (1.0f - d);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            int p1 = aob.p1(f8, w0);
            Paint paint = this.w;
            paint.setColor(p1);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            int w04 = aob.w0(null, aob.Ji, false);
            canvas.save();
            Path path = this.K;
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            float L8 = hl.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(aob.p1((1.0f - d2) * f8, w04));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L8);
                z = z2;
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText(this.H, rectF.centerX() - (measureText / 2.0f), rectF.centerY() + hl.L(5.0f), textPaint3);
                canvas.restore();
            } else {
                z = z2;
            }
            int i3 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i3 > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                i = i3;
                if (this.W != 0) {
                    this.V = (((uptimeMillis - r7) * 0.36f) + this.V) % 360.0f;
                }
                this.W = uptimeMillis;
                float L9 = hl.L(8.0f);
                float A = qd4.A(1.0f, d2, L8, rectF.centerY());
                float centerX = rectF.centerX() - L9;
                float f9 = A - L9;
                float centerX2 = rectF.centerX() + L9;
                float f10 = A + L9;
                RectF rectF2 = this.I;
                rectF2.set(centerX, f9, centerX2, f10);
                if (d3 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - (d3 * 0.5f);
                    canvas.scale(f11, f11, rectF2.centerX(), rectF2.centerY());
                    int p12 = aob.p1((1.0f - d3) * d2 * f8, w04);
                    Paint paint2 = this.s;
                    paint2.setColor(p12);
                    canvas.drawArc(rectF2, this.V - 90.0f, Math.max(0.1f, Math.min(0.9f, e)) * 360.0f, false, paint2);
                    canvas.restore();
                }
                if (d3 > 0.0f) {
                    float centerX3 = rectF.centerX();
                    float centerY = rectF.centerY();
                    Path path2 = this.P;
                    path2.rewind();
                    path2.moveTo(centerX3 - hl.L(f2), hl.L(0.5f) + centerY);
                    path2.lineTo(centerX3 - hl.L(1.75f), hl.L(4.25f) + centerY);
                    path2.lineTo(centerX3 + hl.L(5.75f), centerY - hl.L(3.75f));
                    PathMeasure pathMeasure = this.Q;
                    pathMeasure.setPath(path2, false);
                    Path path3 = this.R;
                    path3.rewind();
                    pathMeasure.getSegment(0.0f, pathMeasure.getLength() * d3, path3, true);
                    Paint.Style style = Paint.Style.STROKE;
                    Paint paint3 = this.S;
                    paint3.setStyle(style);
                    paint3.setStrokeWidth(hl.N(2.33f));
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setColor(aob.p1(f8, w04));
                    canvas.drawPath(path3, paint3);
                }
            } else {
                i = i3;
            }
            canvas.restore();
            canvas.restore();
            f3 = 0.0f;
            if (i > 0 || d > 0.0f || d3 > 0.0f) {
                invalidate();
            }
        } else {
            z = z2;
            f3 = 0.0f;
            this.W = 0L;
        }
        if (this.f) {
            float L10 = z ? f3 : hl.L(21.0f);
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z) {
                width2 -= hl.L(21.0f);
            }
            canvas.drawLine(L10, height, width2, getHeight() - 1, aob.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder(this.b);
        if (this.e != null && !this.a0) {
            sb.append(", ");
            sb.append(this.e);
        }
        boolean z = false;
        if (this.b0) {
            sb.append(", ");
            sb.append(ob6.a0(null, null, 2131744996, Integer.valueOf(Math.round(this.f0 * 100.0f))));
        } else if (!this.a0) {
            sb.append(", ");
            sb.append(ob6.M0(2131744995, null));
        } else if (this.c0) {
            sb.append(", ");
            sb.append(ob6.M0(2131744994, null));
        }
        accessibilityNodeInfo.setText(sb);
        accessibilityNodeInfo.setClassName(this.a0 ? "android.widget.CheckBox" : "android.widget.Button");
        accessibilityNodeInfo.setCheckable(this.a0);
        if (this.a0 && this.e0) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
        if (!this.a0 && !this.b0) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.F));
        }
        if (this.c0) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_update, this.G));
        }
        if (this.h0 == null || this.i0 == null) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_variants, ob6.M0(2131744993, null)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.h0;
        if (view != null) {
            int a = (int) (a() + hl.L(18.0f));
            int L = hl.L(34.0f);
            int round = Math.round(hl.L(this.h == null ? 25.0f : 21.5f) - (L / 2.0f));
            int x = ob6.a0 ? qu6.x(21.0f, getWidth(), a) : hl.L(21.0f);
            view.layout(x - hl.L(6.0f), round, hl.L(6.0f) + x + a, L + round);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.h == null ? 50.0f : 64.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r0 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r2.i != false) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v41 v41Var = this.U;
        if (action == 1) {
            float x = motionEvent.getX();
            if (this.h0 != null && this.i0 != null && x >= r5.getLeft() - hl.L(8.0f)) {
                if (x <= hl.L(8.0f) + r5.getRight() && !v41Var.i) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    this.i0.run();
                    return true;
                }
            }
        }
        RectF rectF = this.J;
        if (action == 0) {
            boolean z = c() && !this.b0 && rectF.contains(motionEvent.getX(), motionEvent.getY());
            v41Var.c(z);
        } else {
            if (action != 2) {
                if (action == 1 || action == 3) {
                    boolean z2 = v41Var.i;
                    v41Var.c(false);
                    if (z2) {
                        if (action == 1) {
                            performHapticFeedback(3);
                            b();
                            return true;
                        }
                    }
                }
                return v41Var.i || super.onTouchEvent(motionEvent);
            }
            if (v41Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                v41Var.c(false);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        kba kbaVar;
        if (i == R.id.acc_action_speech_update && this.c0) {
            b();
            return true;
        }
        if (i != R.id.acc_action_speech_variants || this.h0 == null || (kbaVar = this.i0) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        kbaVar.run();
        return true;
    }
}
