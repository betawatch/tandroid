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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yka extends FrameLayout {
    public final String E;
    public String F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public final lm J;
    public final lm K;
    public final lm L;
    public final n41 M;
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
    public t7a a0;
    public String b;
    public final Paint c;
    public final String d;
    public final boolean e;
    public final vl3 f;
    public final wf2 h;
    public final TextPaint n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final String y;

    public yka(Context context, String str, String str2, String str3, boolean z) {
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
        String M0 = k96.M0(2131745068, null);
        this.y = M0;
        this.E = k96.M0(2131745035, null);
        this.F = M0;
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        s33 s33Var = s33.h;
        lm lmVar = new lm(this, 0L, 300L, s33Var);
        this.J = lmVar;
        lm lmVar2 = new lm(this, 0L, 420L, s33Var);
        this.K = lmVar2;
        lm lmVar3 = new lm(this, 0L, 420L, s33Var);
        this.L = lmVar3;
        this.M = new n41(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = z;
        vl3 L = str != null ? DictationAsr.L(str) : null;
        this.f = L;
        String[] d = L != null ? L.d(str) : new String[0];
        this.V = d;
        if (d.length > 1) {
            View view = new View(context);
            this.W = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = jm3.N(DictationAsr.g0(L, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(gl.L(16.0f));
        textPaint2.setTextSize(gl.L(14.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(gl.N(2.0f));
        textPaint3.setTextSize(gl.L(14.0f));
        textPaint3.setTypeface(gl.o());
        wf2 wf2Var = new wf2(26, null, context);
        this.h = wf2Var;
        wf2Var.setDrawUnchecked(false);
        wf2Var.b(-1, -1, bkb.Ei);
        wf2Var.setDrawBackgroundAsArc(-1);
        addView(wf2Var, nme.d(26, 26.0f, (k96.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        wf2Var.setImportantForAccessibility(2);
        View view2 = this.W;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        c();
        lmVar.e(true, this.U);
        float f = 1.0f;
        lmVar2.e(true, b() ? 0.0f : 1.0f);
        if (!this.Q && b()) {
            f = 0.0f;
        }
        lmVar3.e(true, f);
    }

    public final void a() {
        if (this.Q) {
            return;
        }
        if (!this.P) {
            DictationAsr.s(this.f);
        } else if (this.R) {
            this.S = true;
            vl3 e0 = DictationAsr.e0(this.a);
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
            String N = jm3.N(DictationAsr.g0(this.f, this.a));
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
            vl3[] M = DictationAsr.M();
            int length = M.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                vl3 vl3Var = M[i];
                if (vl3Var.c(str) && DictationAsr.y(vl3Var)) {
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
            for (vl3 vl3Var2 : DictationAsr.M()) {
                if (vl3Var2.c(str2) && vl3Var2.j) {
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
                            for (vl3 vl3Var3 : DictationAsr.M()) {
                                if (vl3Var3.c(str3) && vl3Var3.j) {
                                    f = Math.max(f, vl3Var3.k);
                                }
                            }
                        }
                        this.U = f;
                        this.h.a(this.T, isAttachedToWindow());
                        if (z4 && !this.Q && this.P && isAttachedToWindow() && gl.A1()) {
                            announceForAccessibility(k96.a0(null, null, 2131745079, this.b));
                        }
                        z3 = this.P;
                        if (z3 != (getBackground() != null)) {
                            setBackground(z3 ? bkb.L0(false) : null);
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
                        announceForAccessibility(k96.a0(null, null, 2131745079, this.b));
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
        boolean z = k96.a0;
        int w0 = bkb.w0(null, bkb.y6, false);
        int w02 = bkb.w0(null, bkb.Ei, false);
        float L = gl.L(25.0f);
        int w03 = bkb.w0(null, bkb.F6, false);
        TextPaint textPaint = this.n;
        textPaint.setColor(w03);
        TextPaint textPaint2 = this.r;
        textPaint2.setColor(w0);
        float measureText = textPaint.measureText(this.b);
        float L2 = L + gl.L(5.5f);
        canvas2.drawText(this.b, z ? (getWidth() - gl.L(21.0f)) - measureText : gl.L(21.0f), L2, textPaint);
        if (this.W != null) {
            Paint paint = this.c;
            paint.setColor(w0);
            float width = z ? ((getWidth() - gl.L(21.0f)) - measureText) - gl.L(12.0f) : gl.L(21.0f) + measureText + gl.L(12.0f);
            canvas2.drawLine(width - gl.L(4.5f), L - gl.L(2.0f), width, gl.L(2.5f) + L, paint);
            canvas2 = canvas;
            canvas2.drawLine(width, L + gl.L(2.5f), width + gl.L(4.5f), L - gl.L(2.0f), paint);
            measureText += gl.L(18.0f);
        }
        String str = this.d;
        if (str != null) {
            canvas2.drawText(str, z ? (((getWidth() - gl.L(21.0f)) - measureText) - gl.L(8.0f)) - textPaint2.measureText(str) : gl.L(8.0f) + gl.L(21.0f) + measureText, L2, textPaint2);
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
            float L3 = gl.L(28.0f) + measureText2;
            float L4 = gl.L(30.0f);
            float L5 = z ? gl.L(17.0f) + L3 : getWidth() - gl.L(17.0f);
            float f3 = L4 / 2.0f;
            RectF rectF = this.H;
            rectF.set(L5 - L3, L - f3, L5, L + f3);
            float f4 = 1.0f - d;
            float a = this.M.a(0.08f) * (1.0f - (d * 0.2f));
            canvas2.save();
            canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
            int p1 = bkb.p1(f4, w02);
            Paint paint2 = this.w;
            paint2.setColor(p1);
            canvas2.drawRoundRect(rectF, f3, f3, paint2);
            int w04 = bkb.w0(null, bkb.Ii, false);
            canvas2.save();
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            canvas2.clipPath(path);
            float L6 = gl.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(bkb.p1((1.0f - d2) * f4, w04));
                canvas2.save();
                canvas2.translate(0.0f, (-d2) * L6);
                canvas2.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas2.drawText(this.F, rectF.centerX() - (measureText2 / 2.0f), rectF.centerY() + gl.L(5.0f), textPaint3);
                canvas2.restore();
            }
            if (d2 > 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.O != 0) {
                    this.N = (((uptimeMillis - r5) * 0.36f) + this.N) % 360.0f;
                }
                this.O = uptimeMillis;
                float L7 = gl.L(8.0f);
                float A = tb4.A(1.0f, d2, L6, rectF.centerY());
                RectF rectF2 = this.G;
                rectF2.set(rectF.centerX() - L7, A - L7, rectF.centerX() + L7, A + L7);
                int p12 = bkb.p1(d2 * f4, w04);
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
            float L8 = z ? f2 : gl.L(f);
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z) {
                width2 -= gl.L(f);
            }
            canvas.drawLine(L8, height, width2, getHeight() - 1, bkb.j0);
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
            sb.append(k96.a0(null, null, 2131745078, Integer.valueOf(Math.round(this.U * 100.0f))));
        } else if (!this.P) {
            sb.append(", ");
            sb.append(k96.M0(2131745077, null));
        } else if (this.R) {
            sb.append(", ");
            sb.append(k96.M0(2131745076, null));
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
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_variants, k96.M0(2131745075, null)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.W;
        if (view != null) {
            int measureText = (int) (this.n.measureText(this.b) + gl.L(18.0f));
            int L = gl.L(34.0f);
            int L2 = (gl.L(50.0f) - L) / 2;
            int x = k96.a0 ? ls6.x(21.0f, getWidth(), measureText) : gl.L(21.0f);
            view.layout(x - gl.L(6.0f), L2, gl.L(6.0f) + x + measureText, L + L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
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
        n41 n41Var = this.M;
        if (action == 1) {
            float x = motionEvent.getX();
            if (this.W != null && this.a0 != null && x >= r5.getLeft() - gl.L(8.0f)) {
                if (x <= gl.L(8.0f) + r5.getRight() && !n41Var.i) {
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
            n41Var.c(z);
        } else {
            if (action != 2) {
                if (action == 1 || action == 3) {
                    boolean z2 = n41Var.i;
                    n41Var.c(false);
                    if (z2) {
                        if (action == 1) {
                            performHapticFeedback(3);
                            a();
                            return true;
                        }
                    }
                }
                return n41Var.i || super.onTouchEvent(motionEvent);
            }
            if (n41Var.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                n41Var.c(false);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        t7a t7aVar;
        if (i == R.id.acc_action_speech_update && this.R) {
            a();
            return true;
        }
        if (i != R.id.acc_action_speech_variants || this.W == null || (t7aVar = this.a0) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        t7aVar.run();
        return true;
    }
}
