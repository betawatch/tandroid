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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pcb extends FrameLayout implements tjb {
    public int E;
    public final ry8[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public kya L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final ocb h;
    public final String[] n;
    public final int[] r;
    public final oy8[] s;
    public final oy8[] w;
    public final int[] x;
    public final int[] y;

    public pcb(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{k96.M0(2131744074, null), k96.M0(2131744073, null), k96.M0(2131744078, null), k96.M0(2131744075, null), k96.M0(2131744077, null), k96.M0(2131744076, null)};
        this.r = new int[]{r7, r7, r7, r7, bkb.X5, bkb.c9};
        this.s = new oy8[6];
        this.w = new oy8[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new ry8[2];
        this.H = 1.0f;
        int i2 = bkb.b9;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gl.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(gl.L(2.0f));
        ocb ocbVar = new ocb(this, context);
        this.h = ocbVar;
        this.a = bkb.w0(null, bkb.i5, false);
        ocbVar.setMinValue(0);
        ocbVar.setDrawDividers(false);
        boolean isEmpty = na7.q1(i).G0.isEmpty();
        ocbVar.setMaxValue(isEmpty ? 4 : 5);
        ocbVar.setAllItemsCount(!isEmpty ? 6 : 5);
        ocbVar.setWrapSelectorWheel(true);
        ocbVar.setFormatter(new ncb(this));
        ocbVar.setOnValueChangedListener(new ncb(this));
        ocbVar.setImportantForAccessibility(2);
        ocbVar.setValue(gba.m(i));
        addView(ocbVar, nme.d(kk7.P1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            this.F[i3] = new ry8(context);
            addView(this.F[i3], nme.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        oy8 a = a(this.h.getValue());
        if (a != null) {
            this.F[0].setImageDrawable(a);
            a.H(a.e[0] - 1);
        }
        gl.U3(this.F[0], true, 0.5f, true, false);
        gl.U3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final oy8 a(int i) {
        oy8[] oy8VarArr = this.s;
        if (oy8VarArr[i] == null) {
            oy8VarArr[i] = new oy8(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, gl.L(28.0f), gl.L(28.0f), true, null);
            c(i);
        }
        return oy8VarArr[i];
    }

    public final void b() {
        int value;
        if (this.L != null || this.K == (value = this.h.getValue())) {
            return;
        }
        this.K = value;
        int i = (this.E + 1) % 2;
        oy8 a = a(value);
        ry8[] ry8VarArr = this.F;
        if (a != null) {
            if (ry8VarArr[i].getVisibility() != 0) {
                a.I(0, false, false);
            }
            ry8VarArr[i].setAnimation(a);
            ry8VarArr[i].d();
        } else {
            ry8VarArr[i].a();
        }
        gl.U3(ry8VarArr[this.E], false, 0.5f, true, true);
        gl.U3(ry8VarArr[i], true, 0.5f, true, true);
        this.E = i;
        kya kyaVar = new kya(this, (byte) 23);
        this.L = kyaVar;
        gl.e3(kyaVar, 150L);
    }

    public final void c(int i) {
        oy8[] oy8VarArr = this.s;
        if (oy8VarArr[i] != null) {
            int f = bm2.f(0.9f, bkb.w0(null, bkb.c6, false), bkb.w0(null, bkb.b9, false));
            int i2 = bkb.d9;
            int w0 = bkb.w0(null, i2, false);
            oy8 oy8Var = oy8VarArr[i];
            oy8[] oy8VarArr2 = this.w;
            oy8 oy8Var2 = oy8VarArr2[i];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (oy8Var == oy8Var2 && w0 == iArr2[i] && f == iArr[i]) {
                return;
            }
            oy8VarArr2[i] = oy8Var;
            iArr2[i] = w0;
            iArr[i] = f;
            if (i != 2) {
                zkb.x(this, oy8VarArr[i], i2, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            oy8VarArr[i].L(f, "Arrow");
            oy8VarArr[i].L(w0, "Box2");
            oy8VarArr[i].L(w0, "Box1");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        ocb ocbVar = this.h;
        boolean z = ocbVar.getValue() == 5;
        float f2 = this.G;
        ry8[] ry8VarArr = this.F;
        if (z) {
            if (f2 != 1.0f) {
                float f3 = f2 + 0.053333335f;
                this.G = f3;
                if (f3 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    ry8VarArr[0].invalidate();
                    ry8VarArr[1].invalidate();
                    invalidate();
                }
            }
        } else if (f2 != 0.0f) {
            float f4 = f2 - 0.053333335f;
            this.G = f4;
            if (f4 < 0.0f) {
                this.G = 0.0f;
            } else {
                ry8VarArr[0].invalidate();
                ry8VarArr[1].invalidate();
                invalidate();
            }
        }
        int i = bkb.L6;
        int w0 = bkb.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        int w02 = bkb.w0(null, i, false);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        int B = ug8.B(16.0f, gl.L(21.0f) + gl.L(132.0f), getMeasuredWidth());
        int L = gl.L(21.0f);
        int D = ug8.D(48.0f, getMeasuredHeight(), 2);
        float f5 = L;
        float f6 = D;
        float measuredHeight = getMeasuredHeight() - D;
        RectF rectF = this.f;
        rectF.set(f5, f6, B, measuredHeight);
        int i2 = this.J;
        int[] iArr = this.r;
        if (i2 < 0) {
            this.J = iArr[ocbVar.getValue()];
            this.H = 1.0f;
            this.I = bm2.f(0.9f, bkb.w0(null, bkb.c6, false), bkb.w0(null, this.J, false));
            f = 1.0f;
        } else {
            f = 1.0f;
            if (iArr[ocbVar.getValue()] != this.J) {
                this.I = bm2.f(this.H, this.I, bm2.f(0.9f, bkb.w0(null, bkb.c6, false), bkb.w0(null, this.J, false)));
                this.H = 0.0f;
                this.J = iArr[ocbVar.getValue()];
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
        int i4 = bkb.c6;
        int f9 = bm2.f(this.H, i3, bm2.f(0.9f, bkb.w0(null, i4, false), bkb.w0(null, this.J, false)));
        Paint paint3 = this.c;
        paint3.setColor(f9);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint3);
        paint3.setColor(bkb.w0(null, i4, false));
        paint3.setAlpha(kk7.d4);
        rectF.set(f5, f6, B - gl.L(58.0f), getMeasuredHeight() - D);
        rectF.inset(-gl.L(1.0f), -gl.L(1.0f));
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(bkb.w0(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), gl.L(15.0f), paint3);
        float centerY = rectF.centerY() - gl.L(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + gl.L(23.0f) + 0.0f, centerY, rectF.right - gl.L(68.0f), centerY, paint2);
        float centerY2 = rectF.centerY() + gl.L(6.0f);
        canvas.drawLine(rectF.left + gl.L(23.0f) + 0.0f, centerY2, rectF.right - gl.L(23.0f), centerY2, paint2);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            ocb ocbVar = this.h;
            int value = ocbVar.getValue() + 1;
            if (value > ocbVar.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            ocbVar.a(true);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        int w0 = bkb.w0(null, bkb.i5, false);
        this.a = w0;
        ocb ocbVar = this.h;
        ocbVar.setTextColor(w0);
        ocbVar.invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        for (int i = 0; i < this.s.length; i++) {
            c(i);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
