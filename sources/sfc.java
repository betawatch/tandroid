// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sfc {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final mm D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float a;
    public int h;
    public int i;
    public rfc j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float p;
    public boolean q;
    public float s;
    public float t;
    public long u;
    public final View v;
    public float y;
    public int z;
    public int b = 0;
    public float c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public final RectF o = new RectF();
    public float r = 1.0f;
    public final int w = hl.L(4.0f);
    public final int x = hl.L(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public sfc(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = hl.L(24.0f);
        this.t = hl.L(6.0f);
        this.D = new mm(0.0f, view, 0L, 300L, k43.h);
    }

    public static void g(float f, int i) {
        if (f < 1.0f) {
            i = vm2.o(i, (int) (Color.alpha(i) * f));
        }
        Q.setColor(i);
    }

    public final void a(Canvas canvas, View view) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        float f7;
        char c;
        int i2;
        float R1 = hl.R1(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = R1;
        int i3 = this.i;
        int i4 = this.w;
        rectF.top = hl.R1((i3 - i4) / 2.0f, (i3 - hl.L(3.0f)) - this.x, this.y);
        int i5 = this.i;
        rectF.bottom = hl.R1((i5 + i4) / 2.0f, i5 - hl.L(3.0f), this.y);
        float f8 = this.b;
        float min = Math.min(this.c, f8);
        this.c = min;
        float R12 = hl.R1(min, f8, 0.5f);
        this.c = R12;
        float abs = Math.abs(f8 - R12);
        View view2 = this.v;
        if (abs > 0.005f) {
            view2.invalidate();
        }
        float f9 = this.c;
        float f10 = this.C;
        if (f10 != 1.0f) {
            float f11 = f10 + 0.07272727f;
            this.C = f11;
            if (f11 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = k43.f.getInterpolation(this.C);
                f9 = (f9 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float e = this.D.e(false, 0.0f);
        if (this.f) {
            e = 0.0f;
        }
        rectF.right = hl.R1(this.h - (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
        g(1.0f - this.y, this.k);
        b(canvas, rectF, Q);
        float f12 = this.r;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.16f;
            this.r = f13;
            if (f13 > 1.0f) {
                this.r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        boolean z = this.q;
        float f14 = this.p;
        if (z) {
            if (f14 > 0.0f) {
                f = 2.0f;
                rectF.right = hl.R1((f14 * (this.h - r14)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g((1.0f - this.r) * (1.0f - this.y), this.l);
                b(canvas, rectF, Q);
            } else {
                f = 2.0f;
            }
            float f15 = this.s;
            if (f15 > 0.0f) {
                rectF.right = hl.R1((f15 * (this.h - r13)) + (S / f), view2.getWidth() - (this.z * f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        } else {
            f = 2.0f;
            float f16 = this.r;
            float f17 = (this.s * f16) + ((1.0f - f16) * f14);
            if (f17 > 0.0f) {
                rectF.right = hl.R1((f17 * (this.h - r12)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        }
        float L = hl.L(this.f ? 8.0f : 6.0f);
        if (this.t != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f2 = 3.0f;
            f3 = e;
            long j = elapsedRealtime - this.u;
            this.u = elapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f18 = this.t;
            i = 0;
            if (f18 < L) {
                float B = c00.B(j, 60.0f, hl.L(1.0f), f18);
                this.t = B;
                if (B > L) {
                    this.t = L;
                }
            } else {
                float x = uh9.x(j, 60.0f, hl.L(1.0f), f18);
                this.t = x;
                if (x < L) {
                    this.t = L;
                }
            }
            view2.invalidate();
        } else {
            f2 = 3.0f;
            f3 = e;
            i = 0;
        }
        float R13 = hl.R1(this.t, 0.0f, this.y);
        if (f3 > 0.0f) {
            float f19 = rectF.left;
            f4 = 0.2f;
            f5 = 8.0f;
            float R14 = hl.R1((S / f) + (this.h - r14), view2.getWidth() - (this.z * f), this.y) + this.z;
            rectF.right = R14;
            rectF.left = hl.R1(f19, R14, 1.0f - f3);
            if (this.y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, vm2.f(this.y, this.n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f19;
            g(1.0f - this.y, vm2.f(this.y, this.m, c() == 0.0f ? i : this.A));
            canvas.drawCircle(hl.R1((S / f) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.z * f)), this.y) + this.z, rectF.centerY(), R13 * f3, Q);
        } else {
            f4 = 0.2f;
            f5 = 8.0f;
        }
        float f20 = this.z;
        float f21 = S / f;
        if (this.f) {
            f9 = this.d;
        }
        rectF.right = hl.R1(f21 + f9, c() * (view2.getWidth() - (this.z * f)), this.y) + f20;
        if (this.y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.y * 255.0f * f4));
            b(canvas, rectF, R);
        }
        g(1.0f, vm2.f(this.y, this.n, this.A));
        b(canvas, rectF, Q);
        g(1.0f - this.y, vm2.f(this.y, this.m, c() == 0.0f ? i : this.A));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f3) * R13, Q);
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f22 = ((this.f || this.g) ? this.d : this.c) / (this.h - S);
        int size = this.F.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f22) {
                break;
            } else {
                size--;
            }
        }
        if (this.K == null) {
            this.K = new StaticLayout[2];
        }
        float R15 = hl.R1(S / f, 0.0f, this.y) + this.z;
        float R16 = hl.R1(this.h - (S / f), view2.getWidth() - (this.z * f), this.y) + this.z;
        float f23 = (this.h - (S / f)) + this.z;
        float abs2 = Math.abs(R15 - f23) - hl.L(16.0f);
        float f24 = this.P;
        if (f24 <= 0.0f || Math.abs(f24 - abs2) <= 0.01f) {
            f6 = 255.0f;
            f7 = f2;
        } else {
            StaticLayout[] staticLayoutArr = this.K;
            StaticLayout staticLayout = staticLayoutArr[i];
            if (staticLayout != null) {
                f7 = f2;
                CharSequence text = staticLayout.getText();
                f6 = 255.0f;
                staticLayoutArr[i] = d((int) abs2, text);
            } else {
                f6 = 255.0f;
                f7 = f2;
            }
            StaticLayout[] staticLayoutArr2 = this.K;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = d((int) abs2, staticLayout2.getText());
            }
        }
        this.P = abs2;
        if (size != this.J) {
            StaticLayout[] staticLayoutArr3 = this.K;
            staticLayoutArr3[1] = staticLayoutArr3[i];
            if (this.f) {
                hl.W3(view2);
            }
            if (size < 0 || size >= this.F.size()) {
                this.K[i] = null;
            } else {
                CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                StaticLayout[] staticLayoutArr4 = this.K;
                if (charSequence == null) {
                    staticLayoutArr4[i] = null;
                } else {
                    staticLayoutArr4[i] = d((int) abs2, charSequence);
                }
            }
            this.M = 0.0f;
            if (size == -1) {
                this.N = -1;
            } else {
                int i6 = this.J;
                if (i6 == -1) {
                    this.N = 1;
                } else if (size < i6) {
                    this.N = -1;
                } else if (size > i6) {
                    this.N = 1;
                }
            }
            this.J = size;
        }
        if (this.M < 1.0f) {
            c = 1;
            i2 = i4;
            this.M = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / (this.F.size() > 8 ? 160.0f : 220.0f)) + this.M, 1.0f);
            view2.invalidate();
            this.O = SystemClock.elapsedRealtime();
        } else {
            c = 1;
            i2 = i4;
        }
        if (this.I < 1.0f) {
            this.I = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O)) / 200.0f) + this.I, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = k43.f.getInterpolation(this.M);
        canvas.save();
        int i7 = this.i;
        canvas.translate(((R16 - f23) * this.y) + R15, hl.R1((i7 + i2) / f, i7 - hl.L(f7), this.y) + hl.L(12.0f));
        if (this.K[c] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate((hl.L(16.0f) * (-this.N) * interpolation2) + hl.L(f5), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[c].getHeight()) / f);
            this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * f6 * this.I));
            this.K[c].draw(canvas);
            canvas.restore();
        }
        if (this.K[i] != null) {
            canvas.save();
            if (this.N != 0) {
                canvas.translate(qd4.A(1.0f, interpolation2, hl.L(16.0f) * this.N, hl.L(f5)), 0.0f);
            }
            canvas.translate(0.0f, (-this.K[i].getHeight()) / f);
            this.L.setAlpha((int) (qd4.z(1.0f, this.y, f6, interpolation2) * this.I));
            this.K[i].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        char c2 = 2;
        boolean z = true;
        float L = hl.L(hl.U1(this.y, 2, 1));
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, L, L, paint);
            return;
        }
        float f = 0.0f;
        float R1 = hl.R1(S / 2.0f, 0.0f, this.y) + this.z;
        float R12 = hl.R1(this.h - (S / 2.0f), this.v.getWidth() - (this.z * 2.0f), this.y) + this.z;
        hl.P.set(rectF);
        float f2 = 1.0f;
        float L2 = hl.L(this.I * 1.0f) / 2.0f;
        Path path = U;
        if (path == null) {
            path = new Path();
            U = path;
        }
        path.reset();
        float L3 = hl.L(4.0f) / (R12 - R1);
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.F.size()) {
                i2 = -1;
                break;
            } else if (((Float) ((Pair) this.F.get(i2)).first).floatValue() >= L3) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int size = this.F.size() - 1;
        while (true) {
            c = c2;
            if (size < 0) {
                break;
            }
            if (1.0f - ((Float) ((Pair) this.F.get(size)).first).floatValue() >= L3) {
                i = size + 1;
                break;
            } else {
                size--;
                c2 = c;
            }
        }
        if (i < 0) {
            i = this.F.size();
        }
        int i3 = i;
        int i4 = i2;
        while (i4 <= i3) {
            boolean z2 = z;
            float floatValue = i4 == i2 ? f : ((Float) ((Pair) this.F.get(i4 - 1)).first).floatValue();
            float floatValue2 = i4 == i3 ? f2 : ((Float) ((Pair) this.F.get(i4)).first).floatValue();
            while (i4 != i3 && i4 != 0 && i4 < this.F.size() - 1 && ((Float) ((Pair) this.F.get(i4)).first).floatValue() - floatValue <= L3) {
                i4++;
                floatValue2 = ((Float) ((Pair) this.F.get(i4)).first).floatValue();
            }
            RectF rectF2 = hl.P;
            rectF2.left = hl.R1(R1, R12, floatValue) + (i4 > 0 ? L2 : 0.0f);
            float R13 = hl.R1(R1, R12, floatValue2) - (i4 < i3 ? L2 : 0.0f);
            rectF2.right = R13;
            float f3 = rectF.right;
            boolean z3 = R13 > f3 ? z2 ? 1 : 0 : false;
            if (z3) {
                rectF2.right = f3;
                R13 = f3;
            }
            float f4 = rectF.left;
            if (R13 >= f4) {
                float f5 = rectF2.left;
                if (f5 < f4) {
                    rectF2.left = f4;
                } else {
                    f4 = f5;
                }
                float[] fArr = T;
                if (fArr == null) {
                    fArr = new float[8];
                    T = fArr;
                }
                if (i4 == i2 || (z3 && f4 >= rectF.left)) {
                    fArr[7] = L;
                    fArr[6] = L;
                    fArr[z2 ? 1 : 0] = L;
                    fArr[0] = L;
                    float f6 = 0.7f * L * this.I;
                    fArr[5] = f6;
                    fArr[4] = f6;
                    fArr[3] = f6;
                    fArr[c] = f6;
                } else {
                    float f7 = 0.7f * L * this.I;
                    if (i4 >= i3) {
                        fArr[7] = f7;
                        fArr[6] = f7;
                        fArr[z2 ? 1 : 0] = f7;
                        fArr[0] = f7;
                        fArr[5] = L;
                        fArr[4] = L;
                        fArr[3] = L;
                        fArr[c] = L;
                    } else {
                        fArr[5] = f7;
                        fArr[4] = f7;
                        fArr[3] = f7;
                        fArr[c] = f7;
                        fArr[7] = f7;
                        fArr[6] = f7;
                        fArr[z2 ? 1 : 0] = f7;
                        fArr[0] = f7;
                    }
                }
                U.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (z3) {
                    break;
                }
            }
            i4++;
            z = z2 ? 1 : 0;
            f = 0.0f;
            f2 = 1.0f;
        }
        canvas.drawPath(U, paint);
    }

    public final float c() {
        return this.b / (this.h - S);
    }

    public final StaticLayout d(int i, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(hl.L(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(hl.L(400.0f), i)).build();
    }

    public final boolean e(float f, float f2, int i) {
        rfc rfcVar;
        int i2 = 0;
        if (i == 0) {
            if (this.y <= 0.0f) {
                int i3 = this.i;
                int i4 = S;
                int i5 = (i3 - i4) / 2;
                if (f >= (-i5)) {
                    int i6 = this.h;
                    if (f <= i6 + i5 && f2 >= 0.0f && f2 <= i3) {
                        int i7 = this.b;
                        if (i7 - i5 > f || f > i7 + i4 + i5) {
                            int i8 = ((int) f) - (i4 / 2);
                            this.b = i8;
                            if (i8 < 0) {
                                this.b = 0;
                            } else if (i8 > i6 - i4) {
                                i2 = i4 - i6;
                                this.b = i2;
                            } else {
                                i2 = i8;
                            }
                            this.c = i2;
                            i7 = i2;
                        }
                        this.g = true;
                        this.f = true;
                        this.d = i7;
                        this.e = (int) (f - i7);
                        return true;
                    }
                }
            }
        } else if (i == 1 || i == 3) {
            if (this.f) {
                int i9 = this.d;
                this.b = i9;
                float f3 = i9;
                this.c = f3;
                if (i == 1 && (rfcVar = this.j) != null) {
                    rfcVar.g(f3 / (this.h - S));
                }
                this.f = false;
                hl.d3(new azb(this, (byte) 18), 50L);
                return true;
            }
        } else if (i == 2 && this.f) {
            int i10 = (int) (f - this.e);
            this.d = i10;
            if (i10 < 0) {
                this.d = 0;
            } else {
                i2 = this.h - S;
                if (i10 > i2) {
                    this.d = i2;
                } else {
                    i2 = i10;
                }
            }
            rfc rfcVar2 = this.j;
            if (rfcVar2 != null) {
                rfcVar2.h(i2 / (this.h - S));
            }
            return true;
        }
        return false;
    }

    public final void f(float f) {
        float f2 = this.s;
        if (f != f2) {
            this.p = f2;
            this.q = f < f2;
            this.s = f;
            this.r = 0.0f;
        }
    }

    public final void h(boolean z, float f) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f) < 0.04f) {
            this.D.e(true, 1.0f);
            this.E = this.b;
        }
        this.a = f;
        int ceil = (int) Math.ceil((this.h - S) * f);
        if (z) {
            if (Math.abs(ceil - this.b) > hl.L(10.0f)) {
                float interpolation = k43.f.getInterpolation(this.C);
                this.B = (int) qd4.A(1.0f, interpolation, this.B, this.b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.b;
            }
        }
        this.b = ceil;
        if (ceil < 0) {
            ceil = 0;
            this.b = 0;
        } else {
            int i = this.h - S;
            if (ceil > i) {
                this.b = i;
                ceil = i;
            }
        }
        if (Math.abs(this.c - ceil) > hl.L(8.0f)) {
            this.c = this.b;
        }
    }
}
