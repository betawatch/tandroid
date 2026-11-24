// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zma extends FrameLayout {
    public final String E;
    public String F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public final ln J;
    public final ln K;
    public final ln L;
    public final u51 M;
    public float N;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public final String[] V;
    public final View W;
    public final String a;
    public e6a a0;
    public String b;
    public final Paint c;
    public final String d;
    public final boolean e;
    public final gn3 f;
    public final jh2 h;
    public final TextPaint n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final String y;

    public zma(Context context, String str, String str2, String str3, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.r = textPaint2;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.x = textPaint3;
        String M0 = jb6.M0(2131744994, null);
        this.y = M0;
        this.E = jb6.M0(2131744961, null);
        this.F = M0;
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        d53 d53Var = d53.h;
        ln lnVar = new ln(this, 0L, 300L, d53Var);
        this.J = lnVar;
        ln lnVar2 = new ln(this, 0L, 420L, d53Var);
        this.K = lnVar2;
        ln lnVar3 = new ln(this, 0L, 420L, d53Var);
        this.L = lnVar3;
        this.M = new u51(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = z;
        gn3 L = str != null ? DictationAsr.L(str) : null;
        this.f = L;
        String[] d = L != null ? L.d(str) : new String[0];
        this.V = d;
        if (d.length > 1) {
            View view = new View(context);
            this.W = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = un3.N(DictationAsr.g0(L, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(gm.L(16.0f));
        textPaint2.setTextSize(gm.L(14.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gm.N(2.0f));
        textPaint3.setTextSize(gm.L(14.0f));
        textPaint3.setTypeface(gm.o());
        jh2 jh2Var = new jh2(26, null, context);
        this.h = jh2Var;
        jh2Var.setDrawUnchecked(false);
        jh2Var.b(-1, -1, cmb.Ei);
        jh2Var.setDrawBackgroundAsArc(-1);
        addView(jh2Var, qoe.d(26, 26.0f, (jb6.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        jh2Var.setImportantForAccessibility(2);
        View view2 = this.W;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        c();
        lnVar.e(true, this.U);
        float f = 1.0f;
        lnVar2.e(true, b() ? 0.0f : 1.0f);
        if (!this.Q && b()) {
            f = 0.0f;
        }
        lnVar3.e(true, f);
    }

    public final void a() {
        if (this.Q) {
            return;
        }
        if (!this.P) {
            DictationAsr.s(this.f);
        } else if (this.R) {
            this.S = true;
            gn3 e0 = DictationAsr.e0(this.a);
            if (e0 != null && DictationAsr.y(e0)) {
                DictationAsr.t(e0, true);
            }
        }
        c();
    }

    public final boolean b() {
        return !this.P || this.R || this.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.W != null) {
            String N = un3.N(DictationAsr.g0(this.f, this.a));
            if (!N.equals(this.b)) {
                this.b = N;
                requestLayout();
            }
        }
        boolean z4 = this.Q;
        if (this.f == null) {
            this.P = true;
            this.T = DictationAsr.x();
        } else {
            String str = this.a;
            gn3[] M = DictationAsr.M();
            int length = M.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                gn3 gn3Var = M[i];
                if (gn3Var.c(str) && DictationAsr.y(gn3Var)) {
                    z = true;
                    break;
                }
                i++;
            }
            this.P = z;
            this.T = z && !DictationAsr.x() && DictationAsr.z(this.a);
        }
        if (this.f != null) {
            String str2 = this.a;
            for (gn3 gn3Var2 : DictationAsr.M()) {
                if (gn3Var2.c(str2) && gn3Var2.j) {
                    if (!this.P || this.S) {
                        z2 = true;
                        this.Q = z2;
                        this.R = (this.P || z2 || DictationAsr.e0(this.a) == null) ? false : true;
                        if (b() && !this.Q) {
                            this.F = !this.P ? this.E : this.y;
                        }
                        float f = 0.0f;
                        if (this.f != null) {
                            String str3 = this.a;
                            for (gn3 gn3Var3 : DictationAsr.M()) {
                                if (gn3Var3.c(str3) && gn3Var3.j) {
                                    f = Math.max(f, gn3Var3.k);
                                }
                            }
                        }
                        this.U = f;
                        this.h.a(this.T, isAttachedToWindow());
                        if (z4 && !this.Q && this.P && isAttachedToWindow() && gm.A1()) {
                            announceForAccessibility(jb6.a0(null, null, 2131745005, this.b));
                        }
                        z3 = this.P;
                        if (z3 != (getBackground() != null)) {
                            setBackground(z3 ? cmb.L0(false) : null);
                        }
                        invalidate();
                    }
                    z2 = false;
                    this.Q = z2;
                    this.R = (this.P || z2 || DictationAsr.e0(this.a) == null) ? false : true;
                    if (b()) {
                        this.F = !this.P ? this.E : this.y;
                    }
                    float f2 = 0.0f;
                    if (this.f != null) {
                    }
                    this.U = f2;
                    this.h.a(this.T, isAttachedToWindow());
                    if (z4) {
                        announceForAccessibility(jb6.a0(null, null, 2131745005, this.b));
                    }
                    z3 = this.P;
                    if (z3 != (getBackground() != null)) {
                    }
                    invalidate();
                }
            }
        }
        this.S = false;
        z2 = false;
        this.Q = z2;
        this.R = (this.P || z2 || DictationAsr.e0(this.a) == null) ? false : true;
        if (b()) {
        }
        float f22 = 0.0f;
        if (this.f != null) {
        }
        this.U = f22;
        this.h.a(this.T, isAttachedToWindow());
        if (z4) {
        }
        z3 = this.P;
        if (z3 != (getBackground() != null)) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        boolean z = jb6.a0;
        int w0 = cmb.w0(null, cmb.y6, false);
        int w02 = cmb.w0(null, cmb.Ei, false);
        float L = gm.L(25.0f);
        int w03 = cmb.w0(null, cmb.F6, false);
        TextPaint textPaint = this.n;
        textPaint.setColor(w03);
        TextPaint textPaint2 = this.r;
        textPaint2.setColor(w0);
        float measureText = textPaint.measureText(this.b);
        float L2 = L + gm.L(5.5f);
        canvas2.drawText(this.b, z ? (getWidth() - gm.L(21.0f)) - measureText : gm.L(21.0f), L2, textPaint);
        if (this.W != null) {
            Paint paint = this.c;
            paint.setColor(w0);
            float width = z ? ((getWidth() - gm.L(21.0f)) - measureText) - gm.L(12.0f) : gm.L(21.0f) + measureText + gm.L(12.0f);
            canvas2.drawLine(width - gm.L(4.5f), L - gm.L(2.0f), width, gm.L(2.5f) + L, paint);
            canvas2 = canvas;
            canvas2.drawLine(width, L + gm.L(2.5f), width + gm.L(4.5f), L - gm.L(2.0f), paint);
            measureText += gm.L(18.0f);
        }
        String str = this.d;
        if (str != null) {
            canvas2.drawText(str, z ? (((getWidth() - gm.L(21.0f)) - measureText) - gm.L(8.0f)) - textPaint2.measureText(str) : gm.L(8.0f) + gm.L(21.0f) + measureText, L2, textPaint2);
        }
        float d = this.K.d(!b());
        float d2 = this.L.d(this.Q || !b());
        float e = this.J.e(false, this.U);
        this.h.setAlpha(d);
        if (d < 1.0f) {
            String str2 = this.F;
            TextPaint textPaint3 = this.x;
            float measureText2 = textPaint3.measureText(str2);
            f = 21.0f;
            float L3 = gm.L(28.0f) + measureText2;
            float L4 = gm.L(30.0f);
            float L5 = z ? gm.L(17.0f) + L3 : getWidth() - gm.L(17.0f);
            float f3 = L4 / 2.0f;
            RectF rectF = this.H;
            rectF.set(L5 - L3, L - f3, L5, L + f3);
            float f4 = 1.0f - d;
            float a = this.M.a(0.08f) * (1.0f - (d * 0.2f));
            canvas2.save();
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            int p1 = cmb.p1(f4, w02);
            Paint paint2 = this.w;
            paint2.setColor(p1);
            canvas2.drawRoundRect(rectF, f3, f3, paint2);
            int w04 = cmb.w0(null, cmb.Ii, false);
            canvas2.save();
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            canvas2.clipPath(path);
            float L6 = gm.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(cmb.p1((1.0f - d2) * f4, w04));
                canvas2.save();
                canvas2.translate(0.0f, (-d2) * L6);
                canvas2.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas2.drawText(this.F, rectF.centerX() - (measureText2 / 2.0f), rectF.centerY() + gm.L(5.0f), textPaint3);
                canvas2.restore();
            }
            if (d2 > 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.O != 0) {
                    this.N = (((uptimeMillis - r5) * 0.36f) + this.N) % 360.0f;
                }
                this.O = uptimeMillis;
                float L7 = gm.L(8.0f);
                float A = td4.A(1.0f, d2, L6, rectF.centerY());
                RectF rectF2 = this.G;
                rectF2.set(rectF.centerX() - L7, A - L7, rectF.centerX() + L7, A + L7);
                int p12 = cmb.p1(d2 * f4, w04);
                Paint paint3 = this.s;
                paint3.setColor(p12);
                canvas2.drawArc(rectF2, this.N - 90.0f, Math.max(0.1f, Math.min(0.9f, e)) * 360.0f, false, paint3);
            }
            canvas.restore();
            canvas.restore();
            f2 = 0.0f;
            if (d2 > 0.0f || d > 0.0f) {
                invalidate();
            }
        } else {
            f = 21.0f;
            f2 = 0.0f;
            this.O = 0L;
        }
        if (this.e) {
            float L8 = z ? f2 : gm.L(f);
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z) {
                width2 -= gm.L(f);
            }
            canvas.drawLine(L8, height, width2, getHeight() - 1, cmb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder(this.b);
        String str = this.d;
        if (str != null) {
            sb.append(", ");
            sb.append(str);
        }
        boolean z = false;
        if (this.Q) {
            sb.append(", ");
            sb.append(jb6.a0(null, null, 2131745004, Integer.valueOf(Math.round(this.U * 100.0f))));
        } else if (!this.P) {
            sb.append(", ");
            sb.append(jb6.M0(2131745003, null));
        } else if (this.R) {
            sb.append(", ");
            sb.append(jb6.M0(2131745002, null));
        }
        accessibilityNodeInfo.setText(sb);
        accessibilityNodeInfo.setClassName(this.P ? "android.widget.CheckBox" : "android.widget.Button");
        accessibilityNodeInfo.setCheckable(this.P);
        if (this.P && this.T) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
        if (!this.P && !this.Q) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.y));
        }
        if (this.R) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_update, this.E));
        }
        if (this.W == null || this.a0 == null) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_variants, jb6.M0(2131745001, null)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.W;
        if (view != null) {
            int measureText = (int) (this.n.measureText(this.b) + gm.L(18.0f));
            int L = gm.L(34.0f);
            int L2 = (gm.L(50.0f) - L) / 2;
            int y = jb6.a0 ? kt6.y(21.0f, getWidth(), measureText) : gm.L(21.0f);
            view.layout(y - gm.L(6.0f), L2, gm.L(6.0f) + y + measureText, L + L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
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
        u51 u51Var = this.M;
        if (action == 1) {
            float x = motionEvent.getX();
            if (this.W != null && this.a0 != null && x >= r5.getLeft() - gm.L(8.0f)) {
                if (x <= gm.L(8.0f) + r5.getRight() && !u51Var.i) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    this.a0.run();
                    return true;
                }
            }
        }
        RectF rectF = this.H;
        if (action == 0) {
            boolean z = b() && !this.Q && rectF.contains(motionEvent.getX(), motionEvent.getY());
            u51Var.c(z);
        } else {
            if (action != 2) {
                if (action == 1 || action == 3) {
                    boolean z2 = u51Var.i;
                    u51Var.c(false);
                    if (z2) {
                        if (action == 1) {
                            performHapticFeedback(3);
                            a();
                            return true;
                        }
                    }
                }
                return u51Var.i || super.onTouchEvent(motionEvent);
            }
            if (u51Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                u51Var.c(false);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        e6a e6aVar;
        if (i == R.id.acc_action_speech_update && this.R) {
            a();
            return true;
        }
        if (i != R.id.acc_action_speech_variants || this.W == null || (e6aVar = this.a0) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        e6aVar.run();
        return true;
    }
}
