// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class td8 extends jqa {
    public float[] J1;
    public float[] K1;
    public float L1;
    public boolean M1;
    public int N1;
    public RectF O1;
    public TextPaint P1;
    public float Q1;
    public float R1;
    public String[] S1;
    public vd8 T1;
    public float U1;
    public int V1;
    public int W1;
    public int X1;

    @Override // pf0
    public final void A(boolean z, boolean z2, boolean z3) {
        super.A(z, z2, z3);
        ok1 ok1Var = this.i0;
        if (ok1Var == null || ((iqa) ok1Var).b == null) {
            return;
        }
        uk1 uk1Var = this.h0;
        N(uk1Var.k, uk1Var.l, z2);
    }

    @Override // pf0
    public final void C(int i, int i2) {
        ArrayList arrayList;
        RectF rectF = this.O1;
        if (this.i0 == null || this.M1) {
            return;
        }
        RectF rectF2 = this.I0;
        float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + hl.L(16.0f)) - i2, rectF2.centerX() - i)) - 90.0d);
        float f = 0.0f;
        if (degrees < 0.0f) {
            degrees = (float) (degrees + 360.0d);
        }
        float f2 = degrees / 360.0f;
        float f3 = 0.0f;
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                i3 = -1;
                f3 = 0.0f;
                break;
            }
            if (((ud8) arrayList.get(i3)).n || ((ud8) arrayList.get(i3)).o != 0.0f) {
                if (f2 > f3) {
                    float f4 = this.K1[i3] + f3;
                    if (f2 < f4) {
                        f = f4;
                        break;
                    }
                }
                f3 += this.K1[i3];
            }
            i3++;
        }
        if (this.N1 != i3 && i3 >= 0) {
            this.N1 = i3;
            invalidate();
            this.T1.setVisibility(0);
            o46 o46Var = (o46) arrayList.get(i3);
            vd8 vd8Var = this.T1;
            String str = o46Var.a.d;
            int i4 = (int) this.J1[this.N1];
            int i5 = o46Var.m;
            vd8Var.N.setText(str);
            TextView textView = vd8Var.O;
            textView.setText(Integer.toString(i4));
            textView.setTextColor(i5);
            this.T1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            double width = rectF.width() / 2.0f;
            int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f3 * 360.0f) - 90.0f)) * width));
            int i6 = min >= 0 ? min : 0;
            if (this.T1.getMeasuredWidth() + i6 > getMeasuredWidth() - hl.L(16.0f)) {
                i6 -= (this.T1.getMeasuredWidth() + i6) - (getMeasuredWidth() - hl.L(16.0f));
            }
            int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(r7)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(r13)) * width) + rectF.centerY()))) - hl.L(50.0f);
            this.T1.setTranslationX(i6);
            this.T1.setTranslationY(min2);
            hl.W3(this);
        }
        x((this.H0 * this.h0.k) - pf0.l1);
    }

    @Override // pf0
    public final boolean D(ok1 ok1Var) {
        iqa iqaVar = (iqa) ok1Var;
        boolean D = super.D(iqaVar);
        if (iqaVar != null) {
            this.J1 = new float[iqaVar.d.size()];
            this.K1 = new float[iqaVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override // pf0
    public final void J(ok1 ok1Var, long j) {
        int length = ok1Var.a.length;
        long j2 = j - (j % 86400000);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (j2 >= ok1Var.a[i2]) {
                i = i2;
            }
        }
        float length2 = ok1Var.b.length < 2 ? 0.5f : 1.0f / ok1Var.a.length;
        uk1 uk1Var = this.h0;
        if (i == 0) {
            uk1Var.k = 0.0f;
            uk1Var.l = length2;
            return;
        }
        if (i >= ok1Var.a.length - 1) {
            uk1Var.k = 1.0f - length2;
            uk1Var.l = 1.0f;
            return;
        }
        float f = i * length2;
        uk1Var.k = f;
        float f2 = f + length2;
        uk1Var.l = f2;
        if (f2 > 1.0f) {
            uk1Var.l = 1.0f;
        }
        A(true, true, false);
    }

    @Override // jqa
    /* renamed from: L */
    public final kqa h(nk1 nk1Var) {
        return new ud8(nk1Var);
    }

    public final void N(float f, float f2, boolean z) {
        if (this.J1 != null) {
            int length = ((iqa) this.i0).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < length; i4++) {
                float f3 = ((iqa) this.i0).b[i4];
                if (f3 >= f && i3 == -1) {
                    i3 = i4;
                }
                if (f3 <= f2) {
                    i2 = i4;
                }
            }
            if (i2 < i3) {
                i3 = i2;
            }
            if (!z && this.X1 == i2 && this.W1 == i3) {
                return;
            }
            this.X1 = i2;
            this.W1 = i3;
            this.M1 = true;
            this.L1 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                this.J1[i5] = 0.0f;
            }
            while (i3 <= i2) {
                for (int i6 = 0; i6 < size; i6++) {
                    float[] fArr = this.J1;
                    fArr[i6] = fArr[i6] + ((nk1) ((iqa) this.i0).d.get(i6)).a[i3];
                    this.L1 += ((nk1) ((iqa) this.i0).d.get(i6)).a[i3];
                    if (this.M1 && ((ud8) arrayList.get(i6)).n && ((nk1) ((iqa) this.i0).d.get(i6)).a[i3] > 0) {
                        this.M1 = false;
                    }
                }
                i3++;
            }
            if (z) {
                while (i < size) {
                    if (this.L1 == 0.0f) {
                        ((ud8) arrayList.get(i)).r = 0.0f;
                    } else {
                        ((ud8) arrayList.get(i)).r = this.J1[i] / this.L1;
                    }
                    i++;
                }
                return;
            }
            while (i < size) {
                ud8 ud8Var = (ud8) arrayList.get(i);
                ValueAnimator valueAnimator = ud8Var.s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f4 = this.L1;
                ValueAnimator e = pf0.e(ud8Var.r, f4 == 0.0f ? 0.0f : this.J1[i] / f4, new lk(this, ud8Var, (byte) 19));
                ud8Var.s = e;
                e.start();
                i++;
            }
        }
    }

    @Override // pf0, tk1
    public final void a(float f, float f2, boolean z) {
        if (this.i0 == null) {
            return;
        }
        if (z) {
            N(f, f2, false);
        } else {
            H();
            invalidate();
        }
    }

    @Override // pf0
    public final q26 g() {
        vd8 vd8Var = new vd8(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(vd8Var.getContext());
        linearLayout.setPadding(hl.L(4.0f), hl.L(2.0f), hl.L(4.0f), hl.L(2.0f));
        TextView textView = new TextView(vd8Var.getContext());
        vd8Var.N = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = hl.L(96.0f);
        TextView textView2 = new TextView(vd8Var.getContext());
        vd8Var.O = textView2;
        linearLayout.addView(textView2);
        vd8Var.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        vd8Var.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        vd8Var.f.setVisibility(8);
        vd8Var.G = false;
        this.T1 = vd8Var;
        return vd8Var;
    }

    @Override // jqa, pf0
    public final o46 h(nk1 nk1Var) {
        return new ud8(nk1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    @Override // jqa, pf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        int i;
        x84 x84Var;
        float f;
        float f2;
        RectF rectF;
        float f3;
        float f4;
        TextPaint textPaint;
        float f5;
        TextPaint textPaint2;
        float f6;
        int i2;
        float f7;
        byte b;
        int i3;
        float f8;
        TextPaint textPaint3 = this.P1;
        RectF rectF2 = this.O1;
        if (this.i0 != null) {
            if (canvas != null) {
                canvas.save();
            }
            byte b2 = 1;
            if (this.z0 == 1) {
                float f9 = this.A0.f;
                i = (int) (f9 * f9 * 255.0f);
            } else {
                i = jn7.d4;
            }
            boolean z = this.M1;
            float f10 = this.U1;
            float f11 = 0.0f;
            if (z) {
                if (f10 != 0.0f) {
                    float f12 = f10 - 0.12f;
                    this.U1 = f12;
                    if (f12 < 0.0f) {
                        this.U1 = 0.0f;
                    }
                    invalidate();
                }
            } else if (f10 != 1.0f) {
                float f13 = f10 + 0.12f;
                this.U1 = f13;
                if (f13 > 1.0f) {
                    this.U1 = 1.0f;
                }
                invalidate();
            }
            float f14 = this.U1;
            int i4 = (int) (i * f14);
            float f15 = (f14 * 0.6f) + 0.4f;
            RectF rectF3 = this.I0;
            if (canvas != null) {
                canvas.scale(f15, f15, rectF3.centerX(), rectF3.centerY());
            }
            float height = (int) ((rectF3.width() > rectF3.height() ? rectF3.height() : rectF3.width()) * 0.45f);
            rectF2.set(rectF3.centerX() - height, (rectF3.centerY() + hl.L(16.0f)) - height, rectF3.centerX() + height, rectF3.centerY() + hl.L(16.0f) + height);
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            float f16 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                f16 = (((ud8) arrayList.get(i5)).r * ((ud8) arrayList.get(i5)).o) + f16;
            }
            if (f16 == 0.0f) {
                if (canvas != null) {
                    canvas.restore();
                    return;
                }
                return;
            }
            float f17 = -90.0f;
            int i6 = 0;
            while (true) {
                x84Var = pf0.D1;
                f = 2.0f;
                f2 = f11;
                if (i6 >= size) {
                    break;
                }
                if (((ud8) arrayList.get(i6)).o > f2 || ((ud8) arrayList.get(i6)).n) {
                    ((ud8) arrayList.get(i6)).c.setAlpha(i4);
                    float f18 = (((ud8) arrayList.get(i6)).r / f16) * ((ud8) arrayList.get(i6)).o;
                    this.K1[i6] = f18;
                    if (f18 != f2) {
                        if (canvas != null) {
                            canvas.save();
                        }
                        i2 = i4;
                        double B = c00.B(f18, 2.0f, 360.0f, f17);
                        if (((ud8) arrayList.get(i6)).q > f2) {
                            float interpolation = x84Var.getInterpolation(((ud8) arrayList.get(i6)).q);
                            if (canvas != null) {
                                b = b2;
                                double d = interpolation;
                                f7 = f17;
                                canvas.translate((float) (Math.cos(Math.toRadians(B)) * hl.L(8.0f) * d), (float) (Math.sin(Math.toRadians(B)) * hl.L(8.0f) * d));
                                ((ud8) arrayList.get(i6)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                                ((ud8) arrayList.get(i6)).c.setStrokeWidth(1.0f);
                                ((ud8) arrayList.get(i6)).c.setAntiAlias(!pf0.B1);
                                if (canvas == null) {
                                    b2 = b;
                                    if (this.z0 != b2) {
                                        Paint paint = ((ud8) arrayList.get(i6)).c;
                                        i3 = i6;
                                        f8 = f7;
                                        canvas.drawArc(rectF2, f8, f18 * 360.0f, true, paint);
                                        ((ud8) arrayList.get(i3)).c.setStyle(Paint.Style.STROKE);
                                        canvas.restore();
                                    } else {
                                        i3 = i6;
                                        f8 = f7;
                                    }
                                } else {
                                    i3 = i6;
                                    f8 = f7;
                                    b2 = b;
                                }
                                ((ud8) arrayList.get(i3)).c.setAlpha(jn7.d4);
                                f17 = (f18 * 360.0f) + f8;
                                i6 = i3 + 1;
                                i4 = i2;
                                f11 = f2;
                            }
                        }
                        f7 = f17;
                        b = b2;
                        ((ud8) arrayList.get(i6)).c.setStyle(Paint.Style.FILL_AND_STROKE);
                        ((ud8) arrayList.get(i6)).c.setStrokeWidth(1.0f);
                        ((ud8) arrayList.get(i6)).c.setAntiAlias(!pf0.B1);
                        if (canvas == null) {
                        }
                        ((ud8) arrayList.get(i3)).c.setAlpha(jn7.d4);
                        f17 = (f18 * 360.0f) + f8;
                        i6 = i3 + 1;
                        i4 = i2;
                        f11 = f2;
                    }
                }
                i3 = i6;
                i2 = i4;
                i6 = i3 + 1;
                i4 = i2;
                f11 = f2;
            }
            float f19 = 360.0f;
            int i7 = i4;
            if (canvas != null) {
                float f20 = -90.0f;
                int i8 = 0;
                while (i8 < size) {
                    if (((ud8) arrayList.get(i8)).o > f2 || ((ud8) arrayList.get(i8)).n) {
                        float f21 = (((ud8) arrayList.get(i8)).r * ((ud8) arrayList.get(i8)).o) / f16;
                        canvas.save();
                        double B2 = c00.B(f21, f, f19, f20);
                        if (((ud8) arrayList.get(i8)).q > f2) {
                            f4 = f;
                            textPaint = textPaint3;
                            double interpolation2 = x84Var.getInterpolation(((ud8) arrayList.get(i8)).q);
                            rectF = rectF2;
                            f3 = f20;
                            canvas.translate((float) (Math.cos(Math.toRadians(B2)) * hl.L(8.0f) * interpolation2), (float) (Math.sin(Math.toRadians(B2)) * hl.L(8.0f) * interpolation2));
                        } else {
                            rectF = rectF2;
                            f3 = f20;
                            f4 = f;
                            textPaint = textPaint3;
                        }
                        int i9 = (int) (100.0f * f21);
                        if (f21 < 0.02f || i9 <= 0 || i9 > 100) {
                            f5 = f21;
                            textPaint2 = textPaint;
                        } else {
                            float sqrt = (float) (Math.sqrt(1.0f - f21) * rectF.width() * 0.42f);
                            textPaint2 = textPaint;
                            textPaint2.setTextSize((this.R1 * f21) + this.Q1);
                            textPaint2.setAlpha((int) (i7 * ((ud8) arrayList.get(i8)).o));
                            f5 = f21;
                            double d2 = sqrt;
                            canvas.drawText(this.S1[i9], (float) ((Math.cos(Math.toRadians(B2)) * d2) + rectF.centerX()), ((float) ((Math.sin(Math.toRadians(B2)) * d2) + rectF.centerY())) - ((textPaint2.ascent() + textPaint2.descent()) / f4), textPaint2);
                        }
                        canvas.restore();
                        ((ud8) arrayList.get(i8)).c.setAlpha(jn7.d4);
                        f19 = 360.0f;
                        f6 = (f5 * 360.0f) + f3;
                    } else {
                        rectF = rectF2;
                        f6 = f20;
                        f4 = f;
                        textPaint2 = textPaint3;
                    }
                    i8++;
                    f20 = f6;
                    textPaint3 = textPaint2;
                    f = f4;
                    rectF2 = rectF;
                }
                canvas.restore();
            }
        }
    }

    @Override // jqa, pf0
    public final void n(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        td8 td8Var = this;
        ok1 ok1Var = td8Var.i0;
        if (ok1Var != null) {
            int length = ((iqa) ok1Var).b.length;
            ArrayList arrayList = td8Var.d;
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((o46) arrayList.get(i3)).j = 0;
            }
            float length2 = (1.0f / ((iqa) td8Var.i0).b.length) * td8Var.D0;
            int i4 = 0;
            while (i4 < length) {
                float A = qd4.A(td8Var.D0, length2, ((iqa) td8Var.i0).b[i4], length2 / 2.0f);
                int i5 = 1;
                int i6 = i2;
                int i7 = i6;
                boolean z = true;
                float f4 = 0.0f;
                while (i6 < size) {
                    o46 o46Var = (o46) arrayList.get(i6);
                    boolean z2 = o46Var.n;
                    if (z2 || o46Var.o != 0.0f) {
                        i = i4;
                        float f5 = o46Var.a.a[i] * o46Var.o;
                        f4 += f5;
                        if (f5 > 0.0f) {
                            i7++;
                            if (z2) {
                                z = false;
                            }
                        }
                    } else {
                        i = i4;
                    }
                    i6++;
                    i4 = i;
                }
                int i8 = i4;
                float f6 = 0.0f;
                int i9 = 0;
                while (i9 < size) {
                    o46 o46Var2 = (o46) arrayList.get(i9);
                    if (o46Var2.n || o46Var2.o != 0.0f) {
                        long[] jArr = o46Var2.a.a;
                        if (i7 == i5) {
                            if (jArr[i8] != 0) {
                                f3 = o46Var2.o;
                                int i10 = td8Var.C0;
                                float f7 = f3 * i10;
                                float[] fArr = o46Var2.k;
                                int i11 = o46Var2.j;
                                int i12 = i11 + 1;
                                o46Var2.j = i12;
                                fArr[i11] = A;
                                int i13 = i11 + 2;
                                o46Var2.j = i13;
                                fArr[i12] = (i10 - f7) - f6;
                                int i14 = i11 + 3;
                                o46Var2.j = i14;
                                fArr[i13] = A;
                                o46Var2.j = i11 + 4;
                                fArr[i14] = i10 - f6;
                                f6 += f7;
                            }
                            f3 = 0.0f;
                            int i102 = td8Var.C0;
                            float f72 = f3 * i102;
                            float[] fArr2 = o46Var2.k;
                            int i112 = o46Var2.j;
                            int i122 = i112 + 1;
                            o46Var2.j = i122;
                            fArr2[i112] = A;
                            int i132 = i112 + 2;
                            o46Var2.j = i132;
                            fArr2[i122] = (i102 - f72) - f6;
                            int i142 = i112 + 3;
                            o46Var2.j = i142;
                            fArr2[i132] = A;
                            o46Var2.j = i112 + 4;
                            fArr2[i142] = i102 - f6;
                            f6 += f72;
                        } else {
                            if (f4 != 0.0f) {
                                if (z) {
                                    f2 = o46Var2.o;
                                    f = (jArr[i8] / f4) * f2;
                                } else {
                                    f = jArr[i8] / f4;
                                    f2 = o46Var2.o;
                                }
                                f3 = f * f2;
                                int i1022 = td8Var.C0;
                                float f722 = f3 * i1022;
                                float[] fArr22 = o46Var2.k;
                                int i1122 = o46Var2.j;
                                int i1222 = i1122 + 1;
                                o46Var2.j = i1222;
                                fArr22[i1122] = A;
                                int i1322 = i1122 + 2;
                                o46Var2.j = i1322;
                                fArr22[i1222] = (i1022 - f722) - f6;
                                int i1422 = i1122 + 3;
                                o46Var2.j = i1422;
                                fArr22[i1322] = A;
                                o46Var2.j = i1122 + 4;
                                fArr22[i1422] = i1022 - f6;
                                f6 += f722;
                            }
                            f3 = 0.0f;
                            int i10222 = td8Var.C0;
                            float f7222 = f3 * i10222;
                            float[] fArr222 = o46Var2.k;
                            int i11222 = o46Var2.j;
                            int i12222 = i11222 + 1;
                            o46Var2.j = i12222;
                            fArr222[i11222] = A;
                            int i13222 = i11222 + 2;
                            o46Var2.j = i13222;
                            fArr222[i12222] = (i10222 - f7222) - f6;
                            int i14222 = i11222 + 3;
                            o46Var2.j = i14222;
                            fArr222[i13222] = A;
                            o46Var2.j = i11222 + 4;
                            fArr222[i14222] = i10222 - f6;
                            f6 += f7222;
                        }
                    }
                    i9++;
                    i5 = 1;
                    td8Var = this;
                }
                i4 = i8 + 1;
                td8Var = this;
                i2 = 0;
            }
            for (int i15 = 0; i15 < size; i15++) {
                o46 o46Var3 = (o46) arrayList.get(i15);
                Paint paint = o46Var3.c;
                Paint paint2 = o46Var3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(jn7.d4);
                paint2.setAntiAlias(false);
                canvas.drawLines(o46Var3.k, 0, o46Var3.j, paint2);
            }
        }
    }

    @Override // jqa, pf0, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.i0 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (i == this.N1) {
                    if (((ud8) arrayList.get(i)).q < 1.0f) {
                        ((ud8) arrayList.get(i)).q += 0.1f;
                        if (((ud8) arrayList.get(i)).q > 1.0f) {
                            ((ud8) arrayList.get(i)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((ud8) arrayList.get(i)).q > 0.0f) {
                    ((ud8) arrayList.get(i)).q -= 0.1f;
                    if (((ud8) arrayList.get(i)).q < 0.0f) {
                        ((ud8) arrayList.get(i)).q = 0.0f;
                    }
                    invalidate();
                }
                i++;
            }
        }
        super.onDraw(canvas);
    }

    @Override // pf0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.V1) {
            this.V1 = getMeasuredWidth();
            RectF rectF = this.I0;
            int height = (int) ((rectF.width() > rectF.height() ? rectF.height() : rectF.width()) * 0.45f);
            this.Q1 = height / 13;
            this.R1 = height / 7;
        }
    }

    @Override // jqa, pf0
    public final void q(z2c z2cVar) {
        k(null);
        float f = 0.0f;
        int i = 0;
        while (true) {
            float[] fArr = this.K1;
            if (i >= fArr.length) {
                return;
            }
            f += fArr[i];
            z2cVar.k[i] = (360.0f * f) - 180.0f;
            i++;
        }
    }

    @Override // pf0
    public final void y() {
        this.N1 = -1;
        this.T1.setVisibility(8);
        invalidate();
    }

    @Override // pf0
    public final void i(Canvas canvas) {
    }

    @Override // pf0
    public final void j(Canvas canvas) {
    }

    @Override // pf0
    public final void o(Canvas canvas) {
    }

    @Override // pf0
    public final void l(Canvas canvas, rk1 rk1Var) {
    }

    @Override // pf0
    public final void p(Canvas canvas, rk1 rk1Var) {
    }
}
