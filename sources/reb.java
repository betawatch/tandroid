// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class reb extends FrameLayout implements vlb {
    public int E;
    public final s09[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public zcb L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final qeb h;
    public final String[] n;
    public final int[] r;
    public final p09[] s;
    public final p09[] w;
    public final int[] x;
    public final int[] y;

    public reb(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{jb6.M0(2131744000, null), jb6.M0(2131743999, null), jb6.M0(2131744004, null), jb6.M0(2131744001, null), jb6.M0(2131744003, null), jb6.M0(2131744002, null)};
        this.r = new int[]{r7, r7, r7, r7, cmb.X5, cmb.c9};
        this.s = new p09[6];
        this.w = new p09[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new s09[2];
        this.H = 1.0f;
        int i2 = cmb.b9;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(gm.L(2.0f));
        qeb qebVar = new qeb(this, context);
        this.h = qebVar;
        this.a = cmb.w0(null, cmb.i5, false);
        qebVar.setMinValue(0);
        qebVar.setDrawDividers(false);
        boolean isEmpty = oc7.r1(i).G0.isEmpty();
        qebVar.setMaxValue(isEmpty ? 4 : 5);
        qebVar.setAllItemsCount(!isEmpty ? 6 : 5);
        qebVar.setWrapSelectorWheel(true);
        qebVar.setFormatter(new peb(this));
        qebVar.setOnValueChangedListener(new peb(this));
        qebVar.setImportantForAccessibility(2);
        qebVar.setValue(gda.m(i));
        addView(qebVar, qoe.d(nm7.P1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            this.F[i3] = new s09(context);
            addView(this.F[i3], qoe.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        p09 a = a(this.h.getValue());
        if (a != null) {
            this.F[0].setImageDrawable(a);
            a.H(a.e[0] - 1);
        }
        gm.T3(this.F[0], true, 0.5f, true, false);
        gm.T3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final p09 a(int i) {
        p09[] p09VarArr = this.s;
        if (p09VarArr[i] == null) {
            p09VarArr[i] = new p09(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, gm.L(28.0f), gm.L(28.0f), true, null);
            c(i);
        }
        return p09VarArr[i];
    }

    public final void b() {
        int value;
        if (this.L != null || this.K == (value = this.h.getValue())) {
            return;
        }
        this.K = value;
        int i = (this.E + 1) % 2;
        p09 a = a(value);
        s09[] s09VarArr = this.F;
        if (a != null) {
            if (s09VarArr[i].getVisibility() != 0) {
                a.I(0, false, false);
            }
            s09VarArr[i].setAnimation(a);
            s09VarArr[i].d();
        } else {
            s09VarArr[i].a();
        }
        gm.T3(s09VarArr[this.E], false, 0.5f, true, true);
        gm.T3(s09VarArr[i], true, 0.5f, true, true);
        this.E = i;
        zcb zcbVar = new zcb(this, (byte) 1);
        this.L = zcbVar;
        gm.d3(zcbVar, 150L);
    }

    public final void c(int i) {
        p09[] p09VarArr = this.s;
        if (p09VarArr[i] != null) {
            int f = on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, cmb.b9, false));
            int i2 = cmb.d9;
            int w0 = cmb.w0(null, i2, false);
            p09 p09Var = p09VarArr[i];
            p09[] p09VarArr2 = this.w;
            p09 p09Var2 = p09VarArr2[i];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (p09Var == p09Var2 && w0 == iArr2[i] && f == iArr[i]) {
                return;
            }
            p09VarArr2[i] = p09Var;
            iArr2[i] = w0;
            iArr[i] = f;
            if (i != 2) {
                anb.x(this, p09VarArr[i], i2, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            p09VarArr[i].L(f, "Arrow");
            p09VarArr[i].L(w0, "Box2");
            p09VarArr[i].L(w0, "Box1");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        qeb qebVar = this.h;
        boolean z = qebVar.getValue() == 5;
        float f2 = this.G;
        s09[] s09VarArr = this.F;
        if (z) {
            if (f2 != 1.0f) {
                float f3 = f2 + 0.053333335f;
                this.G = f3;
                if (f3 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    s09VarArr[0].invalidate();
                    s09VarArr[1].invalidate();
                    invalidate();
                }
            }
        } else if (f2 != 0.0f) {
            float f4 = f2 - 0.053333335f;
            this.G = f4;
            if (f4 < 0.0f) {
                this.G = 0.0f;
            } else {
                s09VarArr[0].invalidate();
                s09VarArr[1].invalidate();
                invalidate();
            }
        }
        int i = cmb.L6;
        int w0 = cmb.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        int w02 = cmb.w0(null, i, false);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        int B = wi8.B(16.0f, gm.L(21.0f) + gm.L(132.0f), getMeasuredWidth());
        int L = gm.L(21.0f);
        int D = wi8.D(48.0f, getMeasuredHeight(), 2);
        float f5 = L;
        float f6 = D;
        float measuredHeight = getMeasuredHeight() - D;
        RectF rectF = this.f;
        rectF.set(f5, f6, B, measuredHeight);
        int i2 = this.J;
        int[] iArr = this.r;
        if (i2 < 0) {
            this.J = iArr[qebVar.getValue()];
            this.H = 1.0f;
            this.I = on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, this.J, false));
            f = 1.0f;
        } else {
            f = 1.0f;
            if (iArr[qebVar.getValue()] != this.J) {
                this.I = on2.f(this.H, this.I, on2.f(0.9f, cmb.w0(null, cmb.c6, false), cmb.w0(null, this.J, false)));
                this.H = 0.0f;
                this.J = iArr[qebVar.getValue()];
            }
        }
        float f7 = this.H;
        if (f7 != f) {
            float f8 = f7 + 0.16f;
            this.H = f8;
            if (f8 > f) {
                this.H = f;
            } else {
                invalidate();
            }
        }
        int i3 = this.I;
        int i4 = cmb.c6;
        int f9 = on2.f(this.H, i3, on2.f(0.9f, cmb.w0(null, i4, false), cmb.w0(null, this.J, false)));
        Paint paint3 = this.c;
        paint3.setColor(f9);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint3);
        paint3.setColor(cmb.w0(null, i4, false));
        paint3.setAlpha(nm7.d4);
        rectF.set(f5, f6, B - gm.L(58.0f), getMeasuredHeight() - D);
        rectF.inset(-gm.L(1.0f), -gm.L(1.0f));
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(cmb.w0(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), gm.L(15.0f), paint3);
        float centerY = rectF.centerY() - gm.L(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + gm.L(23.0f) + 0.0f, centerY, rectF.right - gm.L(68.0f), centerY, paint2);
        float centerY2 = rectF.centerY() + gm.L(6.0f);
        canvas.drawLine(rectF.left + gm.L(23.0f) + 0.0f, centerY2, rectF.right - gm.L(23.0f), centerY2, paint2);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            qeb qebVar = this.h;
            int value = qebVar.getValue() + 1;
            if (value > qebVar.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            qebVar.a(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        int w0 = cmb.w0(null, cmb.i5, false);
        this.a = w0;
        qeb qebVar = this.h;
        qebVar.setTextColor(w0);
        qebVar.invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        for (int i = 0; i < this.s.length; i++) {
            c(i);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
