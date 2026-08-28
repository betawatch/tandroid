package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import j3.r0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m extends g {
    @Override // qf.g
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    @Override // qf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i9;
        int i10;
        if (this.d0 == null) {
            return;
        }
        float f17 = this.B0;
        j jVar = this.c0;
        float f18 = jVar.l;
        float f19 = jVar.k;
        float f20 = f17 / (f18 - f19);
        float f21 = g.g1;
        float f22 = (f19 * f20) - f21;
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
                float f23 = fArr2.length < 2 ? 0.0f : fArr2[1] * f20;
                long[] jArr = fVar.a.a;
                int i13 = ((int) (f21 / f23)) + 1;
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
                    int i15 = i14;
                    long j10 = jArr[max];
                    if (j10 < 0) {
                        f14 = f20;
                        f15 = f22;
                        f16 = f21;
                        i9 = min;
                    } else {
                        f14 = f20;
                        float f24 = (this.d0.b[max] * f14) - f22;
                        float f25 = this.w;
                        f15 = f22;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f16 = f21;
                        i9 = min;
                        float C = r0.C((getMeasuredHeight() - this.s) - g.j1, strokeWidth, f26, (getMeasuredHeight() - this.s) - strokeWidth);
                        if (z10) {
                            if (i15 == 0) {
                                fArr[i15] = f24;
                                i10 = i15 + 2;
                                fArr[i15 + 1] = C;
                            } else {
                                fArr[i15] = f24;
                                fArr[i15 + 1] = C;
                                fArr[i15 + 2] = f24;
                                i10 = i15 + 4;
                                fArr[i15 + 3] = C;
                            }
                            i14 = i10;
                        } else if (z12) {
                            path.moveTo(f24, C);
                            i14 = i15;
                            z12 = false;
                        } else {
                            path.lineTo(f24, C);
                        }
                        max++;
                        f20 = f14;
                        f22 = f15;
                        f21 = f16;
                        min = i9;
                    }
                    i14 = i15;
                    max++;
                    f20 = f14;
                    f22 = f15;
                    f21 = f16;
                    min = i9;
                }
                f10 = f20;
                f11 = f22;
                f12 = f21;
                int i16 = i14;
                canvas.save();
                int i17 = this.u0;
                float f27 = 1.0f;
                if (i17 == 2) {
                    sf.j jVar2 = this.v0;
                    float f28 = jVar2.f;
                    f13 = f28 > 0.5f ? 0.0f : 1.0f - (f28 * 2.0f);
                    canvas.scale((f28 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
                } else if (i17 == 1) {
                    float f29 = this.v0.f;
                    f13 = f29 < 0.3f ? 0.0f : f29;
                    canvas.save();
                    sf.j jVar3 = this.v0;
                    float f30 = jVar3.f;
                    canvas.scale(f30, f30, jVar3.d, jVar3.e);
                } else {
                    if (i17 == 3) {
                        f27 = this.v0.f;
                    }
                    paint.setAlpha((int) (fVar.o * 255.0f * f27));
                    if (this.C - this.B <= 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawPath(path, paint);
                    } else {
                        canvas.drawLines(fArr, 0, i16, paint);
                    }
                    canvas.restore();
                }
                f27 = f13;
                paint.setAlpha((int) (fVar.o * 255.0f * f27));
                if (this.C - this.B <= 100) {
                }
                if (z10) {
                }
                canvas.restore();
            } else {
                f10 = f20;
                f11 = f22;
                f12 = f21;
            }
            i12++;
            f20 = f10;
            f22 = f11;
            f21 = f12;
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
        int i11;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.d0 != null) {
            int i12 = 0;
            while (i12 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i12);
                boolean z11 = fVar.n;
                Paint paint2 = fVar.b;
                float[] fArr = fVar.l;
                Path path = fVar.e;
                if (z11 || fVar.o != 0.0f) {
                    path.reset();
                    int length = this.d0.b.length;
                    long[] jArr = fVar.a.a;
                    fVar.f.reset();
                    int i13 = 0;
                    int i14 = 0;
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
                            i11 = length;
                        } else {
                            rf.b bVar = this.d0;
                            arrayList2 = arrayList3;
                            float f12 = this.y0 * bVar.b[i13];
                            boolean z12 = g.x1;
                            i10 = size;
                            if (z12) {
                                i11 = length;
                                f10 = this.f0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = bVar.e;
                            }
                            if (z12) {
                                f11 = this.g0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = bVar.f;
                            }
                            float f13 = (1.0f - ((j10 - f11) / (f10 - f11))) * this.x0;
                            if (z10) {
                                if (i14 == 0) {
                                    int i15 = i14 + 1;
                                    fArr[i14] = f12;
                                    i14 += 2;
                                    fArr[i15] = f13;
                                } else {
                                    fArr[i14] = f12;
                                    fArr[i14 + 1] = f13;
                                    int i16 = i14 + 3;
                                    fArr[i14 + 2] = f12;
                                    i14 += 4;
                                    fArr[i16] = f13;
                                }
                            } else if (i13 == 0) {
                                path.moveTo(f12, f13);
                            } else {
                                path.lineTo(f12, f13);
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                        length = i11;
                    }
                    arrayList = arrayList3;
                    i9 = size;
                    fVar.j = i14;
                    if (fVar.n || fVar.o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i12++;
                        arrayList3 = arrayList;
                        size = i9;
                    }
                } else {
                    arrayList = arrayList3;
                    i9 = size;
                }
                i12++;
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
