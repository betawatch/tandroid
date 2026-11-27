// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class q46 extends pf0 {
    @Override // pf0
    public final o46 h(nk1 nk1Var) {
        return new o46(nk1Var, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    @Override // pf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        float f7;
        int i2;
        int i3;
        if (this.i0 == null) {
            return;
        }
        float f8 = this.G0;
        uk1 uk1Var = this.h0;
        float f9 = uk1Var.l;
        float f10 = uk1Var.k;
        float f11 = f8 / (f9 - f10);
        float f12 = pf0.l1;
        float f13 = (f10 * f11) - f12;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i5 >= arrayList.size()) {
                return;
            }
            o46 o46Var = (o46) arrayList.get(i5);
            boolean z2 = o46Var.n;
            float[] fArr = o46Var.k;
            Path path = o46Var.f;
            Paint paint = o46Var.c;
            if (z2 || o46Var.o != 0.0f) {
                float[] fArr2 = this.i0.b;
                float f14 = fArr2.length < 2 ? 0.0f : fArr2[1] * f11;
                long[] jArr = o46Var.a.a;
                int i6 = ((int) (f12 / f14)) + 1;
                path.reset();
                int max = Math.max(i4, this.G - i6);
                int min = Math.min(this.i0.b.length - 1, this.H + i6);
                boolean z3 = true;
                int i7 = 0;
                while (true) {
                    z = pf0.B1;
                    if (max > min) {
                        break;
                    }
                    int i8 = i7;
                    long j = jArr[max];
                    if (j < 0) {
                        f5 = f11;
                        f6 = f13;
                        f7 = f12;
                        i2 = min;
                    } else {
                        f5 = f11;
                        float f15 = (this.i0.b[max] * f5) - f13;
                        float f16 = this.x;
                        f6 = f13;
                        float f17 = (j - f16) / (this.w - f16);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f7 = f12;
                        i2 = min;
                        float B = qu6.B((getMeasuredHeight() - this.s) - pf0.o1, strokeWidth, f17, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z) {
                            int i9 = i8 + 1;
                            if (i8 == 0) {
                                fArr[i8] = f15;
                                i3 = i8 + 2;
                                fArr[i9] = B;
                            } else {
                                fArr[i8] = f15;
                                fArr[i9] = B;
                                fArr[i8 + 2] = f15;
                                i3 = i8 + 4;
                                fArr[i8 + 3] = B;
                            }
                            i7 = i3;
                        } else if (z3) {
                            path.moveTo(f15, B);
                            i7 = i8;
                            z3 = false;
                        } else {
                            path.lineTo(f15, B);
                        }
                        max++;
                        f11 = f5;
                        f13 = f6;
                        f12 = f7;
                        min = i2;
                    }
                    i7 = i8;
                    max++;
                    f11 = f5;
                    f13 = f6;
                    f12 = f7;
                    min = i2;
                }
                f = f11;
                f2 = f13;
                f3 = f12;
                int i10 = i7;
                canvas.save();
                byte b = this.z0;
                float f18 = 1.0f;
                if (b == 2) {
                    z2c z2cVar = this.A0;
                    float f19 = z2cVar.f;
                    f4 = f19 > 0.5f ? 0.0f : 1.0f - (f19 * 2.0f);
                    canvas.scale((f19 * 2.0f) + 1.0f, 1.0f, z2cVar.d, z2cVar.e);
                } else if (b == 1) {
                    float f20 = this.A0.f;
                    f4 = f20 < 0.3f ? 0.0f : f20;
                    canvas.save();
                    z2c z2cVar2 = this.A0;
                    float f21 = z2cVar2.f;
                    canvas.scale(f21, f21, z2cVar2.d, z2cVar2.e);
                } else {
                    if (b == 3) {
                        f18 = this.A0.f;
                    }
                    paint.setAlpha((int) (o46Var.o * 255.0f * f18));
                    if (this.H - this.G <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z) {
                        canvas.drawPath(path, paint);
                        i = 0;
                    } else {
                        i = 0;
                        canvas.drawLines(fArr, 0, i10, paint);
                    }
                    canvas.restore();
                }
                f18 = f4;
                paint.setAlpha((int) (o46Var.o * 255.0f * f18));
                if (this.H - this.G <= 100) {
                }
                if (z) {
                }
                canvas.restore();
            } else {
                f = f11;
                f2 = f13;
                f3 = f12;
                i = i4;
            }
            i5++;
            i4 = i;
            f11 = f;
            f13 = f2;
            f12 = f3;
        }
    }

    @Override // pf0
    public final void n(Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        float f;
        float f2;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i4 = 0;
            while (i4 < size) {
                o46 o46Var = (o46) arrayList3.get(i4);
                boolean z2 = o46Var.n;
                float[] fArr = o46Var.l;
                Paint paint = o46Var.b;
                Path path = o46Var.e;
                float f3 = 0.0f;
                if (z2 || o46Var.o != 0.0f) {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = o46Var.a.a;
                    o46Var.f.reset();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        z = pf0.B1;
                        if (i5 >= length) {
                            break;
                        }
                        float f4 = f3;
                        long[] jArr2 = jArr;
                        long j = jArr2[i5];
                        if (j < 0) {
                            arrayList2 = arrayList3;
                            i2 = size;
                            i3 = length;
                        } else {
                            ok1 ok1Var = this.i0;
                            arrayList2 = arrayList3;
                            float f5 = this.D0 * ok1Var.b[i5];
                            if (pf0.C1) {
                                f2 = this.k0;
                                i2 = size;
                                f = this.l0;
                                i3 = length;
                            } else {
                                i2 = size;
                                i3 = length;
                                float f6 = ok1Var.e;
                                fArr = fArr;
                                f = ok1Var.f;
                                f2 = f6;
                            }
                            float f7 = (1.0f - ((j - f) / (f2 - f))) * this.C0;
                            if (z) {
                                int i7 = i6 + 1;
                                if (i6 == 0) {
                                    fArr[i6] = f5;
                                    i6 += 2;
                                    fArr[i7] = f7;
                                } else {
                                    fArr[i6] = f5;
                                    fArr[i7] = f7;
                                    int i8 = i6 + 3;
                                    fArr[i6 + 2] = f5;
                                    i6 += 4;
                                    fArr[i8] = f7;
                                }
                            } else if (i5 == 0) {
                                path.moveTo(f5, f7);
                            } else {
                                path.lineTo(f5, f7);
                            }
                        }
                        i5++;
                        f3 = f4;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i2;
                        length = i3;
                    }
                    arrayList = arrayList3;
                    i = size;
                    float f8 = f3;
                    o46Var.j = i6;
                    if (o46Var.n || o46Var.o != f8) {
                        paint.setAlpha((int) (o46Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, o46Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i = size;
                }
                i4++;
                arrayList3 = arrayList;
                size = i;
            }
        }
    }

    @Override // pf0
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
