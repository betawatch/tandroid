package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import j3.r0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends g {
    @Override // qf.g
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        int i9;
        float f13;
        float f14;
        int i10;
        if (this.d0 == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.c0;
        float f16 = jVar.l;
        float f17 = jVar.k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.g1;
        float f20 = (f17 * f18) - f19;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i12 >= arrayList.size()) {
                return;
            }
            sf.f fVar = (sf.f) arrayList.get(i12);
            boolean z11 = fVar.n;
            float[] fArr = fVar.k;
            Path path = fVar.f;
            Paint paint = fVar.c;
            if (z11 || fVar.o != 0.0f) {
                float[] fArr2 = this.d0.b;
                float f21 = fArr2.length < 2 ? 0.0f : fArr2[1] * f18;
                long[] jArr = fVar.a.a;
                int i13 = ((int) (f19 / f21)) + 1;
                path.reset();
                int max = Math.max(i11, this.B - i13);
                int min = Math.min(this.d0.b.length - 1, this.C + i13);
                boolean z12 = true;
                int i14 = 0;
                while (true) {
                    z10 = g.w1;
                    if (max > min) {
                        break;
                    }
                    float f22 = f18;
                    float f23 = f20;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f19;
                        i10 = i12;
                    } else {
                        f14 = f19;
                        float f24 = (this.d0.b[max] * f22) - f23;
                        float f25 = this.w;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i10 = i12;
                        float C = r0.C((getMeasuredHeight() - this.s) - g.j1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (!z10) {
                            if (z12) {
                                path.moveTo(f24 - (f21 / 2.0f), C);
                                z12 = false;
                            } else {
                                path.lineTo(f24 - (f21 / 2.0f), C);
                            }
                            path.lineTo((f21 / 2.0f) + f24, C);
                        } else if (i14 == 0) {
                            float f27 = f21 / 2.0f;
                            fArr[i14] = f24 - f27;
                            fArr[i14 + 1] = C;
                            float f28 = f24 + f27;
                            fArr[i14 + 2] = f28;
                            fArr[i14 + 3] = C;
                            int i15 = i14 + 5;
                            fArr[i14 + 4] = f28;
                            i14 += 6;
                            fArr[i15] = C;
                        } else if (max == min) {
                            float f29 = f21 / 2.0f;
                            float f30 = f24 - f29;
                            fArr[i14] = f30;
                            fArr[i14 + 1] = C;
                            fArr[i14 + 2] = f30;
                            fArr[i14 + 3] = C;
                            float f31 = f24 + f29;
                            fArr[i14 + 4] = f31;
                            fArr[i14 + 5] = C;
                            fArr[i14 + 6] = f31;
                            fArr[i14 + 7] = C;
                            int i16 = i14 + 9;
                            fArr[i14 + 8] = f31;
                            i14 += 10;
                            fArr[i16] = (getMeasuredHeight() - this.s) - strokeWidth;
                        } else {
                            float f32 = f21 / 2.0f;
                            float f33 = f24 - f32;
                            fArr[i14] = f33;
                            fArr[i14 + 1] = C;
                            fArr[i14 + 2] = f33;
                            fArr[i14 + 3] = C;
                            float f34 = f24 + f32;
                            fArr[i14 + 4] = f34;
                            fArr[i14 + 5] = C;
                            int i17 = i14 + 7;
                            fArr[i14 + 6] = f34;
                            i14 += 8;
                            fArr[i17] = C;
                        }
                    }
                    max++;
                    f18 = f22;
                    f20 = f23;
                    f19 = f14;
                    i12 = i10;
                }
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i9 = i12;
                canvas.save();
                int i18 = this.u0;
                float f35 = 1.0f;
                if (i18 == 2) {
                    sf.j jVar2 = this.v0;
                    float f36 = jVar2.f;
                    f13 = f36 > 0.5f ? 0.0f : 1.0f - (f36 * 2.0f);
                    canvas.scale((f36 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i18 == 1) {
                    float f37 = this.v0.f;
                    f13 = f37 < 0.3f ? 0.0f : f37;
                    canvas.save();
                    sf.j jVar3 = this.v0;
                    float f38 = jVar3.f;
                    canvas.scale(f38, f38, jVar3.d, jVar3.e);
                } else {
                    if (i18 == 3) {
                        f35 = this.v0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f35));
                    if (this.C - this.B <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i14, paint);
                    }
                    canvas.restore();
                }
                f35 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f35));
                if (this.C - this.B <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i9 = i12;
            }
            i12 = i9 + 1;
            f18 = f10;
            f20 = f11;
            f19 = f12;
            i11 = 0;
        }
    }

    @Override // qf.g
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        int i10;
        float f10;
        float f11;
        float f12;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        rf.b bVar = this.d0;
        if (bVar != null) {
            float[] fArr = bVar.b;
            float f13 = fArr.length < 2 ? 1.0f : fArr[1] * this.y0;
            int i11 = 0;
            while (i11 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i11);
                boolean z11 = fVar.n;
                Paint paint = fVar.b;
                float[] fArr2 = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.d0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        z10 = g.w1;
                        if (i13 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                        } else {
                            rf.b bVar2 = this.d0;
                            arrayList2 = arrayList3;
                            float f14 = this.y0 * bVar2.b[i13];
                            boolean z12 = g.x1;
                            if (z12) {
                                f10 = this.f0;
                                i10 = size;
                            } else {
                                i10 = size;
                                f10 = bVar2.e;
                            }
                            if (z12) {
                                f12 = this.g0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = bVar2.f;
                            }
                            float f15 = (1.0f - ((j10 - f12) / (f11 - f12))) * this.x0;
                            if (!z10) {
                                if (i13 == 0) {
                                    path.moveTo(f14 - (f13 / 2.0f), f15);
                                } else {
                                    path.lineTo(f14 - (f13 / 2.0f), f15);
                                }
                                path.lineTo((f13 / 2.0f) + f14, f15);
                            } else if (i12 == 0) {
                                float f16 = f13 / 2.0f;
                                fArr2[i12] = f14 - f16;
                                fArr2[i12 + 1] = f15;
                                float f17 = f14 + f16;
                                fArr2[i12 + 2] = f17;
                                fArr2[i12 + 3] = f15;
                                int i14 = i12 + 5;
                                fArr2[i12 + 4] = f17;
                                i12 += 6;
                                fArr2[i14] = f15;
                            } else if (i13 == length - 1) {
                                float f18 = f13 / 2.0f;
                                float f19 = f14 - f18;
                                fArr2[i12] = f19;
                                fArr2[i12 + 1] = f15;
                                fArr2[i12 + 2] = f19;
                                fArr2[i12 + 3] = f15;
                                float f20 = f14 + f18;
                                fArr2[i12 + 4] = f20;
                                fArr2[i12 + 5] = f15;
                                fArr2[i12 + 6] = f20;
                                fArr2[i12 + 7] = f15;
                                int i15 = i12 + 9;
                                fArr2[i12 + 8] = f20;
                                i12 += 10;
                                fArr2[i15] = 0.0f;
                            } else {
                                float f21 = f13 / 2.0f;
                                float f22 = f14 - f21;
                                fArr2[i12] = f22;
                                fArr2[i12 + 1] = f15;
                                fArr2[i12 + 2] = f22;
                                fArr2[i12 + 3] = f15;
                                float f23 = f14 + f21;
                                fArr2[i12 + 4] = f23;
                                fArr2[i12 + 5] = f15;
                                int i16 = i12 + 7;
                                fArr2[i12 + 6] = f23;
                                i12 += 8;
                                fArr2[i16] = f15;
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                    }
                    arrayList = arrayList3;
                    i9 = size;
                    fVar.j = i12;
                    if (fVar.n || fVar.o != 0.0f) {
                        paint.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i9 = size;
                }
                i11++;
                arrayList3 = arrayList;
                size = i9;
            }
        }
    }

    @Override // qf.g
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
